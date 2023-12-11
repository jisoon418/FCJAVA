package fc.java.course2.part1;

import fc.java.course2_model.IntArray_02;

public class MyIntArrayTest_02 {
    public static void main(String[] args) {
        //정수 3개를 배열에 저장하고 출력
        IntArray_02 list=new IntArray_02();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);// 예외발생 -> 배열의 길이를 늘려야함

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
