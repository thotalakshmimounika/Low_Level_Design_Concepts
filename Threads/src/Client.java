public class Client {

    static void doSomething(){
        System.out.println("Doing Something : This is printed by:" + Thread.currentThread().getName() + " Thread");

    }
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
        System.out.println();
        System.out.println("Hello World. This is printed by :" + Thread.currentThread().getName() + " Thread");

        doSomething();
    }
}
