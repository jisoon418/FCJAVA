package fc.java.part2;

import java.util.Scanner;
public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("점수를 입력하시오");
        int score = abc.nextInt();
        if (score >= 00 && score <= 100) {
            if (score >= 90) {
                System.out.println("A반");
            } else if (score >= 85) {
                System.out.println("B반");
            } else if (score >= 80 && score < 85) {
                System.out.println("C반");
            } else {
                System.out.println("불합격");
            }
        } else {
            System.out.println("유효한 점수가 아닙니다");
        }
        //Q.
        System.out.print("년도를 입력하세요");
        int year=abc.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println("윤년입니다");
        }else{
            System.out.println("윤년이 아닙니다");
        }
    }
}