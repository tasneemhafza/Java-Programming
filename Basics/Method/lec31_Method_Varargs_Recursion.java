package Basics.Method;

public class lec31_Method_Varargs_Recursion {

    //Static Method
    // static int logic(int x, int y){  //a fuinction/Method
    //     int z;
    //     if(x>y){
    //         z = x+y;
    //     }
    //     else {
    //         z = (x +y) * 5;
    //     }
    //     x = 566;
    //     return z;
    // }
    // public static void main(String[] args) {  
    //     int a = 5;
    //     int b = 7;
    //     int c;
    //     // Method invocation using Object creation
    //     //cwh_31_methods obj = new cwh_31_methods();
    //     //c = obj.logic(a, b);
    //     c = logic(a, b);
    //     System.out.println(a + " "+ b);
    //     int a1 = 2;
    //     int b1 = 1;
    //     int c1;
    //     c1 = logic(a1, b1);
    //     System.out.println(c);
    //     System.out.println(c1);

    //By Object Creation
    //     class calculate{
    //         int multiply(int a,int b){
    //            return a*b;
    //        }
    //        double multiply(double a,double b){
    //             return  a*b;
    //        }
       
    //    public static void main(String[] args) {
       
    //            calculate obj = new calculate(); //gives error while CWH doesnt with same code
    //            int c = obj.multiply(5,4);
    //            double d = obj.multiply(5.1,4.2);
    //            System.out.println("Mutiply method : returns integer : " + c);
    //            System.out.println("Mutiply method : returns double : " +  d);
       
    //}


    //Method overloading
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!"); 
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    // public static void main(String[] args) {
    //     // tellJoke();

    //     // Case 1: Changing the Integer
    //     int x = 45;
    //     change(x);
    //     System.out.println("The value of x after running change is: " + x);

    //     // Case 1: Changing the Array
    //     int [] marks = {52, 73, 77, 89, 98, 94};
    //     change2(marks);
    //     System.out.println("The value of x after running change is: " + marks[0]);


    //     // Method Overloading
    //     foo();
    //     foo(3000);
    //     foo(3000, 4000);
    //     // Arguments are actual!


        // //Varargs
        // class calculate {

        //     static int add(int ...arr){
        //         int result = 0;
        //         for (int a : arr){
        //             result = result + a;
        //         }
        //         return result;
        // }
        
        // public static void main(String[] args){
        //     System.out.println(add(1,2));
        //     System.out.println(add(2,3,4));
        //     System.out.println(add(4,5,6));
        // }
        // }
        

        //Recursion

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of factorial x is: " + factorial(x));
    }

} 

