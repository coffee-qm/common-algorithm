package com.coffee.common.algorithm.sort.impl;

import com.coffee.common.algorithm.sort.AbstractSort;

/**
 * 快速排序
 * 
 * @author QM
 */
public class QuickSort extends AbstractSort {
	@Override
	public void sort(final int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(final int[] arr, final int left, final int right) {
		if (left < right) {
			//
			pivot(arr, left, right);
			//
			final int pivot = right - 1;
			int i = left;
			int j = right - 1;
			while (true) {
				while (arr[++i] < arr[pivot]) {
				}
				while (j > left && arr[--j] > arr[pivot]) {
				}
				if (i < j) {
					swap(arr, i, j);
				} else {
					break;
				}
			}
			if (i < right) {
				swap(arr, i, right - 1);
			}
			sort(arr, left, i - 1);
			sort(arr, i + 1, right);
		}
	}

	private static void pivot(final int[] arr, final int left, final int right) {
		final int mid = (left + right) / 2;
		if (arr[left] > arr[mid]) {
			swap(arr, left, mid);
		}
		if (arr[left] > arr[right]) {
			swap(arr, left, right);
		}
		if (arr[right] < arr[mid]) {
			swap(arr, right, mid);
		}
		swap(arr, right - 1, mid);
	}
}
