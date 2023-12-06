package fc.java.part2;

public class MovieTest {
    public static void main(String[] args) {
        Movie v=new Movie();
        v.name="아바타";
        v.date="2022.12.14";
        v.actor="제이크 설리";
        v.genre="액션";
        v.time=192;
        v.grade="12세";
        System.out.println(v.name+"\t"+v.date+"\t"+v.actor+"\t"+v.genre+"\t"+v.time+"\t"+v.grade+"\t");
    }
}
