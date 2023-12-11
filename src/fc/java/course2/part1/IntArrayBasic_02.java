package fc.java.course2.part1;

public class IntArrayBasic_02 {
    public static void main(String[] args) {
        int[] arr=new int[5]; //가변길이로만들어야함
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        for (int i = 0; i < arr.length; i++) {
            int data=arr[i]; //데이터를 얻는 동작
            System.out.println(data);
        }
        for(int data:arr){
            System.out.println(data);
        }
    }
}
