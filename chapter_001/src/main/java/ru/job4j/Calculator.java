package ru.job4j;

/**
 * Класс для вычисление арифметических операций.
 * @author daitzhanov
 * @since 09.01.2017
 * @version 1.0
 */
public class Calculator {
	/**
	 *Result.
	 */
	private double result;
	/**
	 * Add.
	 * @param first - first
	 * @param second - second
	 */
	public void add(double first, double second) {
		result = first + second;
	}
	/**
	 * Subtruct.
	 * @param first - first
	 * @param second - second
	 */
	public void subtruct(double first, double second) {
		result = first - second;
	}
	/**
	 * Multiple.
	 * @param first - first
	 * @param second - second
	 */
	public void multiple(double first, double second) {
		result = first * second;
	}
	/**
	 * Div.
	 * @param first - first
	 * @param second - second
	 */
	public void div(double first, double second) {
		result = first / second;
	}
	/**
	 * GetResult.
	 * @return result - result
	 */
	public double getResult() {
		return result;
	}
}