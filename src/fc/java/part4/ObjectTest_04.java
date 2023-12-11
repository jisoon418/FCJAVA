package fc.java.part4;

import fc.java.poly.A_04;

public class ObjectTest_04 {
    public static void main(String[] args) {
        A_04 b=new A_04();
        b.display();
        Object a=new A_04();//upcasting
        ((A_04)a).display();//downcasting
    }
}
