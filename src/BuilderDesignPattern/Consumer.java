package BuilderDesignPattern;

public class Consumer {
    private int id;
    private String name;
    private int age;
    private String gender;
   private  Consumer (Builder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.age=builder.age;
        this.gender=builder.gender;

    }
    public static Builder builder(){
       return new Builder();
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    public static class Builder {
       private int id;
        private String name;
        private int age;
        private String gender;

        public Builder() {
//            this.id = id;
        }

        public Consumer build(){
                return new Consumer(this);
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
