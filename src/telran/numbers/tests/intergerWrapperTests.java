package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intergerWrapperTests {

	@Test
	void expressionSmallNumbers() {
		Integer expression =200/100+80;
		Integer expected=82;
		assertTrue(expected==expression); //from -128 to 127
	}
	@Test 
	void expressionBigNumbers() {
		Integer expression=5000/5+800;
		Integer expected=1800;
		assertEquals(expected,expression);// from <-128 and >127
	}

}
