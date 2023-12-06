package fc.java.part4;

import fc.java.poly.Animal02;
import fc.java.poly.Cat02;
import fc.java.poly.Dog02;

public class IsNotOverride02 {
    public static void main(String[] args) {
        //재정의를 하지 않았기 때문에 상위 클래스가 명령을 내리면 에러
        //재정의를 하지 않으면 다형성을 보장하지 않음
        Animal02 ani=new Dog02();
        ani.eat();

        ani=new Cat02();
        ani.eat();

    }
}
