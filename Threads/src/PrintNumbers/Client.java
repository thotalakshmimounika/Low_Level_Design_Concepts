package PrintNumbers;

public class Client {
    public static void main(String[] args) {
        for(int j=1;j<=100;j++) {
            NumberPrinter numberPrinter = new NumberPrinter(j);
//            System.out.println("printing number : " + j);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
