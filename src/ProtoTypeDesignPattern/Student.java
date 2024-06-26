package ProtoTypeDesignPattern;
public class Student implements ProtoType <Student> {
    private String name;
    private int age;
    private double psp;
    private String batchName;
    private double avgBatchPsp;
    private int count = 1;/////////////////////////////important /////////////
    public Student() {

    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batchName = student.batchName;
        this.avgBatchPsp = student.avgBatchPsp;
        this.psp = student.psp;
        this.count = student.count;
    }



    @Override
    public Student clone() {
//        Student copy = new Student();
//        copy.name = this.name;
//        copy.age = this.age;
//        copy.psp = this.psp;
//        copy.batchName = this.batchName;
//        copy.avgBatchPsp = this.avgBatchPsp;
//        copy.count = this.count;

        return new Student(this);
    }

    public String getName() {
        count++;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }
}