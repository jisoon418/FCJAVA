package fc.java.course2.part1;

public class StringManupulation_03 {
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(str.charAt(1));//괄호안의 인덱스에 있는 문자
        System.out.println(str.replaceAll("o", "X"));//"o"문자를 "X"로 변환
        System.out.println(str.length());//문자열 길이
        System.out.println(str.toUpperCase());//모두 대문자
        System.out.println(str.toLowerCase());//모두 소문자
        System.out.println(str.substring(5));//괄호안에 있는 인덱스부터 끝까지 가져옴
        System.out.println(str.substring(5,8));//5 인덱스부터 8 인덱스 전까지인 7 즉, 5,6,7만 가져옴
        System.out.println(str.indexOf("W"));//괄호안에있는 문자가 있는 인덱스를 출력
        for (int i = 0; i < str.length(); i++) { //문자를 하나씩 꺼내오고싶을때
            System.out.println(str.charAt(i));

        }
    }
}
