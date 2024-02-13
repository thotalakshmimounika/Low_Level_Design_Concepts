package PracticeMultiThread;

public class HelloWorldPrinter implements Runnable {
    public void print(){
        System.out.println("Hello World by : "+ Thread.currentThread().getName() + "Thread");
    }

    @Override
    public void run() {
        System.out.println("Hello World by : "+ Thread.currentThread().getName() + "Thread");

    }
}
