package ExecutorsandCallables.MergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(7,3,4,1,9,8,2,6);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Mergersorter mergersorter = new Mergersorter(list,executorService);

        Future<List<Integer>> sortedlistFuture = executorService.submit(mergersorter);
        List<Integer> sortedList = sortedlistFuture.get();

        System.out.println(sortedList);
    }
}
