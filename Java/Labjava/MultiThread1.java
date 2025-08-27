public class MultiThread1 implements Runnable{
  String name;
  MultiThread1(String n){
    name = n;
    System.out.println("Creating:" + name);
  }

  @Override
  public void run(){
    System.out.println("Running:" + name);
    try{
      for (int i=3;i>0;i--){
        System.out.println("Thread:" + name + ":" + i);
        Thread.sleep(10);
      }
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
  }

public static void main(String[] args) {
    MultiThread1 r1 = new MultiThread1("One");
    Thread t1 = new Thread(r1);
    t1.start();

    MultiThread1 r2= new MultiThread1("Two");
    Thread t2 = new Thread(r2);
    t2.start();
  }

}


