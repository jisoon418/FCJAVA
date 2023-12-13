package fc.java.course2.part2;

import java.util.ArrayList;
import java.util.List;
import fc.java.course2_model.Movie_04;

public class ArrayListGeneric_08 {
    public static void main(String[] args) {
       /* List list = new ArrayList(); //Object[]로 되어있음
        list.add(new Movie_04("괴물", "봉준호", "2006", "한국"));
        list.add("Hello");
        //여러가지 타입을 넣었을 때 안정성 보장 X, 어떤 타입이 들어갈지 모름

        System.out.println(list.get(0));
        System.out.println(list.get(1));*/

        List<Movie_04> list = new ArrayList(); //Movie[] 배열로 바뀜
        list.add(new Movie_04("괴물", "봉준호", "2006", "한국"));
        list.add(new Movie_04("기생충", "봉준호", "2019","한국"));
        //list.add("Hello"); 에러남
        //여러가지 타입을 넣었을 때 안정성 보장 X, 어떤 타입이 들어갈지 모름

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
