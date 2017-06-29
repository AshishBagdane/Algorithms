package algorithms.sort.counting;

import algorithms.arrays.Arrays;

public class CountingSort {

	public static void sort(Integer[] arr) {
		int[] count = new int[Arrays.findMax(arr) + 1];
		Integer[] output = new Integer[arr.length];
		System.out.println(count.length);
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		for (int i = 0; i < arr.length; i++) {
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
	}
	
	public static void sort(Character[] arr) {
		int[] count = new int[Arrays.findMax(arr) + 1];
		Character[] output = new Character[arr.length];
		System.out.println(count.length);
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		for (int i = 0; i < arr.length; i++) {
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
	}
}
