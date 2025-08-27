class Modifier{
  int a = 5;
  public void print() {
    System.out.println("Hello from PublicModifier");
  }

  private int b = 10;

  protected void display() {
    System.out.println("Hello from ProtectedModifier");
  }
}

class ChildModifier extends Modifier{
  public void show() {
    System.out.println("Hello from ChildModifier");
    display(); // Accessing the protected method from the parent class
  }
}



class AccessModifier10{
  public static void main(String[] args){
    Modifier pm = new Modifier();
    System.out.println(pm.a);
    pm.print();
    // System.out.println(pm.b); // This line will cause a compilation error because 'b' is private
  
    ChildModifier cm = new ChildModifier();
    cm.show(); 

  }
}
