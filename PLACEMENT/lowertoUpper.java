package PLACEMENT;



public class lowertoUpper {
    public static void main(String[] args) {
        String s="birju @ku$ma%r";
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                // int che=s.charAt(i)-32;
                // char ch=(char)che;
                char che=s.charAt(i);
                ans+=(char)(che-32);
               
            }
            else{
                ans=ans+s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
