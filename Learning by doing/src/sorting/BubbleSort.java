package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		bubbleSort(new int[] { 20, 12, 1, 25, 45, 21, 1 });
		bubbleSort(new int[] { 2, 13, 21, 24, 12, 1, 0, 15 });
		bubbleSort(new int[] { 14, 10, 1, 24, 23, 3, 5 });

	}

	public static void bubbleSort(int[] numbers) {
		System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(numbers));

		for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length - 1; j > i; j--) {
				if (numbers[j] < numbers[j - 1]) {
					swap(numbers, j, j - 1);
				}
			}
		}
		System.out.printf("Sorted Array using Bubble sort algorithm :%s %n", Arrays.toString(numbers));

	}

	public static void swap(int[] array, int from, int to) {
		int temp = array[from];
		array[from] = array[to];
		array[to] = temp;
	}

}
