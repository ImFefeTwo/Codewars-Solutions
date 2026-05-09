package katas.kyu8;

public class GetCharacterFromASCIIValue {
    /*
    Write a function which takes a number and returns the corresponding ASCII char for that value.

    Example:
    65 --> 'A'
    97 --> 'a'
    48 --> '0
    For ASCII table, you can refer to http://www.asciitable.com/
    */
    public static void main(String[] args) {
        System.out.println(getChar(55));
        System.out.println(getChar(123));
        System.out.println(getChar(77));
        System.out.println(getChar(35));
    }

    public static char getChar(int c) {
        char character = (char) c;
        return character;
    }
}
