package fc.java.part4;

import fc.java.model.Animal02;
import fc.java.model.Cat02;
import fc.java.model.Dog02;

public class DogCatOverride02 {
    public static void main(String[] args) {
        //업캐스팅 : Dog.java(x), Dog.class(o)
        Animal02 x=new Dog02();
        x.eat();

        x=new Cat02();
        x.eat();
    }
}
