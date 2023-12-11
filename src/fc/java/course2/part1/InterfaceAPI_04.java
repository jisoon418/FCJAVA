package fc.java.course2.part1;

import fc.java.course2_model.BB_04;
import fc.java.course2_model.CC_04;

public class InterfaceAPI_04 {
    public static void main(String[] args) {
        CC_04 c=new BB_04();
        c.x();//BB_04의 x()가 동작 -> 동적바인딩
        c.y();
        c.z();
    }
}
