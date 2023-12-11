package fc.java.course2.part1;

public class HelloWorldString_03 {
    public static void main(String[] args) {
        String str=new String("HelloWorld"); //heap area
        System.out.println(str.toString()); //.toString()은 원래 생략되어있음

        String str1="Hello world"; //Literal Memory
        System.out.println(str1.toString()); //.toString()은 원래 생략되어있음
    }
}
