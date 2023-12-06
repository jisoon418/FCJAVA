package fc.java.part2;

public class ApiOverloading {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('a');
        System.out.println("apple");
        //여기서 println이 메소드의 오버로딩
        int max=maxValue(7,9);
        System.out.println("max = " + max);
        int min=minValue(3,8);
        System.out.println("min = " + min);
    }
    //Q. 두개의 정수를 매개변수로 받아서 더 큰 수를 리턴하는 메서드 정의
    public static int maxValue(int a, int b){
        return (a>b) ? a : b;
    }
    //Q.두개의 정수를 매개변수로 받아서 더 작은 수를 리턴하는 메서드 정의
    public static int minValue(int a, int b){
        return (a<b) ? a : b;
    }
    
}
