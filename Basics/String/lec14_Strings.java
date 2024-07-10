package Basics.String;

import java.util.Arrays;

public class lec14_Strings {

    public static void main(String[] args) {
        //String name = new String("Tasneem");
        String name = "Tasneem";  //indexing from 0123456
        char [] arr= name.toCharArray();
        System.out.println(arr[4]);
        int [] nums= {1,2,3,4};
        String str= nums.toString();
       
        //1. Length
        int value = name.length();
        System.out.println(value);


        //2. Lower case
        String lower = name.toLowerCase();
        System.out.println(lower);  //write tlc it will come

        //3. Upper case
        System.out.println(name.toUpperCase());   //name.toUpperCase()

        //4. Trim
        String nameUntrim = "     Tasneem     ";
        System.out.println(nameUntrim);
        System.out.println(nameUntrim.trim());   //removes spaces from front and end 

        //5. 6. Substring (imp)
        System.out.println(name.substring(4));  //from eem H...
        System.out.println(name.substring(1, 5)); //from asne excluding 5th
        name.substring(0, 1).toLowerCase();

        //7. Replace
        System.out.println(name.replace('T', 't')); //one char only
        System.out.println(name.replace("ee", "i")); //multiple char

        //8. 9. Check Starting
        System.out.println(name.startsWith("Tas"));  //boolean result
        System.out.println(name.endsWith("ze"));
        System.out.println(name.contains("sn"));  //true

        //10. Character finding (imp)
        System.out.println(name.charAt(6));
      

        //11. Index of: returns the index of the given string
        String modifiedName = "Tassnneem";
        System.out.println(modifiedName.indexOf("ss"));  //first occurance of s is at 2
        System.out.println(modifiedName.indexOf("ne", 5)); //search for ne from index 5 and print where it found
        //modifiedName.index of(name); //will return index of name (i.e Tasneem) if present in modifiedName

        //12. Last index of 
        System.out.println(modifiedName.lastIndexOf("nee", 7));  //search from 7 till it find nee and print n's 5
        System.out.println(modifiedName.lastIndexOf("nee"));  

        //13. Equals
        System.out.println(name.equals(modifiedName));
        System.out.println(name.equalsIgnoreCase("tASneem"));

        //14. Escape
        System.out.println("I am escaping sequence \"double quote\".");  //cannot simply give " " under ""

        
    }
}
