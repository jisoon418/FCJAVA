package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //Q. 자동차의 정보를 키보드로 입력 받아 다른 메서드로 이동
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

        //System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
        // 자동차 데이터를 이동하기 위한 바구니가 필요, 클래스로 CarDTO, CarVO 설계
        //carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);
        CarDTO car=new CarDTO(); //fc.java.model. import 하기
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;
        carInfoPrint(car);
    }
    //Q. 매개변수로 자동차의 정보를 받아서 출력하는 메서드를 만드려면?
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }

}
