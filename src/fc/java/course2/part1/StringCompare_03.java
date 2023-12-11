package fc.java.course2.part1;

public class StringCompare_03 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";
        if(str1.equals(str2)){
            System.out.println("str1과 str2이 같습니다");
        }else{
            System.out.println("str1과 str2가 다릅니다");
        }
        String str3="apple";
        String str4="banana";
        int result=str3.compareTo(str4);
        if(result==0){
            System.out.println("str3과 str4가 같습니다");
        }else if(result<0){
            System.out.println("str4가 str3보다 더 큽니다");
        }else{
            System.out.println("str3이 str4보다 더 큽니다");
        }
    }
}
