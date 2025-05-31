// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Parent reference to Animal
        myAnimal.sound();                // Calls Animal's sound()

        Dog myDog = new Dog();           // Dog object
        myDog.sound();                   // Calls Dog's overridden sound()

        // Animal ref = new Dog();          // Parent reference to Dog object
        // ref.sound();                     // Calls Dog's sound() due to dynamic binding
        Animal obj=new Dog();
        obj.sound();
    }
}
