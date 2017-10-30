package com.coffee.common.algorithm.sort.impl;

import com.coffee.common.algorithm.sort.AbstractSort;

/**
 * 选择排序
 * 
 * @author QM
 */
public class SelectSort extends AbstractSort {

	@Override
	public void sort(final int[] arr) {
		//
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				swap(arr, min, i);
			}
		}
	}
}
