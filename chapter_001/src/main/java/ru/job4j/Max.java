package ru.job4j;

/**
 * ����� ��� ���������� ��������� �� ���� �����.
 * @author daitzhanov
 * @since 06.02.2017
 * @version 1.0
 */
public class Max {
	/**
	 * maxNuber.
	 */
	private int maxNuber;
	/**
	 * getMax.
	 * @param first - first
	 * @param second - second
	 * @return maxNuber
	 */
	public int max(int first, int second) {
		maxNuber = first > second ? first : second;
	}
	/**
	  * getMaxNumber.
	  * @return maxNuber - maxNuber
	 */
	public int getMaxNumber() {
		return maxNuber;
	}
}