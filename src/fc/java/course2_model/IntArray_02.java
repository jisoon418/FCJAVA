package fc.java.course2_model;

import java.util.Arrays;

public class IntArray_02 {
    private static final int DEFAULT_CAPACITY=5; //final을 적으면 DEFAULT_CAPACITY 값을 수정할 수 없음
    private int[] elements;
    private int size=0;
    //생성동작
    public IntArray_02(){
        elements=new int[DEFAULT_CAPACITY]; //5개 크기의 배열
    }

    //저장하는 동작
    public void add(int element){
        if(size==elements.length){
            //크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        //크기 체크
        elements[size++]=element;
    }
    //얻는 동작
    public int get(int index){ //-1, 5~~는 넣으면 안되므로
        //index 체크? >> if문 사용
        return elements[index];
    }
    //원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }

    public void ensureCapacity(){
        int newCapacity= elements.length*2;
        elements=Arrays.copyOf(elements, newCapacity);
    }
}
