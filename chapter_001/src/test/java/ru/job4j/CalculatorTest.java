package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Calculator.java.
 *
 * @author daitzhanov
 * @version 1.0
 * @since 09.01.2017
 */
  public class CalculatorTest {
	 /**
	  * Test add.
	  */
	  @Test
	  public void whenAddFirstToSecondThenGetResult() {
		  Calculator calc = new Calculator();
		  calc.add(1.0, 1.0);
		  double result = calc.getResult();
		  assertThat(result, is(2.0));
	  }
	  /**
	   * Test subtruct.
	   */
	   @Test
	   public void whenSubtructSecondFromFirstThenGetResult() {
		   Calculator calc = new Calculator();
		   calc.subtruct(2.0, 1.0);
		   double result = calc.getResult();
		   assertThat(result, is(1.0));
	   }
	   /**
	    * Test multiple.
		*/
		@Test
		public void whenMultipleFirstToSecondThenGetResult() {
			Calculator calc = new Calculator();
			calc.multiple(1.0, 2.0);
			double result = calc.getResult();
			assertThat(result, is(2.0));
		}
		/**
		 * Test div.
		 */
		 @Test
		 public void whenDivSecondToFirstThenGetResult() {
			 Calculator calc = new Calculator();
			 calc.div(2.0, 2.0);
			 double result = calc.getResult();
			 assertThat(result, is(1.0));
		 }
 }