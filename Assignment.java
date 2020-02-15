
public class Assignment {

    public static void main(String[] args) {

    //    ages();     
       names();   
        
    }

    public static void ages() {

         // Part 1:	Create an array of int called ages that contains the 
        // following values: 3, 9, 23, 64, 2, 8, 28, 93.
        
            // a. Programmatically subtract the value of the first element 
            // in the array from the value in the last element of the array 
            // (do not type ANY numbers in the operation, ages[7] – ages[0] 
            // is not allowed). Print the result to the console.
            
            // b. Add a new age to your array and repeat the step above to 
            // ensure it is dynamic (works for arrays of different lengths).
            
            // c. Use a loop to iterate through the array and calculate the 
            // average age. Print the result to the console.
        
        int[] ages = new int[]{3, 9, 23, 64, 2, 8, 28, 93, 41};

        int first = ages[ages.length - ages.length]; // can't input [0], so calculate instead
        int last = ages[ages.length - 1]; // last item is at (length - 1) since arrays start at 0

        System.out.println(last - first);

        double ageSum = 0;

        for (int i = 0; i < ages.length; i++) {
            ageSum += ages[i];
        }

        System.out.println(ageSum / ages.length);       

    }
    
    public static void names() {

        // Part 2: Create an array of String called names that contains the following values: 
        // “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
            // a.	Use a loop to iterate through the array and calculate the average number 
            // of letters per name. Print the result to the console.
            // b.	Use a loop to iterate through the array again and concatenate all the names 
            // together, separated by spaces, and print the result to the console.

        String[] names = new String[]{"Tommy", "Tim", "Sally", "Buck", "Bob"};

        int charCount = 0; 

        for (String name : names) {     
            charCount += name.length(); 
        }

        System.out.println("Average number of letters: " + (charCount / names.length)); 

        String allNames = "";

        for (String name: names) {
            allNames = allNames.concat(name).concat(" ");
        }

        System.out.println("All names: " + allNames);

        
    }



}