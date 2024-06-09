package prototypeDesign;

//package designPatterns.prototypeRegistry;

public class Client {
    public static void main(String[] args) {
        Student studentApr23Proto = new Student();
        studentApr23Proto.setBatchName("Apr23");
        studentApr23Proto.setAvgBatchPsp(80);
        studentApr23Proto.setInstructorName("Naman");
        studentApr23Proto.setMonthOfEnrollment("0423");
        studentApr23Proto.setCurrentModule("DSA");

        Student studentMar23Proto = new Student();
        studentMar23Proto.setBatchName("Mar23");
        studentMar23Proto.setAvgBatchPsp(90);
        studentMar23Proto.setInstructorName("Sandeep");
        studentMar23Proto.setMonthOfEnrollment("0323");
        studentMar23Proto.setCurrentModule("DSA");

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.register("Apr23", studentApr23Proto);
        studentRegistry.register("Mar23", studentMar23Proto);


        Student pratyushApr23 = studentRegistry.get("Apr23").copy();
        pratyushApr23.setName("Pratyush");
        pratyushApr23.setEmail("peatyush@email.com");
        pratyushApr23.setPhoneNumber("1234");

        Student ananthApr23 = studentRegistry.get("Mar23").copy();
        ananthApr23.setName("Ananth");
        ananthApr23.setEmail("ananth@email.com");
        ananthApr23.setPhoneNumber("5678");

        Student st = new IntelligentStudent(100);
        ((IntelligentStudent)  st).setIq(200);
        st.setBatchName("Jan23");
        st.setAvgBatchPsp(8);
        st.setInstructorName("Gaurav");
        st.setMonthOfEnrollment("042223");
        st.setCurrentModule("DSA");
        studentRegistry.register("Jan23", st);

        Student ananthJan23 = studentRegistry.get("Jan23").copy();
        ananthJan23.setName("Ananth");
        ananthJan23.setEmail("ananth@email.com");
        ananthJan23.setPhoneNumber("5678");



        System.out.println(ananthJan23);
        System.out.println(ananthJan23.getBatchName());
        System.out.println(ananthJan23.getAvgBatchPsp());
        System.out.println(ananthJan23.getCurrentModule());
//        System.out.println(ananthJan23.((ananthJan23)st).getIq);
        System.out.println(((IntelligentStudent)  st).getIq());
        System.out.println(ananthApr23);



    }
}