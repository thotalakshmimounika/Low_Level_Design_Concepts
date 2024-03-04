package Synchronization.Practice;

public class Count implements Runnable{
    int c;

    public Count(int count) {

        this.c = count;
    }

    public int getCount() {


        return c;
    }

    public void setCount(int count) {

        this.c = count;
    }

    @Override
    public void run() {
        System.out.println(getCount());
    }
}
