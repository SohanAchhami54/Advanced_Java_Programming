// Save this file as ImplementRun.java

class Mytask implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ImplementRun {
    public static void main(String[] args) {
        Mytask task = new Mytask();          // Create task
        Thread t = new Thread(task);         // Pass task to thread
        t.start();                           // Start the thread
    }
}
