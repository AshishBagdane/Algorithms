package algorithms.sort;

public class QuickSort {

	public static void ascending(Integer[] arr) {
		quickSortAsc(arr, 0, arr.length - 1);
	}
	
	private static void quickSortAsc(Integer[] arr, int low, int high) {
		if (low < high) {
			int mid = partitionAsc(arr, low, high);
			quickSortAsc(arr, low, mid);
			quickSortAsc(arr, mid + 1, high);
		}
	}
	
	private static Integer partitionAsc(Integer[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low - 1;
		int j = high + 1;
		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);
			do {
				j--;
			} while (arr[j] > pivot);
			if (i >= j) {
				return j;
			}
			swap(arr, i, j);
		}
	}
	
	public static void descending(Integer[] arr) {
		quickSortDsc(arr, 0, arr.length - 1);
	}
	
	private static void quickSortDsc(Integer[] arr, int low, int high) {
		if (low < high) {
			int mid = partitionDsc(arr, low, high);
			quickSortDsc(arr, low, mid);
			quickSortDsc(arr, mid + 1, high);
		}
	}
	
	private static Integer partitionDsc(Integer[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low - 1;
		int j = high + 1;
		while (true) {
			do {
				i++;
			} while (arr[i] > pivot);
			do {
				j--;
			} while (arr[j] < pivot);
			if (i >= j) {
				return j;
			}
			swap(arr, i, j);
		}
	}
	
	public static void ascending(Float[] arr) {
		quickSortAsc(arr, 0, arr.length - 1);
	}
	
	private static void quickSortAsc(Float[] arr, int low, int high) {
		if (low < high) {
			int mid = partitionAsc(arr, low, high);
			quickSortAsc(arr, low, mid);
			quickSortAsc(arr, mid + 1, high);
		}
	}
	
	private static Integer partitionAsc(Float[] arr, int low, int high) {
		float pivot = arr[low];
		int i = low - 1;
		int j = high + 1;
		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);
			do {
				j--;
			} while (arr[j] > pivot);
			if (i >= j) {
				return j;
			}
			swap(arr, i, j);
		}
	}
	
	public static void descending(Float[] arr) {
		quickSortDsc(arr, 0, arr.length - 1);
	}
	
	private static void quickSortDsc(Float[] arr, int low, int high) {
		if (low < high) {
			int mid = partitionDsc(arr, low, high);
			quickSortDsc(arr, low, mid);
			quickSortDsc(arr, mid + 1, high);
		}
	}
	
	private static Integer partitionDsc(Float[] arr, int low, int high) {
		float pivot = arr[low];
		int i = low - 1;
		int j = high + 1;
		while (true) {
			do {
				i++;
			} while (arr[i] > pivot);
			do {
				j--;
			} while (arr[j] < pivot);
			if (i >= j) {
				return j;
			}
			swap(arr, i, j);
		}
	}
	
	public static void ascending(Double[] arr) {
		quickSortAsc(arr, 0, arr.length - 1);
	}
	
	private static void quickSortAsc(Double[] arr, int low, int high) {
		if (low < high) {
			int mid = partitionAsc(arr, low, high);
			quickSortAsc(arr, low, mid);
			quickSortAsc(arr, mid + 1, high);
		}
	}
	
	private static Integer partitionAsc(Double[] arr, int low, int high) {
		double pivot = arr[low];
		int i = low - 1;
		int j = high + 1;
		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);
			do {
				j--;
			} while (arr[j] > pivot);
			if (i >= j) {
				return j;
			}
			swap(arr, i, j);
		}
	}
	
	public static void descending(Double[] arr) {
		quickSortDsc(arr, 0, arr.length - 1);
	}
	
	private static void quickSortDsc(Double[] arr, int low, int high) {
		if (low < high) {
			int mid = partitionDsc(arr, low, high);
			quickSortDsc(arr, low, mid);
			quickSortDsc(arr, mid + 1, high);
		}
	}
	
	private static Integer partitionDsc(Double[] arr, int low, int high) {
		double pivot = arr[low];
		int i = low - 1;
		int j = high + 1;
		while (true) {
			do {
				i++;
			} while (arr[i] > pivot);
			do {
				j--;
			} while (arr[j] < pivot);
			if (i >= j) {
				return j;
			}
			swap(arr, i, j);
		}
	}
	
	public static void ascending(String[] arr) {
		quickSortAsc(arr, 0, arr.length - 1);
	}
	
	private static void quickSortAsc(String[] arr, int low, int high) {
		if (low < high) {
			int mid = partitionAsc(arr, low, high);
			quickSortAsc(arr, low, mid);
			quickSortAsc(arr, mid + 1, high);
		}
	}
	
	private static Integer partitionAsc(String[] arr, int low, int high) {
		String pivot = arr[low];
		int i = low - 1;
		int j = high + 1;
		while (true) {
			do {
				i++;
			} while (arr[i].compareTo(pivot) < 0);
			do {
				j--;
			} while (arr[j].compareTo(pivot) > 0);
			if (i >= j) {
				return j;
			}
			swap(arr, i, j);
		}
	}
	
	public static void descending(String[] arr) {
		quickSortDsc(arr, 0, arr.length - 1);
	}
	
	private static void quickSortDsc(String[] arr, int low, int high) {
		if (low < high) {
			int mid = partitionDsc(arr, low, high);
			quickSortDsc(arr, low, mid);
			quickSortDsc(arr, mid + 1, high);
		}
	}
	
	private static Integer partitionDsc(String[] arr, int low, int high) {
		String pivot = arr[low];
		int i = low - 1;
		int j = high + 1;
		while (true) {
			do {
				i++;
			} while (arr[i].compareTo(pivot) > 0);
			do {
				j--;
			} while (arr[j].compareTo(pivot) < 0);
			if (i >= j) {
				return j;
			}
			swap(arr, i, j);
		}
	}
	
	private static <E> void swap(E[] arr, int i, int j) {
		E temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}