package algorithms.search.arrays.linear;

public class LinearSearch {
    
	public static Integer search(Integer[] arr, Integer key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreaterEqual(Integer[] arr, Integer key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] >= key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreater(Integer[] arr, Integer key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] > key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreaterEqual(Integer[] arr, Integer key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] >= key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreater(Integer[] arr, Integer key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] > key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchForward(Integer[] arr, Integer key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchBackward(Integer[] arr, Integer key, Integer position) {
		for (Integer i = position; i >= 0; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
