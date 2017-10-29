package com.coffee.common.algorithm.sort.impl;

import com.coffee.common.algorithm.sort.Sort;

/**
 * 希尔排序
 * 
 * @author QM
 */
public class ShellSort extends Sort {

	@Override
	public void sort(final int[] arr) {
		sortBySwap(arr);
		//		sortByMove(arr);
	}

	private void sortBySwap(final int[] arr) {
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				while (j - gap >= 0 && arr[j] < arr[j - gap]) {
					swap(arr, j, j - gap);
					j -= gap;
				}
			}
		}
	}

	private void sortByMove(final int[] arr) {
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				final int tmp = arr[i];
				if (arr[j] < arr[j - gap]) {
					while (j - gap >= 0 && tmp < arr[j - gap]) {
						arr[j] = arr[j - gap];
						j -= gap;
					}
					arr[j] = tmp;
				}
			}
		}
	}
}
