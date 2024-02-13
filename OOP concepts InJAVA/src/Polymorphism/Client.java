package Polymorphism;

import java.util.Random;

public class Client {
        static A getObject(){
            B b = new B();
            C c = new C();

            Random random = new Random(10);
            if (random.nextInt()%2==0){
                return b;
            }
            return c;

        }
        A a = getObject();
//        a.name="Mounika"; - 2. This will not work because the getObject function does not know which object is created and which called.
////        a.CompanyName ="Google"; - 1. Compiler is not alllowing, in order to allow we need to force it by typecasting it
//        ((C) a).CompanyName ="Google";
//
//        System.out.println(((C) a).CompanyName);

}

