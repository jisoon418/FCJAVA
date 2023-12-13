package fc.java.course2.part2;

import fc.java.course2_model.Pair_09;

import java.util.*;

public class PairGenericTest_09 {
    public static void main(String[] args) {
        Pair_09<String, Integer> pair=new Pair_09<>("hello", 1);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        //검색을 빠르게 할 수 있는 자료구조
        Map<String, Integer> maps=new HashMap<>();
        maps.put("kor", 60);
        maps.put("eng", 80);
        maps.put("math", 70);

        System.out.println(maps.get("kor"));//60
        System.out.println(maps.get("eng"));//80
        System.out.println(maps.get("math"));//70
    }
}
