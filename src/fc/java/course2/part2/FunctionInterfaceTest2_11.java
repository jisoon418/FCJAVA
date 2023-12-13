package fc.java.course2.part2;

import fc.java.course2_model.MathOperationImpl_11;
import fc.java.course2_model.MathOperation_11;

public class FunctionInterfaceTest2_11 {
    public static void main(String[] args) {
        MathOperation_11 mo=new MathOperationImpl_11();
        int result=mo.operation(10,20);
        System.out.println("result = " + result);
    }
}
