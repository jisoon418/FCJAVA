package fc.java.part4;

import fc.java.model.Animal02;
import fc.java.model.Cat02;
import fc.java.model.Dog02;

public class DogCatUpCastingTest02 {
    public static void main(String[] args) {
        //Dog 객체 사용
        //업캐스딩
        Animal02 x=new Dog02();
        x.eat(); //동물처럼먹다 로 출력 -> 개처럼 먹다로 출력되도록

        x=new Cat02();
        x.eat(); //동물처럼먹다 로 출력 -> 고양이처럼 먹다로 출력되도록
    }
}
