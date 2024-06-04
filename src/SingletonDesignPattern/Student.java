package SingletonDesignPattern;
public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradYear;
    private double psp;
    private String batchName;
    private static Student instance ;

    private Student() {
    }
    public static Student getInstance(){
        if(instance == null){
            synchronized(Student.class){
                if(instance==null){
                    instance  = new Student();
                }
            }
        }

        return instance;
    }
}



///////////////////////For multithreading ////////////////