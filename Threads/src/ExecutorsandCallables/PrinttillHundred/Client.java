package ExecutorsandCallables.PrinttillHundred;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        ExecutorService executorService = Executors.newCachedThreadPool();


        for(int i=1;i<=100;i++){
            if(i==5 || i==11 || i==20  || i==88){
                System.out.println("Debug");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }
    }
}
