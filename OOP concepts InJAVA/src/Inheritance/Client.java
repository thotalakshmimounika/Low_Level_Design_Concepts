package Inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.login();
        i.username="Mounika";
        System.out.println("Instructor name is - "+ i.username);
    }
}
