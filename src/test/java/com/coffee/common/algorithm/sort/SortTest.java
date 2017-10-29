package com.coffee.common.algorithm.sort;

import java.util.Arrays;

import org.junit.Test;

import com.coffee.common.algorithm.sort.impl.HeapSort;
import com.coffee.common.algorithm.sort.impl.MergeSort;
import com.coffee.common.algorithm.sort.impl.QuickSort;

public class SortTest {
	private int[] getArr() {
		final int[] arr = { 9, 1, 4, 10, 123, 2, 598, 34, 18 };
		return arr;
	}

	@Test
	public void test0() {
		final int[] arr = getArr();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	@Test
	public void testHeapSort() {
		final int[] arr = getArr();
		final HeapSort sort = new HeapSort();
		sort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	@Test
	public void testMergeSort() {
		final int[] arr = getArr();
		final MergeSort sort = new MergeSort();
		sort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	@Test
	public void testQuickSort() {
		final int[] arr = getArr();
		final QuickSort sort = new QuickSort();
		sort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
