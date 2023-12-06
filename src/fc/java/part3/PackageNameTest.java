package fc.java.part3;
//import java.lang.*; // lang에 있는 모든 클래스들은 디폴트 패키지로 항상 import 되므로 생략
import java.util.*;// util 패키지 아래에 scanner를 찾을 수 있도록 import를 적어줘야함
//import fc.java.model.CarDTO;
//import fc.java.model.*; //model 패키지에 있는 모든 클래스를 사용하고 싶을때

public class PackageNameTest {
    public static void main(String[] args) {
        java.lang.String str="홍길동";
        Scanner scan=new Scanner(java.lang.System.in);
        java.lang.System.out.println("Hello World");

        //직접 만든 클래스
        fc.java.model.CarDTO car= new fc.java.model.CarDTO();//import 안시키면 이렇게 적어야함


    }
}
