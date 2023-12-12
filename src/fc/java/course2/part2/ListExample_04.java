package fc.java.course2.part2;

import java.util.ArrayList;

public class ListExample_04 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        list.remove(0);//apple 안나옴
        list.set(1,"orange");
        for(String str:list){
            System.out.println(str);
        }
    }
}
