package fc.java.part3;

import fc.java.model.StudentVO;

public class StudentTest {
    public static void main(String[] args) {
        //Q. 정수 6개를 저장할 배열
        int[] arr=new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=67;
        arr[4]=55;
        arr[5]=60;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //Q. 잘 설계된 학생 객체 설계하고 데이터를 저장 한 후 출력
        StudentVO vo=new StudentVO("홍길동", "컴퓨터공학과", 27, "bit@empas.com", 2023110, "010-1111-1111");
        System.out.println(vo);
    }
}
