package fc.java.poly;
//추상클래스(불완전 클래스)
public abstract class Animal02 {
    public abstract void eat(); //추상메서드(불완전 메서드) : 메서드의 구현부가 없음
    public void move(){
        System.out.println("무리를 지어서 다닌다"); //구현메서드(재정의 안해도됨)
    }
}
