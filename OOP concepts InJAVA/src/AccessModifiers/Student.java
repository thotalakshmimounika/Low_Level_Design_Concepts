package AccessModifiers;

public class Student {
    private String name; //private
    int batchid; //default
    int age; //default
    protected double psp; //protected

    public String UniversityName; //public

    void changeBatch(int newBatchid){
        this.batchid = newBatchid;
    }
//    void giveMockInterview(){
//        System.out.println("Going to give Mock Interview");
//    }
}
