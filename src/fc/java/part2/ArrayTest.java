package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
       int[] a={10,20,30,40,50};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        int sum=a[0]+a[3];
        System.out.println("sum = " + sum);
    }
}
