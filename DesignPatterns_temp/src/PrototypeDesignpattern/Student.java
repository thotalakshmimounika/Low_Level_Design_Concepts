package PrototypeDesignpattern;

public class Student implements prototype {
    private int age;
    private String name;
    private double psp;
    private String batchname;
    private double Avgbatchpsp;

    public Student() {

    }


//    public Student clone(){
//        Student copy = new Student();
//        copy.name=this.name;
//        copy.age=this.age;
//        copy.psp=this.psp;
//        copy.batchname=this.batchname;
//        copy.Avgbatchpsp=this.Avgbatchpsp;
//
//        return copy;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchname() {
        return batchname;
    }

    public void setBatchname(String batchname) {
        this.batchname = batchname;
    }

    public double getAvgbatchpsp() {
        return Avgbatchpsp;
    }

    public void setAvgbatchpsp(double avgbatchpsp) {
        Avgbatchpsp = avgbatchpsp;
    }

    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.Avgbatchpsp = student.Avgbatchpsp;
        this.batchname = student.batchname;
    }

    @Override
    public Student clone() {

//        Student copy = new Student();
//        copy.name=this.name;
//        copy.age=this.age;
//        copy.psp=this.psp;
//        copy.batchname=this.batchname;
//        copy.Avgbatchpsp=this.Avgbatchpsp;
//
//        return copy;
        return new Student(this);
    }
}