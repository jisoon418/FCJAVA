package fc.java.course2_model;

import fc.java.part2.Book;

import java.util.Arrays;

public class BookArray_02 {
    private static final int DEFAULT_CAPACITY=5; //final을 적으면 DEFAULT_CAPACITY 값을 수정할 수 없음
    private Book_02[] elements;
    private int size=0;
    //생성동작
    public BookArray_02(){
        elements=new Book_02[DEFAULT_CAPACITY]; //5개 크기의 배열
    }

    //저장하는 동작
    public void add(Book_02 element){
        if(size==elements.length){
            //크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        //크기 체크
        elements[size++]=element;
    }
    //얻는 동작
    public Book_02 get(int index){ //-1, 5~~는 넣으면 안되므로
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("index의 범위가 초과");
        }
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
