package com.tgc03112.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
  * Used for interace test
  * @author tgc03112
  */
public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	/**
	  * Used for interace test
	  * @author tgc03112
	  */
	public void testSum(){
		assertEquals(5, calculator.sum(2,3));
	}
	@Test
	/**
	  * Used for interace test
	  * @author tgc03112
	  */
	public void testDif(){
		assertEquals(-1, calculator.dif(2,3));
	}
}
