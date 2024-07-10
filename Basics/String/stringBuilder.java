package Basics.String;

public class stringBuilder {
        public static void main(String[] args) {
            // Create a StringBuilder
            StringBuilder sb = new StringBuilder("Hello");
    
            //append method is used to add a string, a character, an integer, and a double to the 
            sb.append("World");
            sb.append('!');
            sb.append(123);
            sb.append(3.14);
    
            // Insert characters at a specific position
            sb.insert(5, ","); // Inserts a comma at index 5
    
            // Delete characters
            sb.delete(6, 11); // Deletes characters from index 6 to 10]
            
    
            // Replace characters
            sb.replace(5, 6, "!"); // Replaces the character at index 5 with '!'
    
            // Convert StringBuilder to String
            String result = sb.toString();
    
            System.out.println(result); // Output: Hell, World
        
    }
    
}
