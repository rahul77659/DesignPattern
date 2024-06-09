package prototypeDesign;

public class IntelligentStudent extends Student{
    private int iq;
//
//    public IntelligentStudent(String batchName, double avgBatchPsp, String instructorName, String monthOfEnrollment, String currentModule, String name, String phoneNumber, String email, int iq) {
//        super(batchName, avgBatchPsp, instructorName, monthOfEnrollment, currentModule, name, phoneNumber, email);
//        this.iq = iq;
//    }

    public IntelligentStudent(String batchName, int iq) {
        super(batchName);
        this.iq = iq;
    }



    public IntelligentStudent(int iq) {
        this.iq = iq;
    }
    public IntelligentStudent() {
        this.iq = iq;
    }



    public int getIq(){
        return iq;
    }
    @Override
    public String toString() {
        return "IntelligentStudent [iq=" + iq + "]";
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent copy(){
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatchName(this.getBatchName());
        intelligentStudent.setAvgBatchPsp(this.getAvgBatchPsp());// similarly copy all
        intelligentStudent.iq = this.iq;

        return intelligentStudent;
    }

}