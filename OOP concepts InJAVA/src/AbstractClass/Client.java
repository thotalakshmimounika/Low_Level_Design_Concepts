package AbstractClass;

public class Client {
    public static void main(String[] args) {
        Animal a = new Tiger();
//        Animal a1 = new cat(); It is not allowing to create object because cat is a abstract class
        a.walk();
        a.eat();
        a.sleep();
    }
}
