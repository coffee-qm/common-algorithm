package com.coffee.common.algorithm.sort.impl;

import com.coffee.common.algorithm.sort.Sort;

/**
 * 堆排序
 * 
 * @author QM
 */
public class HeapSort extends Sort {

	@Override
	public void sort(final int[] arr) {
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			heap(arr, i, arr.length);
		}
		for (int i = arr.length - 1; i > 0; i--) {
			swap(arr, 0, i);
			heap(arr, 0, i);
		}
	}

	private void heap(final int[] arr, int i, final int length) {
		final int tmp = arr[i];
		for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
			if (k + 1 < length && arr[k] < arr[k + 1]) {
				k++;
			}
			if (arr[k] > tmp) {
				arr[i] = arr[k];
				i = k;
			} else {
				break;
			}
		}
		arr[i] = tmp;
	}
}
