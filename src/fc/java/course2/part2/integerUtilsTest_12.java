package fc.java.course2.part2;

import fc.java.course2_model.Converter_12;
import fc.java.course2_model.IntegerUtils_12;

public class integerUtilsTest_12 {
    public static void main(String[] args) {
        //정적메서드 참조
        Converter_12<String, Integer> converter= IntegerUtils_12::stringToInt;
        int result=converter.convert("123");//auto-unboxing
        System.out.println("result = " + result);
    }
}
