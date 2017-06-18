package algorithms.arrays;

import java.math.BigInteger;

public class Arrays {

	public static <E> void print(E[] arr) {
		for (E element : arr) {
			System.out.print(element.toString() + " ");
		}
		System.out.println();
	}
	
	public static <E> void print(E[] arr, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.print(arr[i].toString() + " ");
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
	
	public static Long sum(Integer[] arr) {
		Long sum = 0L;
		for (Integer element : arr) {
			sum += element;
		}
		return sum;
	}
	
	public static BigInteger sum(Long[] arr) {
		BigInteger sum = BigInteger.ZERO;
		for (Long element : arr) {
			sum = sum.add(new BigInteger(String.valueOf(element)));
		}
		return sum;
	}
	
	public static BigInteger sum(BigInteger[] arr) {
		BigInteger sum = BigInteger.ZERO;
		for (BigInteger element : arr) {
			sum = sum.add(new BigInteger(String.valueOf(element)));
		}
		return sum;
	}
	
	public static Integer[] copyOf(Integer[] arr) {
		Integer[] copy = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}
	
	public static Long[] copyOf(Long[] arr) {
		Long[] copy = new Long[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}
	
	public static Float[] copyOf(Float[] arr) {
		Float[] copy = new Float[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}
	
	public static Double[] copyOf(Double[] arr) {
		Double[] copy = new Double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}
	
	public static String[] copyOf(String[] arr) {
		String[] copy = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}
}
