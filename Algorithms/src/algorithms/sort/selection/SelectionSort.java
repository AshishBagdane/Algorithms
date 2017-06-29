package algorithms.sort;

public class SelectionSort {

	private static <E> void swap(E[] arr, int i, int j) {
		E temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void ascending(Integer[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				swap(arr, i, minIndex);
			}
		}
	}
	
	public static void descending(Integer[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				swap(arr, i, maxIndex);
			}
		}
	}
	
	public static void ascending(Long[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				swap(arr, i, minIndex);
			}
		}
	}
	
	public static void descending(Long[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				swap(arr, i, maxIndex);
			}
		}
	}
	
	public static void ascending(Float[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				swap(arr, i, minIndex);
			}
		}
	}
	
	public static void descending(Float[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				swap(arr, i, maxIndex);
			}
		}
	}
	
	public static void ascending(Double[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				swap(arr, i, minIndex);
			}
		}
	}
	
	public static void descending(Double[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				swap(arr, i, maxIndex);
			}
		}
	}
	
	public static void ascending(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[minIndex]) < 0) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				swap(arr, i, minIndex);
			}
		}
	}
	
	public static void descending(String[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int maxIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[maxIndex]) > 0) {
					maxIndex = j;
				}
			}
			if (i != maxIndex) {
				swap(arr, i, maxIndex);
			}
		}
	}
}
