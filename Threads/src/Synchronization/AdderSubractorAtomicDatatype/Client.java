package Synchronization.AdderSubractorAtomicDatatype;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger count = new AtomicInteger();
        Adder adder = new Adder(count);
        Subractor subractor=new Subractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both the threads are completed "+ count.get());

    }
}