package MethodOverriding;

public class B extends A{
    //    void doSomething(int b){
//        System.out.println("Doing Something");
//    } - This will throw an error because the b get the dosomething from A and it also have another something with same signature
    int doSomething(int a,int b){
        System.out.println("Doing Something");
        return 0;
    }
}
// this general overload concept. Overriding is shown in MethodOverriding2 pacakage
