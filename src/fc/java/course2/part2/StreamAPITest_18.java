package fc.java.course2.part2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest_18 {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        //짝수들만의 합
        int sumofevens=Arrays.stream(numbers)
                .filter(n->n%2==0)
                .sum();
        System.out.println(sumofevens);


        //짝수만의 배열
        int[] evennumbers=Arrays.stream(numbers)
                .filter(n->n%2==0)
                .toArray();
        for(int a : evennumbers) {
            System.out.println(a);
        }
    }
}
