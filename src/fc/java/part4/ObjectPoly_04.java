package fc.java.part4;
import fc.java.poly.*;

public class ObjectPoly_04 {
    public static void main(String[] args) {
        A_04 a=new A_04();
        display(a);
        B_04 b=new B_04();
        display(b);
    }

    private static void display(Object x) {//하나만 만들어서 확장하는게 쉬움
        if (x instanceof A_04) {
            ((A_04)x).printGO();
        }else{
            ((B_04)x).printGO();
        }
    }
}
