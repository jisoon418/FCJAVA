package fc.java.course2.part2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest_14 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("홍길동", "김길동", "이길동");
        Collections.sort(names, String::compareTo);
        System.out.println(names); // List 형식으로 출력
        for(String name: names){
            System.out.println(name);
        }
    }
}
