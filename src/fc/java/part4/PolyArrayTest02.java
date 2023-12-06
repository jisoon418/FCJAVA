package fc.java.part4;

import fc.java.model.Animal02;
import fc.java.model.Cat02;
import fc.java.model.Dog02;

public class PolyArrayTest02 {
    public static void main(String[] args) {
        Dog02 d=new Dog02();
        Cat02 c=new Cat02();
        //Dog와 Cat을 저장할 배열 생성
        Animal02[] ani=new Animal02[2]; //다형성 배열
        ani[0]=d;
        ani[1]=c;
        display(ani);
    }
    public static void display(Animal02[] ani){
        for (int i = 0; i < ani.length; i++) {
            ani[i].eat();
            if(ani[i] instanceof Cat02)
                ((Cat02)ani[i]).night();
        }
    }
}
