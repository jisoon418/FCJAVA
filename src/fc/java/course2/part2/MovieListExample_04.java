package fc.java.course2.part2;

import fc.java.course2_model.Movie_04;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieListExample_04 {
    public static void main(String[] args) {
        ArrayList<Movie_04> list=new ArrayList<>();
        list.add(new Movie_04("괴물", "봉준호", "2006","한국"));
        list.add(new Movie_04("기생충", "봉준호", "2019","한국"));
        list.add(new Movie_04("완벽한 타인", "이재규", "2018","한국"));

        for(Movie_04 m : list){
            System.out.println(m);
        }

        System.out.println("+----------------+------+----+------+");
        System.out.println("+     영화감독    | 감독 | 개봉년도 |국가|");
        System.out.println("+----------------+------+----+------+");
        for(Movie_04 m :list){
            System.out.printf("|%-10s|%-5s|%4s|%-4s|\n",m.getTitle(),m.getDirector(),m.getYear(),m.getCountry());
        }

        System.out.println("+----------------+------+----+------+");

        String searchTitle="기생충";
        for(Movie_04 m : list){
            if(m.getTitle().equals(searchTitle)){
                System.out.println(m);
                break;
            }
        }
    }
}
