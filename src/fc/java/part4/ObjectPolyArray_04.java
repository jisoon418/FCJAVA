package fc.java.part4;

import fc.java.poly.A_04;
import fc.java.poly.B_04;

public class ObjectPolyArray_04 {
    public static void main(String[] args) {
        //A,B 클래스를 저장할 배열 생성
        Object[] obj=new Object[2];
        obj[0]=new A_04();
        //((A_04)obj[0]).printGO();
        obj[1]=new B_04();
        display(obj);
        //((B_04)obj[1]).printGO();
/*
        for (int i = 0; i < obj.length; i++) {
            if(obj[i] instanceof A_04){
                ((A_04)obj[i]).printGO();
            }else{
                ((B_04)obj[i]).printGO();
            }

*/        }
    private static void display(Object[] obj) {
        for (int i = 0; i < obj.length; i++) {
            if(obj[i] instanceof A_04){
                ((A_04)obj[i]).printGO();
            }else{
                ((B_04)obj[i]).printGO();
            }

        }
    }

}

