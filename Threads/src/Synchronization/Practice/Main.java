package Synchronization.Practice;

import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Count count = new Count(0);
        Adder add = new Adder(count);
        Subtractor sub = new Subtractor(count);
        Thread t1= new Thread(add);
        Thread t2 = new Thread(sub);
        t1.start();
        t2.start();
        System.out.println("Count value : "+count.getCount());
    }
}
