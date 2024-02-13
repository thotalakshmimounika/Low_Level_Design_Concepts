package PracticeMultiThread;

public class Adder implements Runnable{
    int x;
    int y;

    public Adder(int x,int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        System.out.println("Total: "+(x+y)+"by : "+ Thread.currentThread().getName());

    }
}
