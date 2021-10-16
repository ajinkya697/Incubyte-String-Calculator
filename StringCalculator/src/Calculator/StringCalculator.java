package Calculator;

public class StringCalculator {
	public static int add(String numbers) {
		String[] numbersArray = numbers.split(",");
	    if (numbersArray.length > 2) {
	        throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
	    } else {
	        for (String number : numbersArray) {
	            if (!number.isEmpty()) {
	                Integer.parseInt(number);
	            }
	        }
	    }
	    return 0; // Added return
    }
}
