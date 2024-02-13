package Collections;

public class Student implements Comparable<Student> {
    int id;
    String name;
    int age;
    double psp;

    public Student(int id, String name, int age, double psp) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    // this <-> other
    // <0 -> current object is smaller than the other obj -> | this ... other |
    // =0 -> both students are equal-> |this ... other| or |other ... this |
    // >0 -> current object is greater than the other obj -> |other ... this |
    @Override
    public int compareTo(Student other) {
        if(this.psp== other.psp){
            return 0;
        }
        if(this.psp< other.psp){
            return 1;
        }
        return -1;
    }

    public Comparable<Object> getName() {
        return null;
    }
}
