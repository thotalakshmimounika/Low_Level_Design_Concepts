package MethodOverriding2;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething("mounika");
        a = new B();
        a.doSomething("gtd");

    }
}

