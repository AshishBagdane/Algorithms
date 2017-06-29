package algorithms.sort;

import algorithms.arrays.Arrays;

public class MergeSort {

    public static void descending(Integer[] A) {
    	Integer[] B = Arrays.copyOf(A);
        splitMergeDSC(B, 0, A.length, A);
    }
    
    private static void splitMergeDSC(Integer[] B, int low, int high, Integer[] A) {
        if(high - low < 2) {
            return;
        }
        int mid = (low + high) / 2;
        splitMergeDSC(A, low, mid, B);
        splitMergeDSC(A, mid, high, B);
        mergeDSC(B, low, mid, high, A);
    }
    
    private static void mergeDSC(Integer[] A, int low, int mid, int high, Integer[] B) {
        int i = low, j = mid;
        for(int k = low; k < high; k++) {
            if(i < mid && (j >= high || A[i] > A[j])) {
                B[k] = A[i];
                i++;
            }else{
                B[k] = A[j];
                j++;
            }
        }
    }
    
    public static void ascending(Integer[] A) {
    	Integer[] B = Arrays.copyOf(A);
        splitMergeASC(B, 0, A.length, A);
    }
    
    private static void splitMergeASC(Integer[] B, int low, int high, Integer[] A) {
        if(high - low < 2) {
            return;
        }
        int mid = (low + high) / 2;
        splitMergeASC(A, low, mid, B);
        splitMergeASC(A, mid, high, B);
        mergeASC(B, low, mid, high, A);
    }
    
    private static void mergeASC(Integer[] A, int low, int mid, int high, Integer[] B) {
        int i = low, j = mid;
        for(int k = low; k < high; k++) {
            if(i < mid && (j >= high || A[i] < A[j])) {
                B[k] = A[i];
                i++;
            }else{
                B[k] = A[j];
                j++;
            }
        }
    }
    
    public static void descending(Long[] A) {
    	Long[] B = Arrays.copyOf(A);
        splitMergeDSC(B, 0, A.length, A);
    }
    
    private static void splitMergeDSC(Long[] B, int low, int high, Long[] A) {
        if(high - low < 2) {
            return;
        }
        int mid = (low + high) / 2;
        splitMergeDSC(A, low, mid, B);
        splitMergeDSC(A, mid, high, B);
        mergeDSC(B, low, mid, high, A);
    }
    
    private static void mergeDSC(Long[] A, int low, int mid, int high, Long[] B) {
        int i = low, j = mid;
        for(int k = low; k < high; k++) {
            if(i < mid && (j >= high || A[i] > A[j])) {
                B[k] = A[i];
                i++;
            }else{
                B[k] = A[j];
                j++;
            }
        }
    }
    
    public static void ascending(Long[] A) {
    	Long[] B = Arrays.copyOf(A);
        splitMergeASC(B, 0, A.length, A);
    }
    
    private static void splitMergeASC(Long[] B, int low, int high, Long[] A) {
        if(high - low < 2) {
            return;
        }
        int mid = (low + high) / 2;
        splitMergeASC(A, low, mid, B);
        splitMergeASC(A, mid, high, B);
        mergeASC(B, low, mid, high, A);
    }
    
    private static void mergeASC(Long[] A, int low, int mid, int high, Long[] B) {
        int i = low, j = mid;
        for(int k = low; k < high; k++) {
            if(i < mid && (j >= high || A[i] < A[j])) {
                B[k] = A[i];
                i++;
            }else{
                B[k] = A[j];
                j++;
            }
        }
    }
    
    public static void descending(Float[] A) {
    	Float[] B = Arrays.copyOf(A);
        splitMergeDSC(B, 0, A.length, A);
    }
    
    private static void splitMergeDSC(Float[] B, int low, int high, Float[] A) {
        if(high - low < 2) {
            return;
        }
        int mid = (low + high) / 2;
        splitMergeDSC(A, low, mid, B);
        splitMergeDSC(A, mid, high, B);
        mergeDSC(B, low, mid, high, A);
    }
    
    private static void mergeDSC(Float[] A, int low, int mid, int high, Float[] B) {
        int i = low, j = mid;
        for(int k = low; k < high; k++) {
            if(i < mid && (j >= high || A[i] > A[j])) {
                B[k] = A[i];
                i++;
            }else{
                B[k] = A[j];
                j++;
            }
        }
    }
    
