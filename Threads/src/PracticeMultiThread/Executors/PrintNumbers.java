package PracticeMultiThread.Executors;

public class PrintNumbers implements Runnable{
    int x;

    public PrintNumbers(int x) {
        this.x=x;
    }


    @Override
    public void run() {
        System.out.println("Number : "+ x +Thread.currentThread().getName());
    }
}
