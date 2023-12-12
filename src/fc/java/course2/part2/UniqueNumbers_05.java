package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers_05 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,2,4,6,7,1,3};

        Set<Integer> uniqueNums=new HashSet<>();
        //반복문을 활용하여 하나씩 꺼내서 중복된거 없게
        for(int number: nums){
            uniqueNums.add(number);
        }

        System.out.println("Unique numbers..");
        for(int number : uniqueNums){
            System.out.println(number);
        }
    }
}
