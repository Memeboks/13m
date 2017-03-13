import java.util.Scanner;

public class A {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        System.out.print(q+" "+(q*q)+" "+(q*q*q)+" "+(q*q*q*q));
    }
}