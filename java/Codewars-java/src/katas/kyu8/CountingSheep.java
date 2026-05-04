package katas.kyu8;

public class CountingSheep {

    /*
    Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

    For example:
    [true,  true,  true,  false,
    true,  true,  true,  true ,
    true,  false, true,  false,
    true,  false, false, true ,
    true,  true,  true,  true ,
    false, false, true,  true]

    The correct answer would be 17.

    Hint: Don't forget to check for bad values like null/undefined
    * */
    public static void main(String[] args) {
        Boolean[] sheeps = {true, false, true, true, true, false, false, true, false, true, true, true, false, false, true, true, true, false};
        System.out.println(sheeps.length);
        System.out.println(countSheeps(sheeps));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (int i = 0; i <= arrayOfSheeps.length - 1; i++) {
            if (arrayOfSheeps[i] instanceof Boolean && arrayOfSheeps[i]) {
                counter++;
            }
        }
        return counter;
    }
}
