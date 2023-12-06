package fc.java.part4;

import fc.java.model.*;

public class DogCatTest02 {
    public static void main(String[] args) {
        //Dog 객체를 생성하고 eat()동작을 구동
        Dog02 d=new Dog02();
        d.eat();

        //Cat 객체를 생성하고 eat(), night() 동작을 구동
        Cat02 c=new Cat02();
        c.eat();
        c.night();
    }
}
