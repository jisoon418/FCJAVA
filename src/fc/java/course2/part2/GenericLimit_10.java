package fc.java.course2.part2;

import fc.java.course2_model.AverageCal_10;

public class GenericLimit_10 {
    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5};
        Double[] doubles={1.0, 2.0, 3.0, 4.0, 5.0};

        AverageCal_10<Integer> integerCalculator=new AverageCal_10<>(integers);
        double integerAverage=integerCalculator.calAverage();
        System.out.println(integerAverage);

        AverageCal_10<Double> doubleCalculator=new AverageCal_10<>(doubles);
        double doubleAverage=doubleCalculator.calAverage();
        System.out.println(doubleAverage);
    }
}
