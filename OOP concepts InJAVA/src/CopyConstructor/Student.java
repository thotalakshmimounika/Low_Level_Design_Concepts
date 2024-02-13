package CopyConstructor;

public class Student {
    String name;
    int age = 21;
    double psp;
    String UniversityName;

    boolean isPalced;

    public Student(String Stuname, String StuUniname){
        System.out.println(name);
        name=Stuname;
        UniversityName=StuUniname;

    }
    public Student(Student oldstudent){
        name= oldstudent.name;
        UniversityName= oldstudent.UniversityName;
        psp= oldstudent.psp;
        isPalced= oldstudent.isPalced;
    }
}