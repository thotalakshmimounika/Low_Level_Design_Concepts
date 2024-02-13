package Generics.PairExample.UsingGenerics;

public class PairGenericType<FIRST,SECOND>{

    private FIRST first;
    private SECOND second;

    public PairGenericType(FIRST f,SECOND s){
        this.first=f;
        this.second=s;
    }

    public FIRST getFirst() {
        return first;
    }

    public SECOND getSecond() {
        return second;
    }
}
