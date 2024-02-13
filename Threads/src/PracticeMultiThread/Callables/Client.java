package PracticeMultiThread.Callables;

import javax.sound.midi.Soundbank;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberGenerator generator1 = new RandomNumberGenerator();
        RandomNumberGenerator generator2 = new RandomNumberGenerator();
        ExecutorService service= Executors.newFixedThreadPool(2);
        Future<Integer> x = service.submit(generator1);
        Future<Integer> y = service.submit(generator2);
        System.out.println("X value : "+x.get());
        System.out.println("Y value : "+y.get());
        int sum = x.get()+y.get();
        System.out.println("Total : "+ sum);
        service.shutdown();
    }
}
