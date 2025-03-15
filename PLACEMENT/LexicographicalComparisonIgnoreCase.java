package PLACEMENT;



public class LexicographicalComparisonIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Applehghgvgh";
        String str2 = "apple";

        int result = str1.compareToIgnoreCase(str2);
        if (result == 0) {
            System.out.println("Both strings are lexicographically equal (ignoring case).");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\".");
        } else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\".");
        }
    }
}
