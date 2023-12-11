package fc.java.course2.part1;

import fc.java.course2_model.MinMaxFinder_01;

public class MinMaxFinderTest_01 {
    public static void main(String[] args) {
        int[] arr={5,3,9,1,7};
        int min= MinMaxFinder_01.findmin(arr);
        int max= MinMaxFinder_01.findmax(arr);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
