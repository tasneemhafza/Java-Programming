package Basics.Array;
public class lec26_27_28_Arrays {

    public static void main(String[] args) {
    // 1. Declaration and then memory allocation
    int [] marks1;
    marks1 = new int [5];
    marks1[0] = 99;
    marks1[1] = 97;
    marks1[2] = 94;
    marks1[3] = 96;
    marks1[4] = 91;

    // 2. Declaration and memory allocation 
    //int [] marks2 = new int[5];

    //Declaration, memory allocation and initialization at once
    int [] marks3 = {67, 77, 89, 56, 78};  //indexing from 0

    System.out.println(marks1[4]);
    System.out.println(marks3[3]);
    //System.out.println(marks[5]);  --> error as theres no element 5

    float [] marks4 = {77.0f, 66.5f, 44.5f, 88.0f, 99.0f};
    String [] students = {"Tasneem", "BTS", "ARMY", "Mummy", "Papa"};

    // Array length counting 
    System.out.println(marks4.length);
    System.out.println(students[2]);

    // Displaying the array - naive way
    System.out.println("Printing all elements by naive way:");
    System.out.println(marks1[0]);
    System.out.println(marks1[1]);
    System.out.println(marks1[2]);
    System.out.println(marks1[3]);
    System.out.println(marks1[4]);

    // Displaying by using loop
    System.out.println("Printing all elements by using loop:");
    for(int i=0; i<marks1.length; i++) {
        System.out.println(marks1[i]);
    }
    //Quiz: print in reverse order
    System.out.println("Printing in reverse:");
    for(int i=marks1.length-1; i>=0; i--) {
        System.out.println(marks1[i]);
    }

    //Quiz: Display using for-each loop
    System.out.println("Printing using for-each loop:");
    for(int element: marks1) {
        System.out.println(element);
    }
   

    // MUltiDimentional Array:-
    // 2-D Array like matrix 
    int [][] apartment;  //[rows][column]--> [floors (0-groundfloor)][rooms]
    apartment = new int [2][3]; //2*3=6 elements
    apartment[0][0] = 101;
    apartment[0][1] = 102;
    apartment[0][2] = 103;
    apartment[1][0] = 201;
    apartment[1][1] = 202;
    apartment[1][2] = 203;

    //Displaying 2-D array using loop
    for(int i=0; i<=apartment.length; i++) {
        for(int j=0; j<apartment[i].length; j++) {
            System.out.print(apartment[i][j]);
            System.out.print(" "); //adds space between elements
        }
        System.out.println(""); // adds a new line for next row
    }
}
    
}
