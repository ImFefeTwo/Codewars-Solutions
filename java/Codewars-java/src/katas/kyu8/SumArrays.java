package katas.kyu8;

public class SumArrays {

    /*
    Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative. If the array is empty, return 0.
    Examples

    Input: [1, 5.2, 4, 0, -1]
    Output: 9.2

    Input: [-2.398]
    Output: -2.398

    Input: []
    Output: 0
    Assumptions

    You can assume that you are given a (possibly empty) valid array containing only numbers.

    What We're Testing

    We're testing basic loops and math operations. This is for beginners who are just learning loops and math operations.
    Advanced users may find this extremely easy and can easily write this in one line.
    */

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


