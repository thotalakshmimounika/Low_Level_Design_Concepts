package StaticVariablesMethods;

public class Client {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.name="Mounika";
//        s.addr="XYZ";
//        s.age=18;
        //        Does not required to create a object
        Student.Universityname="ABC";
//        you can also make changes to static declared variables
        System.out.println(Student.Universityname);
//        System.out.println(Student.name); - It will not allow beacuse object to access is not created

    }
}
