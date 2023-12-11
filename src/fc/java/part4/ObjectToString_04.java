package fc.java.part4;

import fc.java.poly.Board_04;

public class ObjectToString_04 {
    public static void main(String[] args) {
        Board_04 b=new Board_04();
        b.setTitle("게시글입니다");
        //System.out.println(b.getTitle());
        System.out.println(b.toString());//fc.java.poly.Board_04@7a79be86 -> 게시글입니다 출력하고싶음
        System.out.println(b);//fc.java.poly.Board_04@7a79be86 -> 게시글입니다 출력하고싶음 -> 재정의해야함

    }
}
