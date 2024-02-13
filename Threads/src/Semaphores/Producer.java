package Semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Shirt> store;
    private String name;
    private int maxsize;
    Semaphore semaproducer;
    Semaphore semaconsumer;

    public Producer(Queue<Shirt> store,String name,int maxsize,Semaphore semaproducer,Semaphore semaconsumer){
        this.store=store;
        this.name=name;
        this.maxsize=maxsize;
        this.semaproducer=semaproducer;
        this.semaconsumer=semaconsumer;
    }
    @Override
    public void run() {
        while(true){
            try { // Intially store-0 prod can -5(n) , coms -0
                semaproducer.acquire(); // prod -4,
                System.out.println("current Size - " + this.store.size() + " Added by producer " + this.name);
                store.add(new Shirt()); // prod - 4, store - 1
                semaconsumer.release(); //prod -4, store -1, cons-1
            }catch (Exception e){
                e.getMessage();
            }

        }
    }
}