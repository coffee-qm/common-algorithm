package com.coffee.common.algorithm.sort.impl;

import com.coffee.common.algorithm.sort.Sort;

/**
 * 插入排序
 * 
 * @author QM
 */
public class InsertionSort extends Sort {

	@Override
	public void sort(final int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j - 1]) {
				swap(arr, j, j - 1);
				j--;
			}
		}
	}

}
