class Vehicle {
  public void Start() {
    System.out.println("Vehicle is starting");
  }
}

class Car extends Vehicle {
  public void drive() {
    System.out.println("Car is driving");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.Start();   // inherited method
    myCar.drive();   // Car's own method
  }
}
