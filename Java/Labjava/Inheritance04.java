class Employee {
  int salary = 6000;
}

class Teacher extends Employee {
  int bonus = 500;
}
    
class Inheritance04 {
  public static void main(String[] args){
    Teacher t1 = new Teacher();
    System.out.println("Salary:" + t1.salary + "\nBonus:" + t1.bonus);
  }
}
