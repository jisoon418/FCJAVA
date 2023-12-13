package fc.java.course2.part2;

import fc.java.course2_model.MathOperation_11;

public class LambdaTest_16 {
    public static void main(String[] args) {
        /*MathOperation_11 add=new MathOperation_11() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int result=add.operation(10, 20);
        System.out.println("result = " + result);*/

        //람다식
        MathOperation_11 add1=(int x, int y) -> {return x+y;};
        //더 간결하게는 MathOperation_11 add1=(x,y) -> x+y;
        MathOperation_11 multi=(x, y) -> x*y;
        int result1=add1.operation(10, 20);
        System.out.println("result = " + result1);
        int result2=multi.operation(10, 20);
        System.out.println("result = " + result2);


    }
}
