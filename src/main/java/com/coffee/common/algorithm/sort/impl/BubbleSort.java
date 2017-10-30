package com.coffee.common.algorithm.sort.impl;

import com.coffee.common.algorithm.sort.AbstractSort;

/**
 * 冒泡排序
 * 
 * @author QM
 */
public class BubbleSort extends AbstractSort {

	@Override
	public void sort(final int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean f = Boolean.TRUE;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					f = Boolean.FALSE;
				}
			}
			if (f) {
				break;
			}
		}
	}

}
