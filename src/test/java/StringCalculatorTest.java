import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

public class StringCalculatorTest {

	private static StringCalculator CalcTest = new StringCalculator();

	@Test
	public void ClassTest() {
		assertThat(CalcTest, instanceOf(StringCalculator.class));
	}

	@Test
	public void zeroNumberInput() {
		assertEquals(0, CalcTest.sum(""));
	}

	@Test
	public void oneNumberInput() {
		assertEquals(5, CalcTest.sum("5"));
	}

	@Test
	public void twoNumberInput() {
		assertEquals(4, CalcTest.sum("1,3"));
	}
}
