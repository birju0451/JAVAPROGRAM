package PLACEMENT;


/*1. Using compareTo()
The compareTo() method works as follows:

Returns 0 if both strings are equal.
Returns a negative number if the first string is lexicographically smaller.
Returns a positive number if the first string is lexicographically greater.
 */
public class LexicographicalComparison {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("Both strings are lexicographically equal.");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\".");
        } else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\".");
        }
    }
}
