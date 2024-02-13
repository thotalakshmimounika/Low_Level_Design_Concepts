package AccessModifierscheck;

import AccessModifiers.Student;

public class StudentChild extends Student {
    public void doSomething(){
        psp=67; //protected be accessed in different folder because it is a child class
//        name="Shiva"; - private
        UniversityName="SRK"; //public can be accessed from anywhere
    }
}
