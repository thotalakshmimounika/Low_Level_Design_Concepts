package Synchronization.AdderSubractorAtomicDatatype;

import java.util.concurrent.atomic.AtomicInteger;

public class Adder implements Runnable{
    AtomicInteger count;
    public Adder(AtomicInteger count){
        this.count=count;

    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            count.addAndGet(i);
        }
    }
}