package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorToStringPrint {
    public static void main(String[] args) {
        // 생성자 메서드를 통해 PersonVO 객체에 원하는 이름, 나이, 전화번호를 저장하고 toString으로 출력
        PersonVO vo=new PersonVO("홍길동", 50, "010-1111-1111");
        System.out.println(vo.toString());
        System.out.println(vo); //vo.toString()을 자동으로 찾음
    }
}
