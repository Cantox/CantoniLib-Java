import CantoniLib.*;

public class Main {
      public static void main(String[] args) {
            String[] arr = {"z", "c", "2", "a"};
            Arr.Sorts.insertionSort(arr, String.CASE_INSENSITIVE_ORDER);
            for(String n : arr) System.out.println(n);
        }
}
