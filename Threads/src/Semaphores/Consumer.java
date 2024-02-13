package Semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Shirt> store;
    private String name;

    Semaphore semaproducer;
    Semaphore semaconsumer;

    public Consumer(Queue<Shirt> store,String name,Semaphore semaproducer,Semaphore semaconsumer){
        this.store=store;
        this.name=name;
        this.semaconsumer = semaconsumer;
        this.semaproducer=semaproducer;
    }

    @Override
    public void run() {
        while(true){
            try{
                semaconsumer.acquire();
                System.out.println("current Size - " + this.store.size() +" removed by consumer " + this.name );
                store.remove();
                semaproducer.release();
            }catch (Exception e){
                e.getMessage();
            }
        }

    }
}