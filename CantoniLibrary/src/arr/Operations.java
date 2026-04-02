package arr;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Array utility class used to do operations
 * on the elements of the array or get informations
 * about the array or its elements
 * 
 * @author Cantoni Alessandro
 */
public class Operations {
      protected Operations() {}
      
      /**
       * Returns the index of the first apperance of
       * the given value.<br>
       * If the value isn't found returns -1
       * 
       * @param arr The array containing the value
       * @param value The value to search
       * @return The index of the value
       */
      public static int indexOf(byte[] arr, byte value) {
            if(arr == null) return -1;
            for(int i=0; i<arr.length; i++) if(arr[i]==value) return i;
            return -1;
      }
      /**
       * Returns the index of the first apperance of
       * the given value.<br>
       * If the value isn't found returns -1
       * 
       * @param arr The array containing the value
       * @param value The value to search
       * @return The index of the value
       */
      public static int indexOf(short[] arr, short value) {
            if(arr == null) return -1;
            for(int i=0; i<arr.length; i++) if(arr[i]==value) return i;
            return -1;
      }
      /**
       * Returns the index of the first apperance of
       * the given value.<br>
       * If the value isn't found returns -1
       * 
       * @param arr The array containing the value
       * @param value The value to search
       * @return The index of the value
       */
      public static int indexOf(int[] arr, int value) {
            if(arr == null) return -1;
            for(int i=0; i<arr.length; i++) if(arr[i]==value) return i;
            return -1;
      }
      /**
       * Returns the index of the first apperance of
       * the given value.<br>
       * If the value isn't found returns -1
       * 
       * @param arr The array containing the value
       * @param value The value to search
       * @return The index of the value
       */
      public static int indexOf(long[] arr, long value) {
            if(arr == null) return -1;
            for(int i=0; i<arr.length; i++) if(arr[i]==value) return i;
            return -1;
      }
      /**
       * Returns the index of the first apperance of
       * the given value.<br>
       * If the value isn't found returns -1
       * 
       * @param arr The array containing the value
       * @param value The value to search
       * @return The index of the value
       */
      public static int indexOf(float[] arr, float value) {
            if(arr == null) return -1;
            for(int i=0; i<arr.length; i++) if(arr[i]==value) return i;
            return -1;
      }
      /**
       * Returns the index of the first apperance of
       * the given value.<br>
       * If the value isn't found returns -1
       * 
       * @param arr The array containing the value
       * @param value The value to search
       * @return The index of the value
       */
      public static int indexOf(double[] arr, double value) {
            if(arr == null) return -1;
            for(int i=0; i<arr.length; i++) if(arr[i]==value) return i;
            return -1;
      }
      /**
       * Returns the index of the first apperance of
       * the given value.<br>
       * If the value isn't found returns -1
       * 
       * @param arr The array containing the value
       * @param value The value to search
       * @return The index of the value
       */
      public static int indexOf(char[] arr, char value) {
            if(arr == null) return -1;
            for(int i=0; i<arr.length; i++) if(arr[i]==value) return i;
            return -1;
      }
      /**
       * Returns the index of the first apperance of
       * the given value.<br>
       * If the value isn't found returns -1
       * 
       * @param arr The array containing the value
       * @param value The value to search
       * @return The index of the value
       */
      public static int indexOf(boolean[] arr, boolean value) {
            if(arr == null) return -1;
            for(int i=0; i<arr.length; i++) if(arr[i]==value) return i;
            return -1;
      }
      /**
       * Returns the index of the first apperance of
       * the given value.<br>
       * If the value isn't found returns -1
       * 
       * @param <T> The array's elements type
       * @param arr The array containing the value
       * @param value The value to search
       * @param c The comparator used to check if the value is present
       * @return The index of the value
       */
      public static <T> int indexOf(T[] arr, T value, Comparator<? super T> c) {
            if(arr == null) return -1;
            for(int i=0; i<arr.length; i++) if(c.compare(arr[i], value) == 0) return i;
            return -1;
      }
      
