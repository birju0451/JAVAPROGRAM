package PLACEMENT;


/*
 * lusi is the huge fan of movie and visited the film festible but she not sure which movie she
 * will watch,each movie can be c by two integer  li ans Ri denoting the length and rating the corresponding the  movie,losi want to watch exactly one movie with the mamimu value of li*ri 
 * if there are severa such mov she would pic one with maximun valu of Ri if there till at i she would pic one with the minimul index among them
 * 
 * input formate
 * the first line of the input contains the interger N which is going to tell the totol no movie
 * second line ofhte input constain N intege which are having l1,l2.......ln
 * the third line of input contain n integer ranging fromn r1 to rn
 * 
 * output will be the singel integer which denotes i value what losi want to watch
 * 
 * inpu:2 
 * 2 1
 * 1 2    output:1 
 * 
 * 3
 * 2 1 1
 * 1 3 4  output 3
 */
import java.util.Scanner;
public class x {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Total no movie : ");
        int N=sc.nextInt();
        int[] len=new int[N];
        int[] rat=new int[N];
        System.out.println("Enetr the length of the movie:");
        for (int i = 0; i < N; i++) {
            len[i]=sc.nextInt();
        }
        System.out.println("Enetr the Rating  of the movie:");
        for (int i = 0; i < N; i++) {
            rat[i] = sc.nextInt();
        }

        int [] max=new int[N];
        for (int i = 0; i < N; i++) {
            max[i] = len[i]*rat[i];
        }
        boolean flag=true;//let l*r max array have same element
        for (int i = 0; i < max.length-1; i++) {
            if(max[i]!=max[i+1]){
                flag=false;
            }
        }

        int Rat_ans=Integer.MIN_VALUE;
        if(flag==true){
            for (int i = 0; i < rat.length; i++) {
                if(rat[i] > Rat_ans){
                    Rat_ans =i;  // Fix: Store rating, not index
                 }
            }
        }
        System.out.println(Rat_ans);
        sc.close();
    }
}
