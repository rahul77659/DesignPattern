package BuilderDesignPattern;

public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradYear;
    private double psp;
    private String batchName;

    private Student (Builder builder) {
//        if(builder.getId()>6){
//            throw new RuntimeException();
//        }
        this.name=builder.getName();
        this.yoe=builder.getYoe();
        this.gradYear=builder.getGradYear();
        this.psp=builder.getPsp();
        this.batchName=builder.getBatchName();
        this.id = builder.getId();

    }
    public static Builder builder(){
        Builder b = new Builder();
        return b;
     //     return new Builder(); //Builder object does not exist without Student
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yoe=" + yoe +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", batchName='" + batchName + '\'' +
                '}';
    }

    ////////////////////////////Inner Builder Class /////////////
    ////inner class is object of Student clas just behaving as an attribute of Student Class
    /////allowed to access the private constructor

    public static class Builder {   /////////static class builder  as java class allow two types of inner class static and other builder heere
        private int id;
        private String name;
        private int yoe;
        private int gradYear;
        private double psp;
        private String batchName;

        ///Constructor
        public Builder() {
            ///check  ya validate
        }
        public void validate(){
            if(name == null){
                throw new RuntimeException();
            }
//            if(yoe < 1){
//                throw new InvalidYOEException("YOE should not be 0");
//            }
            if(gradYear > 2022){
                throw new InvalidgradYearException("Grad year should be 2022 or before");
            }
        }
        public  Student build(){
            this.validate();
            Student st=new Student(this);
            return st;
        }


        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getYoe() {
            return yoe;
        }

        public int getGradYear() {
            return gradYear;
        }

        public double getPsp() {
            return psp;
        }

        public String getBatchName() {
            return batchName;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public void setYoe(int yoe) {
            this.yoe = yoe;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public void setPsp(double psp) {
            this.psp = psp;
        }

        public void setBatchName(String batchName) {
            this.batchName = batchName;
        }
    }



}
