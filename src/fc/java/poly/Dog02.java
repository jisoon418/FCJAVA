package fc.java.poly;

public class Dog02 extends Animal02 {  //추상메서드
    // 재정의를 안함 -> 에러
    // 재정의를 해야함 -> 바디를 만들어야함
    public void eat(){
        System.out.println("개처럼 먹다");
    }

}
