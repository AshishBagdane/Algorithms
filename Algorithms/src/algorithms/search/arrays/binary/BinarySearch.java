package algorithms.search.arrays.binary;

public class BinarySearch {

	public static Integer find(Integer[] arr, Integer key) {
		Integer low = 0;
		Integer high = arr.length - 1;
		while (low <= high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static Integer find(Long[] arr, Long key) {
		Integer low = 0;
		Integer high = arr.length - 1;
		while (low <= high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static Integer find(Float[] arr, Float key) {
		Integer low = 0;
		Integer high = arr.length - 1;
		while (low <= high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static Integer find(Double[] arr, Double key) {
		Integer low = 0;
		Integer high = arr.length - 1;
		while (low <= high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static Integer find(String[] arr, String key) {
		Integer low = 0;
		Integer high = arr.length - 1;
		while (low <= high) {
			Integer mid = (low + high) / 2;
			if (arr[mid].equals(key)) {
				return mid;
			} else if (arr[mid].compareTo(key) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static Integer findGreaterEqual(Integer[] arr, Integer key) {
		Integer high = arr.length - 1;
		Integer low = 1;
		while (low < high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] >= key) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		if (arr[low] < key) {
			return -1;
		}
		return low;
	}

	public static Integer findGreaterEqual(Long[] arr, Long key) {
		Integer high = arr.length - 1;
		Integer low = 1;
		while (low < high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] >= key) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		if (arr[low] < key) {
			return -1;
		}
		return low;
	}

	public static Integer findGreaterEqual(Float[] arr, Float key) {
		Integer high = arr.length - 1;
		Integer low = 1;
		while (low < high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] >= key) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		if (arr[low] < key) {
			return -1;
		}
		return low;
	}

	public static Integer findGreaterEqual(Double[] arr, Double key) {
		Integer high = arr.length - 1;
		Integer low = 1;
		while (low < high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] >= key) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		if (arr[low] < key) {
			return -1;
		}
		return low;
	}

	public static Integer findGreaterEqual(String[] arr, String key) {
		Integer high = arr.length - 1;
		Integer low = 1;
		while (low < high) {
			Integer mid = (low + high) / 2;
			if (arr[mid].compareTo(key) >= 0) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		if (arr[low].compareTo(key) < 0) {
			return -1;
		}
		return low;
	}

	public static Integer findGreater(Integer[] arr, Integer key) {
		Integer high = arr.length - 1;
		Integer low = 1;
		while (low < high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] > key) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		if (arr[low] <= key) {
			return -1;
		}
		return low;
	}

	public static Integer findGreater(Long[] arr, Long key) {
		Integer high = arr.length - 1;
		Integer low = 1;
		while (low < high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] > key) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		if (arr[low] <= key) {
			return -1;
		}
		return low;
	}

	public static Integer findGreater(Float[] arr, Float key) {
		Integer high = arr.length - 1;
		Integer low = 1;
		while (low < high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] > key) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		if (arr[low] <= key) {
			return -1;
		}
		return low;
	}

	public static Integer findGreater(Double[] arr, Double key) {
		Integer high = arr.length - 1;
		Integer low = 1;
		while (low < high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] > key) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		if (arr[low] <= key) {
			return -1;
		}
		return low;
	}

	public static Integer findGreater(String[] arr, String key) {
		Integer high = arr.length - 1;
		Integer low = 1;
		while (low < high) {
			Integer mid = (low + high) / 2;
			if (arr[mid].compareTo(key) > 0) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		if (arr[low].compareTo(key) <= 0) {
			return -1;
		}
		return low;
	}
}
