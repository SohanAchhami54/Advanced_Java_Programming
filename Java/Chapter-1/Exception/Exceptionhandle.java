public class Exceptionhandle{
  public static void main(String[] args){
    int a=100;
    int b=0;
    try{
      int result=a/b;
      System.out.println("Result:"+result);
    } catch(ArithmeticException e){
      System.out.println("Error:Division by zero is not allowd in computer science and mathematics.");
    }finally{
      System.out.println("program ended");
  }
}
}