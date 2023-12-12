package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample_06 {
    public static void main(String[] args) {
        Map<String, Integer> stdScores=new HashMap<>();
        stdScores.put("Kim", 95);
        stdScores.put("Lee", 85);
        stdScores.put("Park", 90);
        stdScores.put("Choi", 80);

        System.out.println("Kim's score:" + stdScores.get("Kim"));

        //수정
        stdScores.put("Park", 92);
        System.out.println("Park's update score:" + stdScores.get("Park"));

        //삭제
        stdScores.remove("Choi");
        System.out.println("Choi's score removal:" + stdScores.get("Choi"));

        //전체데이터 출력
        for(Map.Entry<String, Integer> entry:stdScores.entrySet()){
            System.out.println(entry.getKey() + "'s score : " + entry.getValue());
        }
    }
}
