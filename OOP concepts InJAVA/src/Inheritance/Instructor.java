package Inheritance;

public class Instructor extends User {
    String batchname;
    double avgRating;

    void scheduleclass(){
        System.out.println("Scheduling new class for your batch");
    }
}
