package PLACEMENT;


public class vowelConsonent {
    public static void main(String[] args) {
        String str=new String("i am indian");
        // char[] ch=str.toCharArray();
        int cons=0;
        int vow=0;
        for (int i = 0; i < str.length(); i++) {
            char chr=str.charAt(i);
            if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'||chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U'){
                vow++;
            }
            else cons++;
        }
        System.out.println(cons);
        System.out.println(vow);
    }
    
}
