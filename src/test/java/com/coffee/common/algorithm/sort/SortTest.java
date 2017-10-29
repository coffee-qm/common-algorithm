package com.coffee.common.algorithm.sort;

import java.util.Arrays;

import org.junit.Test;

import com.coffee.common.algorithm.sort.impl.BubbleSort;
import com.coffee.common.algorithm.sort.impl.HeapSort;
import com.coffee.common.algorithm.sort.impl.InsertionSort;
import com.coffee.common.algorithm.sort.impl.MergeSort;
import com.coffee.common.algorithm.sort.impl.QuickSort;
import com.coffee.common.algorithm.sort.impl.SelectSort;
import com.coffee.common.algorithm.sort.impl.ShellSort;

public class SortTest {
	private int[] getArr() {
		final int[] arr = { 9, 1, 4, 10, 123, 2, 598, 34, 18, 22 };
		return arr;
	}

	@Test
	public void test0() {
		final int[] arr = getArr();
		Arrays.sort(arr);
		System.out.println("JDK:" + Arrays.toString(arr));
	}

	@Test
	public void testSelectSort() {
		final int[] arr = getArr();
		final SelectSort sort = new SelectSort();
		sort.sort(arr);
		System.out.println("Select:" + Arrays.toString(arr));
	}

	@Test
	public void testBubbleSort() {
		final int[] arr = getArr();
		final BubbleSort sort = new BubbleSort();
		sort.sort(arr);
		System.out.println("Bubble:" + Arrays.toString(arr));
	}

	@Test
	public void testInsertionSort() {
		final int[] arr = getArr();
		final InsertionSort sort = new InsertionSort();
		sort.sort(arr);
		System.out.println("Insertion:" + Arrays.toString(arr));
	}

	@Test
	public void testShellSort() {
		final int[] arr = getArr();
		final ShellSort sort = new ShellSort();
		sort.sort(arr);
		System.out.println("Shell:" + Arrays.toString(arr));
	}

	@Test
	public void testHeapSort() {
		final int[] arr = getArr();
		final HeapSort sort = new HeapSort();
		sort.sort(arr);
		System.out.println("Heap:" + Arrays.toString(arr));
	}

	@Test
	public void testMergeSort() {
		final int[] arr = getArr();
		final MergeSort sort = new MergeSort();
		sort.sort(arr);
		System.out.println("Merge:" + Arrays.toString(arr));
	}

	@Test
	public void testQuickSort() {
		final int[] arr = getArr();
		final QuickSort sort = new QuickSort();
		sort.sort(arr);
		System.out.println("Quick:" + Arrays.toString(arr));
	}
}
