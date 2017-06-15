package algorithms.search.arrays.binary;

public class BinarySearch {

	public static int find(Integer[] arr, Integer key) {
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
	
	public static int find(Long[] arr, Long key) {
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
	
	public static int find(Float[] arr, Float key) {
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
	
	public static int find(Double[] arr, Double key) {
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
	
	public static int find(String[] arr, String key) {
		Integer low = 0;
		Integer high = arr.length - 1;
		while (low <= high) {
			Integer mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid].compareTo(key) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
