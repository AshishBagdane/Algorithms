package algorithms.sort.insertion;

public class InsertionSort {

	public static void ascending(Integer[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Integer key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void descending(Integer[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Integer key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void ascending(Long[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Long key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void descending(Long[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Long key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void ascending(Float[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Float key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void descending(Float[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Float key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void ascending(Double[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Double key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void descending(Double[] arr) {
		for (int i = 1; i < arr.length; i++) {
			Double key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void ascending(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void descending(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			int j = i -1;
			while (j >= 0 && arr[j].compareTo(key) < 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}
