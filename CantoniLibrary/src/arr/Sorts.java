package arr;

import java.util.Comparator;

/**
 * Array utility class containing common sorting
 * algorithms
 * 
 * @author Cantoni Alessandro
 */
public class Sorts {
      protected Sorts() {}
      
      private static void swap(int index1, int index2, byte[] arr){
            byte temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      private static void swap(int index1, int index2, short[] arr){
            short temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      private static void swap(int index1, int index2, int[] arr){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      private static void swap(int index1, int index2, long[] arr){
            long temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      private static void swap(int index1, int index2, float[] arr){
            float temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      private static void swap(int index1, int index2, double[] arr){
            double temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      private static void swap(int index1, int index2, char[] arr){
            char temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      private static void swap(int index1, int index2, String[] arr){
            String temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      private static <T> void swap(int index1, int index2, T[] arr){
            T temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      
      /**
       * Creates and returns a sorted copy of the array
       * using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static byte[] sorted(byte[] arr) {
            byte[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static short[] sorted(short[] arr) {
            short[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static int[] sorted(int[] arr) {
            int[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static long[] sorted(long[] arr) {
            long[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static float[] sorted(float[] arr) {
            float[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static double[] sorted(double[] arr) {
            double[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * ( False elements before True ones )
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static boolean[] sorted(boolean[] arr) {
            boolean[] res = arr.clone();
            int falseCount = 0;
            for(boolean e : res) if(!e) falseCount++;
            for(int i=0; i<res.length; i++) res[i] = i >= falseCount;
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @param caseSensitive Whether or not the sorting should be case sensitive
       * @return a sorted copy of the array
       */
      public static char[] sorted(char[] arr, boolean caseSensitive) {
            char[] res = arr.clone();
            quickSort(res, 0, res.length-1, caseSensitive);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @param caseSensitive Whether or not the sorting should be case sensitive
       * @return a sorted copy of the array
       */
      public static String[] sorted(String[] arr, boolean caseSensitive) {
            String[] res = arr.clone();
            quickSort(res, 0, res.length-1, caseSensitive);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * using the QuickSort algorithm
       * 
       * @param <T> The array's elements type
       * @param arr The array to sort
       * @param comparator The comparator used to sort the array
       * @return a sorted copy of the array
       */
      public static <T> T[] sorted(T[] arr, Comparator<T> comparator) {
            T[] res = arr.clone();
            quickSort(res, 0, res.length-1, comparator);
            return res;
      }
      
      /**
       * Creates and returns a sorted copy of the array
       * (in descending order) using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static byte[] sortedDesc(byte[] arr) {
            byte[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * (in descending order) using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static short[] sortedDesc(short[] arr) {
            short[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * (in descending order) using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static int[] sortedDesc(int[] arr) {
            int[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * (in descending order) using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static long[] sortedDesc(long[] arr) {
            long[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * (in descending order) using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static float[] sortedDesc(float[] arr) {
            float[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * (in descending order) using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static double[] sortedDesc(double[] arr) {
            double[] res = arr.clone();
            quickSort(res, 0, res.length-1);
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * ( True elements before the False ones )
       * 
       * @param arr The array to sort
       * @return a sorted copy of the array
       */
      public static boolean[] sortedDesc(boolean[] arr) {
            boolean[] res = arr.clone();
            int falseCount = 0;
            for(boolean e : res) if(!e) falseCount++;
            for(int i=0; i<res.length; i++) res[i] = i < falseCount;
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * (in descending order) using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @param caseSensitive Whether or not the sorting should be case sensitive
       * @return a sorted copy of the array
       */
      public static char[] sortedDesc(char[] arr, boolean caseSensitive) {
            char[] res = arr.clone();
            quickSort(res, 0, res.length-1, caseSensitive);
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * (in descending order) using the QuickSort algorithm
       * 
       * @param arr The array to sort
       * @param caseSensitive Whether or not the sorting should be case sensitive
       * @return a sorted copy of the array
       */
      public static String[] sortedDesc(String[] arr, boolean caseSensitive) {
            String[] res = arr.clone();
            quickSort(res, 0, res.length-1, caseSensitive);
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Creates and returns a sorted copy of the array
       * (in descending order) using the QuickSort algorithm
       * 
       * @param <T> The array's elements type
       * @param arr The array to sort
       * @param comparator The comparator used to sort the array
       * @return a sorted copy of the array
       */
      public static <T> T[] sortedDesc(T[] arr, Comparator<T> comparator) {
            T[] res = arr.clone();
            quickSort(res, 0, res.length-1, comparator);
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      
      
      
      /**
       * Sorts the array in ascendig order using the QuickSort
       * algorithm
       * 
       * @param arr The array to sort
       * @param low The lower end of the array to sort (0 to sort the whole array)
       * @param high The higher end of the array to sort (array.length - 1 to sort the whole array)
       */
      public static void quickSort(byte[] arr, int low, int high) {
            if (low < high) {
                  int pi = partition(arr, low, high);
                  
                  quickSort(arr, low, pi - 1);
                  quickSort(arr, pi + 1, high);
            }
      }
      private static int partition(byte[] arr, int low, int high) {
            byte pivot = arr[high]; 
            int i = (low - 1);

            for (int j = low; j < high; j++) 
                  if (arr[j] < pivot) {
                        i++;
                        swap(i,j,arr);
                  }
            swap(i+1, high, arr);

            return i + 1;
      }
      /**
       * Sorts the array in ascendig order using the QuickSort
       * algorithm
       * 
       * @param arr The array to sort
       * @param low The lower end of the array to sort (0 to sort the whole array)
       * @param high The higher end of the array to sort (array.length - 1 to sort the whole array)
       */
      public static void quickSort(short[] arr, int low, int high) {
            if (low < high) {
                  int pi = partition(arr, low, high);
                  
                  quickSort(arr, low, pi - 1);
                  quickSort(arr, pi + 1, high);
            }
      }
      private static int partition(short[] arr, int low, int high) {
            short pivot = arr[high]; 
            int i = (low - 1);

            for (int j = low; j < high; j++) 
                  if (arr[j] < pivot) {
                        i++;
                        swap(i,j,arr);
                  }
            swap(i+1, high, arr);

            return i + 1;
      }
      /**
       * Sorts the array in ascendig order using the QuickSort
       * algorithm
       * 
       * @param arr The array to sort
       * @param low The lower end of the array to sort (0 to sort the whole array)
       * @param high The higher end of the array to sort (array.length - 1 to sort the whole array)
       */
      public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                  int pi = partition(arr, low, high);
                  
                  quickSort(arr, low, pi - 1);
                  quickSort(arr, pi + 1, high);
            }
      }
      private static int partition(int[] arr, int low, int high) {
            int pivot = arr[high]; 
            int i = (low - 1);

            for (int j = low; j < high; j++) 
                  if (arr[j] < pivot) {
                        i++;
                        swap(i,j,arr);
                  }
            swap(i+1, high, arr);

            return i + 1;
      }
      /**
       * Sorts the array in ascendig order using the QuickSort
       * algorithm
       * 
       * @param arr The array to sort
       * @param low The lower end of the array to sort (0 to sort the whole array)
       * @param high The higher end of the array to sort (array.length - 1 to sort the whole array)
       */
      public static void quickSort(long[] arr, int low, int high) {
            if (low < high) {
                  int pi = partition(arr, low, high);
                  
                  quickSort(arr, low, pi - 1);
                  quickSort(arr, pi + 1, high);
            }
      }
      private static int partition(long[] arr, int low, int high) {
            long pivot = arr[high]; 
            int i = (low - 1);

            for (int j = low; j < high; j++) 
                  if (arr[j] < pivot) {
                        i++;
                        swap(i,j,arr);
                  }
            swap(i+1, high, arr);

            return i + 1;
      }
      /**
       * Sorts the array in ascendig order using the QuickSort
       * algorithm
       * 
       * @param arr The array to sort
       * @param low The lower end of the array to sort (0 to sort the whole array)
       * @param high The higher end of the array to sort (array.length - 1 to sort the whole array)
       */
      public static void quickSort(float[] arr, int low, int high) {
            if (low < high) {
                  int pi = partition(arr, low, high);
                  
                  quickSort(arr, low, pi - 1);
                  quickSort(arr, pi + 1, high);
            }
      }
      private static int partition(float[] arr, int low, int high) {
            float pivot = arr[high]; 
            int i = (low - 1);

            for (int j = low; j < high; j++) 
                  if (arr[j] < pivot) {
                        i++;
                        swap(i,j,arr);
                  }
            swap(i+1, high, arr);

            return i + 1;
      }
      /**
       * Sorts the array in ascendig order using the QuickSort
       * algorithm
       * 
       * @param arr The array to sort
       * @param low The lower end of the array to sort (0 to sort the whole array)
       * @param high The higher end of the array to sort (array.length - 1 to sort the whole array)
       */
      public static void quickSort(double[] arr, int low, int high) {
            if (low < high) {
                  int pi = partition(arr, low, high);
                  
                  quickSort(arr, low, pi - 1);
                  quickSort(arr, pi + 1, high);
            }
      }
      private static int partition(double[] arr, int low, int high) {
            double pivot = arr[high]; 
            int i = (low - 1);

            for (int j = low; j < high; j++) 
                  if (arr[j] < pivot) {
                        i++;
                        swap(i,j,arr);
                  }
            swap(i+1, high, arr);

            return i + 1;
      }
      /**
       * Sorts the array in ascendig order using the QuickSort
       * algorithm
       * 
       * @param arr The array to sort
       * @param low The lower end of the array to sort (0 to sort the whole array)
       * @param high The higher end of the array to sort (array.length - 1 to sort the whole array)
       * @param caseSensitive Whether or not the sorting should be case sensitive
       */
      public static void quickSort(char[] arr, int low, int high, boolean caseSensitive) {
            if (low < high) {
                  int pi = (caseSensitive) ? partitionCaseSens(arr,low,high) : partitionCaseInsens(arr,low,high);
                  
                  quickSort(arr, low, pi - 1, caseSensitive);
                  quickSort(arr, pi + 1, high, caseSensitive);
            }
      }
      private static int partitionCaseSens(char[] arr, int low, int high) {
            char pivot = arr[high]; 
            int i = (low - 1);

            for (int j = low; j < high; j++) 
                  if (arr[j] < pivot) {
                        i++;
                        swap(i,j,arr);
                  }
            swap(i+1, high, arr);

            return i + 1;
      }
      private static int partitionCaseInsens(char[] arr, int low, int high) {
            char pivot = arr[high]; 
            int i = (low - 1);
            
            for (int j = low; j < high; j++) 
                  if ( Character.toLowerCase(arr[j]) < Character.toLowerCase(pivot) ) {
                        i++;
                        swap(i,j,arr);
                  }
            swap(i+1, high, arr);

            return i + 1;
      }
      /**
       * Sorts the array in ascendig order using the QuickSort
       * algorithm
       * 
       * @param arr The array to sort
       * @param low The lower end of the array to sort (0 to sort the whole array)
       * @param high The higher end of the array to sort (array.length - 1 to sort the whole array)
       * @param caseSensitive Whether or not the sorting should be case sensitive
       */
      public static void quickSort(String[] arr, int low, int high, boolean caseSensitive) {
            if (low < high) {
                  int pi = (caseSensitive) ? partition(arr, low,  high, (s1, s2) -> s1.compareTo(s2)) : partition(arr, low, high, String.CASE_INSENSITIVE_ORDER);
                  
                  quickSort(arr, low, pi - 1, caseSensitive);
                  quickSort(arr, pi + 1, high, caseSensitive);
            }
      }
      /**
       * Sorts the array in ascendig order using the QuickSort
       * algorithm
       * 
       * @param <T> The array's elements type
       * @param arr The array to sort
       * @param low The lower end of the array to sort (0 to sort the whole array)
       * @param high The higher end of the array to sort (array.length - 1 to sort the whole array)
       * @param comparator The comparator used to sort the array
       */
      public static <T> void quickSort(T[] arr, int low, int high, Comparator<T> comparator) {
            if (low < high) {
                  int pi = partition(arr, low, high, comparator);

                  quickSort(arr, low, pi - 1, comparator);
                  quickSort(arr, pi + 1, high, comparator);
            }
      }
      private static <T> int partition(T[] arr, int low, int high, Comparator<T> comparator) {
            T pivot = arr[high];
            int i = (low - 1);

            for (int j = low; j < high; j++) {
                  // La logica di confronto è delegata al comparator
                  if (comparator.compare(arr[j], pivot) < 0) {
                        i++;
                        swap(i, j, arr);
                  }
            }
            swap(i + 1, high, arr);
            return i + 1;
      }
      
      
      /**
       * Sorts the array in ascendig order using the MergeSort
       * algorithm (!!! STABLE algorithm !!!)
       * 
       * @param <T> The array's elements type
       * @param arr The array to sort
       * @param left The lower end of the array to sort (0 to sort the whole array)
       * @param right The higher end of the array to sort (array.length - 1 to sort the whole array)
       * @param comparator The comparator used to sort the array
       */
      public static <T> void mergeSort(T[] arr, int left, int right, Comparator<T> comparator) {
            if (left < right) {
                  int mid = left + (right - left) / 2;
                  mergeSort(arr, left, mid, comparator);
                  mergeSort(arr, mid + 1, right, comparator);
                  merge(arr, left, mid, right, comparator);
            }
      }
      private static <T> void merge(T[] arr, int left, int mid, int right, Comparator<T> comparator) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            T[] L = (T[]) new Object[n1];
            T[] R = (T[]) new Object[n2];

            for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
            for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

            int i = 0, j = 0;
            int k = left;

            while (i < n1 && j < n2) {
                  if (comparator.compare(L[i], R[j]) <= 0) {   arr[k] = L[i];   i++;   } 
                  else {   arr[k] = R[j];   j++;   }
                  k++;
            }

            while (i < n1) {   arr[k] = L[i];   i++;   k++;   }
            while (j < n2) {   arr[k] = R[j];   j++;   k++;   }
      }
      
      /**
       * Sorts the array in ascendig order using the HeapSort
       * algorithm
       * 
       * @param <T> The array's elements type
       * @param arr The array to sort
       * @param comparator The comparator used to sort the array
       */
      public static <T> void heapSort(T[] arr, Comparator<T> comparator) {
            int n = arr.length;
            for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i, comparator);
            for (int i = n - 1; i > 0; i--) {
                  swap(0, i, arr);
                  heapify(arr, i, 0, comparator);
            }
      }
      private static <T> void heapify(T[] arr, int n, int i, Comparator<T> comparator) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            
            if (left < n && comparator.compare(arr[left], arr[largest]) > 0) largest = left;
            if (right < n && comparator.compare(arr[right], arr[largest]) > 0) largest = right;

            if (largest != i) {
                swap(i, largest, arr);
                heapify(arr, n, largest, comparator);
            }
      }
      
      /**
       * Sorts the array in ascendig order using the TimSort
       * algorithm (Simplified version of the one used by Java.Utils.Arrays.sort)
       * 
       * @param <T> The array's elements type
       * @param arr The array to sort
       * @param comparator The comparator used to sort the array
       */
      public static <T> void timSort(T[] arr, Comparator<T> comparator) {
            Timsort.timSort(arr, arr.length, comparator);
      }
      
      /**
       * Sorts the array in ascendig order using the InsertionSort
       * algorithm
       * 
       * @param <T> The array's elements type
       * @param arr The array to sort
       * @param comparator The comparator used to sort the array
       */
      public static <T> void insertionSort(T[] arr, Comparator<T> comparator) {
            for (int i = 1; i < arr.length; i++) {
                  T key = arr[i];
                  int j = i - 1;
                  while (j >= 0 && comparator.compare(arr[j], key) > 0) {   arr[j + 1] = arr[j];   j = j - 1;   }
                  arr[j + 1] = key;
            }
      }
      
      /**
       * Sorts the array in ascendig order using the BubbleSort
       * algorithm
       * 
       * @param <T> The array's elements type
       * @param arr The array to sort
       * @param comparator The comparator used to sort the array
       */
      public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
            for (int i = 0; i < arr.length - 1; i++) {
                  boolean swapped = false;
                  for (int j = 0; j < arr.length - i - 1; j++)
                        if (comparator.compare(arr[j], arr[j + 1]) > 0) {   swap(j, j+1, arr);   swapped = true;   }
                  if (!swapped) break;
            }
      }
}



class Timsort {
      private static final int RUN = 32;

      protected static <T> void timSort(T[] arr, int n, Comparator<T> comparator) {
            for (int i = 0; i < n; i += RUN) insertionSort(arr, i, Math.min((i + RUN - 1), (n - 1)), comparator);

            for (int size = RUN; size < n; size = 2 * size)
                  for (int left = 0; left < n; left += 2 * size) {
                        int mid = left + size - 1;
                        int right = Math.min((left + 2 * size - 1), (n - 1));
                        if (mid < right) merge(arr, left, mid, right, comparator);
                  }
      }
      
      private static <T> void insertionSort(T[] arr, int left, int right, Comparator<T> comparator) {
            for (int i = left + 1; i <= right; i++) {
                  T temp = arr[i];
                  int j = i - 1;
                  while (j >= left && comparator.compare(arr[j], temp) > 0) {   arr[j + 1] = arr[j];   j--;   }
                  arr[j + 1] = temp;
            }
      }
      
      private static <T> void merge(T[] arr, int left, int mid, int right, Comparator<T> comparator) {
              int n1 = mid - left + 1;
              int n2 = right - mid;

              T[] L = (T[]) new Object[n1];
              T[] R = (T[]) new Object[n2];

              for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
              for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

              int i = 0, j = 0;
              int k = left;

              while (i < n1 && j < n2) {
                    if (comparator.compare(L[i], R[j]) <= 0) {   arr[k] = L[i];   i++;   } 
                    else {   arr[k] = R[j];   j++;   }
                    k++;
              }

              while (i < n1) {   arr[k] = L[i];   i++;   k++;   }
              while (j < n2) {   arr[k] = R[j];   j++;   k++;   }
        }
}