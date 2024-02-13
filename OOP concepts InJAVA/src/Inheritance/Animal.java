package Inheritance;

public class Animal {
    public String furcolor;
    public int nooflegs;

    public Animal(String furcolor,int nooflegs) {
        this.furcolor = furcolor;
        this.nooflegs = nooflegs;
        System.out.println("Counstructor of Animal");
    }
}
//Inheritance: It is a upper class called parent and allows it childs it extend it . child class can have its own attributes and methods