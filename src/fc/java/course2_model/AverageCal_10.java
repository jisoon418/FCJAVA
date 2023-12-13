package fc.java.course2_model;

public class AverageCal_10<T extends Number> {
    private T[] numbers;

    public AverageCal_10(T[] numbers) {
        this.numbers = numbers;
    }

    public double calAverage() {
        double sum = 0.0;
        for (T number : numbers){
            sum+=number.doubleValue();
        }
        return sum/ numbers.length;
    }
}

