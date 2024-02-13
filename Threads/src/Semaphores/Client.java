package Semaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Shirt> store = new ConcurrentLinkedDeque<>();
        int maxsize=5;

        Semaphore semaproducer = new Semaphore(maxsize);
        Semaphore semaconsumer = new Semaphore(0);

        Producer p1 = new Producer(store,"P1",maxsize,semaproducer,semaconsumer);
        Producer p2 = new Producer(store,"P2",maxsize,semaproducer,semaconsumer);
        Producer p3 = new Producer(store,"P3",maxsize,semaproducer,semaconsumer);
        Producer p4 = new Producer(store,"P4",maxsize,semaproducer,semaconsumer);
        Producer p5 = new Producer(store,"P5",maxsize,semaproducer,semaconsumer);

        Consumer c1 = new Consumer(store,"C1",semaproducer,semaconsumer);
        Consumer c2 = new Consumer(store,"C2",semaproducer,semaconsumer);
        Consumer c3 = new Consumer(store,"C3",semaproducer,semaconsumer);
        Consumer c4 = new Consumer(store,"C4",semaproducer,semaconsumer);
        Consumer c5 = new Consumer(store,"C5",semaproducer,semaconsumer);

        Thread tp1 = new Thread(p1);
        tp1.start();
        Thread tp2 = new Thread(p2);
        tp2.start();
        Thread tp3 = new Thread(p3);
        tp3.start();
        Thread tp4 = new Thread(p4);
        tp4.start();
        Thread tp5= new Thread(p5);
        tp5.start();

        Thread tc1 = new Thread(c1);
        tc1.start();
        Thread tc2 = new Thread(c2);
        tc2.start();
        Thread tc3 = new Thread(c3);
        tc3.start();
        Thread tc4 = new Thread(c4);
        tc4.start();
        Thread tc5 = new Thread(c5);
        tc5.start();

    }
}