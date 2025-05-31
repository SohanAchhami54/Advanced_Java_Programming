// this is an example of default access modifiers in java.

public class Default {

    String name;
    int age;
    public Default(String name,int age){
        this.name=name;
        this.age=age;
    }

     void displayinfo(){
        System.out.println("name is:"+name+"and age is:"+age);
    }
}
    //another class with in the same packages.
    class Main{
     public static void main (String [] args){
        Default person=new Default("Sohan",22);
        person.displayinfo();

     }
    }

