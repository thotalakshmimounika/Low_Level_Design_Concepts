package Lambdas.FewMoreExamples;

import Collections.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //v1
        DoingSomething doingSomething = new DoingSomething();
        Thread t = new Thread(doingSomething);
        t.start();

        //v2
        Runnable runnable = () -> {
            System.out.println("v2 is doing");
        };
        Thread t2 = new Thread(runnable);
        t2.start();

        //v3
        Thread t3 = new Thread(
                () -> {
                    System.out.println("V3 id doing");
                }
        );
        t3.start();

        //Another example

        List<Student> students = new ArrayList<>();

        students.addAll(List.of(
                        new Student(1, "Mounika", 21, 90),
                        new Student(2, "Sai", 23, 98),
                        new Student(3, "Naveen", 24, 63),
                        new Student(4, "Lily", 25, 80)
                )
        );
        Comparator<Student> comparator = (o1, o2) -> {
            if (o1.getName().equals(o2.getName())) {
                return 0;
            }
            if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            }
            return 1;
        };
        Collections.sort(students);

        Collections.sort(students,
                (o1, o2) -> {
                    if (o1.getName().equals(o2.getName())) {
                        return 0;
                    }
                    if (o1.getName().compareTo(o2.getName()) < 0) {
                        return -1;
                    }
                    return 1;
                }
        );
        System.out.println(students);

        //Calculator

        //using lambdas without classes
        MathematicalOperation addition = (o1, o2) -> {
            return o1 + o2;
        };
        System.out.println(addition.operate(3,7));
        MathematicalOperation subraction = (o1, o2) -> {
            return o1 - o2;
        };

        //general case, with class and then object of the class and passing the values for output

        AdditionOperation additionOperation = new AdditionOperation();
        System.out.println(additionOperation.operate(5,7));
    }
}
