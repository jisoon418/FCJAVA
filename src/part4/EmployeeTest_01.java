package part4;

public class EmployeeTest_01 {
    public static void main(String[] args) {
        //일반 사원 한명의 객체를 생성하고 데이터 저장 후 출력
        RempVO_01 vo=new RempVO_01("홍길동",33,"010-1111-1111","2022-10-10","홍보부",false);
        //출력
        //System.out.println(vo.name+"\t"+vo.age+"\t"+vo.phone+"\t"+vo.empDate+"\t"+vo.dept+"\t"+vo.marriage);
        System.out.println(vo.toString());
    }
}
