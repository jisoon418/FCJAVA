package fc.java.course2.part2;

import fc.java.course2_model.*;

public class StringUitilsTest_13 {
    public static void main(String[] args) {
        StringUtils_13 stringUtils=new StringUtils_13();
        //인스턴스 메서드 참조
        Converter_12<String, String> converter=stringUtils::reverse;
        String result=converter.convert("hello");
        System.out.println("result = " + result);
    }
}
