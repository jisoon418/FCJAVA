package fc.java.course2_model;

public class Person_01{
    private String name;
    private int age;
    private Person_01(){}
    public Person_01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
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

    @Override
    public String toString() {
        return "Person_01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
