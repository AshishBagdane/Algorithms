package algorithms.sort;

public class BubbleSort {

	public static void ascending(Integer[] arr) {
		for (Integer i = 0; i < arr.length - 1; i++) {
			for (Integer j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					Integer temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void descending(Integer[] arr) {
		for (Integer i = 0; i < arr.length - 1; i++) {
			for (Integer j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					Integer temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void ascending(Long[] arr) {
		for (Integer i = 0; i < arr.length - 1; i++) {
			for (Integer j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					Long temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void descending(Long[] arr) {
		for (Integer i = 0; i < arr.length - 1; i++) {
			for (Integer j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					Long temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void ascending(Character[] arr) {
		for (Integer i = 0; i < arr.length - 1; i++) {
			for (Integer j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					Character temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void descending(Character[] arr) {
		for (Integer i = 0; i < arr.length - 1; i++) {
			for (Integer j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					Character temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void ascending(String[] arr) {
		for (Integer i = 0; i < arr.length - 1; i++) {
			for (Integer j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					String temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void descending(String[] arr) {
		for (Integer i = 0; i < arr.length - 1; i++) {
			for (Integer j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) < 0) {
					String temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}
