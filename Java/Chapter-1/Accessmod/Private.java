public class Private {
    private String name;
    private int age;

    public  Private (String name, int age){
        this.name=name;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("Name:"+name+" age:"+age);
    }


    public static void main(String[] args) {
        Private obj= new Private("Sohan",21);
        obj.displayInfo();
    }
}
