package algorithms.arrays;

public class Arrays {

	public static <E> void print(E[] arr) {
		for (E element : arr) {
			System.out.print(element.toString() + " ");
		}
		System.out.println();
	}
	
	public static <E> void printReverse(E[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i].toString() + " ");
		}
		System.out.println();
	}
	
	public static <E> void reverse(E[] arr) {
		int length = arr.length - 1;
		for (int i = 0; i <= Math.floorDiv(length, 2); i++) {
			E temp = arr[i];
			arr[i] = arr[length - i];
			arr[length - i] = temp;
		}
	}
	
	public static Integer findMax(Integer[] arr) {
		Integer max = Integer.MIN_VALUE;
		for (Integer element : arr) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}
	
	public static Integer findMin(Integer[] arr) {
		Integer min = Integer.MAX_VALUE;
		for (Integer element : arr) {
			if (element.compareTo(min) < 0) {
				min = element;
			}
		}
		return min;
	}
	
	public static Long findMax(Long[] arr) {
		Long max = Long.MIN_VALUE;
		for (Long element : arr) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}
	
	public static Long findMin(Long[] arr) {
		Long min = Long.MAX_VALUE;
		for (Long element : arr) {
			if (element.compareTo(min) < 0) {
				min = element;
			}
		}
		return min;
	}
	
	public static Character findMax(Character[] arr) {
		Character max = Character.MIN_VALUE;
		for (Character element : arr) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}
	
	public static Character findMin(Character[] arr) {
		Character min = Character.MAX_VALUE;
		for (Character element : arr) {
			if (element.compareTo(min) < 0) {
				min = element;
			}
		}
		return min;
	}
	
	public static Long sum(Long[] arr) {
		Long sum = 0L;
		for (Long element : arr) {
			sum += element;
		}
		return sum;
	}
}
