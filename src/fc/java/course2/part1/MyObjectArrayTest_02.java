package fc.java.course2.part1;

import fc.java.course2_model.A_02;
import fc.java.course2_model.B_02;
import fc.java.course2_model.C_02;
import fc.java.course2_model.ObjectArray_02;

public class MyObjectArrayTest_02 {
    public static void main(String[] args) {
        //A,B,C 객체를 배열에 저장하고 출력
        ObjectArray_02 list=new ObjectArray_02(4);
        list.add(new A_02()); //upcasting  Object element=new A_02();
        list.add(new B_02());
        list.add(new C_02());

        //반복문 사용X
        A_02 a=(A_02)list.get(0);//downcasting
        a.display();

        B_02 b=(B_02)list.get(1);//downcasting
        b.display();

        C_02 c=(C_02)list.get(2);//downcasting
        c.display();

        //반복문 사용
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof A_02){
                ((A_02)list.get(i)).display();
            } else if (list.get(i) instanceof B_02) {
                ((B_02)list.get(i)).display();
            }else{
                ((C_02)list.get(i)).display();
            }

        }
    }
}
