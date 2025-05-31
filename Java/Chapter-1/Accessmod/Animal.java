public class Animal {
    protected String type = "Animal";

    protected void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    public void showDetails() {
        System.out.println("Type: " + type);  //  Accessing protected field
        sound();                              //  Accessing protected method
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.showDetails();
    }
}
