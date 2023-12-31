package fc.java.course2.part2;

import java.util.*;
import java.util.function.Predicate;

public class StreamExample_19 {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven= n -> n%2==0;
        int sumofsquares=numbers.stream()
                .filter(n->n%2==0)
                .sorted()
                .map(n->n*n)
                .reduce(0, Integer::sum);
        System.out.println(sumofsquares);
    }
}
