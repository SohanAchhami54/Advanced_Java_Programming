class Mythread extends Thread{
  public void run(){
    System.out.println("Thread is running");
  }
}
public class Extendingthread{
  public static void main(String[] args){
    Mythread t1=new Mythread();
    t1.start(); // Start the thread
    System.out.println("Thread has started");
  }
}