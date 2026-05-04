package katas.kyu8;

public class ANeedleInTheHaystack {
    /*
    Can you find the needle in the haystack?
    Write a function findNeedle() that takes an array full of junk but containing one "needle"
    After your function finds the needle it should return a message (as a string) that says:
    "found the needle at position" plus the index it found the needle, so:

    Example(Input --> Output)
    ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
    */
    public static void main(String[] args) {
        Object[] objetos = {"junk", "more junk", new String("needle"), "gadget" };
        System.out.println(findNeedle(objetos));
    }

    public static String findNeedle(Object[] haystack) {
        int positionOfNeedle = -1;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] instanceof String && "needle".equals(haystack[i])) {
                positionOfNeedle = i;
            }
        }
        return "found the needle at position " + positionOfNeedle;
    }
}

// ============================================================================
// NOTES
// If we use "needle".equals(haystack[i]), instanceof is redundant.
// ============================================================================