    public static void ascending(Float[] A) {
    	Float[] B = Arrays.copyOf(A);
        splitMergeASC(B, 0, A.length, A);
    }
    
    private static void splitMergeASC(Float[] B, int low, int high, Float[] A) {
        if(high - low < 2) {
            return;
        }
        int mid = (low + high) / 2;
        splitMergeASC(A, low, mid, B);
        splitMergeASC(A, mid, high, B);
        mergeASC(B, low, mid, high, A);
    }
    
    private static void mergeASC(Float[] A, int low, int mid, int high, Float[] B) {
        int i = low, j = mid;
        for(int k = low; k < high; k++) {
            if(i < mid && (j >= high || A[i] < A[j])) {
                B[k] = A[i];
                i++;
            }else{
                B[k] = A[j];
                j++;
            }
        }
    }
    
    public static void descending(Double[] A) {
    	Double[] B = Arrays.copyOf(A);
        splitMergeDSC(B, 0, A.length, A);
    }
    
    private static void splitMergeDSC(Double[] B, int low, int high, Double[] A) {
        if(high - low < 2) {
            return;
        }
        int mid = (low + high) / 2;
        splitMergeDSC(A, low, mid, B);
        splitMergeDSC(A, mid, high, B);
        mergeDSC(B, low, mid, high, A);
    }
    
    private static void mergeDSC(Double[] A, int low, int mid, int high, Double[] B) {
        int i = low, j = mid;
        for(int k = low; k < high; k++) {
            if(i < mid && (j >= high || A[i] > A[j])) {
                B[k] = A[i];
                i++;
            }else{
                B[k] = A[j];
                j++;
            }
        }
    }
    
    public static void ascending(Double[] A) {
    	Double[] B = Arrays.copyOf(A);
        splitMergeASC(B, 0, A.length, A);
    }
    
    private static void splitMergeASC(Double[] B, int low, int high, Double[] A) {
        if(high - low < 2) {
            return;
        }
        int mid = (low + high) / 2;
        splitMergeASC(A, low, mid, B);
        splitMergeASC(A, mid, high, B);
        mergeASC(B, low, mid, high, A);
    }
    
    private static void mergeASC(Double[] A, int low, int mid, int high, Double[] B) {
        int i = low, j = mid;
        for(int k = low; k < high; k++) {
            if(i < mid && (j >= high || A[i] < A[j])) {
                B[k] = A[i];
                i++;
            }else{
                B[k] = A[j];
                j++;
            }
        }
    }
    
    public static void descending(String[] A) {
    	String[] B = Arrays.copyOf(A);
        splitMergeDSC(B, 0, A.length, A);
    }
    
    private static void splitMergeDSC(String[] B, int low, int high, String[] A) {
        if(high - low < 2) {
            return;
        }
        int mid = (low + high) / 2;
        splitMergeDSC(A, low, mid, B);
        splitMergeDSC(A, mid, high, B);
        mergeDSC(B, low, mid, high, A);
    }
    
    private static void mergeDSC(String[] A, int low, int mid, int high, String[] B) {
        int i = low, j = mid;
        for(int k = low; k < high; k++) {
            if(i < mid && (j >= high || A[i].compareTo(A[j]) > 0)) {
                B[k] = A[i];
                i++;
            }else{
                B[k] = A[j];
                j++;
            }
        }
    }
    
    public static void ascending(String[] A) {
    	String[] B = Arrays.copyOf(A);
        splitMergeASC(B, 0, A.length, A);
    }
    
    private static void splitMergeASC(String[] B, int low, int high, String[] A) {
        if(high - low < 2) {
            return;
        }
        int mid = (low + high) / 2;
        splitMergeASC(A, low, mid, B);
        splitMergeASC(A, mid, high, B);
        mergeASC(B, low, mid, high, A);
    }
    
    private static void mergeASC(String[] A, int low, int mid, int high, String[] B) {
        int i = low, j = mid;
        for(int k = low; k < high; k++) {
            if(i < mid && (j >= high || A[i].compareTo(A[j]) < 0)) {
                B[k] = A[i];
                i++;
            }else{
                B[k] = A[j];
                j++;
            }
        }
    }
}
