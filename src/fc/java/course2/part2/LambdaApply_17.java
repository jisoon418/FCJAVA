package fc.java.course2.part2;

import fc.java.course2_model.StringOperation_17;

public class LambdaApply_17 {
    public static void main(String[] args) {
        StringOperation_17 toUpperCase=s->s.toUpperCase();
        StringOperation_17 toLowerCase=s->s.toLowerCase();
        //문자열을 저장하는 변수
        String input="Lambda Expressions";
        System.out.println(processString(input, toUpperCase));
        System.out.println(processString(input, toLowerCase));

    }
    //대소문자를 바꿔주는 메서드
    public static String processString(String input, StringOperation_17 operation){
        return operation.apply(input);
    }
}
