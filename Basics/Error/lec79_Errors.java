package Basics.Error;
import java.util.*;
public class lec79_Errors {
    public static void main(String[] args) {
        //Syntax Error
        //int a=0 --> no semicolon
        //b=8; --> b not declared

        //Logical Errors
        //WAP to Print prime no bet 1 to 10
        System.out.println("2");
        for(int i=0; i<5; i++) {
            System.out.println(2*i+1); //3,5,7, and 9 whis is not prime
        }

        //Runtime Error
        int k;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of k= ");
            k=sc.nextInt();
        }
        System.out.print("Integer part of 1000 divided by k is = " +1000/k);
    }
}
