package algorithms.arrays;

public class Arrays {

	public static void print(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void printReverse(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void reverse(int[] arr) {
		int length = arr.length - 1;
		for (int i = 0; i <= Math.floorDiv(length, 2); i++) {
			int temp = arr[i];
			arr[i] = arr[length - i];
			arr[length - i] = temp;
		}
	}
	
	public static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int element : arr) {
			if (element > max) {
				max = element;
			}
		}
		return max;
	}
	
	public static int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int element : arr) {
			if (element < min) {
				min = element;
			}
		}
		return min;
	}
}
