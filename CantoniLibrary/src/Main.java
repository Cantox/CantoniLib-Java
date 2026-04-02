import CantoniLib.*;

public class Main {
      public static void main(String[] args) {
            String[] arr = {"z", "c", "2", "a"};
            //int[] arr = null;
            Arr.Sorts.sorted(arr, String.CASE_INSENSITIVE_ORDER);
            for(String n : arr) System.out.println(n);
            System.out.println();
            
            float[] arr2 = {1.5f,2.23f,3.00f,10.2f,1,55.434f};
            Arr.Console.print(arr2,2,3);
            System.out.println();
            
            byte[] arr3 = {1,2,3};
            Arr.Console.print(Arr.Perm.shiftedR(arr3,4));
        }
}
