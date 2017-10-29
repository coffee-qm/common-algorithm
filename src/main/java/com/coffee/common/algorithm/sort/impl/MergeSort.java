package com.coffee.common.algorithm.sort.impl;

import com.coffee.common.algorithm.sort.Sort;

public class MergeSort extends Sort {

	@Override
	public void sort(final int[] arr) {
		final int[] tmp = new int[arr.length];
		sort(arr, 0, arr.length - 1, tmp);
	}

	private void sort(final int[] arr, final int left, final int right,
			final int[] tmp) {
		if (left < right) {
			final int mid = (left + right) / 2;
			//
			sort(arr, left, mid, tmp);
			//
			sort(arr, mid + 1, right, tmp);
			merge(arr, left, mid, right, tmp);
		}
	}

	private void merge(final int[] arr, int left, final int mid,
			final int right, final int[] tmp) {
		int i = left;
		int j = mid + 1;
		int t = 0;
		//
		while (i <= mid && j <= right) {
			if (arr[i] <= arr[j]) {
				tmp[t++] = arr[i++];
			} else {
				tmp[t++] = arr[j++];
			}
		}
		while (i <= mid) {
			tmp[t++] = arr[i++];
		}
		while (j <= right) {
			tmp[t++] = arr[j++];
		}
		t = 0;
		while (left <= right) {
			arr[left++] = tmp[t++];
		}
	}
}
