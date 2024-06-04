package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        New Approach 2
//        Builder builder = Student.builder();
//        builder.setId(5);
//        builder.setName("John Doe");
//        Student student = builder.build();

        Student student =Student.builder()
                .setId(5)
                .setName("Rahul")
                .setGradYear(2021)
                .build();



    Consumer consumer = Consumer.builder()
            .setGender("male").setName("rahulbabu")
            .build();
    Producer producer= Producer.builder()
            .setGender("male").setName("rahulbabu")
            .build();

    DatabaseConfiguration db = DatabaseConfiguration.builder()
            .setDatabaseUrl("CCC")
            .build();
    QueryBuilder qb = QueryBuilder.builder().setFrom("asasa").build();
    MessageBuilder mT= MessageBuilder.builder().setContent("asasa").build();
//        Student student =Student.build();
//        System.out.println(builder);
        System.out.println(student);
        System.out.println(consumer);
        System.out.println(producer);
        System.out.println(db);
        System.out.println(qb);
        System.out.println(mT);
    }
}
