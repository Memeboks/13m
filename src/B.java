import java.util.Scanner;

public class B {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for (int i=2; i<q; i++) {
            if (meme(i) ==true)
                System.out.print(i + " ");
            }
        }
        public static boolean meme(int i){
         if(i==2)
         return true;
         else {
         for (int k=2; k<=Math.sqrt(i); k++){
             if (i%k==0)
                 return false;
         }
         return true;
         }
    }
        }