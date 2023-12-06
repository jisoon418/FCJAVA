package fc.java.part2;

public class CallbyReference {
    public static void main(String[] args) {
        float a=56.7f;
        float b=78.9f;
        floatadd(a,b);

    }
    //Q. 매개변수로 2개의 실수를 받아서 총합을 구아혀 출력하는 메서드 정의
    public static void floatadd(float a, float b){
        float hap=a+b;
        System.out.println("hap = " + hap);

    }
}
