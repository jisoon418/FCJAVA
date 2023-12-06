package fc.java.model;

public class Cat02 extends Animal02 {
    //재정의(override)
    public void eat(){
        System.out.println("고양이처럼 먹다");
    }
    public void night(){
        System.out.println("밤에 눈에서 빛이 난다");
    }
}
