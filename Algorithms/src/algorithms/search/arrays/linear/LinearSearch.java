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
	
	public static Integer search(Long[] arr, Long key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreaterEqual(Long[] arr, Long key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] >= key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreater(Long[] arr, Long key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] > key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreaterEqual(Long[] arr, Long key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] >= key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreater(Long[] arr, Long key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] > key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchForward(Long[] arr, Long key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchBackward(Long[] arr, Long key, Integer position) {
		for (Integer i = position; i >= 0; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static Integer search(Float[] arr, Float key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreaterEqual(Float[] arr, Float key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] >= key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreater(Float[] arr, Float key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] > key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreaterEqual(Float[] arr, Float key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] >= key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreater(Float[] arr, Float key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] > key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchForward(Float[] arr, Float key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchBackward(Float[] arr, Float key, Integer position) {
		for (Integer i = position; i >= 0; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static Integer search(Double[] arr, Double key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreaterEqual(Double[] arr, Double key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] >= key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreater(Double[] arr, Double key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i] > key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreaterEqual(Double[] arr, Double key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] >= key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreater(Double[] arr, Double key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] > key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchForward(Double[] arr, Double key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchBackward(Double[] arr, Double key, Integer position) {
		for (Integer i = position; i >= 0; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static Integer search(String[] arr, String key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i].compareTo(key) == 0) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreaterEqual(String[] arr, String key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i].compareTo(key) >= 0) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreater(String[] arr, String key) {
		for (Integer i = 1; i <= arr.length - 1; i++) {
			if (arr[i].compareTo(key) > 0) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreaterEqual(String[] arr, String key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i].compareTo(key) >= 0) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchGreater(String[] arr, String key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i].compareTo(key) > 0) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchForward(String[] arr, String key, Integer position) {
		for (Integer i = position; i <= arr.length - 1; i++) {
			if (arr[i].compareTo(key) == 0) {
				return i;
			}
		}
		return -1;
	}

	public static Integer searchBackward(String[] arr, String key, Integer position) {
		for (Integer i = position; i >= 0; i++) {
			if (arr[i].compareTo(key) == 0) {
				return i;
			}
		}
		return -1;
	}
}
