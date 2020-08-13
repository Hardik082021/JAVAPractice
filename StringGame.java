package basic;

import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        int s1=0,s2=0;
        for(int i=0;i<S1.length();i++){
            s1+=S1.charAt(i);
        }
        for(int i=0;i<S2.length();i++){
            s2+=S2.charAt(i);
        }
        int c = sc.nextInt();
        switch (c){
            case 1:
                X(s1,s2);
                break;
            case 2:
                X(S1,S2);
                break;
            case 3:
                X(s1,S2);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
    public static void X(int A, int B){
        System.out.println(A+B);
    }
    public static void X(String A, String B){
        System.out.println(A+B);
    }
    public static void X(int A, String B){
        int sum=0;
        for(int i=0;i<B.length();i++){
            sum+=B.charAt(i);
        }
        System.out.println(sum+A);
    }
}
