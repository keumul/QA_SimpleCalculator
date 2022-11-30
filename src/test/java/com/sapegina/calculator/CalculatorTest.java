package com.sapegina.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		int result = calculator.sum(2, 2);
			Assert.assertEquals(4, result);
	}

	@Test
	public void testSub() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(0, calculator.sub(2, 2));
	}

	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, calculator.div(6, 3));
	}

	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(6, calculator.mul(2, 1));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		Calculator calculator = new Calculator();
		calculator.div(6, 0);
	}
}
