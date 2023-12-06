package fc.java.part2;

import java.util.Scanner;
public class IfElseTest {
    public static void main(String[] args) {
        int x=10;
        if(x>=0){
            System.out.println("0 or 양수");
        }else {
            System.out.println("음수");
        }
        //Q. 정수 1개를 입력 받아 짝수인지 홀수인지를 판단하는 코드
        Scanner sc=new Scanner(System.in);
        System.out.println("정수를 입력하세요 :");
        int num=sc.nextInt();
        if(num%2==0) {
            System.out.println("짝수입니다");
        }else{
            System.out.println("홀수입니다");
        }
        //Q. 입력받은 수가 12의 배수인지를 출력하는 코드를 작성하세요
        System.out.println("정수를 입력하세요 :");
        int su=sc.nextInt();
        if(su%12==0){
            System.out.println("12의 배수입니다");
        }else {
            System.out.println("12의 배수가 아닙니다");
        }
    }
}
