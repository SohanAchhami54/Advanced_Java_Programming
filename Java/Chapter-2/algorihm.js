//
function calculatePriority(pickupDate, returnDate, bookingDate) {
  const durationInDays = (new Date(returnDate) - new Date(pickupDate)) / (1000 * 60 * 60 * 24);
  const urgencyInDays = (new Date(pickupDate) - new Date(bookingDate)) / (1000 * 60 * 60 * 24);
  const timeUrgencyScore = Math.max(0, 10 - urgencyInDays); // capped at 10

  const priorityScore = (durationInDays * 2) + timeUrgencyScore;
  return priorityScore;
}

const bookingDate = new Date(); 
const pickupDate = req.body.from;
const returnDate = req.body.to;

const priorityScore = calculatePriority(pickupDate, returnDate, bookingDate);

const newBooking = new Booking({
  user: req.user._id,
  bike: req.body.bikeId,       
  from: pickupDate,
  to: returnDate,
  status: 'pending',
  priorityScore: priorityScore,
  createdAt: bookingDate
});

const sortedBookings = bookings
  .filter(b => b.status === 'pending')
  .sort((a, b) => b.priorityScore - a.priorityScore);




















function haversineDistance(lat1, lon1, lat2, lon2) {
  const R = 6371; // Radius of Earth in km
  const toRad = angle => angle * Math.PI / 180;

  const dLat = toRad(lat2 - lat1);
  const dLon = toRad(lon2 - lon1);

  const a = Math.sin(dLat / 2) ** 2 +
            Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) *
            Math.sin(dLon / 2) ** 2;

  const c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
  return R * c;
}



const express = require('express');
const Bike = require('./models/bikeModel'); // Your Mongoose model
const router = express.Router();

router.get('/api/nearby-bikes', async (req, res) => {
  const { lat, lng } = req.query;
  if (!lat || !lng) {
    return res.status(400).json({ message: 'lat and lng required' });
  }

  const userLat = parseFloat(lat);
  const userLng = parseFloat(lng);
  const maxDistance = 10; // km

  try {
    const allBikes = await Bike.find(); // Fetch all bikes
    const nearbyBikes = allBikes
      .map(bike => {
        const distance = haversineDistance(userLat, userLng, bike.lat, bike.lng);
        return { ...bike._doc, distance: distance.toFixed(2) };
      })
      .filter(bike => bike.distance <= maxDistance)
      .sort((a, b) => a.distance - b.distance);

    res.json(nearbyBikes);
  } catch (err) {
    res.status(500).json({ message: 'Server error' });
  }
});
