package CopyConstructor;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student("Mounika","XYZ");
//        Student st2= new Student(st1);
        Student st2=st1;
        System.out.println("Client.main");
        st2.name="Sai";

    }
}
