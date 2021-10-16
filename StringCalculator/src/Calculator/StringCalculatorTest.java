package Calculator;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
	@Test
	public final void whenEmptyStringIsUsedThenReturnValueIs0() {
	    Assert.assertEquals(0, StringCalculator.add(""));
	}
}
