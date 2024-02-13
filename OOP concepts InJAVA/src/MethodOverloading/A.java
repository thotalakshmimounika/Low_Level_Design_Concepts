package MethodOverloading;

public class A {
//    Method Sign - doSomething[int], if we remove the datatype it will not alllow beacause of two methods with exactly same.Creates Ambiguity
    int doSomething(int a){
        System.out.println("Doing Something");
        return 0;
    }
//    Method Sign - doSomething[int]
    String doSomething(){
        System.out.println("Doing Something with returning String");
        return "1";
    }
//    Both the Method Signatures are different which is why the medthods are overloaded.
}
