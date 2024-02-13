package PracticeMultiThread;

public class MainClass {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        helloWorldPrinter.print();
//        helloWorldPrinter.run();
        Thread t = new Thread(helloWorldPrinter);
        t.run();
//        t.start();
//        Adder adder = new Adder(5,10);
//        Thread t1 = new Thread(adder);
//        t1.start();
    }
}
