package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        //Q. 한 사람의 데이터를 저장할 변수를 선언
        // 모델링 된 Person 클래스를 이용하여 객체를 메모리에 생성
        // 인스턴스를 만드는 과정
        Person p=new Person();
        //이름, 나이, 전화번호를 저장하고 동작 호출 실행
        p.name="홍길동";
        p.age=30;
        p.phone="010-1111-1111";

        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);

        p.play();
        p.eat();
        p.walk();
    }
}
