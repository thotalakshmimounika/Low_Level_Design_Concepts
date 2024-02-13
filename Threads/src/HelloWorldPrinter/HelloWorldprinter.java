package HelloWorldPrinter;

public class HelloWorldprinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world , this is printed by : " + Thread.currentThread().getName() + " thread");

    }
}
