package fc.java.course2.part1;

import fc.java.course2_model.BookArray_02;
import fc.java.course2_model.Book_02;

public class MyBookArrayTest_02 {
    public static void main(String[] args) {
        //책 3권 데이터 배열 저장, 출력
        BookArray_02 list=new BookArray_02();
        list.add(new Book_02("자바",15000,"한빛","홍길동"));
        list.add(new Book_02("C++",17000,"대림","김길동"));
        list.add(new Book_02("Python",16000,"정보","이길동"));

        //Book_02 vo=list.get(0);
        System.out.println(list.get(0));
        //vo=list.get(1);
        System.out.println(list.get(1));
        //vo=list.get(2);
        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
