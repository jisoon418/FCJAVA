package fc.java.course2.part2;

import fc.java.course2_model.MathOperation_11;

public class FunctionInterfaceTest3_11 {
    public static void main(String[] args) {
        //MathOperation_11 인터페이스를 내부 익명 클래스로 구현
        MathOperation_11 mo=new MathOperation_11(){

            @Override
            public int operation(int x, int y) {
                return 0;
            }
        }; //익명 내부 클래스로 함수 인터페이스 사용
        int result=mo.operation(10,20);
        System.out.println("result = " + result);
    }
}
