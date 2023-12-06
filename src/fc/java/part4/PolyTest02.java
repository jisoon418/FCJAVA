package fc.java.part4;

import fc.java.model.Animal02;
import fc.java.model.Cat02;
import fc.java.model.Dog02;

public class PolyTest02 {
    public static void main(String[] args) {
        //Upcasting으로 객체를 생성
        //상속 관계, 재정의(override), 동적바인딩
        //다형성 : 상위 클래스가 동일한 메세지로 하위 클래스를 서로 다르게 동작시키는 객체지향 원리
        Animal02 x=new Dog02();
        x.eat(); //실행시점에서 사용(호출)될 메서드가 결정되는 바인딩(동적 바인딩)

        x=new Cat02();
        x.eat();
        //Downcasting
        ((Cat02)x).night();
    }
}
