package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample_05 {
    public static void main(String[] args) {
        Set <String> set=new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); //중복X

        //크기
        System.out.println(set.size()); //중복안되므로 3 나옴

        for(String element : set){
            System.out.println(element);
        }

        //요소 삭제
        set.remove("Banana");
        for(String element : set){
            System.out.println(element);
        }

        //포함되어있는지
        boolean contains= set.contains("Cherry");
        System.out.println("체리가 포함되어있는가? " + contains);

        //전체비우기
        set.clear();
        boolean empty= set.isEmpty();
        System.out.println("비워졌는지? "+ empty);
    }
}
