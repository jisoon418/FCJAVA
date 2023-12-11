package fc.java.course2.part1;

import fc.java.course2_model.Book_02;

import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        //Book 3권을 배열에 저장하고 출력
        ArrayList list=new ArrayList();//기본크기는 10임, Object[]를 가지고 있음
        list.add(new Book_02("자바",15000,"한빛","홍길동"));
        list.add(new Book_02("C++",17000,"대림","김길동"));
        list.add(new Book_02("Python",16000,"정보","이길동"));

        //Book_02 vo=(Book_02)list.get(0);// Book<---(Book)Object 다운캐스팅
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //다운캐스팅안해도 JVM에서 자동으로 toString()
        }
    }
}
