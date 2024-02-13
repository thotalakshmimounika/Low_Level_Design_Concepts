package BuilderDesignPattern;

import BuilderDesignPattern.Exception.InvalidArgumentException;

public class Student {
    private String name;
    private int age;
    private String universityname;
    private Gender gender;
    private String phonenuber;
    private double psp;

    private Student(Builder builder){
        this.name=builder.getName();
        this.universityname=builder.getUniversityname();
        this.age=builder.getAge();
        this.gender=builder.getGender();
        this.phonenuber= builder.getPhonenuber();;
        this.psp= builder.getPsp();
    }

    public static Builder createbuilder(){

        return new Builder();
    }


    static public class Builder {
        private String name;
        private int age;
        private String universityname;
        private Gender gender;
        private String phonenuber;
        private double psp;

        public String getName() {

            return name;
        }

        public Builder setName(String name) {

            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {

            this.age = age;
            return this;
        }

        public String getUniversityname() {

            return universityname;
        }

        public Builder setUniversityname(String universityname) {

            this.universityname = universityname;
            return this;
        }

        public Gender getGender() {

            return gender;
        }

        public Builder setGender(Gender gender) {

            this.gender = gender;
            return this;
        }

        public String getPhonenuber() {

            return phonenuber;
        }

        public Builder setPhonenuber(String phonenuber) {

            this.phonenuber = phonenuber;
            return this;
        }

        public double getPsp() {

            return psp;
        }

        public Builder setPsp(double psp) {

            this.psp = psp;
            return this;
        }

        private boolean validate() {
            if (this.phonenuber.length() != 10) {
                return false;
            }
            return true;
        }

        public Student build() throws InvalidArgumentException {
            if (!validate()) {
                throw new InvalidArgumentException();
            }

            return new Student(this);
        }
    }
}
