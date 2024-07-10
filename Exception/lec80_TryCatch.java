package Exception;
import java.util.*;
public class lec80_TryCatch {
    public static void main(String[] args) {
//Try Catch block        
        int a = 6000;
        int b = 0;
        // Without Try:
//        int c = a / b;
//        System.out.println("The result is " + c);
        // With Try:
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");


//Handling Specific Exception--> Multiple Catch blocks
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the array index");
            int ind = sc.nextInt();

            System.out.println("Enter the number you want to divide the value with");
            int number = sc.nextInt();
            try{
                System.out.println("The value at array index entered is: " + marks[ind]);
                System.out.println("The value of array-value/number is: " + marks[ind]/number);
            }
            catch (ArithmeticException e){
                System.out.println("ArithmeticException occured!");
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException occured!");
                System.out.println(e);
            }
            catch (Exception e){
                System.out.println("Some other exception occured!");
                System.out.println(e);
            }

//Nested Try-Catch 
            int [] marks1 = new int[3];
            marks[0] = 7;
            marks[1] = 56;
            marks[2] = 6;
            try (Scanner scan = new Scanner(System.in)) {
            }
            boolean flag = true;
            while(flag) {
                System.out.println("Enter the value of index");
                int index = sc.nextInt();
                try { //try1
                    System.out.println("Welcome to video no 82");
                    try { //try2 under try1
                        System.out.println(marks1[index]);
                        flag = false;
                    } catch (ArrayIndexOutOfBoundsException e) { //catch2
                        System.out.println("Sorry this index does not exist");
                        System.out.println("Exception in level 2");
                    }
                } catch (Exception e) { //catch1
                    System.out.println("Exception in level 1");
                }
            }
        }
        System.out.println("Thanks for using this program");
    }
}
