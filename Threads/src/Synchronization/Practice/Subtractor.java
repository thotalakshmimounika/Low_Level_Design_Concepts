package Synchronization.Practice;

public class Subtractor implements Runnable{
    private Count count;


    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000000;i++){
            count.setCount(count.getCount()-1);
        }
        System.out.println("Sub value : "+count.getCount());
    }
}
