package algorithms.sort.heap;

public class HeapSort {
    
	private static Integer heapsize;

	public static void ascending(Integer[] arr) {
		buildMaxHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			maxHeapify(arr, 0);
		}
	}

	private static void maxHeapify(Integer[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer largest;
		if (leftIndex <= heapsize && arr[leftIndex] > arr[index]) {
			largest = leftIndex;
		} else {
			largest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex] > arr[largest]) {
			largest = rightIndex;
		}
		if (largest != index) {
			swap(arr, index, largest);
			maxHeapify(arr, largest);
		}
	}

	private static void buildMaxHeap(Integer[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			maxHeapify(arr, index);
		}
	}

	public static void descending(Integer[] arr) {
		buildMinHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			minHeapify(arr, 0);
		}
	}

	private static void minHeapify(Integer[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer largest;
		if (leftIndex <= heapsize && arr[leftIndex] < arr[index]) {
			largest = leftIndex;
		} else {
			largest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex] < arr[largest]) {
			largest = rightIndex;
		}
		if (largest != index) {
			swap(arr, index, largest);
			minHeapify(arr, largest);
		}
	}

	private static void buildMinHeap(Integer[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			minHeapify(arr, index);
		}
	}
	
	public static void ascending(Long[] arr) {
		buildMaxHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			maxHeapify(arr, 0);
		}
	}

	private static void maxHeapify(Long[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer largest;
		if (leftIndex <= heapsize && arr[leftIndex] > arr[index]) {
			largest = leftIndex;
		} else {
			largest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex] > arr[largest]) {
			largest = rightIndex;
		}
		if (largest != index) {
			swap(arr, index, largest);
			maxHeapify(arr, largest);
		}
	}

	private static void buildMaxHeap(Long[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			maxHeapify(arr, index);
		}
	}

	public static void descending(Long[] arr) {
		buildMinHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			minHeapify(arr, 0);
		}
	}

	private static void minHeapify(Long[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer largest;
		if (leftIndex <= heapsize && arr[leftIndex] < arr[index]) {
			largest = leftIndex;
		} else {
			largest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex] < arr[largest]) {
			largest = rightIndex;
		}
		if (largest != index) {
			swap(arr, index, largest);
			minHeapify(arr, largest);
		}
	}

	private static void buildMinHeap(Long[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			minHeapify(arr, index);
		}
	}
	
	public static void ascending(Float[] arr) {
		buildMaxHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			maxHeapify(arr, 0);
		}
	}

	private static void maxHeapify(Float[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer largest;
		if (leftIndex <= heapsize && arr[leftIndex] > arr[index]) {
			largest = leftIndex;
		} else {
			largest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex] > arr[largest]) {
			largest = rightIndex;
		}
		if (largest != index) {
			swap(arr, index, largest);
			maxHeapify(arr, largest);
		}
	}

	private static void buildMaxHeap(Float[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			maxHeapify(arr, index);
		}
	}

	public static void descending(Float[] arr) {
		buildMinHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			minHeapify(arr, 0);
		}
	}

	private static void minHeapify(Float[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer largest;
		if (leftIndex <= heapsize && arr[leftIndex] < arr[index]) {
			largest = leftIndex;
		} else {
			largest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex] < arr[largest]) {
			largest = rightIndex;
		}
		if (largest != index) {
			swap(arr, index, largest);
			minHeapify(arr, largest);
		}
	}

	private static void buildMinHeap(Float[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			minHeapify(arr, index);
		}
	}
	
	public static void ascending(Double[] arr) {
		buildMaxHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			maxHeapify(arr, 0);
		}
	}

	private static void maxHeapify(Double[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer largest;
		if (leftIndex <= heapsize && arr[leftIndex] > arr[index]) {
			largest = leftIndex;
		} else {
			largest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex] > arr[largest]) {
			largest = rightIndex;
		}
		if (largest != index) {
			swap(arr, index, largest);
			maxHeapify(arr, largest);
		}
	}

	private static void buildMaxHeap(Double[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			maxHeapify(arr, index);
		}
	}

	public static void descending(Double[] arr) {
		buildMinHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			minHeapify(arr, 0);
		}
	}

	private static void minHeapify(Double[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer smallest;
		if (leftIndex <= heapsize && arr[leftIndex] < arr[index]) {
			smallest = leftIndex;
		} else {
			smallest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex] < arr[smallest]) {
			smallest = rightIndex;
		}
		if (smallest != index) {
			swap(arr, index, smallest);
			minHeapify(arr, smallest);
		}
	}

	private static void buildMinHeap(Double[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			minHeapify(arr, index);
		}
	}
	
	public static void ascending(Character[] arr) {
		buildMaxHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			maxHeapify(arr, 0);
		}
	}

	private static void maxHeapify(Character[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer largest;
		if (leftIndex <= heapsize && arr[leftIndex] > arr[index]) {
			largest = leftIndex;
		} else {
			largest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex] > arr[largest]) {
			largest = rightIndex;
		}
		if (largest != index) {
			swap(arr, index, largest);
			maxHeapify(arr, largest);
		}
	}

	private static void buildMaxHeap(Character[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			maxHeapify(arr, index);
		}
	}

	public static void descending(Character[] arr) {
		buildMinHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			minHeapify(arr, 0);
		}
	}

	private static void minHeapify(Character[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer smallest;
		if (leftIndex <= heapsize && arr[leftIndex] < arr[index]) {
			smallest = leftIndex;
		} else {
			smallest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex] < arr[smallest]) {
			smallest = rightIndex;
		}
		if (smallest != index) {
			swap(arr, index, smallest);
			minHeapify(arr, smallest);
		}
	}

	private static void buildMinHeap(Character[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			minHeapify(arr, index);
		}
	}
	
	public static void ascending(String[] arr) {
		buildMaxHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			maxHeapify(arr, 0);
		}
	}

	private static void maxHeapify(String[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer largest;
		if (leftIndex <= heapsize && arr[leftIndex].compareTo(arr[index]) > 0) {
			largest = leftIndex;
		} else {
			largest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex].compareTo(arr[largest]) > 0) {
			largest = rightIndex;
		}
		if (largest != index) {
			swap(arr, index, largest);
			maxHeapify(arr, largest);
		}
	}

	private static void buildMaxHeap(String[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			maxHeapify(arr, index);
		}
	}

	public static void descending(String[] arr) {
		buildMinHeap(arr);
		for (Integer i = heapsize; i >= 1; i--) {
			swap(arr, 0, i);
			heapsize--;
			minHeapify(arr, 0);
		}
	}

	private static void minHeapify(String[] arr, Integer index) {
		Integer leftIndex = index + 1;
		Integer rightIndex = index + 2;
		Integer smallest;
		if (leftIndex <= heapsize && arr[leftIndex].compareTo(arr[index]) < 0) {
			smallest = leftIndex;
		} else {
			smallest = index;
		}
		if (rightIndex <= heapsize && arr[rightIndex].compareTo(arr[smallest]) < 0) {
			smallest = rightIndex;
		}
		if (smallest != index) {
			swap(arr, index, smallest);
			minHeapify(arr, smallest);
		}
	}

	private static void buildMinHeap(String[] arr) {
		heapsize = arr.length - 1;
		for (Integer index = Math.floorDiv(arr.length - 1, 2); index >= 0; index--) {
			minHeapify(arr, index);
		}
	}

	private static <E> void swap(E[] arr, Integer index, Integer largest) {
		E temp = arr[index];
		arr[index] = arr[largest];
		arr[largest] = temp;
	}
}
