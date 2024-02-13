package AccessModifierscheck;

import AccessModifiers.Student;

public class Client {
    public static void main(String[] args) {
      Student student = new Student();
//        student.name="Hello"; //private not access in diff folder
//        student.batchid=78; //default can't be access from different folder
//        student.psp=91.9; //protected can't be accessed from different folder unless it is child class
        student.UniversityName ="Scaler"; //public can be accessed from anywhere
    }
}
