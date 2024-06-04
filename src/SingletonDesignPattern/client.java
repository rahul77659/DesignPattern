package SingletonDesignPattern;

public class client {
    public static void main(String[] args) {
//        Student st =new Student();
//        Student st1 =new Student();

        Student st1=Student.getInstance();
        Student st2 =Student.getInstance();
        System.out.println(st1);
        System.out.println(st2);


    }
}
