package fc.java.course2.part2;

public class integerStringTest_02 {
    public static void main(String[] args) {
        String str="123";
        String str1="123";
        System.out.println(str+str1); //123123 -> +가 결합의 의미
        //246 결과가 나오게 하려면?
        int num=Integer.parseInt(str)+Integer.parseInt(str1);
        System.out.println(num);

        int a=123;
        int b=123;
        System.out.println(a+b); //246
        //123123 나오게 하려면?
        String str2=String .valueOf(a)+String.valueOf(b);
        System.out.println(str2);
        String str3=(a+"")+(b+""); //a+""+b; 로 해도됨
        System.out.println(str3);
    }
}
