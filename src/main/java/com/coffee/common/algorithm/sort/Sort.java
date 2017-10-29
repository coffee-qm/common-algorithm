package com.coffee.common.algorithm.sort;

/**
 * @author QM
 */
public abstract class Sort {

	/**
	 * sort
	 * 
	 * @param arr
	 *            Array
	 */
	public abstract void sort(final int[] arr);

	/**
	 * swap a with b
	 * 
	 * @param arr
	 *            array
	 * @param a
	 *            a
	 * @param b
	 *            b
	 */
	protected static void swap(final int[] arr, final int a, final int b) {
		final int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
}
