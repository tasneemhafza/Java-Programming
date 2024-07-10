package Basics.InOut;
import java.util.Scanner;

public class lec05_UserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from user:");
        try (// Integer
        Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int sum1 = a+b;
            System.out.print("The sum of two numbers is = ");
            System.out.println(sum1);

            // Float
            System.out.print("Enter first number: ");
            float x = sc.nextFloat();
            System.out.print("Enter second number: ");
            float y = sc.nextFloat();
            float sum2 = x+y;
            System.out.print("The sum of two numbers is = ");
            System.out.println(sum2);

            // Boolean
            System.out.println("Checking input from user is a integer or not:-");
            boolean b1 = sc.hasNextInt(); //checks wheather input is an int or not and returns true or false
            System.out.println(b1); 

            // Strings
            System.out.println("Taking 1st input from user:");
            //String str = sc.next();    //either sc.next or sc.nextLine at once
            String str = sc.nextLine();  //for multiple words
            System.out.println(str);
        }
    }
}