import static org.junit.Assert.*;

import org.junit.Test;
public class StringCalcTest {


	@Test
	public void emptyStringShouldGiveZero(){
		StringCalculator calc = new StringCalculator();
		assertEquals(0, calc.Add(""));
	}
	@Test
	public void singleNumberShouldReturnSameNumber() {
		StringCalculator calc = new StringCalculator();
		assertEquals(1000, calc.Add("1000"));
	}
	@Test
	public void twoNumbersShouldReturnSum() {
		StringCalculator calc = new StringCalculator();
		assertEquals(1+1, calc.Add("1,1"));
	}
	@Test
	public void anUnknownNumberOfNumbersShouldBeAdded() {
		StringCalculator calc = new StringCalculator();
		assertEquals(1+44+56+12+4, calc.Add("1,44,56,12,4"));
	}
	@Test
	public void newLineShouldWorkAsDelimiter() {
		StringCalculator calc = new StringCalculator();
		assertEquals(0, calc.Add("1,\n"));
	}
}
