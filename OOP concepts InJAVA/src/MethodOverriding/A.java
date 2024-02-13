package MethodOverriding;

public class A {
    //    Method Sign - doSomething[int], if we remove the datatype it will not alllow beacause of two methods with exactly same.Creates Ambiguity
    int doSomething(int a) {
        System.out.println("Doing Something");
        return 0;
    }
}
