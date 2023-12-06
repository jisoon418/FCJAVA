package fc.java.part2;

public class BasicArrayTest {
    public static void main(String[] args) {
        float[] f={24.5f, 45.6f,77.65f};
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);

        Book[] b=new Book[3]; //객체배열이라고함
        b[0]=new Book();
        b[0].title="자바";
        b[0].company="한빛";
        b[0].author="김지영";
        b[0].price=30000;
        b[0].page=500;
        b[0].isbn="11889900";

        System.out.println(b[0].title+"\t"+b[0].company+"\t"+b[0].author+"\t"+b[0].author+"\t"+b[0].price+"\t"+b[0].page+"\t"+b[0].isbn);
        b[1]=new Book();
        b[2]=new Book();


    }
}
