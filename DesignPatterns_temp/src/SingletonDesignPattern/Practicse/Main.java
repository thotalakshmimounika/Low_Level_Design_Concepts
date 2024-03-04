package SingletonDesignPattern.Practicse;

public class Main {
    public static void main(String[] args) {
        SDP s1 = SDP.createinstance();
        System.out.println(s1);
        SDP s2 = SDP.createinstance();
        System.out.println(s2);
        SDP s3 = SDP.createinstance();
        System.out.println(s3);
        SDP s4 = SDP.createinstance();
        System.out.println(s4);
    }

}
