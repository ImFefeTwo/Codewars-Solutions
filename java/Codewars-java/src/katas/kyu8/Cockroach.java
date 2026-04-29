package katas.kyu8;

public class Cockroach {
    /*
    The cockroach is one of the fastest insects.
    Write a function which takes its speed in km per hour and returns
    it in cm per second, rounded down to the integer (= floored).
    For example: 1.08 --> 30

    Note! The input is a Real number (actual type is language dependent)
    and is >= 0. The result should be an Integer.
     */

    public static void main (String[] args) {
        Cockroach cockroach = new Cockroach();
        int finalSpeed = cockroach.cockroachSpeed(1.09);
        System.out.println(finalSpeed);
    }

    public int cockroachSpeed(double x){
        // km/h to cm/s and rounded down
        int speedInCmPerSec = (int) Math.floor(x / 0.036);
        return speedInCmPerSec;
    }
}

// ============================================================================
// NOTES
// "0.036" is a magic number. Could be improved by declaring a constant.
// Example: private static final double KM_H_TO_CM_S = 0.036;
// int speedInCmPerSec = (int) Math.floor(x / KM_H_TO_CM_S);
// ============================================================================
