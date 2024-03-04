package PrototypeDesignpattern;

public class Client {

    public static void fillRegistery(StudentRegistry studentRegistry){
        Student AprBeginnerBatchPrototype = new Student();
        AprBeginnerBatchPrototype.setBatchname("April23BeginnerBatch");
        AprBeginnerBatchPrototype.setAvgbatchpsp(97);

        studentRegistry.register("April23BeginnerBatch",AprBeginnerBatchPrototype);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setAvgbatchpsp(99);
        intelligentStudent.setBatchname("April23BeginnerIntelligentBatch");
        intelligentStudent.setIq(180);

        studentRegistry.register("April23BeginnerIntelligentBatch",intelligentStudent);


    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistery(studentRegistry);

        Student dhaval = studentRegistry.get("April23BeginnerBatch").clone();
        dhaval.setName("Dhaval");
        dhaval.setAge(21);
        dhaval.setPsp(89);

        Student mounika = studentRegistry.get("April23BeginnerIntelligentBatch").clone();
        mounika.setName("Mounika");
        mounika.setAge(22);
        mounika.setPsp(99);
        System.out.println("Debug");


    }

}