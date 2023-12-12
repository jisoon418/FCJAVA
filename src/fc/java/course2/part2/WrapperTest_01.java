package fc.java.course2.part2;

public class WrapperTest_01 {
    public static void main(String[] args) {
        //정수형 변수에 10을 저장하세요
        int a=10; //기본자료형
        //Integer aa=new Integer(10); //사용자정의 자료형, 객체자료형
        Integer aa=10; //Auto-boxing
        System.out.println(aa.intValue()); // Unboxing

        Integer bb=20;//auto-boxing
        int b=bb; //auto-unboxing

        Float f=10.5f;//new Float(10.5f); 자동으로 들어감 이게 auto-boxing
        System.out.println(f.floatValue()); //unboxing
        float ff=f; //auto=boxing
        System.out.println(ff);

    }
}
