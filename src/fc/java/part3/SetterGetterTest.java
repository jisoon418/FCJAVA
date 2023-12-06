package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        //Q. setter, getter 메서드를 활용해 PersonVO 객체에 이름, 나이, 전화번호 저장 및 출력
        PersonVO vo=new PersonVO();
        vo.setName("홍길동");
        vo.setAge(50);
        vo.setPhone("010-2345-6789");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
    }
}
