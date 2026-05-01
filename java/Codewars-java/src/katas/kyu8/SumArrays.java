package katas.kyu8;

public class SumArrays {

    public static void main(String[] args) {
        double[] myArray = {15, 5, 10};
        System.out.println(sum(myArray));
    }

    public static double sum(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}


