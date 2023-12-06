package fc.java.part4;

import fc.java.model.Animal02;
import fc.java.model.Cat02;
import fc.java.model.Dog02;

public class PolyMethodTest02 {
    public static void main(String[] args) {
        Dog02 d=new Dog02();
        display(d);
        Cat02 c=new Cat02();
        display(c);
    }
    private static void display(Animal02 ani) { //다형성 인수
        ani.eat();
        if(ani instanceof Cat02){
            ((Cat02)ani).night();
        }
    }

}
