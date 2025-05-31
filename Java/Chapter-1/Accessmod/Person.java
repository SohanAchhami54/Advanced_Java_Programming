//this is an example of public access modifiers.
public class Person {
public String name;
public int age;

public Person(String name, int age) {
this.name = name;
this.age = age;
}

public void displayInfo() {
System.out.println("Name: " + name + ", Age: " + age);
}


public class Main {
public static void main(String[] args) {
Person person = new Person("Sid", 22);
person.displayInfo();
}
}
}