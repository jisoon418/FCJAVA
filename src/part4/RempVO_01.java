package part4;
//일반사원
public class RempVO_01 extends Employee_01{
    public RempVO_01(){
        super();
    }
    public RempVO_01(String name, int age, String phone, String empDate, String dept, boolean marriage){
        //초기화(자식이 부모의 기억공간에 초기화를 하는 경우
       super(name, age, phone, empDate, dept, marriage); //부모의 생성자를 호출
    }
}
