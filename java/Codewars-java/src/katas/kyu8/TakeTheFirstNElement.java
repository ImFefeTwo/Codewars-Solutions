package katas.kyu8;

public class TakeTheFirstNElement {
    /*
    Create a function that accepts a list/array and a number n, and returns a list/array of the first n elements from the list/array.

    If you need help, here's a reference:
    https://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#copyOfRange(int[],%20int,%20int)
    */

    public static void main(String[] args) {
        int[] numbers = {1, 56, 75, 45, 56, 466};
        take(new int[]{0, 1, 2}, 6);
    }

    public static int[] take(int[] arr, int n) {
        if (arr == null || arr.length == 0 || n <= 0) {
            return new int[0];
        }
        int limit = Math.min(n, arr.length);
        int[] elements = new int[limit];
        for (int i = 0; i < limit; i++) {
            elements[i] = arr[i];
            System.out.println(elements[i]);
        }
        return elements;
    }
}


