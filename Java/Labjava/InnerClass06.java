class Teacher {
  int salary = 20000;
  class Student {
    void display() {
      System.out.println("This is student class");
    }
  }
}


// how to create a inner class
class InnerClass06 {
  public static void main(String[] args) {
    Teacher t = new Teacher();
    Teacher.Student s = t.new Student();
    s.display();
  }
}
