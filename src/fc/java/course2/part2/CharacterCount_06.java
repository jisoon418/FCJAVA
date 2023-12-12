package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount_06 {
    public static void main(String[] args) {
        String str="Hello, World";
        Map<Character, Integer> charCountMap=new HashMap<>();
        char[] strArray=str.toCharArray(); //char 배열로 만들기

        for(char c :strArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }
        System.out.println("Character Counts");
        for(char c : charCountMap.keySet()){
            System.out.println(c+ ":"+ charCountMap.get(c));
        }
    }
}
