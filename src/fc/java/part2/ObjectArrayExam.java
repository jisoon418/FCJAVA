package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie[] m= new Movie[3];
        m[0]=new Movie();
        m[0].name="A영화";
        m[0].actor="김지영";
        m[0].time=160;
        m[0].grade="15세";
        m[0].date="20230115";

        m[1]=new Movie();
        m[1].name="B영화";
        m[1].actor="김지영";
        m[1].time=160;
        m[1].grade="15세";
        m[1].date="20230115";

        m[2]=new Movie();
        m[2].name="C영화";
        m[2].actor="김지영";
        m[2].time=160;
        m[2].grade="15세";
        m[2].date="20230115";
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].name+m[i].actor+"\t"+m[i].time+"\t"+m[i].grade+"\t"+m[i].date);

        }

    }
}
