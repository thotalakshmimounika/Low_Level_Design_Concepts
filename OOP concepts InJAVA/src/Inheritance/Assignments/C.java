package Inheritance.Assignments;

public class C {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age=10;
        p1.name="Sai";
        Person p2 = new Person();
        p2.age=11;
        p2.name="Mounika";

        fun(p1,p2);

        System.out.println(p1.age +" " + p1.name);
        System.out.println(p2.age + " " + p2.name);


    }
    static void fun(Person p1d,Person p2d){
        Person temp= p1d;
        p1d=p2d;
        p2d=temp;
    }

}
