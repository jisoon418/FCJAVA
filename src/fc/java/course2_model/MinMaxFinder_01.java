package fc.java.course2_model;

public class MinMaxFinder_01 {
    public static int findmin(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int findmax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
