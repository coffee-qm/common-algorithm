package com.coffee.common.algorithm.sort;

public abstract class Sort {
	public abstract void sort(final int[] arr);

	protected static void swap(final int[] arr, final int a, final int b) {
		final int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
}
