package PLACEMENT;



public class lexography {
    public static void main(String[] args) {
        String str1="this is car";
        String str2="this is car";
        int count=0;
        if (str1.length()==str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i)==str2.charAt(j)) {
                        count++;
                    }
                }
            }
        }

        if (count==str1.length() && count==str2.length() ) {
            System.out.println("the given string is lexographically");
        }
    }
}
