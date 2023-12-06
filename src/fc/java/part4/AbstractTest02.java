package fc.java.part4;

import fc.java.poly.Animal02;
import fc.java.poly.Cat02;
import fc.java.poly.Dog02;

public class AbstractTest02 {
    public static void main(String[] args) {
        //추상 클래스는 단독으로 객체를 생성할 수 없다
        Animal02 ani=new Dog02();
        ani.eat();
        ani.move();

        ani=new Cat02();
        ani.eat();
        ani.move();
        ((Cat02)ani).night();
    }
}
