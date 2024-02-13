package Generics.PairExample.RawType;

public class Client {
    public static void main(String[] args) {
        Pair p1 = new Pair(1,"Mounika");
        Pair p2 = new Pair("Hey" , "Hi");

        //int a = (int) p1.getFirst(); or
        Object a = p1.getFirst();
        int c = (int) a+5;
        String b = (String) p2.getSecond();
        System.out.println(a);
    }
}
