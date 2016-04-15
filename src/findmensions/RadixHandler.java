package findmensions;

/**
 *
 * @author Tiffany Sawyer
 */
public abstract class RadixHandler {
    
    /**
     * Turn a list of strings representing numbers in a certain base
     * into a list of decimal numbers
     * @param listOfNums
     * An array of strings representing numbers in a base
     * @param radix
     * The radix of the numbers
     * @return 
     * A list of the numbers converted to base 10
     */
    public static int[] stringToNumber(String[] listOfNums, int radix) {
        
        // Create list of decimal numbers same size as list of strings
        int[] decimalNums = new int[listOfNums.length];
        
        // Iterate through list of strings
        // Convert each string to number and add to number list
        for (int i = 0; i < listOfNums.length; i++) {
            decimalNums[i] = Integer.valueOf(listOfNums[i], radix);
        }
        
        return decimalNums;
    }
    
    /**
     * Turn a list of decimal numbers into a list of string representing
     * those numbers in a selected radix
     * @param listOfNums
     * An array of decimal numbers
     * @param radix
     * The radix you want the numbers to be represented in
     * @return 
     * A list of strings representing characters in a selected base
     */
    public static String[] numberToString(int[] listOfNums, int radix) {
        
        String[] radixedList = new String[listOfNums.length];
        
        // Iterate through list of numbers
        // Convert each number to string and add to string list
        for (int i = 0; i < listOfNums.length; i++) {
            radixedList[i] = Integer.toString(listOfNums[i], radix);
        }
        
        return radixedList;
        
    }
    
}
