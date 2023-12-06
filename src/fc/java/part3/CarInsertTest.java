package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        //키보드로부터 입력
        Scanner scan=new Scanner(System.in); //new는 객체를 생성할 때 쓰는 연산자, 오른쪽에는 객체를 생성하는 생성자 메서드
        System.out.print("자동차 일련번호:");
        int carSn=scan.nextInt();

        scan.nextLine(); //버퍼비우기, nextInt 다음에 엔터키가 스트림에 남아있기때문에

        System.out.print("자동차 이름:");
        String carName=scan.nextLine();

        System.out.print("자동차 가격:");
        int carPrice=scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 소유자:");
        String carOwner=scan.nextLine();

        System.out.print("자동차 년식:");
        int carYear=scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 타입:"); // G(휘발유), D(경유)
        String carType=scan.nextLine();

        CarDTO car=new CarDTO(); //fc.java.model. import 하기
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;

        CarDAO dao=new CarDAO();
        dao.carInsert(car);
        dao.carSelect(car);
    }
}
