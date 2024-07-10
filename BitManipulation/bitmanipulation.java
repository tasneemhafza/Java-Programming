package BitManipulation;

import java.util.*;
public class bitmanipulation {
    public static void main(String[] args) {
    // Get bit 
    /* 
        int n=5;
        int position = 3;
        int bitMask = 1<<position;
        if ((bitMask & n)==0) 
        {
            System.out.println("Bit was zero.");
        } else{
            System.out.println("Bit was one");
        } 
    */

    // Set bit
        // int n=5; //0101, 1 << 1 = 0010 then 0010 or 0101= 0111=7
        // int position = 1;
        // int bitMask = 1<<position;
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

    // Clear bit -> 1 will be printed
        // int n=5;
        // int position = 2;
        // int bitMask = 1<<position;
        // int newBitMask = ~(bitMask); //~ -> not
        // int newNumber = newBitMask & n;
        // System.out.println(newNumber);

    // Update bit
    System.out.println("Enter the operatio:\n1. Set\n2. Clear");
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        //operation =1-> set ; operation =0-> clear
        int n=5;
        int position = 1;
        int bitMask = 1<<position;
        if(operation==1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMask); //~ -> not
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
        
    }
}
