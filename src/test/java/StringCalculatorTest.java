import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

public class StringCalculatorTest {

	@Test
	public void ClassTest() {
		StringCalculator CalcTest = new StringCalculator();
		assertThat(CalcTest, instanceOf(StringCalculator.class));
	}
}
