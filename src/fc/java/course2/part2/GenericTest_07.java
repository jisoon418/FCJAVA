package fc.java.course2.part2;

import fc.java.course2_model.Movie_04;
import fc.java.course2_model.ObjectArr07;
import fc.java.part2.Book;
import fc.java.part2.Movie;


public class GenericTest_07 {
    public static void main(String[] args) {
        /*ObjectArr07<String> array=new ObjectArr07<>(5);
        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "Java");
        array.set(3, "Generic");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }*/

        ObjectArr07<Movie_04> blist=new ObjectArr07<>(5);
        blist.set(0, new Movie_04("괴물", "봉준호", "2006","한국"));
        blist.set(1, new Movie_04("기생충", "봉준호", "2019","한국"));
        blist.set(2, new Movie_04("완벽한 타인", "이재규", "2018","한국"));

        for (int i = 0; i < blist.size(); i++) {
            System.out.println(blist.get(i));

        }
    }
}
