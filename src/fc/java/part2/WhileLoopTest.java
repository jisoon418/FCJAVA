package fc.java.part2;

public class WhileLoopTest {
    public static void main(String[] args) {
        //0~5까지 출력
        int i=0;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        //int[] numbers={1,2,3,4,5,6,7,8,9,10} 주어진 배열의 모든 원소 출력
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        i=0;//여기서는 앞에 int i=0;을 썼기때문에 다시 초기화 시켜줘야해서 int빼고 i=0임을 선언
        while(i<numbers.length){
            System.out.println(numbers[i]);
            i++;
        }

        //do while 문
        i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}
