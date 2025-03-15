package PLACEMENT;


public class lowerupper {
    public static void main(String[] args) {
        String s="HhhkkHHhhjGjh";
        StringBuilder l=new StringBuilder();
        StringBuilder u=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                l.append(s.charAt(i));
            }else{
                u.append(s.charAt(i));
            }
        }
        System.out.println(u.toString() + l.toString());
    }
}
