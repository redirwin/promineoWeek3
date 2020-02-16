
public class Assignment {

    public static void main(String[] args) {

    //    ages();     
    //    names();   
    //    System.out.println(concatString("Ciao!", 12));
    //    System.out.println(getFullName("Dave", "Irwin"));
    System.out.println(isGreaterThan100(new int[]{101}));
              
    }

    // Part 1
    public static void ages() {

        // Create an array of int called ages that contains the 
        // following values: 3, 9, 23, 64, 2, 8, 28, 93.

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

    // Parts 2 - 6
    public static void names() {
        
        // Create an array of String called names that contains the following values: 
        // “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

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

        // Part 6: Write a loop to iterate over the nameLengths array and calculate
        // the sum of all the elements in the array. Print the result to the console.

        int sumLengths = 0;

        for (int length : nameLengths) {
            sumLengths += length;
        }

        System.out.println(sumLengths);        
        
    }

    // Part 7
    public static String concatString(String word, int n) {

        // Write a method that takes a String, word, and an int, n, as 
        // arguments and returns the word concatenated to itself n number of 
        // times. (i.e. if I pass in “Hello” and 3, I would expect the method to 
        // return “HelloHelloHello”).

        String concatedString = "";

        for (int i = 0; i < n; i++) {
            concatedString += word;
        }

        return concatedString;
    }

    // Part 8
    public static String getFullName(String firstName, String lastName) {

        // Write a method that takes two Strings, firstName and lastName, 
        // and returns a full name (the full name should be the first and 
        // the last name as a String separated by a space).

        return firstName + (" ") + (lastName);
    }

    // Part 9
    public static boolean isGreaterThan100(int[] numbers) {

        // Write a method that takes an array of int and returns true if the sum 
        // of all the ints in the array is greater than 100.

        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total > 100;

    }

}