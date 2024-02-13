package Inheritance;

public class Dog extends Animal{
    public String name;

    public Dog(String furcolor, int nooflegs, String name) {
        super(furcolor, nooflegs);
        this.name = name;
        System.out.println("Counstructor of Dog");
    }
}
