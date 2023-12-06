package fc.java.part2;

import java.util.Scanner;
public class SwitchTest2 {
    public static void main(String[] args) {
        //Q. 요일에 해당하는 운동을 출력
        Scanner day=new Scanner(System.in);
        System.out.println("요일을 입력하세요 : ");
        String str=day.nextLine();

        switch(str){
            case "sunday" :
                System.out.println("야구하기");
                break;
            case "monday" :
                System.out.println("농구하기");
                break;
            case "tuesday" :
            case "wednesday" :
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
        }
    }
}
