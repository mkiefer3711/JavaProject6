//@author Maddison Kiefer

import java.util.Scanner;


public class toArray {
    
    // Method to convert a comma-separated string to an array of strings
    public static String[] stringToArray(String value) {
        String words[];
        
        // Checks if the input string is empty
        try {
            if("".equals(value)) {
                throw new Exception("String cannot be empty.");
            }
            
            // Splits input into an array of strings
            words = value.split(",");
            // Trims the extra spaces from each element
            for(int i = 0; i < words.length; i++) {
                words[i] = words[i].trim();
            }
            
            // Checks if the input string is greater than 3
            if(words.length < 3) {
                throw new Exception("There are not enough values.");
            }
            // Checks if the input string is less than 3
            else if(words.length > 3) {
                throw new Exception("There are more than three values.");
            }
            else {
                System.out.println();
                System.out.println("Success!");
                System.out.println();
                System.out.println("The values are: ");
                // Returns the array
                return words;
            }
            
        }
        // Catches the exceptions and prints the error message
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        // Returns an empty array if there is an error
        return new String[0]; 
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        String[] words;
        // Receive the user inputs
        System.out.print("Enter three values separated by commas: ");
        input = scnr.nextLine();
        
        // Calls the stringToArray method on the input
        words = stringToArray(input);
        
        // Prints the elements if there are three of them
        if(words.length == 3) {
            for(int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
        }
    }
}
