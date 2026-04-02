package arr;

/**
 * Array utility class that allows peremutations of
 * the arrat
 * 
 * @author Cantoni Alessandro
 */
public class Perm {
      protected Perm() {}
      
      private static int randomIndex(int len) {
            return (int) (Math.random() * len);
      }
      
      /**
       * Swaps the elements at the given indexes
       * 
       * @param index1 The index of the first element to swap
       * @param index2 The index of the second element to swap
       * @param arr The array to permutate
       */
      public static void swap(int index1, int index2, byte[] arr){
            byte temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      /**
       * Swaps the elements at the given indexes
       * 
       * @param index1 The index of the first element to swap
       * @param index2 The index of the second element to swap
       * @param arr The array to permutate
       */
      public static void swap(int index1, int index2, short[] arr){
            short temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      /**
       * Swaps the elements at the given indexes
       * 
       * @param index1 The index of the first element to swap
       * @param index2 The index of the second element to swap
       * @param arr The array to permutate
       */
      public static void swap(int index1, int index2, int[] arr){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      /**
       * Swaps the elements at the given indexes
       * 
       * @param index1 The index of the first element to swap
       * @param index2 The index of the second element to swap
       * @param arr The array to permutate
       */
      public static void swap(int index1, int index2, long[] arr){
            long temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      /**
       * Swaps the elements at the given indexes
       * 
       * @param index1 The index of the first element to swap
       * @param index2 The index of the second element to swap
       * @param arr The array to permutate
       */
      public static void swap(int index1, int index2, float[] arr){
            float temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      /**
       * Swaps the elements at the given indexes
       * 
       * @param index1 The index of the first element to swap
       * @param index2 The index of the second element to swap
       * @param arr The array to permutate
       */
      public static void swap(int index1, int index2, double[] arr){
            double temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      /**
       * Swaps the elements at the given indexes
       * 
       * @param index1 The index of the first element to swap
       * @param index2 The index of the second element to swap
       * @param arr The array to permutate
       */
      public static void swap(int index1, int index2, char[] arr){
            char temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      /**
       * Swaps the elements at the given indexes
       * 
       * @param index1 The index of the first element to swap
       * @param index2 The index of the second element to swap
       * @param arr The array to permutate
       */
      public static void swap(int index1, int index2, boolean[] arr){
            boolean temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      /**
       * Swaps the elements at the given indexes
       * 
       * @param <T> The array's elements type
       * @param index1 The index of the first element to swap
       * @param index2 The index of the second element to swap
       * @param arr The array to permutate
       */
      public static <T> void swap(int index1, int index2, T[] arr){
            T temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
      }
      
      
      /**
       * Swaps two random elements of the array
       * 30 times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @return A shuffled copy of the array
       */
      public static byte[] shuffled(byte[] arr){
            if(arr == null || arr.length < 2) return arr;
            byte[] res = arr.clone();
            for(int i=0; i<30; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * 30 times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @return A shuffled copy of the array
       */
      public static short[] shuffled(short[] arr){
            if(arr == null || arr.length < 2) return arr;
            short[] res = arr.clone();
            for(int i=0; i<30; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * 30 times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @return A shuffled copy of the array
       */
      public static int[] shuffled(int[] arr){
            if(arr == null || arr.length < 2) return arr;
            int[] res = arr.clone();
            for(int i=0; i<30; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
        }
      /**
       * Swaps two random elements of the array
       * 30 times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @return A shuffled copy of the array
       */
      public static long[] shuffled(long[] arr){
            if(arr == null || arr.length < 2) return arr;
            long[] res = arr.clone();
            for(int i=0; i<30; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * 30 times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @return A shuffled copy of the array
       */
      public static float[] shuffled(float[] arr){
            if(arr == null || arr.length < 2) return arr;
            float[] res = arr.clone();
            for(int i=0; i<30; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * 30 times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @return A shuffled copy of the array
       */
      public static double[] shuffled(double[] arr){
            if(arr == null || arr.length < 2) return arr;
            double[] res = arr.clone();
            for(int i=0; i<30; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * 30 times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @return A shuffled copy of the array
       */
      public static char[] shuffled(char[] arr){
            if(arr == null || arr.length < 2) return arr;
            char[] res = arr.clone();
            for(int i=0; i<30; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * 30 times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @return A shuffled copy of the array
       */
      public static boolean[] shuffled(boolean[] arr){
            if(arr == null || arr.length < 2) return arr;
            boolean[] res = arr.clone();
            for(int i=0; i<30; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * 30 times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param <T> The array's elements type
       * @param arr The array to shuffle
       * @return A shuffled copy of the array
       */
      public static <T> T[] shuffled(T[] arr){
            if(arr == null || arr.length < 2) return arr;
            T[] res = arr.clone();
            for(int i=0; i<30; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      
      /**
       * Swaps two random elements of the array
       * the given amount of times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @param iterations The amount of swaps
       * @return A shuffled copy of the array
       */
      public static byte[] shuffled(byte[] arr, int iterations){
            if(arr == null || arr.length < 2) return arr;
            byte[] res = arr.clone();
            for(int i=0; i<iterations; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * the given amount of times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @param iterations The amount of swaps
       * @return A shuffled copy of the array
       */
      public static short[] shuffled(short[] arr, int iterations){
            if(arr == null || arr.length < 2) return arr;
            short[] res = arr.clone();
            for(int i=0; i<iterations; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * the given amount of times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @param iterations The amount of swaps
       * @return A shuffled copy of the array
       */
      public static int[] shuffled(int[] arr, int iterations){
            if(arr == null || arr.length < 2) return arr;
            int[] res = arr.clone();
            for(int i=0; i<iterations; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
        }
      /**
       * Swaps two random elements of the array
       * the given amount of times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @param iterations The amount of swaps
       * @return A shuffled copy of the array
       */
      public static long[] shuffled(long[] arr, int iterations){
            if(arr == null || arr.length < 2) return arr;
            long[] res = arr.clone();
            for(int i=0; i<iterations; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * the given amount of times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @param iterations The amount of swaps
       * @return A shuffled copy of the array
       */
      public static float[] shuffled(float[] arr, int iterations){
            if(arr == null || arr.length < 2) return arr;
            float[] res = arr.clone();
            for(int i=0; i<iterations; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * the given amount of times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @param iterations The amount of swaps
       * @return A shuffled copy of the array
       */
      public static double[] shuffled(double[] arr, int iterations){
            if(arr == null || arr.length < 2) return arr;
            double[] res = arr.clone();
            for(int i=0; i<iterations; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * the given amount of times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @param iterations The amount of swaps
       * @return A shuffled copy of the array
       */
      public static char[] shuffled(char[] arr, int iterations){
            if(arr == null || arr.length < 2) return arr;
            char[] res = arr.clone();
            for(int i=0; i<iterations; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * the given amount of times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param arr The array to shuffle
       * @param iterations The amount of swaps
       * @return A shuffled copy of the array
       */
      public static boolean[] shuffled(boolean[] arr, int iterations){
            if(arr == null || arr.length < 2) return arr;
            boolean[] res = arr.clone();
            for(int i=0; i<iterations; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      /**
       * Swaps two random elements of the array
       * the given amount of times, shuffling it<br>
       * Return a shuffled copy, without modifying the
       * original one
       * 
       * @param <T> The array's elements type
       * @param arr The array to shuffle
       * @param iterations The amount of swaps
       * @return A shuffled copy of the array
       */
      public static <T> T[] shuffled(T[] arr, int iterations){
            if(arr == null || arr.length < 2) return arr;
            T[] res = arr.clone();
            for(int i=0; i<iterations; i++) swap( randomIndex(arr.length), randomIndex(arr.length), res );
            return res;
      }
      

      /**
       * Reverses the order of the elements of the array<br>
       * Return a reversed copy, without modifying the
       * original array
       * 
       * @param arr The array to reverse
       * @return The reversed copy of the array
       */
      public static byte[] reversed(byte[] arr) {
            if(arr == null || arr.length < 2) return arr;
            byte[] res = arr.clone();
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Reverses the order of the elements of the array<br>
       * Return a reversed copy, without modifying the
       * original array
       * 
       * @param arr The array to reverse
       * @return The reversed copy of the array
       */
      public static short[] reversed(short[] arr) {
            if(arr == null || arr.length < 2) return arr;
            short[] res = arr.clone();
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Reverses the order of the elements of the array<br>
       * Return a reversed copy, without modifying the
       * original array
       * 
       * @param arr The array to reverse
       * @return The reversed copy of the array
       */
      public static int[] reversed(int[] arr){
            if(arr == null || arr.length < 2) return arr;
            int[] res = arr.clone();
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Reverses the order of the elements of the array<br>
       * Return a reversed copy, without modifying the
       * original array
       * 
       * @param arr The array to reverse
       * @return The reversed copy of the array
       */
      public static long[] reversed(long[] arr) {
            if(arr == null || arr.length < 2) return arr;
            long[] res = arr.clone();
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Reverses the order of the elements of the array<br>
       * Return a reversed copy, without modifying the
       * original array
       * 
       * @param arr The array to reverse
       * @return The reversed copy of the array
       */
      public static float[] reversed(float[] arr) {
            if(arr == null || arr.length < 2) return arr;
            float[] res = arr.clone();
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Reverses the order of the elements of the array<br>
       * Return a reversed copy, without modifying the
       * original array
       * 
       * @param arr The array to reverse
       * @return The reversed copy of the array
       */
      public static double[] reversed(double[] arr) {
            if(arr == null || arr.length < 2) return arr;
            double[] res = arr.clone();
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Reverses the order of the elements of the array<br>
       * Return a reversed copy, without modifying the
       * original array
       * 
       * @param arr The array to reverse
       * @return The reversed copy of the array
       */
      public static char[] reversed(char[] arr) {
            if(arr == null || arr.length < 2) return arr;
            char[] res = arr.clone();
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Reverses the order of the elements of the array<br>
       * Return a reversed copy, without modifying the
       * original array
       * 
       * @param arr The array to reverse
       * @return The reversed copy of the array
       */
      public static boolean[] reversed(boolean[] arr) {
            if(arr == null || arr.length < 2) return arr;
            boolean[] res = arr.clone();
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }
      /**
       * Reverses the order of the elements of the array<br>
       * Return a reversed copy, without modifying the
       * original array
       * 
       * @param <T> The array's elements type
       * @param arr The array to reverse
       * @return The reversed copy of the array
       */
      public static <T> T[] reversed(T[] arr){
            if(arr == null || arr.length < 2) return arr;
            T[] res = arr.clone();
            for(int i=0; i<(res.length/2)+1; i++)
                  if(i<res.length-i-1) swap(i, res.length-i-1, res);
            return res;
      }


      /**
       * Shifts the elemnents of the array to the right
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static byte[] shiftedR(byte[] arr){
            if(arr == null || arr.length < 2) return arr;
            byte[] res = arr.clone();
            byte buffer = res[res.length-1];
            for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
            res[0] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static short[] shiftedR(short[] arr){
            if(arr == null || arr.length < 2) return arr;
            short[] res = arr.clone();
            short buffer = res[res.length-1];
            for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
            res[0] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static int[] shiftedR(int[] arr){
            if(arr == null || arr.length < 2) return arr;
            int[] res = arr.clone();
            int buffer = res[res.length-1];
            for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
            res[0] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static long[] shiftedR(long[] arr){
            if(arr == null || arr.length < 2) return arr;
            long[] res = arr.clone();
            long buffer = res[res.length-1];
            for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
            res[0] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static float[] shiftedR(float[] arr){
            if(arr == null || arr.length < 2) return arr;
            float[] res = arr.clone();
            float buffer = res[res.length-1];
            for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
            res[0] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static double[] shiftedR(double[] arr){
            if(arr == null || arr.length < 2) return arr;
            double[] res = arr.clone();
            double buffer = res[res.length-1];
            for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
            res[0] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static char[] shiftedR(char[] arr){
            if(arr == null || arr.length < 2) return arr;
            char[] res = arr.clone();
            char buffer = res[res.length-1];
            for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
            res[0] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static boolean[] shiftedR(boolean[] arr){
            if(arr == null || arr.length < 2) return arr;
            boolean[] res = arr.clone();
            boolean buffer = res[res.length-1];
            for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
            res[0] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param <T> The array's elements type
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static <T> T[] shiftedR(T[] arr){
            if(arr == null || arr.length < 2) return arr;
            T[] res = arr.clone();
            T buffer = res[res.length-1];
            for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
            res[0] = buffer;
            return res;
      }
      
      /**
       * Shifts the elemnents of the array to the right
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static byte[] shiftedR(byte[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            byte[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  byte buffer = res[res.length-1];
                  for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
                  res[0] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static short[] shiftedR(short[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            short[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  short buffer = res[res.length-1];
                  for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
                  res[0] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static int[] shiftedR(int[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            int[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  int buffer = res[res.length-1];
                  for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
                  res[0] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static long[] shiftedR(long[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            long[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  long buffer = res[res.length-1];
                  for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
                  res[0] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static float[] shiftedR(float[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            float[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  float buffer = res[res.length-1];
                  for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
                  res[0] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static double[] shiftedR(double[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            double[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  double buffer = res[res.length-1];
                  for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
                  res[0] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static char[] shiftedR(char[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            char[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  char buffer = res[res.length-1];
                  for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
                  res[0] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static boolean[] shiftedR(boolean[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            boolean[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  boolean buffer = res[res.length-1];
                  for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
                  res[0] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the right
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param <T> The array's elements type
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static <T> T[] shiftedR(T[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            T[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  T buffer = res[res.length-1];
                  for(int i=res.length-2; i>=0; i--) swap(i, i+1, res );
                  res[0] = buffer;
            }
            return res;
      }

      
      /**
       * Shifts the elemnents of the array to the left
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static byte[] shiftedL(byte[] arr){
            if(arr == null || arr.length < 2) return arr;
            byte[] res = arr.clone();
            byte buffer = res[0];
            for(int i=1; i<arr.length; i++) swap(i, i-1, res );
            res[arr.length-1] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static short[] shiftedL(short[] arr){
            if(arr == null || arr.length < 2) return arr;
            short[] res = arr.clone();
            short buffer = res[0];
            for(int i=1; i<arr.length; i++) swap(i, i-1, res );
            res[arr.length-1] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static int[] shiftedL(int[] arr){
            if(arr == null || arr.length < 2) return arr;
            int[] res = arr.clone();
            int buffer = res[0];
            for(int i=1; i<arr.length; i++) swap(i, i-1, res );
            res[arr.length-1] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static long[] shiftedL(long[] arr){
            if(arr == null || arr.length < 2) return arr;
            long[] res = arr.clone();
            long buffer = res[0];
            for(int i=1; i<arr.length; i++) swap(i, i-1, res );
            res[arr.length-1] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static float[] shiftedL(float[] arr){
            if(arr == null || arr.length < 2) return arr;
            float[] res = arr.clone();
            float buffer = res[0];
            for(int i=1; i<arr.length; i++) swap(i, i-1, res );
            res[arr.length-1] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static double[] shiftedL(double[] arr){
            if(arr == null || arr.length < 2) return arr;
            double[] res = arr.clone();
            double buffer = res[0];
            for(int i=1; i<arr.length; i++) swap(i, i-1, res );
            res[arr.length-1] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static char[] shiftedL(char[] arr){
            if(arr == null || arr.length < 2) return arr;
            char[] res = arr.clone();
            char buffer = res[0];
            for(int i=1; i<arr.length; i++) swap(i, i-1, res );
            res[arr.length-1] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static boolean[] shiftedL(boolean[] arr){
            if(arr == null || arr.length < 2) return arr;
            boolean[] res = arr.clone();
            boolean buffer = res[0];
            for(int i=1; i<arr.length; i++) swap(i, i-1, res );
            res[arr.length-1] = buffer;
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * one time ( {1,2,3} -> {3,1,2} )<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param <T> The array's elements type
       * @param arr The array to shift
       * @return The shifted copy of the array
       */
      public static <T> T[] shiftedL(T[] arr){
            if(arr == null || arr.length < 2) return arr;
            T[] res = arr.clone();
            T buffer = res[0];
            for(int i=1; i<arr.length; i++) swap(i, i-1, res );
            res[arr.length-1] = buffer;
            return res;
      }
      
      /**
       * Shifts the elemnents of the array to the left
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static byte[] shiftedL(byte[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            byte[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  byte buffer = res[0];
                  for(int i=1; i<arr.length; i++) swap(i, i-1, res );
                  res[arr.length-1] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static short[] shiftedL(short[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            short[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  short buffer = res[0];
                  for(int i=1; i<arr.length; i++) swap(i, i-1, res );
                  res[arr.length-1] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static int[] shiftedL(int[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            int[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  int buffer = res[0];
                  for(int i=1; i<arr.length; i++) swap(i, i-1, res );
                  res[arr.length-1] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static long[] shiftedL(long[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            long[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  long buffer = res[0];
                  for(int i=1; i<arr.length; i++) swap(i, i-1, res );
                  res[arr.length-1] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static float[] shiftedL(float[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            float[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  float buffer = res[0];
                  for(int i=1; i<arr.length; i++) swap(i, i-1, res );
                  res[arr.length-1] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static double[] shiftedL(double[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            double[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  double buffer = res[0];
                  for(int i=1; i<arr.length; i++) swap(i, i-1, res );
                  res[arr.length-1] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static char[] shiftedL(char[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            char[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  char buffer = res[0];
                  for(int i=1; i<arr.length; i++) swap(i, i-1, res );
                  res[arr.length-1] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static boolean[] shiftedL(boolean[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            boolean[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  boolean buffer = res[0];
                  for(int i=1; i<arr.length; i++) swap(i, i-1, res );
                  res[arr.length-1] = buffer;
            }
            return res;
      }
      /**
       * Shifts the elemnents of the array to the left
       * the given amounts of times<br>
       * Return a shifted copy of the array, without modifying the
       * original array
       * 
       * @param <T> The array's elements type
       * @param arr The array to shift
       * @param shifts The number of times the elments of the array are shifted
       * @return The shifted copy of the array
       */
      public static <T> T[] shiftedL(T[] arr, int shifts){
            if(arr == null || arr.length < 2 || shifts%arr.length == 0) return arr;
            T[] res = arr.clone();
            for(int s=0; s<shifts%res.length; s++) {
                  T buffer = res[0];
                  for(int i=1; i<arr.length; i++) swap(i, i-1, res );
                  res[arr.length-1] = buffer;
            }
            return res;
      }
}
