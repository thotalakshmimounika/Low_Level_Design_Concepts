package AccessModifiers;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name="Urja"; //private can't be assess in different file/class even under same folder
        student.batchid=345;//default can be access in same folder
        student.psp=98.7; //protected can be accessed in same folder
        student.UniversityName="SRKR"; //public can be accessed from anywhere
    }
}
