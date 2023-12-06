package fc.java.part2;

public class SwitchTest {
    public static void main(String[] args) {
        //Q. 요일에 해당하는 운동을 출력
        String day="Sunday"; //야구
        switch(day){
            case "Sunday" :
                System.out.println("야구하기");
                break;
            case "Monday" :
                System.out.println("농구하기");
                break;
            case "Tuesday" :
            case "Wednesday" :
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
        }
    }
}
