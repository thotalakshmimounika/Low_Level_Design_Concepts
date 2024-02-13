package Lambdas.AdderSubractorUsingLambdas;

import Lambdas.AdderSubractorUsingLambdas.Count;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        //lambda function
        /*
        1. Creates a anaynomous class - So Adder , subrator not needed
        2. It will implement the interface Runnable in the anaynoums class
        3. it will pass all the variables being shared
        4. It will copy the code from the lambda body into the method of that interface
         */

        Runnable adderlambda = ()-> {
            //All the variables r already present to lambda for useage
            for (int i = 1; i <= 1000000; i++) {
                synchronized (count) {
                    count.value += i;
                }
            }

        };

        Runnable subtractlambda = ()-> {
            //All the variables r already present to lambda for useage
            for (int i = 1; i <= 1000000; i++) {
                synchronized (count) {
                    count.value -= i;
                }
            }

        };


        Thread t1 = new Thread(adderlambda);
        Thread t2 = new Thread(subtractlambda);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both the threads are completed "+ count.value);

    }
}
