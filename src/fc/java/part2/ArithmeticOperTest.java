package fc.java.part2;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        //나누기와 나머지 연산자의 활용(정수의 자리수 구하기)
        int digit=3625;
        System.out.print(digit%10); //일의 자리
        System.out.print(digit/10%10); //십의 자리
        System.out.print(digit/100%10); //백의 자리
        System.out.print(digit/1000%10); //천의 자리

        //짝수(나머지가 0), 홀수(나머지가 1) 구하기
        //배수 구하기


    }
}
