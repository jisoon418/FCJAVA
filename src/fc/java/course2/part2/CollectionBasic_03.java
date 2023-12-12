package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic_03 {
    public static void main(String[] args) {
        //arraylist에 10.20.30.40.50 5개의 정수를 저장하고 출력
        //arraylist -> object[] class 배열이 들어있음, 근데 int를 넣으려면? Integer로 넣어야함
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for(int data:list){
            System.out.println(data);
        }
    }
}
