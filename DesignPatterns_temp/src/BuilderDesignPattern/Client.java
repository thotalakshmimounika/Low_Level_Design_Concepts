package BuilderDesignPattern;

import BuilderDesignPattern.Exception.InvalidArgumentException;

public class Client {
    public static void main(String[] args) throws InvalidArgumentException {
        //V1
//        Builder builder = new Builder();
//        builder.setName("Mounika");
//        builder.setAge(24);
//        builder.setGender(Gender.Female);
//        builder.setPhonenuber("7665327756");
//        builder.setPsp(89);

//        Student student = new Student(builder);

        //V2
//        Builder builder1 = Student.createbuilder();
//        builder1.setName("Mounika");
//        builder1.setAge(24);
//        builder1.setGender(Gender.Female);
//        builder1.setPhonenuber("7665327756");
//        builder1.setPsp(89);

        //V3

        Student student = Student.createbuilder()
                .setAge(26)
                .setName("Mouniks")
                .setGender(Gender.Female)
                .setPsp(89)
                .setPhonenuber("9775543214")
                .setUniversityname("SRKR")
                .build();


    }

}
