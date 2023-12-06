package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    //생략된 생성자 메서드가 있음(기본 생성자_디폴트)
    public PersonVO(){
        this.name="홍길동";
        this.age=50;
        this.phone="010-1111-1111";
    }

    //생성자의 오버로딩
    public PersonVO(String name, int age, String phone){
        this.name=name;
        this.age=age;
        this.phone=phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String toString(){
        return this.name+"\t"+this.age+"\t"+this.phone; //this. 생략가능
    }
}
