package ExecutorsandCallables.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Mergersorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService executorService;

    public Mergersorter( List<Integer> arrayToSort, ExecutorService executorService){
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;

    }
    @Override
    public List<Integer> call() throws Exception {
//        Logic for Merge Sort

//        Base case
        if(arrayToSort.size()<=1){
            return arrayToSort;
        }
//        Main Logic
        int mid = arrayToSort.size()/2;
        List<Integer> leftarray = new ArrayList<>();
        List<Integer> rightarray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftarray.add(arrayToSort.get(i));
        }
        for(int i=mid;i<arrayToSort.size();i++){
            rightarray.add(arrayToSort.get(i));
        }

        Mergersorter leftmergersorter = new Mergersorter(leftarray,executorService);
        Mergersorter rightmergersorter = new Mergersorter(rightarray,executorService);

        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftmergersorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightmergersorter);

//        Our code will wait until it gets the left and right sorted array futur filled.
//        Merge the two sorted arrays
        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        int i=0;
        int j=0;
        List<Integer> SortedArray = new ArrayList<>();
        while(i<leftSortedArray.size() && j<rightSortedArray.size()){
            if(leftSortedArray.get(i)<rightSortedArray.get(j)){
                SortedArray.add(leftSortedArray.get(i));
                i++;
            }
            else{
                SortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }
        while(i<leftSortedArray.size()){
            SortedArray.add(leftSortedArray.get(i));
            i++;
        }
        while(j<rightSortedArray.size()){
            SortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return SortedArray;
    }
}
