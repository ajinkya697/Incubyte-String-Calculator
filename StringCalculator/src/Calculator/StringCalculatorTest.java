package Calculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
	@Test
	public final void whenEmptyStringIsUsedThenReturnValueIs0() {
	    Assert.assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
	    Assert.assertEquals(3, StringCalculator.add("3"));
	}
	 
	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
	    Assert.assertEquals(3+6, StringCalculator.add("3,6"));
	}
}
