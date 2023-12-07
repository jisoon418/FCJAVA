package fc.java.part4;

import fc.java.poly.Radio_03_1;
import fc.java.poly.Remocon_03_1;
import fc.java.poly.TV_03_1;

public class interfacetest_03_1 {
    public static void main(String[] args) {
        //리모콘으로 라디오와 TV를 동작시켜보자
        // 다형성이 보장되며 상위클래스가 인터페이스이면 하위클래스의 내부 동작을 몰라도 동작 시킬 수 있음
        Remocon_03_1 remo=new Radio_03_1();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();

        remo=new TV_03_1();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
    }

}
