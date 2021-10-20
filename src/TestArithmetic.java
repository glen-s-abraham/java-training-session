import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestArithmetic {
	Arithmetic arithmetic = new Arithmetic();
	@Test
	public void additionTest() {
		Assertions.assertEquals(arithmetic.add(3, 5), (3+5));
	}
	@Test
	public void subtractionTest() {
		Assertions.assertEquals(arithmetic.sub(3, 5), (3-5));
	}
	@Test
	public void multiplicationTest() {
		Assertions.assertEquals(arithmetic.mul(3, 5), (3*5));
	}
	@Test
	public void divisionTest() {
		Assertions.assertEquals(arithmetic.div(3, 5), (double)3/5);
	}

}
