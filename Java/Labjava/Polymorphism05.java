//Compile Time Polymorphism / Method Overloading
class Operation {
  static int Multiply(int a, int b) {
    return a * b;
  }

  static double Multiply(double a, double b) {
    return a * b;
  }
}

// Runtime Polymorphism / Method Overriding
class Parent {
  void Print() {
    System.out.println("Parent class");
  }
}

class Child extends Parent {
  void Print() {
    System.out.println("Child class");
  }
}

class Polymorphism05 {
  public static void main(String[] args) {
    Operation op1 = new Operation();
    System.out.println("Multiply:" + op1.Multiply(3,4));
    System.out.println("Multiply:" + op1.Multiply(3.1,4.3));

    Parent p1 = new Child();
    p1.Print();

  }
}
