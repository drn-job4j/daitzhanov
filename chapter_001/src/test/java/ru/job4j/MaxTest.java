package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Max.java.
 * @author daitzhanov
 * @since 06.02.2017
 * @version 1.0
 */
public class MaxTest {
	/**
	 * Test max first over second.
	 */
	@Test
	public void whenFirstOverSecondThenGetResult() {
		Max max = new Max();
		int result = max.max(2, 1);
		assertThat(result, is(2));
	}
	/**
	 * Test max second over first.
	 */
	@Test
	public void whenSecondOverFirstThenGetResult() {
		Max max = new Max();
		int result = max.max(1, 2);
		assertThat(result, is(2));
	}
}