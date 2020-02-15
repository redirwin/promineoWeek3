
public class Assignment {

    public static void main(String[] args) {

        // Part 1.	Create an array of int called ages that contains the 
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
}