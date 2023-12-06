package fc.java.model;

public class Dog02 extends Animal02 {
    public Dog02(){
        super(); // new Animal02()이 호출되기때문에 상위 클래스에 생성자가 호출되어 객체가 만들어짐
        //즉 부모가 먼저 만들어지고 자식이 만들어져야함
        int a=10; //수행문
    }
    //재정의(override)
    public void eat(){
        System.out.println("개처럼 먹다");
    }
}
