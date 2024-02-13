package PracticeMultiThread.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        PrintNumbers printNumbers = new PrintNumbers();
//        Thread t = new Thread(printNumbers);
//        t.start(); - Normal Thread
//If we have multiple task and each task should be assigned to to each thread- eg print number from 1 to 100
//      for(int i = 1; i<=100; i++){
//          PrintNumbers printNumbers = new PrintNumbers(i);
//          Thread t = new Thread(printNumbers);
//          t.start();
//      }
//So, creating 100 threads for 100 task is lot time consuming and cost consuming. In this case we use
//Executor Frameworks, where we need to assign few threads, this service will take care of assigning task to those threads, like
//a scheduler. Task will be in Thread pool, based on availability it assigns those tasks to threads
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (int i=1;i<=100;i++){
            PrintNumbers printNumbers = new PrintNumbers(i);
            executor.submit(printNumbers);
        }
        executor.shutdown();//clears everything


    }
}
