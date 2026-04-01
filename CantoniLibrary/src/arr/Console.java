package arr;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Array utility class with methods to print the array
 * in the console
 * 
 * @author Cantoni Alessandro
 */
public class Console {
      private static final DecimalFormatSymbols usDecimalFormatSymbols = DecimalFormatSymbols.getInstance(Locale.US);
      
      protected Console() {}
      
      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"
       * 
       * @param arr The array to print
       */
      public static void print(byte[] arr){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  System.out.print("[" + arr[0] + ", ");
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + ", ");
                  System.out.print(arr[arr.length-1] + "]");
            }
        }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"
       * 
       * @param arr The array to print
       * @param separation The string put between the array's elements
       */
      public static void print(byte[] arr, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  System.out.print(arr[0] + separation);
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + separation);
                  System.out.print(arr[arr.length-1]);
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param width The minimum number of characters each element occupies
       */
      public static void print(byte[] arr, int width){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if(width < 1) width = 1;
                  String s = Byte.toString(arr[0]);
                  System.out.print("[" + " ".repeat(Math.max(0, width - s.length())) + s + ", ");

                  for(int i=1; i<arr.length-1; i++){
                        s = Byte.toString(arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + s + ", ");
                  }

                  s = Byte.toString(arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s + "]");
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param width The minimum number of characters each element occupies
       * @param separation The string put between the array's elements
       */
      public static void print(byte[] arr, int width, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  if(width < 1) width = 1;
                  String s = Byte.toString(arr[0]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s + separation);

                  for(int i=1; i<arr.length-1; i++){
                        s = Byte.toString(arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + s + separation);
                  }

                  s = Byte.toString(arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
            }
      }

      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"
       * 
       * @param arr The array to print
       */
      public static void print(short[] arr){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  System.out.print("[" + arr[0] + ", ");
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + ", ");
                  System.out.print(arr[arr.length-1] + "]");
            }
        }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"
       * 
       * @param arr The array to print
       * @param separation The string put between the array's elements
       */
      public static void print(short[] arr, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  System.out.print(arr[0] + separation);
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + separation);
                  System.out.print(arr[arr.length-1]);
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param width The minimum number of characters each element occupies
       */
      public static void print(short[] arr, int width){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if(width < 1) width = 1;
                  String s = Short.toString(arr[0]);
                  System.out.print("[" + " ".repeat(Math.max(0, width - s.length())) + s + ", ");

                  for(int i=1; i<arr.length-1; i++){
                        s = Short.toString(arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + s + ", ");
                  }

                  s = Short.toString(arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s + "]");
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param width The minimum number of characters each element occupies
       * @param separation The string put between the array's elements
       */
      public static void print(short[] arr, int width, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  if(width < 1) width = 1;
                  String s = Short.toString(arr[0]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s + separation);

                  for(int i=1; i<arr.length-1; i++){
                        s = Short.toString(arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + s + separation);
                  }

                  s = Short.toString(arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
            }
      }

      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"
       * 
       * @param arr The array to print
       */
      public static void print(int[] arr){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  System.out.print("[" + arr[0] + ", ");
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + ", ");
                  System.out.print(arr[arr.length-1] + "]");
            }
        }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"
       * 
       * @param arr The array to print
       * @param separation The string put between the array's elements
       */
      public static void print(int[] arr, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  System.out.print(arr[0] + separation);
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + separation);
                  System.out.print(arr[arr.length-1]);
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param width The minimum number of characters each element occupies
       */
      public static void print(int[] arr, int width){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if(width < 1) width = 1;
                  String s = Integer.toString(arr[0]);
                  System.out.print("[" + " ".repeat(Math.max(0, width - s.length())) + s + ", ");

                  for(int i=1; i<arr.length-1; i++){
                        s = Integer.toString(arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + s + ", ");
                  }

                  s = Integer.toString(arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s + "]");
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param width The minimum number of characters each element occupies
       * @param separation The string put between the array's elements
       */
      public static void print(int[] arr, int width, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  if(width < 1) width = 1;
                  String s = Integer.toString(arr[0]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s + separation);

                  for(int i=1; i<arr.length-1; i++){
                        s = Integer.toString(arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + s + separation);
                  }

                  s = Integer.toString(arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
            }
      }

      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"
       * 
       * @param arr The array to print
       */
      public static void print(long[] arr){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  System.out.print("[" + arr[0] + ", ");
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + ", ");
                  System.out.print(arr[arr.length-1] + "]");
            }
        }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"
       * 
       * @param arr The array to print
       * @param separation The string put between the array's elements
       */
      public static void print(long[] arr, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  System.out.print(arr[0] + separation);
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + separation);
                  System.out.print(arr[arr.length-1]);
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param width The minimum number of characters each element occupies
       */
      public static void print(long[] arr, int width){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if(width < 1) width = 1;
                  String s = Long.toString(arr[0]);
                  System.out.print("[" + " ".repeat(Math.max(0, width - s.length())) + s + ", ");

                  for(int i=1; i<arr.length-1; i++){
                        s = Long.toString(arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + s + ", ");
                  }

                  s = Long.toString(arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s + "]");
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param width The minimum number of characters each element occupies
       * @param separation The string put between the array's elements
       */
      public static void print(long[] arr, int width, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  if(width < 1) width = 1;
                  String s = Long.toString(arr[0]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s + separation);

                  for(int i=1; i<arr.length-1; i++){
                        s = Long.toString(arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + s + separation);
                  }

                  s = Long.toString(arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
            }
      }

      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"
       * 
       * @param arr The array to print
       */
      public static void print(float[] arr){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  System.out.print("[" + arr[0] + ", ");
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + ", ");
                  System.out.print(arr[arr.length-1] + "]");
            }
        }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"
       * 
       * @param arr The array to print
       * @param separation The string put between the array's elements
       */
      public static void print(float[] arr, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  System.out.print(arr[0] + separation);
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + separation);
                  System.out.print(arr[arr.length-1]);
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"<br>
       * Each element is printed with the given amount of
       * decimal digits
       * 
       * @param arr The array to print
       * @param decimals The amount of decimal digits
       */
      public static void print(float[] arr, int decimals){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (decimals < 1) decimals = 1;
                  String pattern = "0." + "0".repeat(decimals);
                  DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);
                  
                  System.out.print("[" + df.format(arr[0]) + ", ");
                  for(int i=1; i<arr.length-1; i++) System.out.print(df.format(arr[i]) + ", ");
                  System.out.print(df.format(arr[arr.length-1]) + "]");
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"<br>
       * Each element is printed with the given amount of
       * decimal digits
       * 
       * @param arr The array to print
       * @param decimals The amount of decimal digits
       * @param separation The string put between the array's elements
       */
      public static void print(float[] arr, int decimals, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  if (decimals < 1) decimals = 1;
                  String pattern = "0." + "0".repeat(decimals);
                  DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);
                  
                  System.out.print(df.format(arr[0]) + separation);
                  for(int i=1; i<arr.length-1; i++) System.out.print(df.format(arr[i]) + separation);
                  System.out.print(df.format(arr[arr.length-1]));
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"<br>
       * Each element is printed with the given amount of
       * decimal digits<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param decimals The amount of decimal digits
       * @param width The minimum number of characters each element occupies
       */
      public static void print(float[] arr, int decimals, int width){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (decimals < 1) decimals = 1;
                  if(width < 1) width = 1;
                  
                  String pattern = "0." + "0".repeat(decimals);
                  DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);
                  
                  String s = Integer.toString((int)arr[0]);
                  System.out.print("[" + " ".repeat(Math.max(0, width - s.length())) + df.format(arr[0]) + ", ");
                  for(int i=1; i<arr.length-1; i++){
                        s = Integer.toString((int)arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + df.format(arr[i]) + ", ");
                  }
                  s = Integer.toString((int)arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(arr[arr.length-1]) + "]");
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"<br>
       * Each element is printed with the given amount of
       * decimal digits<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param decimals The amount of decimal digits
       * @param width The minimum number of characters each element occupies
       * @param separation The string put between the array's elements
       */
      public static void print(float[] arr, int decimals, int width, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  if (decimals < 1) decimals = 1;
                  if(width < 1) width = 1;
                  
                  String pattern = "0." + "0".repeat(decimals);
                  DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);
                  
                  String s = Integer.toString((int)arr[0]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(arr[0]) + separation);
                  for(int i=1; i<arr.length-1; i++){
                        s = Integer.toString((int)arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + df.format(arr[i]) + separation);
                  }
                  s = Integer.toString((int)arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(arr[arr.length-1]));
            }
      }

      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"
       * 
       * @param arr The array to print
       */
      public static void print(double[] arr){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  System.out.print("[" + arr[0] + ", ");
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + ", ");
                  System.out.print(arr[arr.length-1] + "]");
            }
        }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"
       * 
       * @param arr The array to print
       * @param separation The string put between the array's elements
       */
      public static void print(double[] arr, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  System.out.print(arr[0] + separation);
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + separation);
                  System.out.print(arr[arr.length-1]);
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"<br>
       * Each element is printed with the given amount of
       * decimal digits
       * 
       * @param arr The array to print
       * @param decimals The amount of decimal digits
       */
      public static void print(double[] arr, int decimals){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (decimals < 1) decimals = 1;
                  String pattern = "0." + "0".repeat(decimals);
                  DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);
                  
                  System.out.print("[" + df.format(arr[0]) + ", ");
                  for(int i=1; i<arr.length-1; i++) System.out.print(df.format(arr[i]) + ", ");
                  System.out.print(df.format(arr[arr.length-1]) + "]");
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"<br>
       * Each element is printed with the given amount of
       * decimal digits
       * 
       * @param arr The array to print
       * @param decimals The amount of decimal digits
       * @param separation The string put between the array's elements
       */
      public static void print(double[] arr, int decimals, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  if (decimals < 1) decimals = 1;
                  String pattern = "0." + "0".repeat(decimals);
                  DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);
                  
                  System.out.print(df.format(arr[0]) + separation);
                  for(int i=1; i<arr.length-1; i++) System.out.print(df.format(arr[i]) + separation);
                  System.out.print(df.format(arr[arr.length-1]));
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"<br>
       * Each element is printed with the given amount of
       * decimal digits<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param decimals The amount of decimal digits
       * @param width The minimum number of characters each element occupies
       */
      public static void print(double[] arr, int decimals, int width){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (decimals < 1) decimals = 1;
                  if(width < 1) width = 1;
                  
                  String pattern = "0." + "0".repeat(decimals);
                  DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);
                  
                  String s = Integer.toString((int)arr[0]);
                  System.out.print("[" + " ".repeat(Math.max(0, width - s.length())) + df.format(arr[0]) + ", ");
                  for(int i=1; i<arr.length-1; i++){
                        s = Integer.toString((int)arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + df.format(arr[i]) + ", ");
                  }
                  s = Integer.toString((int)arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(arr[arr.length-1]) + "]");
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"<br>
       * Each element is printed with the given amount of
       * decimal digits<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param decimals The amount of decimal digits
       * @param width The minimum number of characters each element occupies
       * @param separation The string put between the array's elements
       */
      public static void print(double[] arr, int decimals, int width, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  if (decimals < 1) decimals = 1;
                  if(width < 1) width = 1;
                  
                  String pattern = "0." + "0".repeat(decimals);
                  DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);
                  
                  String s = Integer.toString((int)arr[0]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(arr[0]) + separation);
                  for(int i=1; i<arr.length-1; i++){
                        s = Integer.toString((int)arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + df.format(arr[i]) + separation);
                  }
                  s = Integer.toString((int)arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(arr[arr.length-1]));
            }
      }

      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"
       * 
       * @param arr The array to print
       */
      public static void print(char[] arr){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  System.out.print("[" + arr[0] + ", ");
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + ", ");
                  System.out.print(arr[arr.length-1] + "]");
            }
        }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"
       * 
       * @param arr The array to print
       * @param separation The string put between the array's elements
       */
      public static void print(char[] arr, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  System.out.print(arr[0] + separation);
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + separation);
                  System.out.print(arr[arr.length-1]);
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param width The minimum number of characters each element occupies
       */
      public static void print(char[] arr, int width){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if(width < 1) width = 1;
                  String s = Integer.toString(arr[0]);
                  System.out.print("[" + " ".repeat(Math.max(0, width - s.length())) + s + ", ");

                  for(int i=1; i<arr.length-1; i++){
                        s = Integer.toString(arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + s + ", ");
                  }

                  s = Integer.toString(arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s + "]");
            }
      }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"<br>
       * Left padding is added based on the width given
       * 
       * @param arr The array to print
       * @param width The minimum number of characters each element occupies
       * @param separation The string put between the array's elements
       */
      public static void print(char[] arr, int width, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  if(width < 1) width = 1;
                  String s = Integer.toString(arr[0]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s + separation);

                  for(int i=1; i<arr.length-1; i++){
                        s = Integer.toString(arr[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(" ".repeat(padding) + s + separation);
                  }

                  s = Integer.toString(arr[arr.length-1]);
                  System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
            }
      }

      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"
       * 
       * @param arr The array to print
       */
      public static void print(boolean[] arr){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  System.out.print("[" + arr[0] + ", ");
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + ", ");
                  System.out.print(arr[arr.length-1] + "]");
            }
        }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"
       * 
       * @param arr The array to print
       * @param separation The string put between the array's elements
       */
      public static void print(boolean[] arr, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  System.out.print(arr[0] + separation);
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + separation);
                  System.out.print(arr[arr.length-1]);
            }
      }

      /**
       * Prints the array in the console using the scheme
       * "[Element1, Element2, ..., ElementN]"
       * 
       * @param <T> The array's elements type
       * @param arr The array to print
       */
      public static <T> void print(T[] arr){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  System.out.print("[" + arr[0] + ", ");
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + ", ");
                  System.out.print(arr[arr.length-1] + "]");
            }
        }
      /**
       * Prints the array in the console using the scheme
       * "Element1+separation+Element2+separation+...+separation+ElementN"
       * 
       * @param <T> The array's elements type
       * @param arr The array to print
       * @param separation The string put between the array's elements
       */
      public static <T> void print(T[] arr, String separation){
            if (arr == null) System.out.print("null");
            else if (arr.length == 0) System.out.print("[]");
            else {
                  if (separation == null) separation = ", ";
                  System.out.print(arr[0] + separation);
                  for(int i=1; i<arr.length-1; i++) System.out.print(arr[i] + separation);
                  System.out.print(arr[arr.length-1]);
            }
      }
}