      /**
       * Returns the index of the given value using the BinarySearch
       * algorithm.<br>
       * If the array is null, returns -1<br>
       * If the value isn't found, it returns a negative number. The number
       * allows to get the index at which the value should be inserted to keep
       * the array sorted. The equation to apply is: index = (-returnedValue) - 2
       * 
       * @param arr The SORTED array containing the value
       * @param value The value to search
       * @return The index of the value or the insertion position (look in method description)
       */
      public static int binarySearch(byte[] arr, byte value) {
            if(arr == null) return -1;
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                    int mid = low + ((high - low) >>> 1);
                    byte midVal = arr[mid];

                    if (midVal < value) low = mid + 1;
                    else if (midVal > value) high = mid - 1;
                    else return mid;
            }
            return -(low + 2);
      }
      /**
       * Returns the index of the given value using the BinarySearch
       * algorithm.<br>
       * If the array is null, returns -1<br>
       * If the value isn't found, it returns a negative number. The number
       * allows to get the index at which the value should be inserted to keep
       * the array sorted. The equation to apply is: index = (-returnedValue) - 2
       * 
       * @param arr The SORTED array containing the value
       * @param value The value to search
       * @return The index of the value or the insertion position (look in method description)
       */
      public static int binarySearch(short[] arr, short value) {
            if(arr == null) return -1;
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                    int mid = low + ((high - low) >>> 1);
                    short midVal = arr[mid];

                    if (midVal < value) low = mid + 1;
                    else if (midVal > value) high = mid - 1;
                    else return mid;
            }
            return -(low + 2);
      }
      /**
       * Returns the index of the given value using the BinarySearch
       * algorithm.<br>
       * If the array is null, returns -1<br>
       * If the value isn't found, it returns a negative number. The number
       * allows to get the index at which the value should be inserted to keep
       * the array sorted. The equation to apply is: index = (-returnedValue) - 2
       * 
       * @param arr The SORTED array containing the value
       * @param value The value to search
       * @return The index of the value or the insertion position (look in method description)
       */
      public static int binarySearch(int[] arr, int value) {
            if(arr == null) return -1;
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                    int mid = low + ((high - low) >>> 1);
                    int midVal = arr[mid];

                    if (midVal < value) low = mid + 1;
                    else if (midVal > value) high = mid - 1;
                    else return mid;
            }
            return -(low + 2);
      }
      /**
       * Returns the index of the given value using the BinarySearch
       * algorithm.<br>
       * If the array is null, returns -1<br>
       * If the value isn't found, it returns a negative number. The number
       * allows to get the index at which the value should be inserted to keep
       * the array sorted. The equation to apply is: index = (-returnedValue) - 2
       * 
       * @param arr The SORTED array containing the value
       * @param value The value to search
       * @return The index of the value or the insertion position (look in method description)
       */
      public static int binarySearch(long[] arr, long value) {
            if(arr == null) return -1;
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                    int mid = low + ((high - low) >>> 1);
                    long midVal = arr[mid];

                    if (midVal < value) low = mid + 1;
                    else if (midVal > value) high = mid - 1;
                    else return mid;
            }
            return -(low + 2);
      }
      /**
       * Returns the index of the given value using the BinarySearch
       * algorithm.<br>
       * If the array is null, returns -1<br>
       * If the value isn't found, it returns a negative number. The number
       * allows to get the index at which the value should be inserted to keep
       * the array sorted. The equation to apply is: index = (-returnedValue) - 2
       * 
       * @param arr The SORTED array containing the value
       * @param value The value to search
       * @return The index of the value or the insertion position (look in method description)
       */
      public static int binarySearch(float[] arr, float value) {
            if(arr == null) return -1;
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                    int mid = low + ((high - low) >>> 1);
                    float midVal = arr[mid];

                    if (midVal < value) low = mid + 1;
                    else if (midVal > value) high = mid - 1;
                    else return mid;
            }
            return -(low + 2);
      }
      /**
       * Returns the index of the given value using the BinarySearch
       * algorithm.<br>
       * If the array is null, returns -1<br>
       * If the value isn't found, it returns a negative number. The number
       * allows to get the index at which the value should be inserted to keep
       * the array sorted. The equation to apply is: index = (-returnedValue) - 2
       * 
       * @param arr The SORTED array containing the value
       * @param value The value to search
       * @return The index of the value or the insertion position (look in method description)
       */
      public static int binarySearch(double[] arr, double value) {
            if(arr == null) return -1;
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                    int mid = low + ((high - low) >>> 1);
                    double midVal = arr[mid];

                    if (midVal < value) low = mid + 1;
                    else if (midVal > value) high = mid - 1;
                    else return mid;
            }
            return -(low + 2);
      }
      /**
       * Returns the index of the given value using the BinarySearch
       * algorithm.<br>
       * If the array is null, returns -1<br>
       * If the value isn't found, it returns a negative number. The number
       * allows to get the index at which the value should be inserted to keep
       * the array sorted. The equation to apply is: index = (-returnedValue) - 2
       * 
       * @param arr The SORTED array containing the value
       * @param value The value to search
       * @return The index of the value or the insertion position (look in method description)
       */
      public static int binarySearch(char[] arr, char value) {
            if(arr == null) return -1;
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                    int mid = low + ((high - low) >>> 1);
                    char midVal = arr[mid];

                    if (midVal < value) low = mid + 1;
                    else if (midVal > value) high = mid - 1;
                    else return mid;
            }
            return -(low + 2);
      }
      /**
       * Returns the index of the given value using the BinarySearch
       * algorithm.<br>
       * If the array is null, returns -1<br>
       * If the value isn't found, it returns a negative number.The number
       * allows to get the index at which the value should be inserted to keep
       * the array sorted.The equation to apply is: index = (-returnedValue) - 2
       * 
       * @param <T> The array's elements type
       * @param arr The SORTED array containing the value
       * @param value The value to search
       * @param c The comparator used to compare elements (must be the same used to sort the array)
       * @return The index of the value or the insertion position (look in method description)
       */
      public static <T> int binarySearch(T[] arr, T value, Comparator<? super T> c) {
            if (arr == null || c == null) return -1;
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                  int mid = low + ((high - low) >>> 1);
                  T midVal = arr[mid];

                  int cmp = c.compare(midVal, value);
                  if (cmp < 0) low = mid + 1;
                  else if (cmp > 0) high = mid - 1;
                  else return mid;
            }
            return -(low + 1);
      }

      /**
       * Return an array containing all of the indexes at which the value
       * appears in the array<br>
       * If the array is null, returns an empty array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The array containing all the indexes
       */
      public static int[] allIndexesOf(byte[] arr, byte value) {
            if (arr == null) return new int[0];
            ArrayList<Integer> indexes = new ArrayList();

            for(int i=0; i<arr.length; i++)
                    if(arr[i] == value) indexes.add(i);

            int[] res = new int[indexes.size()];
            for(int i=0; i<res.length; i++) res[i] = indexes.get(i);
            return res;
      }
      /**
       * Return an array containing all of the indexes at which the value
       * appears in the array<br>
       * If the array is null, returns an empty array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The array containing all the indexes
       */
      public static int[] allIndexesOf(short[] arr, short value) {
            if (arr == null) return new int[0];
            ArrayList<Integer> indexes = new ArrayList();

            for(int i=0; i<arr.length; i++)
                    if(arr[i] == value) indexes.add(i);

            int[] res = new int[indexes.size()];
            for(int i=0; i<res.length; i++) res[i] = indexes.get(i);
            return res;
      }
      /**
       * Return an array containing all of the indexes at which the value
       * appears in the array<br>
       * If the array is null, returns an empty array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The array containing all the indexes
       */
      public static int[] allIndexesOf(int[] arr, int value) {
            if (arr == null) return new int[0];
            ArrayList<Integer> indexes = new ArrayList();

            for(int i=0; i<arr.length; i++)
                    if(arr[i] == value) indexes.add(i);

            int[] res = new int[indexes.size()];
            for(int i=0; i<res.length; i++) res[i] = indexes.get(i);
            return res;
      }
      /**
       * Return an array containing all of the indexes at which the value
       * appears in the array<br>
       * If the array is null, returns an empty array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The array containing all the indexes
       */
      public static int[] allIndexesOf(long[] arr, long value) {
            if (arr == null) return new int[0];
            ArrayList<Integer> indexes = new ArrayList();

            for(int i=0; i<arr.length; i++)
                    if(arr[i] == value) indexes.add(i);

            int[] res = new int[indexes.size()];
            for(int i=0; i<res.length; i++) res[i] = indexes.get(i);
            return res;
      }
      /**
       * Return an array containing all of the indexes at which the value
       * appears in the array<br>
       * If the array is null, returns an empty array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The array containing all the indexes
       */
      public static int[] allIndexesOf(float[] arr, float value) {
            if (arr == null) return new int[0];
            ArrayList<Integer> indexes = new ArrayList();

            for(int i=0; i<arr.length; i++)
                    if(arr[i] == value) indexes.add(i);

            int[] res = new int[indexes.size()];
            for(int i=0; i<res.length; i++) res[i] = indexes.get(i);
            return res;
      }
      /**
       * Return an array containing all of the indexes at which the value
       * appears in the array<br>
       * If the array is null, returns an empty array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The array containing all the indexes
       */
      public static int[] allIndexesOf(double[] arr, double value) {
            if (arr == null) return new int[0];
            ArrayList<Integer> indexes = new ArrayList();

            for(int i=0; i<arr.length; i++)
                    if(arr[i] == value) indexes.add(i);

            int[] res = new int[indexes.size()];
            for(int i=0; i<res.length; i++) res[i] = indexes.get(i);
            return res;
      }
      /**
       * Return an array containing all of the indexes at which the value
       * appears in the array<br>
       * If the array is null, returns an empty array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The array containing all the indexes
       */
      public static int[] allIndexesOf(char[] arr, char value) {
            if (arr == null) return new int[0];
            ArrayList<Integer> indexes = new ArrayList();

            for(int i=0; i<arr.length; i++)
                    if(arr[i] == value) indexes.add(i);

            int[] res = new int[indexes.size()];
            for(int i=0; i<res.length; i++) res[i] = indexes.get(i);
            return res;
      }
      /**
       * Return an array containing all of the indexes at which the value
       * appears in the array<br>
       * If the array is null, returns an empty array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The array containing all the indexes
       */
      public static int[] allIndexesOf(boolean[] arr, boolean value) {
            if (arr == null) return new int[0];
            ArrayList<Integer> indexes = new ArrayList();

            for(int i=0; i<arr.length; i++)
                    if(arr[i] == value) indexes.add(i);

            int[] res = new int[indexes.size()];
            for(int i=0; i<res.length; i++) res[i] = indexes.get(i);
            return res;
      }
      /**
       * Return an array containing all of the indexes at which the value
       * appears in the array<br>
       * If the array is null, returns an empty array
       * 
       * @param <T> The array's elements type
       * @param arr The array containing the value
       * @param value The value to search for
       * @param c The comparator used to check if the value is present
       * @return The array containing all the indexes
       */
      public static <T> int[] allIndexesOf(T[] arr, T value, Comparator<? super T> c) {
            if (arr == null) return new int[0];
            ArrayList<Integer> indexes = new ArrayList();

            for(int i=0; i<arr.length; i++)
                    if(c.compare(arr[i], value)  == 0) indexes.add(i);

            int[] res = new int[indexes.size()];
            for(int i=0; i<res.length; i++) res[i] = indexes.get(i);
            return res;
      }
      
      
      /**
       * Returns whether or not the array contains the given value
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return If the value is in the array
       */
      public static boolean contains(byte[] arr, byte value) {
            if(arr == null) return false;
            for(byte n : arr) if(n == value) return true;
            return false;
      }
      /**
       * Returns whether or not the array contains the given value
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return If the value is in the array
       */
      public static boolean contains(short[] arr, short value) {
            if(arr == null) return false;
            for(short n : arr) if(n == value) return true;
            return false;
      }
      /**
       * Returns whether or not the array contains the given value
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return If the value is in the array
       */
      public static boolean contains(int[] arr, int value) {
            if(arr == null) return false;
            for(int n : arr) if(n == value) return true;
            return false;
      }
      /**
       * Returns whether or not the array contains the given value
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return If the value is in the array
       */
      public static boolean contains(long[] arr, long value) {
            if(arr == null) return false;
            for(long n : arr) if(n == value) return true;
            return false;
      }
      /**
       * Returns whether or not the array contains the given value
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return If the value is in the array
       */
      public static boolean contains(float[] arr, float value) {
            if(arr == null) return false;
            for(float n : arr) if(n == value) return true;
            return false;
      }
      /**
       * Returns whether or not the array contains the given value
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return If the value is in the array
       */
      public static boolean contains(double[] arr, double value) {
            if(arr == null) return false;
            for(double n : arr) if(n == value) return true;
            return false;
      }
      /**
       * Returns whether or not the array contains the given value
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return If the value is in the array
       */
      public static boolean contains(char[] arr, char value) {
            if(arr == null) return false;
            for(char n : arr) if(n == value) return true;
            return false;
      }
      /**
       * Returns whether or not the array contains the given value
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return If the value is in the array
       */
      public static boolean contains(boolean[] arr, boolean value) {
            if(arr == null) return false;
            for(boolean n : arr) if(n == value) return true;
            return false;
      }
      /**
       * Returns whether or not the array contains the given value
       * 
       * @param <T> The array's elements type
       * @param arr The array containing the value
       * @param value The value to search for
       * @param c The comparator used to check if the value is present
       * @return If the value is in the array
       */
      public static <T> boolean contains(T[] arr, T value, Comparator<? super T> c) {
            if(arr == null) return false;
            for(T n : arr) if(c.compare(n, value) == 0) return true;
            return false;
      }
      
      /**
       * Returns the amount of times the given value is present in 
       * the array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The amount of times the value is present
       */
      public static int count(byte[] arr, byte value) {
            if(arr == null) return 0;
            int count = 0;
            for(byte n : arr) if(n == value) count++;
            return count;
      }
      /**
       * Returns the amount of times the given value is present in 
       * the array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The amount of times the value is present
       */
      public static int count(short[] arr, short value) {
            if(arr == null) return 0;
            int count = 0;
            for(short n : arr) if(n == value) count++;
            return count;
      }
      /**
       * Returns the amount of times the given value is present in 
       * the array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The amount of times the value is present
       */
      public static int count(int[] arr, int value) {
            if(arr == null) return 0;
            int count = 0;
            for(int n : arr) if(n == value) count++;
            return count;
      }
      /**
       * Returns the amount of times the given value is present in 
       * the array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The amount of times the value is present
       */
      public static int count(long[] arr, long value) {
            if(arr == null) return 0;
            int count = 0;
            for(long n : arr) if(n == value) count++;
            return count;
      }
      /**
       * Returns the amount of times the given value is present in 
       * the array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The amount of times the value is present
       */
      public static int count(float[] arr, float value) {
            if(arr == null) return 0;
            int count = 0;
            for(float n : arr) if(n == value) count++;
            return count;
      }
      /**
       * Returns the amount of times the given value is present in 
       * the array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The amount of times the value is present
       */
      public static int count(double[] arr, double value) {
            if(arr == null) return 0;
            int count = 0;
            for(double n : arr) if(n == value) count++;
            return count;
      }
      /**
       * Returns the amount of times the given value is present in 
       * the array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The amount of times the value is present
       */
      public static int count(char[] arr, char value) {
            if(arr == null) return 0;
            int count = 0;
            for(char n : arr) if(n == value) count++;
            return count;
      }
      /**
       * Returns the amount of times the given value is present in 
       * the array
       * 
       * @param arr The array containing the value
       * @param value The value to search for
       * @return The amount of times the value is present
       */
      public static int count(boolean[] arr, boolean value) {
            if(arr == null) return 0;
            int count = 0;
            for(boolean n : arr) if(n == value) count++;
            return count;
      }
      /**
       * Returns the amount of times the given value is present in 
       * the array
       * 
       * @param <T> The array's elements type
       * @param arr The array containing the value
       * @param value The value to search for
       * @param c The comparator used to check if the value is present
       * @return The amount of times the value is present
       */
      public static <T> int count(T[] arr, T value, Comparator<? super T> c) {
            if(arr == null) return 0;
            int count = 0;
            for(T n : arr) if(c.compare(n, value) == 0) count++;
            return count;
      }
      
      
      /**
       * Replaces all instances of the given value with the new value
       * 
       * @param arr The array containing the value
       * @param value The value to replace
       * @param newValue The new value
       */
      public static void replace(byte[] arr, byte value, byte newValue) {
            if(arr == null) return;
            for(int i=0; i<arr.length; i++) if(arr[i] == value) arr[i] = newValue;
      }
      /**
       * Replaces all instances of the given value with the new value
       * 
       * @param arr The array containing the value
       * @param value The value to replace
       * @param newValue The new value
       */
      public static void replace(short[] arr, short value, short newValue) {
            if(arr == null) return;
            for(int i=0; i<arr.length; i++) if(arr[i] == value) arr[i] = newValue;
      }
      /**
       * Replaces all instances of the given value with the new value
       * 
       * @param arr The array containing the value
       * @param value The value to replace
       * @param newValue The new value
       */
      public static void replace(int[] arr, int value, int newValue) {
            if(arr == null) return;
            for(int i=0; i<arr.length; i++) if(arr[i] == value) arr[i] = newValue;
      }
      /**
       * Replaces all instances of the given value with the new value
       * 
       * @param arr The array containing the value
       * @param value The value to replace
       * @param newValue The new value
       */
      public static void replace(long[] arr, long value, long newValue) {
            if(arr == null) return;
            for(int i=0; i<arr.length; i++) if(arr[i] == value) arr[i] = newValue;
      }
      /**
       * Replaces all instances of the given value with the new value
       * 
       * @param arr The array containing the value
       * @param value The value to replace
       * @param newValue The new value
       */
      public static void replace(float[] arr, float value, float newValue) {
            if(arr == null) return;
            for(int i=0; i<arr.length; i++) if(arr[i] == value) arr[i] = newValue;
      }
      /**
       * Replaces all instances of the given value with the new value
       * 
       * @param arr The array containing the value
       * @param value The value to replace
       * @param newValue The new value
       */
      public static void replace(double[] arr, double value, double newValue) {
            if(arr == null) return;
            for(int i=0; i<arr.length; i++) if(arr[i] == value) arr[i] = newValue;
      }
      /**
       * Replaces all instances of the given value with the new value
       * 
       * @param arr The array containing the value
       * @param value The value to replace
       * @param newValue The new value
       */
      public static void replace(char[] arr, char value, char newValue) {
            if(arr == null) return;
            for(int i=0; i<arr.length; i++) if(arr[i] == value) arr[i] = newValue;
      }
      /**
       * Replaces all instances of the given value with the new value
       * 
       * @param arr The array containing the value
       * @param value The value to replace
       * @param newValue The new value
       */
      public static void replace(boolean[] arr, boolean value) {
            if(arr == null) return;
            for(int i=0; i<arr.length; i++) if(arr[i] == value) arr[i] = !arr[i];
      }
      /**
       * Replaces all instances of the given value with the new value
       * 
       * @param <T> The array's elements type
       * @param arr The array containing the value
       * @param value The value to replace
       * @param newValue The new value
       * @param c The comparator used to check if the value is present
       */
      public static <T> void replace(T[] arr, T value, T newValue, Comparator<? super T> c) {
            if(arr == null) return;
            for(int i=0; i<arr.length; i++) if(c.compare(arr[i], value) == 0) arr[i] = newValue;
      }
      
      /**
       * For each value in the values array, replaces each istance of it
       * with the corresponding new value (values[i] --> newValues[i])
       * 
       * @param arr The array containing the values
       * @param values The values to replace
       * @param newValues The new values
       */
      public static void replaceMult(byte[] arr, byte[] values, byte[] newValues) {
            if(arr.length == 0 || values.length != newValues.length) return;
            for(int i=0; i<arr.length; i++)
                  for(int j=0; j<values.length; j++) 
                        if(arr[i] == values[j]) {
                              arr[i] = newValues[j];
                              break;
                        }
      }
      /**
       * For each value in the values array, replaces each istance of it
       * with the corresponding new value (values[i] --> newValues[i])
       * 
       * @param arr The array containing the values
       * @param values The values to replace
       * @param newValues The new values
       */
      public static void replaceMult(short[] arr, short[] values, short[] newValues) {
            if(arr.length == 0 || values.length != newValues.length) return;
            for(int i=0; i<arr.length; i++)
                  for(int j=0; j<values.length; j++) 
                        if(arr[i] == values[j]) {
                              arr[i] = newValues[j];
                              break;
                        }
      }
      /**
       * For each value in the values array, replaces each istance of it
       * with the corresponding new value (values[i] --> newValues[i])
       * 
       * @param arr The array containing the values
       * @param values The values to replace
       * @param newValues The new values
       */
      public static void replaceMult(int[] arr, int[] values, int[] newValues) {
            if(arr.length == 0 || values.length != newValues.length) return;
            for(int i=0; i<arr.length; i++)
                  for(int j=0; j<values.length; j++) 
                        if(arr[i] == values[j]) {
                              arr[i] = newValues[j];
                              break;
                        }
      }
      /**
       * For each value in the values array, replaces each istance of it
       * with the corresponding new value (values[i] --> newValues[i])
       * 
       * @param arr The array containing the values
       * @param values The values to replace
       * @param newValues The new values
       */
      public static void replaceMult(long[] arr, long[] values, long[] newValues) {
            if(arr.length == 0 || values.length != newValues.length) return;
            for(int i=0; i<arr.length; i++)
                  for(int j=0; j<values.length; j++) 
                        if(arr[i] == values[j]) {
                              arr[i] = newValues[j];
                              break;
                        }
      }
      /**
       * For each value in the values array, replaces each istance of it
       * with the corresponding new value (values[i] --> newValues[i])
       * 
       * @param arr The array containing the values
       * @param values The values to replace
       * @param newValues The new values
       */
      public static void replaceMult(float[] arr, float[] values, float[] newValues) {
            if(arr.length == 0 || values.length != newValues.length) return;
            for(int i=0; i<arr.length; i++)
                  for(int j=0; j<values.length; j++) 
                        if(arr[i] == values[j]) {
                              arr[i] = newValues[j];
                              break;
                        }
      }
      /**
       * For each value in the values array, replaces each istance of it
       * with the corresponding new value (values[i] --> newValues[i])
       * 
       * @param arr The array containing the values
       * @param values The values to replace
       * @param newValues The new values
       */
      public static void replaceMult(double[] arr, double[] values, double[] newValues) {
            if(arr.length == 0 || values.length != newValues.length) return;
            for(int i=0; i<arr.length; i++)
                  for(int j=0; j<values.length; j++) 
                        if(arr[i] == values[j]) {
                              arr[i] = newValues[j];
                              break;
                        }
      }
      /**
       * For each value in the values array, replaces each istance of it
       * with the corresponding new value (values[i] --> newValues[i])
       * 
       * @param arr The array containing the values
       * @param values The values to replace
       * @param newValues The new values
       */
      public static void replaceMult(char[] arr, char[] values, char[] newValues) {
            if(arr.length == 0 || values.length != newValues.length) return;
            for(int i=0; i<arr.length; i++)
                  for(int j=0; j<values.length; j++) 
                        if(arr[i] == values[j]) {
                              arr[i] = newValues[j];
                              break;
                        }
      }
      /**
       * For each value in the values array, replaces each istance of it
       * with the corresponding new value (values[i] --> newValues[i])
       * 
       * @param <T> The array's elements type
       * @param arr The array containing the values
       * @param values The values to replace
       * @param newValues The new values
       * @param c The comparator used to check if the value is present
       */
      public static <T> void replaceMult(T[] arr, T[] values, T[] newValues, Comparator<? super T> c) {
            if(arr.length == 0 || values.length != newValues.length) return;
            for(int i=0; i<arr.length; i++)
                  for(int j=0; j<values.length; j++) 
                        if(c.compare(arr[i], values[j]) == 0) {
                              arr[i] = newValues[j];
                              break;
                        }
      }
      
      
      /**
       * Retuns the minimum value of the array<br>
       * If the array is null or empty, return the MAX_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The minimum value
       */
      public static byte getMin(byte[] arr){
            if(arr == null || arr.length == 0) return Byte.MAX_VALUE;
            byte min = arr[0];
            for(byte n : arr) if(n < min) min=n;
            return min;
      }
      /**
       * Retuns the minimum value of the array<br>
       * If the array is null or empty, return the MAX_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The minimum value
       */
      public static short getMin(short[] arr){
            if(arr == null || arr.length == 0) return Short.MAX_VALUE;
            short min = arr[0];
            for(short n : arr) if(n < min) min=n;
            return min;
      }
      /**
       * Retuns the minimum value of the array<br>
       * If the array is null or empty, return the MAX_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The minimum value
       */
      public static int getMin(int[] arr){
            if(arr == null || arr.length == 0) return Integer.MAX_VALUE;
            int min = arr[0];
            for(int n : arr) if(n < min) min=n;
            return min;
      }
      /**
       * Retuns the minimum value of the array<br>
       * If the array is null or empty, return the MAX_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The minimum value
       */
      public static long getMin(long[] arr){
            if(arr == null || arr.length == 0) return Long.MAX_VALUE;
            long min = arr[0];
            for(long n : arr) if(n < min) min=n;
            return min;
      }
      /**
       * Retuns the minimum value of the array<br>
       * If the array is null or empty, return the MAX_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The minimum value
       */
      public static float getMin(float[] arr){
            if(arr == null || arr.length == 0) return Float.MAX_VALUE;
            float min = arr[0];
            for(float n : arr) if(n<min) min=n;
            return min;
      }
      /**
       * Retuns the minimum value of the array<br>
       * If the array is null or empty, return the MAX_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The minimum value
       */
      public static double getMin(double[] arr){
            if(arr == null || arr.length == 0) return Double.MAX_VALUE;
            double min = arr[0];
            for(double n : arr) if(n < min) min=n;
            return min;
      }
      /**
       * Retuns the minimum value of the array<br>
       * If the array is null or empty, return the MAX_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The minimum value
       */
      public static char getMin(char[] arr){
            if(arr == null || arr.length == 0) return Character.MAX_VALUE;
            char min = arr[0];
            for(char n : arr) if(n < min) min=n;
            return min;
      }
      /**
       * Retuns the minimum value of the array<br>
       * If the array is null or empty, return the MAX_VALUE 
       * constant
       * 
       * @param <T> The array's elements type
       * @param arr The array containing the values
       * @param c The comparator used to compare the array's elements
       * @return The minimum value
       */
      public static <T> T getMin(T[] arr, Comparator<? super T> c){
            if(arr == null || arr.length == 0) return null;
            T min = arr[0];
            for(T n : arr) if(c.compare(n, min) < 0) min=n;
            return min;
      }
      
      /**
       * Retuns the maximum value of the array<br>
       * If the array is null or empty, return the MIN_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The maximum value
       */
      public static byte getMax(byte[] arr){
            if(arr == null || arr.length == 0) return Byte.MIN_VALUE;
            byte max = arr[0];
            for(byte n : arr) if(n > max) max=n;
            return max;
      }
      /**
       * Retuns the maximum value of the array<br>
       * If the array is null or empty, return the MIN_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The maximum value
       */
      public static short getMax(short[] arr){
            if(arr == null || arr.length == 0) return Short.MIN_VALUE;
            short max = arr[0];
            for(short n : arr) if(n > max) max=n;
            return max;
      }
      /**
       * Retuns the maximum value of the array<br>
       * If the array is null or empty, return the MIN_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The maximum value
       */
      public static int getMax(int[] arr){
            if(arr == null || arr.length == 0) return Integer.MIN_VALUE;
            int max = arr[0];
            for(int n : arr) if(n > max) max=n;
            return max;
      }
      /**
       * Retuns the maximum value of the array<br>
       * If the array is null or empty, return the MIN_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The maximum value
       */
      public static long getMax(long[] arr){
            if(arr == null || arr.length == 0) return Long.MIN_VALUE;
            long max = arr[0];
            for(long n : arr) if(n > max) max=n;
            return max;
      }
      /**
       * Retuns the maximum value of the array<br>
       * If the array is null or empty, return the MIN_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The maximum value
       */
      public static float getMax(float[] arr){
            if(arr == null || arr.length == 0) return Float.MIN_VALUE;
            float max = arr[0];
            for(float n : arr) if(n > max) max=n;
            return max;
      }
      /**
       * Retuns the maximum value of the array<br>
       * If the array is null or empty, return the MIN_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The maximum value
       */
      public static double getMax(double[] arr){
            if(arr == null || arr.length == 0) return Double.MIN_VALUE;
            double max = arr[0];
            for(double n : arr) if(n > max) max=n;
            return max;
      }
      /**
       * Retuns the maximum value of the array<br>
       * If the array is null or empty, return the MIN_VALUE 
       * constant
       * 
       * @param arr The array containing the values
       * @return The maximum value
       */
      public static char getMax(char[] arr){
            if(arr == null || arr.length == 0) return Character.MIN_VALUE;
            char max = arr[0];
            for(char n : arr) if(n > max) max=n;
            return max;
      }
      /**
       * Retuns the maximum value of the array<br>
       * If the array is null or empty, return the MIN_VALUE 
       * constant
       * 
       * @param <T> The array's elements type
       * @param arr The array containing the values
       * @param c The comparator used to compare the array's elements
       * @return The maximum value
       */
      public static <T> T getMax(T[] arr, Comparator<? super T> c){
            if(arr == null || arr.length == 0) return null;
            T max = arr[0];
            for(T n : arr) if(c.compare(n, max) > 0) max=n;
            return max;
      }
      
      /**
       * Return the avarage between the values of the array
       * 
       * @param arr The array containing the values
       * @return The avarage
       */
      public static double getAvarage(byte[] arr) {
            if(arr == null) return Double.MAX_VALUE;
            double avarage = 0;
            for(byte n : arr) avarage += n;
            return (arr.length > 0) ? avarage / arr.length : avarage;
      }
      /**
       * Return the avarage between the values of the array
       * 
       * @param arr The array containing the values
       * @return The avarage
       */
      public static double getAvarage(short[] arr) {
            if(arr == null) return Double.MAX_VALUE;
            double avarage = 0;
            for(short n : arr) avarage += n;
            return (arr.length > 0) ? avarage / arr.length : avarage;
      }
      /**
       * Return the avarage between the values of the array
       * 
       * @param arr The array containing the values
       * @return The avarage
       */
      public static double getAvarage(int[] arr) {
            if(arr == null) return Double.MAX_VALUE;
            double avarage = 0;
            for(int n : arr) avarage += n;
            return (arr.length > 0) ? avarage / arr.length : avarage;
      }
      /**
       * Return the avarage between the values of the array
       * 
       * @param arr The array containing the values
       * @return The avarage
       */
      public static double getAvarage(long[] arr) {
            if(arr == null) return Double.MAX_VALUE;
            double avarage = 0;
            for(long n : arr) avarage += n;
            return (arr.length > 0) ? avarage / arr.length : avarage;
      }
      /**
       * Return the avarage between the values of the array
       * 
       * @param arr The array containing the values
       * @return The avarage
       */
      public static double getAvarage(float[] arr) {
            if(arr == null) return Double.MAX_VALUE;
            double avarage = 0;
            for(float n : arr) avarage += n;
            return (arr.length > 0) ? avarage / arr.length : avarage;
      }
      /**
       * Return the avarage between the values of the array
       * 
       * @param arr The array containing the values
       * @return The avarage
       */
      public static double getAvarage(double[] arr) {
            if(arr == null) return Double.MAX_VALUE;
            double avarage = 0;
            for(double n : arr) avarage += n;
            return (arr.length > 0) ? avarage / arr.length : avarage;
      }
}