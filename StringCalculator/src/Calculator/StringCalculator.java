package Calculator;

public class StringCalculator {
	public static int add(final String numbers) {
	    int returnValue = 0;
	    String[] numbersArray = numbers.split(",|n"); // Added |n to the split regex
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) {
	            returnValue += Integer.parseInt(number.trim());
	        }
	    }
	    return returnValue;
	}
}
