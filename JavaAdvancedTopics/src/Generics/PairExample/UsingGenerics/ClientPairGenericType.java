package Generics.PairExample.UsingGenerics;

import Generics.PairExample.UsingGenerics.PairGenericType;

public class ClientPairGenericType {
    public static void main(String[] args) {
        PairGenericType<Integer,String> p1 = new PairGenericType<>(1,"Mounika");
        PairGenericType<Double,Double> p2 = new PairGenericType<>(3.78,9.97);

        PairGenericType p3 = new PairGenericType<>("Hello",45);//This is before JAVA5 generics introduced. They are called as Raw Types

        int x = (int) p3.getSecond();


    }
}


