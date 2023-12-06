package fc.java.part3;

import fc.java.model.StudentVO;

public class StudentArrayTest {
    public static void main(String[] args) {
        //Q. 객체배열을 이용하여 4명의 학생 데이터를 저장하고 출력
        StudentVO[] std=new StudentVO[4];
        std[0]=new StudentVO("김지영", "컴공", 26, "bit@caead.com", 20231110, "010-111-111");
        std[1]=new StudentVO("이문배", "환경", 30, "bit@caead.com", 20231111, "010-111-111");
        std[2]=new StudentVO("누렁이", "문창", 12, "bit@caead.com", 20231113, "010-111-111");
        std[3]=new StudentVO("탱고", "몰루", 11, "bit@caead.com", 20231115, "010-111-111");
        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i]);

        }
        for( StudentVO st : std){
            System.out.println(st.toString());
        }
    }
}
