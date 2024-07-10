package JavaDocs;

// Classes Tags
// /**
//  * This class is to demonstrate what javadoc is and how it is used in the java industry //Description
//  * This is <i>italic</i> word<p>this is a new paragraph</p>
//  * @author Tasneem
//  * @version 0.1
//  * @since 2001
//  * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
//  */

// public class lec106_JavaDocs {
//     public void add(int a, int b){
//         System.out.println("The sum is: " + a+b);
//     }
//     public static void main(String[] args) {
//         System.out.println("This is my main method");
//     }
// }


// Method Tags
/**
 * This is a good class
 */
public class lec106_JavaDocs {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * Hello this is a method and this is the most beautiful method of this class
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + Operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c= i+ j;
        return c;
    }
}
