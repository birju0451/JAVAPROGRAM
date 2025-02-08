public class performstringoperation {
    public static void main(String[] args) {
        String s="welcome to sathyabama";
        int i;
        char ch;
        int b=s.length();
        System.out.println(b);

        for(i=0;i<b;i++){
            ch=s.charAt(i);
            if(ch=='e'){
                ch='*';
            }
            System.out.print(ch);
        }
    }
}
