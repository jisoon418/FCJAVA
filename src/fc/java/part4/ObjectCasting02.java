package fc.java.part4;

import fc.java.model.Animal02;
import fc.java.model.Cat02;
import fc.java.model.Dog02;

public class ObjectCasting02 {
    public static void main(String[] args) {
        Animal02 a=new Dog02(); //업캐스팅
        a.eat();

        a=new Cat02(); //업캐스팅
        a.eat();
        //a.night(); // 형변환이 필요. 즉 다운캐스팅이 필요
        Cat02 c=(Cat02)a;
        c.night();
        //((Cat02)a).night(); //위에껄 한줄로 표현

    }
}
