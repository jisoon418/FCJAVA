package fc.java.model;

public class CarDAO {
    //DB연결이 되었다는 가정하에 진행
    public void carInsert(CarDTO car){
        System.out.println("car정보가 DB에 저장되었습니다.");
    }
    public void carSelect(CarDTO car){
        System.out.println("car정보가 출력되었습니다");
    }
}
