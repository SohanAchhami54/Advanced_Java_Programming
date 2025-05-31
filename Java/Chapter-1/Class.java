// Define a class called Car
class Car {
    // Attributes (also called fields or properties)
    String color;
    int speed;

    // Method to set the car's details
    void setDetails(String c, int s) {
        color = c;
        speed = s;
    }

    // Method to display the car's details
    void displayDetails() {
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }

    // Method to increase speed
    void accelerate(int increase) {
        speed += increase;
        System.out.println("New speed after accelerating: " + speed + " km/h");
    }
}

// Main class to run the program
public class Class {
    public static void main(String[] args) {
        // Create an object of Car
        Car myCar = new Car();

        // Set car details
        myCar.setDetails("Red", 60);

        // Show car details
        myCar.displayDetails();

        // Accelerate the car
        myCar.accelerate(20);
    }
}
