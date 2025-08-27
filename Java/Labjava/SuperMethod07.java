class Employee {
 int salary = 20000;
 void display() {
   System.out.println("This is Employee class");
 }
}

class Engineer extends Employee {
 int salary = 30000;
 void display() {
   System.out.println("This is Engineer class");
 }

 void show() {
   System.out.println("Salary:" + super.salary);
   super.display();
 }
}


class SuperMethod07{
 public static void main(String[] args){
   Engineer s = new Engineer();
   s.display();
   s.show(); 
 }
}
