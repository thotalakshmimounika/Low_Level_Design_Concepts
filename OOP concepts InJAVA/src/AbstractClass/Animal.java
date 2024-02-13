package AbstractClass;

abstract public class Animal {
    String name;
    int age;
    abstract void walk();
    abstract void eat();

    void sleep(){
        System.out.println("sleeping....");
    }
}

//Abstract class : It is nothing but a combination of inheritance + interface class that can also allow its child to implement attributes.
//when a classes that extends Abstract class it should defintely implement it methods
//Abstract class allows us to add abtract methods and it is not compulsory
//we cannot create object of an abstract class