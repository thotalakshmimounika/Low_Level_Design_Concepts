package HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world , this is printed by : " + Thread.currentThread().getName() + " thread");
        HelloWorldprinter hp = new HelloWorldprinter();
        Thread thread = new Thread(hp);
        thread.start();

        System.out.println("This is written by me " + Thread.currentThread().getName() + " thread");
    }
}
