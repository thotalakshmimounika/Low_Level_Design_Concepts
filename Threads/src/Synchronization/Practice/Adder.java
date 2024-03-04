package Synchronization.Practice;

public class Adder implements Runnable{
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000000;i++){
            count.setCount(count.getCount()+1);
        }
        System.out.println("Added value : "+count.getCount());
    }
}
