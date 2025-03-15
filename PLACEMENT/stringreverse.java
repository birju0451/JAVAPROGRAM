package PLACEMENT;



import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        int i=0,j=ch.length-1;
        while (i<j) {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
        }
        System.out.println(ch.toString());
        sc.close();
    }
}