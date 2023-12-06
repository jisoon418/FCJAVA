package fc.java.model;

public class MemberDTO {
    public String name;
    private int age; //은닉
    public String phone;

    public void play(){
        System.out.println("운동하기");
    }
}
