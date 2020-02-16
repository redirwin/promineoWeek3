
public class Assignment {

    public static void main(String[] args) {

       ages();     
       names();   
        
    }

    // Part 1:	Create an array of int called ages that contains the 
    // following values: 3, 9, 23, 64, 2, 8, 28, 93.

    public static void ages() {

        int[] ages = new int[]{3, 9, 23, 64, 2, 8, 28, 93, 41};
    
        // a. Programmatically subtract the value of the first element 
        // in the array from the value in the last element of the array 
        // (do not type ANY numbers in the operation, ages[7] – ages[0] 
        // is not allowed). Print the result to the console.

        int first = ages[ages.length - ages.length]; // can't input [0], so calculate instead
        int last = ages[ages.length - 1]; // last item is at (length - 1) since arrays start at 0
        
        // b. Add a new age to your array and repeat the step above to 
        // ensure it is dynamic (works for arrays of different lengths).

            // SEE ARRAY ABOVE
        
        // c. Use a loop to iterate through the array and calculate the 
        // average age. Print the result to the console.
        
        System.out.println(last - first);

        double ageSum = 0;

        for (int i = 0; i < ages.length; i++) {
            ageSum += ages[i];
        }

        System.out.println(ageSum / ages.length);  

    }

    // Part 2: Create an array of String called names that contains the following values: 
    // “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    
    public static void names() {

        String[] names = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a.	Use a loop to iterate through the array and calculate the average number 
        // of letters per name. Print the result to the console.

        int charCount = 0; 

        for (String name : names) {     
            charCount += name.length(); 
        }

        System.out.println("Average number of letters: " + (charCount / names.length)); 

        // b.	Use a loop to iterate through the array again and concatenate all the names 
        // together, separated by spaces, and print the result to the console.

        String allNames = "";

        for (String name : names) {
            allNames = allNames.concat(name).concat(" ");
        }

        System.out.println("All names: " + allNames);
        
        
        // Part 3: How do you access the last element of an array? 
        // --->>> Use array[array.length - 1]
        
        // Part 4: How do you access the first element of an array?
        // --->>> Use array[0]
        
        // Part 5: Create a new array of int called nameLengths. Write a loop to 
        // iterate over the previously created names array and add the length of each 
        // name to the nameLengths array.

        int[] nameLengths = new int[names.length];

        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        
        
    }
}