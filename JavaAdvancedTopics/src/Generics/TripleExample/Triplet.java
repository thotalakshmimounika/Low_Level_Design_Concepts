package Generics.TripleExample;

public class Triplet<type> {
    private type left;
    private type right;
    private type middle;

    public Triplet(type left,type right, type middle){
        this.left=left;
        this.right=right;
        this.middle=middle;
    }

    public type getLeft() {
        return left;
    }

    public type getRight() {
        return right;
    }

    public type getMiddle() {
        return middle;
    }


}
