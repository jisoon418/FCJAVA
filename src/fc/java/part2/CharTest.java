package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        char c='A';
        System.out.println("c = " + c);
        int a='A';
        System.out.println("a = " + a);
        int b='B'+1;
        System.out.println("b = " + (char)b);
        //( )b 이 괄호를 casting이라고 함

        //Q. ‘가’라는 한글 한 문자를 변수에 저장하고 출력
        char han='가';
        System.out.println("han = " + han);
        int hanD='가';
        System.out.println("hanD = " + hanD);
        int hanU='\uAC00';
        System.out.println("hanU = " + (char)hanU);

        //Q. 대문자 ‘A’를 문자 ‘a’로 변환하여 출력하시오(아스키코드 참고)
        char upper='A';
        char lower=(char)(upper+32);
        System.out.println("lower = " + lower);

        char lower1='u';
        int upper1=lower1-32;
        System.out.println("upper1 = " + (char)upper1);

        //Q. ‘1’+’2’=3이 나오도록 프로그래밍 하시오.
        int data='1'+'2';
        System.out.println("data = " + data);

        char i='1';
        char j='2';
        int sum=(i-'0')+(j-'0');
        System.out.println("sum = " + sum);



    }
}
