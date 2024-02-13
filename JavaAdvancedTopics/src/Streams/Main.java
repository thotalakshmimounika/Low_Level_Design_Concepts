package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
       // List<Integer> list = List.of(1,2,3,4,5);

//        for(Integer i :list){
//            System.out.println(i);
//        }

        DataAggregator dataAggregator = new DataAggregator();
        List<Integer> li = new ArrayList<>(dataAggregator.getItems());

        Stream<Integer> s1 = dataAggregator.getItems().stream();
        //s1.forEach(System.out::println);
        s1.forEach((elem)->{
                    System.out.println(elem * 2);
                }
        );

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Stream<Integer> s2 = set1.stream();

//        Consumer<Integer> consumer = (elem)->{
//            System.out.println(elem * 2);
//        };

        System.out.println("===printing set elements===");
        s2.forEach((elem)->{
            System.out.println(elem * 2);
        });

        //        class MyConsumer implements Consumer<Integer>{
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer * 2);
//            }
//        }
//
//        MyConsumer consumer = new MyConsumer();
//        for(Integer i: list){
//            consumer.accept(i);
//        }
        // Question
        List<Integer> l10 = List.of(1,2,3,4,5,6);
        Set<Integer> set = new HashSet<>();

        Stream<Integer> s10 = l10.stream();
        s10.forEach((elem)->{
            set.add(elem);
        });

        System.out.println(set);

    }
}
