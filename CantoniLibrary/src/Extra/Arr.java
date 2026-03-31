package Extra;

import static CantoniLib.Arr.copyOf;
import static CantoniLib.Arr.sort;
import static CantoniLib.Arr.sortIgnoreCase;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Random;

public class Arr {
      private static final Random r = new Random();
      private static final DecimalFormatSymbols usDecimalFormatSymbols = DecimalFormatSymbols.getInstance(Locale.US);

      public static void print(int[] vett){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(", " + vett[i]);
      }
      public static void print(int[] vett, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(separation + vett[i]);
      }
      public static void print(int[] vett, int width){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }

              String s = Integer.toString(vett[0]);
              System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);

              for(int i=1; i<vett.length; i++){
                      s = Integer.toString(vett[i]);
                      int padding = Math.max(0, width - s.length());
                      System.out.print(", " + " ".repeat(padding) + s);
              }
      }
      public static void print(int[] vett, int width, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";

              String s = Integer.toString(vett[0]);
              System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);

              for(int i=1; i<vett.length; i++){
                      s = Integer.toString(vett[i]);
                      int padding = Math.max(0, width - s.length());
                      System.out.print(separation + " ".repeat(padding) + s);
              }
      }

      public static void print(long[] vett){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(", " + vett[i]);
      }
      public static void print(long[] vett, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(separation + vett[i]);
      }
      public static void print(long[] vett, int width){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }

              String s = Long.toString(vett[0]);
              System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);

              for(int i=1; i<vett.length; i++){
                      s = Long.toString(vett[i]);
                      int padding = Math.max(0, width - s.length());
                      System.out.print(", " + " ".repeat(padding) + s);
              }
      }
      public static void print(long[] vett, int width, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";

              String s = Long.toString(vett[0]);
              System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);

              for(int i=1; i<vett.length; i++){
                      s = Long.toString(vett[i]);
                      int padding = Math.max(0, width - s.length());
                      System.out.print(separation + " ".repeat(padding) + s);
              }
      }

      public static void print(float[] vett){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(", " + vett[i]);
      }
      public static void print(float[] vett, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(separation + vett[i]);
      }
      public static void print(float[] vett, int decimals){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (decimals < 1) decimals = 1;

              String pattern = "0." + "0".repeat(decimals);
              DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);

              System.out.print(df.format(vett[0]));
              for(int i=1; i<vett.length; i++)
                      System.out.print(", " + df.format(vett[i]));
      }
      public static void print(float[] vett, int decimals, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";
              if (decimals < 1) decimals = 1;

              String pattern = "0." + "0".repeat(decimals);
              DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);

              System.out.print(df.format(vett[0]));
              for(int i=1; i<vett.length; i++)
                      System.out.print(separation + df.format(vett[i]));
      }
      public static void print(float[] vett, int decimals, int width){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (decimals < 1) decimals = 1;

              String pattern = "0." + "0".repeat(decimals);
              DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);

              String s = Integer.toString((int)vett[0]);
              System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(vett[0]));
              for(int i=1; i<vett.length; i++){
                      s = Integer.toString((int)vett[i]);
                      int padding = Math.max(0, width - s.length());
                      System.out.print(", " + " ".repeat(padding) + df.format(vett[0]));
              }
      }
      public static void print(float[] vett, int decimals, int width, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (decimals < 1) decimals = 1;

              String pattern = "0." + "0".repeat(decimals);
              DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);

              String s = Integer.toString((int)vett[0]);
              System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(vett[0]));
              for(int i=1; i<vett.length; i++){
                      s = Integer.toString((int)vett[i]);
                      int padding = Math.max(0, width - s.length());
                      System.out.print(separation + " ".repeat(padding) + df.format(vett[0]));
              }
      }

      public static void print(double[] vett){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(", " + vett[i]);
      }
      public static void print(double[] vett, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(separation + vett[i]);
      }
      public static void print(double[] vett, int decimals){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (decimals < 1) decimals = 1;

              String pattern = "0." + "0".repeat(decimals);
              DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);

              System.out.print(df.format(vett[0]));
              for(int i=1; i<vett.length; i++)
                      System.out.print(", " + df.format(vett[i]));
      }
      public static void print(double[] vett, int decimals, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";
              if (decimals < 1) decimals = 1;

              String pattern = "0." + "0".repeat(decimals);
              DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);

              System.out.print(df.format(vett[0]));
              for(int i=1; i<vett.length; i++)
                      System.out.print(separation + df.format(vett[i]));
      }
      public static void print(double[] vett, int decimals, int width){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (decimals < 1) decimals = 1;

              String pattern = "0." + "0".repeat(decimals);
              DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);

              String s = Integer.toString((int)vett[0]);
              System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(vett[0]));
              for(int i=1; i<vett.length; i++){
                      s = Integer.toString((int)vett[i]);
                      int padding = Math.max(0, width - s.length());
                      System.out.print(", " + " ".repeat(padding) + df.format(vett[0]));
              }
      }
      public static void print(double[] vett, int decimals, int width, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (decimals < 1) decimals = 1;

              String pattern = "0." + "0".repeat(decimals);
              DecimalFormat df = new DecimalFormat(pattern,usDecimalFormatSymbols);

              String s = Integer.toString((int)vett[0]);
              System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(vett[0]));
              for(int i=1; i<vett.length; i++){
                      s = Integer.toString((int)vett[i]);
                      int padding = Math.max(0, width - s.length());
                      System.out.print(separation + " ".repeat(padding) + df.format(vett[0]));
              }
      }

      public static void print(char[] vett){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(", " + vett[i]);
      }
      public static void print(char[] vett, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(separation + vett[i]);
      }
      public static void print(char[] vett, int width){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }

              String s = String.valueOf(vett[0]);
              System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);

              for(int i=1; i<vett.length; i++){
                      s = String.valueOf(vett[i]);
                      int padding = Math.max(0, width - s.length());
                      System.out.print(", " + " ".repeat(padding) + s);
              }
      }
      public static void print(char[] vett, int width, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";

              String s = String.valueOf(vett[0]);
              System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);

              for(int i=1; i<vett.length; i++){
                      s = String.valueOf(vett[i]);
                      int padding = Math.max(0, width - s.length());
                      System.out.print(separation + " ".repeat(padding) + s);
              }
      }

      public static void print(boolean[] vett){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(", " + vett[i]);
      }
      public static void print(boolean[] vett, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(separation + vett[i]);
      }

      public static void print(String[] vett){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(", " + vett[i]);
      }
      public static void print(String[] vett, String separation){
              if (vett == null) {
                      System.out.print("null");
                      return;
              }
              if (vett.length == 0) {
                      System.out.print("[]");
                      return;
              }
              if (separation == null) separation = ", ";

              System.out.print(vett[0]);
              for(int i=1; i<vett.length; i++)
                      System.out.print(separation + vett[i]);
      }

      
      
      public static void fillRandom(int[] vett, int min, int max){
              if (vett == null) throw new NullPointerException("vett is null");
              if (max < min) throw new IllegalArgumentException("max < min");
              for(int i=0; i<vett.length; i++)
                      vett[i] = r.nextInt((max-min) + 1) + min;
      }
      public static void fillRandom(long[] vett, long min, long max){
              if (vett == null) throw new NullPointerException("vett is null");
              if (max < min) throw new IllegalArgumentException("max < min");
              for(int i=0; i<vett.length; i++)
                      vett[i] = r.nextLong((max-min)+1) + min;
      }
      public static void fillRandom(float[] vett, float min, float max){
              if (vett == null) throw new NullPointerException("vett is null");
              if (max < min) throw new IllegalArgumentException("max < min");
              for(int i=0; i<vett.length; i++)
                      vett[i] = r.nextFloat() * (max-min) + min;
      }
      public static void fillRandom(double[] vett, double min, double max){
              if (vett == null) throw new NullPointerException("vett is null");
              if (max < min) throw new IllegalArgumentException("max < min");
              for(int i=0; i<vett.length; i++)
                      vett[i] = r.nextDouble() * (max-min) + min;
      }
      public static void fillRandom(boolean[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              for(int i=0; i<vett.length; i++)
                      vett[i] = r.nextBoolean();
      }

      public static void fillRandom(char[] vett, char min, char max){
              if (vett == null) throw new NullPointerException("vett is null");
              if (max < min) throw new IllegalArgumentException("max < min");
              for(int i=0; i<vett.length; i++)
                      vett[i] = (char) (r.nextInt((max-min) + 1) + min);
      }
      public static void fillLetters(char vett[]){
              if (vett == null) throw new NullPointerException("vett is null");
              int A = (int)'A', Z = (int)'Z', a = (int)'a', z = (int)'z';
              int min = A, max = min + (Z-A) + (z-a+1); // Range between A - Z and a - z

              for(int i=0; i<vett.length; i++){
                      int n = r.nextInt((max-min) + 1) + min;
                      if(n<=Z) // If n is in upperCase range it gets converted to char
                              vett[i] = (char)n;
                      else // Otherwise it gets added 6 to get to the lowerCase range and then is converted
                              vett[i] = (char)(n+6);
              }
      }
      public static void fillLetters(char vett[], boolean upperCase){
              if (vett == null) throw new NullPointerException("vett is null");
              int minChar = (int)'A', maxChar = (int)'Z';

              if(!upperCase){
                      minChar += (int)'a' - (int) 'A';
                      maxChar += (int)'z' - (int) 'Z';
              }

              for(int i=0; i<vett.length; i++)
                      vett[i] = (char) (r.nextInt((maxChar-minChar) + 1) + minChar);
      }
      public static void fillNumbers(char[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              int min = (int)'0', max = (int)'9';

              for(int i=0; i<vett.length; i++)
                      vett[i] = (char) (r.nextInt((max-min) + 1) + min);
      }
      public static void fillAlphanumerical(char[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              int min = (int)'0', max = min + ((int)'9' - (int)'0') + ((int)'Z' - (int)'A' + 1) + ((int)'z' - (int)'a' + 1);

              for(int i=0; i<vett.length; i++){
                      int n = r.nextInt((max-min) + 1) + min;
                      if(n<=(int)'9') // If n is in 0 - 9 range, it gets converted to char
                              vett[i] = (char)n;
                      else { // Otherwise gets incremented by 7 to get to the upperCase range
                              n+=(int)'A' - ((int)'9'+1); 
                              if(n<=(int)'Z') // If now n is in upperCase range, it gets converted to char
                                      vett[i] = (char)n;
                              else // Otherwise gets incremented again by 6 to get to the lowerCase range and then gets converted to char
                                      vett[i] = (char)(n + ( (int)'a' - ((int)'Z'+1) ) );
                      }
              }
      }
      public static void fillAlphanumerical(char[] vett, boolean upperCase){
              if (vett == null) throw new NullPointerException("vett is null");
              int minChar = (int)'A', maxChar = (int)'Z';

              if(!upperCase){
                      minChar += (int)'a' - (int) 'A';
                      maxChar += (int)'z' - (int) 'Z';
              }

              int min = (int)'0', max = min + ((int)'9' - (int)'0') + (maxChar - minChar + 1);

              for(int i=0; i<vett.length; i++){
                      int n = r.nextInt((max-min) + 1) + min;
                      if(n<=(int)'9')
                              vett[i] = (char)n;
                      else {
                              if(upperCase)
                                      n += (int)'A' - ((int)'9'+1);
                              else 
                                      n += ( (int)'A' - ((int)'9'+1) ) + ( (int)'a' - (int)'A' );
                              vett[i] = (char)n;
                      }
              }
      }

      public static void fillLetters(String vett[], int stringLength){
              if (vett == null) throw new NullPointerException("vett is null");
              if(stringLength < 1)
                      for(int i=0; i<vett.length; i++)
                              vett[i] = "";
              else
                      for(int i=0; i<vett.length; i++){
                              if(vett[i] == null) vett[i] = "";
                              char[] a = new char[stringLength];
                              fillLetters(a);
                              for(char c : a)
                                      vett[i] = vett[i].concat(String.valueOf(c));
                      }
      }
      public static void fillLetters(String vett[], int stringLength, boolean upperCase){
              if (vett == null) throw new NullPointerException("vett is null");
              if(stringLength < 1)
                      for(int i=0; i<vett.length; i++)
                              vett[i] = "";
              else
                      for(int i=0; i<vett.length; i++){
                              if(vett[i] == null) vett[i] = "";
                              char[] a = new char[stringLength];
                              fillLetters(a, upperCase);
                              for(char c : a)
                                      vett[i] = vett[i].concat(String.valueOf(c));
                      }
      }
      public static void fillNumbers(String vett[], int stringLength){
              if (vett == null) throw new NullPointerException("vett is null");
              if(stringLength < 1)
                      for(int i=0; i<vett.length; i++)
                              vett[i] = "";
              else
                      for(int i=0; i<vett.length; i++){
                              if(vett[i] == null) vett[i] = "";
                              char[] a = new char[stringLength];
                              fillNumbers(a);
                              for(char c : a)
                                      vett[i] = vett[i].concat(String.valueOf(c));
                      }
      }
      public static void fillAlphanumerical(String vett[], int stringLength){
              if (vett == null) throw new NullPointerException("vett is null");
              if(stringLength < 1)
                      for(int i=0; i<vett.length; i++)
                              vett[i] = "";
              else
                      for(int i=0; i<vett.length; i++){
                              if(vett[i] == null) vett[i] = "";
                              char[] a = new char[stringLength];
                              fillAlphanumerical(a);
                              for(char c : a)
                                      vett[i] = vett[i].concat(String.valueOf(c));
                      }
      }
      public static void fillAlphanumerical(String vett[], int stringLength, boolean upperCase){
                if (vett == null) throw new NullPointerException("vett is null");
                if(stringLength < 1)
                        for(int i=0; i<vett.length; i++)
                                vett[i] = "";
                else
                        for(int i=0; i<vett.length; i++){
                                if(vett[i] == null) vett[i] = "";
                                char[] a = new char[stringLength];
                                fillAlphanumerical(a, upperCase);
                                for(char c : a)
                                        vett[i] = vett[i].concat(String.valueOf(c));
                        }
        }
      
      
      
      public static int[] sort(int[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              int[] copy = vett.clone();
              Arrays.sort(copy);
              return copy;
      }
      public static long[] sort(long[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              long[] copy = vett.clone();
              Arrays.sort(copy);
              return copy;
      }
      public static float[] sort(float[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              float[] copy = vett.clone();
              Arrays.sort(copy);
              return copy;
      }
      public static double[] sort(double[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              double[] copy = vett.clone();
              Arrays.sort(copy);
              return copy;
      }
      public static char[] sort(char[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              char[] copy = vett.clone();
              Arrays.sort(copy);
              return copy;
      }
      public static boolean[] sort(boolean[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              boolean[] copy = vett.clone();
              int falsi = 0;
              for(boolean elemento : vett)
                    if(!elemento) falsi++;
              for(int i=0; i<falsi; i++) copy[i] = false;
              return copy;
      }
      public static String[] sort(String[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              String[] copy = vett.clone();
              Arrays.sort(copy);
              return copy;
      }
      public static String[] sortIgnoreCase(String[] vett) {
                if (vett == null) throw new NullPointerException("Array è null");
                if(vett.length < 2) return vett.clone();
                
                String[] copy = vett.clone();
                Arrays.sort(copy, String.CASE_INSENSITIVE_ORDER);
                return copy;
        }
      
      public static int[] sortDesc(int[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              int[] copy = vett.clone();
              Arrays.sort(copy);
              for (int i = 0; i < copy.length / 2; i++) {
                  int temp = copy[i];
                  copy[i] = copy[copy.length - 1 - i];
                  copy[copy.length - 1 - i] = temp;
              }
              return copy;
      }
      public static long[] sortDesc(long[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              long[] copy = vett.clone();
              Arrays.sort(copy);
              for (int i = 0; i < copy.length / 2; i++) {
                  long temp = copy[i];
                  copy[i] = copy[copy.length - 1 - i];
                  copy[copy.length - 1 - i] = temp;
              }
              return copy;
      }
      public static float[] sortDesc(float[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              float[] copy = vett.clone();
              Arrays.sort(copy);
              for (int i = 0; i < copy.length / 2; i++) {
                  float temp = copy[i];
                  copy[i] = copy[copy.length - 1 - i];
                  copy[copy.length - 1 - i] = temp;
              }
              return copy;
      }
      public static double[] sortDesc(double[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              double[] copy = vett.clone();
              Arrays.sort(copy);
              for (int i = 0; i < copy.length / 2; i++) {
                  double temp = copy[i];
                  copy[i] = copy[copy.length - 1 - i];
                  copy[copy.length - 1 - i] = temp;
              }
              return copy;
      }
      public static char[] sortDesc(char[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              char[] copy = vett.clone();
              Arrays.sort(copy);
              for (int i = 0; i < copy.length / 2; i++) {
                  char temp = copy[i];
                  copy[i] = copy[copy.length - 1 - i];
                  copy[copy.length - 1 - i] = temp;
              }
              return copy;
      }
      public static boolean[] sortDesc(boolean[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              boolean[] copy = vett.clone();
              int veri = 0;
              for(boolean elemento : vett)
                    if(elemento) veri++;
              for(int i=0; i<veri; i++) copy[i] = true;
              return copy;
      }
      public static String[] sortDesc(String[] vett) {
              if (vett == null) throw new NullPointerException("Array è null");
              if(vett.length < 2) return vett.clone();

              String[] copy = vett.clone();
              Arrays.sort(copy);
              for (int i = 0; i < copy.length / 2; i++) {
                  String temp = copy[i];
                  copy[i] = copy[copy.length - 1 - i];
                  copy[copy.length - 1 - i] = temp;
              }
              return copy;
      }
      public static String[] sortDesccIgnoreCase(String[] vett) {
                if (vett == null) throw new NullPointerException("Array è null");
                if(vett.length < 2) return vett.clone();
                
                String[] copy = vett.clone();
                Arrays.sort(copy, String.CASE_INSENSITIVE_ORDER);
                for (int i = 0; i < copy.length / 2; i++) {
                  String temp = copy[i];
                  copy[i] = copy[copy.length - 1 - i];
                  copy[copy.length - 1 - i] = temp;
              }
              return copy;
        }
      
      
      
      public static int find(int[] vett, int value, boolean sortedArray){
              if (vett == null) throw new NullPointerException("vett is null");
              if(sortedArray){
                      int ind = binarySearch(vett, value);
                      if(ind < 0)
                              return -1;
                      else
                              return ind;
              }

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              return i;

              return -1;
      }
      public static int find(long[] vett, long value, boolean sortedArray){
              if (vett == null) throw new NullPointerException("vett is null");
              if(sortedArray){
                      int ind = binarySearch(vett, value);
                      if(ind < 0)
                              return -1;
                      else
                              return ind;
              }

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              return i;

              return -1;
      }
      public static int find(float[] vett, float value, boolean sortedArray){
              if (vett == null) throw new NullPointerException("vett is null");
              if(sortedArray){
                      int ind = binarySearch(vett, value);
                      if(ind < 0)
                              return -1;
                      else
                              return ind;
              }

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              return i;

              return -1;
      }
      public static int find(double[] vett, double value, boolean sortedArray){
              if (vett == null) throw new NullPointerException("vett is null");
              if(sortedArray){
                      int ind = binarySearch(vett, value);
                      if(ind < 0)
                              return -1;
                      else
                              return ind;
              }

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              return i;

              return -1;
      }
      public static int find(char[] vett, char value, boolean sortedArray){
              if (vett == null) throw new NullPointerException("vett is null");
              if(sortedArray){
                      int ind = binarySearch(vett, value);
                      if(ind < 0)
                              return -1;
                      else
                              return ind;
              }

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              return i;

              return -1;
      }
      public static int find(boolean[] vett, boolean value, boolean sortedArray){
              if (vett == null) throw new NullPointerException("vett is null");
              if(sortedArray){
                      int ind = binarySearch(vett, value);
                      if(ind < 0)
                              return -1;
                      else
                              return ind;
              }

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              return i;

              return -1;
      }

      public static int binarySearch(int[] vett, int value) {
              if (vett == null) throw new NullPointerException("vett is null");
              int low = 0;
              int high = vett.length - 1;

              while (low <= high) {
                      int mid = low + ((high - low) / 2);
                      int midVal = vett[mid];

                      if (midVal < value)
                              low = mid + 1;
                      else if (midVal > value)
                              high = mid - 1;
                      else
                              return mid;
              }

              return -(low + 1);
      }
      public static int binarySearch(long[] vett, long value) {
              if (vett == null) throw new NullPointerException("vett is null");
              int low = 0;
              int high = vett.length - 1;

              while (low <= high) {
                      int mid = low + ((high - low) >>> 1);
                      long midVal = vett[mid];

                      if (midVal < value)
                              low = mid + 1;
                      else if (midVal > value)
                              high = mid - 1;
                      else
                              return mid;
              }

              return -(low + 1);
      }
      public static int binarySearch(float[] vett, float value) {
              if (vett == null) throw new NullPointerException("vett is null");
              int low = 0;
              int high = vett.length - 1;

              while (low <= high) {
                      int mid = low + ((high - low) >>> 1);
                      float midVal = vett[mid];

                      int cmp = Float.compare(midVal, value);

                      if (cmp < 0)
                              low = mid + 1;
                      else if (cmp > 0)
                              high = mid - 1;
                      else
                              return mid;
              }

              return -(low + 1);
      }
      public static int binarySearch(double[] vett, double value) {
              if (vett == null) throw new NullPointerException("vett is null");
              int low = 0;
              int high = vett.length - 1;

              while (low <= high) {
                      int mid = low + ((high - low) >>> 1);
                      double midVal = vett[mid];

                      int cmp = Double.compare(midVal, value);

                      if (cmp < 0)
                              low = mid + 1;
                      else if (cmp > 0)
                              high = mid - 1;
                      else
                              return mid;
              }

              return -(low + 1);
      }
      public static int binarySearch(char[] vett, char value) {
              if (vett == null) throw new NullPointerException("vett is null");
              int low = 0;
              int high = vett.length - 1;

              while (low <= high) {
                      int mid = low + ((high - low) >>> 1);
                      char midVal = vett[mid];

                      if (midVal < value)
                              low = mid + 1;
                      else if (midVal > value)
                              high = mid - 1;
                      else
                              return mid;
              }

              return -(low + 1);
      }
      public static int binarySearch(boolean[] vett, boolean value) {
              if (vett == null) throw new NullPointerException("vett is null");
              int low = 0;
              int high = vett.length - 1;

              while (low <= high) {
                      int mid = low + ((high - low) >>> 1);
                      boolean midVal = vett[mid];

                      if (!midVal && value)
                              low = mid + 1;
                      else if (midVal && !value)
                              high = mid - 1;
                      else
                              return mid;
              }

              return -(low + 1);
      }

      public static int[] findAll(int[] vett, int value){
              if (vett == null) throw new NullPointerException("vett is null");
              ArrayList<Integer> indexes = new ArrayList();

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              indexes.add(i);

              int[] result = new int[indexes.size()];
              for(int i=0; i<result.length; i++)
                      result[i] = indexes.get(i);
              return result;
      }
      public static int[] findAll(long[] vett, long value){
              if (vett == null) throw new NullPointerException("vett is null");
              ArrayList<Integer> indexes = new ArrayList();

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              indexes.add(i);

              int[] result = new int[indexes.size()];
              for(int i=0; i<result.length; i++)
                      result[i] = indexes.get(i);
              return result;
      }
      public static int[] findAll(float[] vett, float value){
              if (vett == null) throw new NullPointerException("vett is null");
              ArrayList<Integer> indexes = new ArrayList();

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              indexes.add(i);

              int[] result = new int[indexes.size()];
              for(int i=0; i<result.length; i++)
                      result[i] = indexes.get(i);
              return result;
      }
      public static int[] findAll(double[] vett, double value){
              if (vett == null) throw new NullPointerException("vett is null");
              ArrayList<Integer> indexes = new ArrayList();

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              indexes.add(i);

              int[] result = new int[indexes.size()];
              for(int i=0; i<result.length; i++)
                      result[i] = indexes.get(i);
              return result;
      }
      public static int[] findAll(char[] vett, char value){
              if (vett == null) throw new NullPointerException("vett is null");
              ArrayList<Integer> indexes = new ArrayList();

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              indexes.add(i);

              int[] result = new int[indexes.size()];
              for(int i=0; i<result.length; i++)
                      result[i] = indexes.get(i);
              return result;
      }
      public static int[] findAll(boolean[] vett, boolean value){
              if (vett == null) throw new NullPointerException("vett is null");
              ArrayList<Integer> indexes = new ArrayList();

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              indexes.add(i);

              int[] result = new int[indexes.size()];
              for(int i=0; i<result.length; i++)
                      result[i] = indexes.get(i);
              return result;
      }

      public static int find(String[] vett, String value, boolean sortedArray){
              if (vett == null) throw new NullPointerException("vett is null");
              if (value == null) throw new NullPointerException("value is null");
              if(sortedArray){
                      int ind = binarySearch(vett, value);
                      if(ind < 0)
                              return -1;
                      else
                              return ind;
              }

              for(int i=0; i<vett.length; i++){
                      if(vett[i] == null) {}
                      else if(vett[i].equals(value))
                              return i;
              }

              return -1;
      }
      public static int binarySearch(String[] vett, String value) {
      if (vett == null) throw new NullPointerException("vett is null");
      if (value == null) throw new NullPointerException("value is null");

      for(int i=0; i<vett.length; i++)
              if(vett[i] == null) vett[i] = "";

      int low = 0;
      int high = vett.length - 1;

      while (low <= high) {
          int mid = low + ((high - low) >>> 1);

          int cmp = vett[mid].compareTo(value);

          if (cmp < 0)
              low = mid + 1;
          else if (cmp > 0)
              high = mid - 1;
          else
              return mid;
      }

      return -(low + 1);
  }
      public static int findIgnoreCase(String[] vett, String value, boolean sortedArray){
              if (vett == null) throw new NullPointerException("vett is null");
              if (value == null) throw new NullPointerException("value is null");
              if(sortedArray){
                      int ind = binarySearch(vett, value);
                      if(ind < 0)
                              return -1;
                      else
                              return ind;
              }

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == null) {}
                      else if(vett[i].equalsIgnoreCase(value))
                              return i;

              return -1;
      }
      public static int binarySearchIgnoreCase(String[] vett, String value) {
      if (vett == null) throw new NullPointerException("vett is null");
      if (value == null) throw new NullPointerException("value is null");

      for(int i=0; i<vett.length; i++)
              if(vett[i] == null) vett[i] = "";

      int low = 0;
      int high = vett.length - 1;

      while (low <= high) {
          int mid = low + ((high - low) >>> 1);

          int cmp = vett[mid].compareToIgnoreCase(value);

          if (cmp < 0)
              low = mid + 1;
          else if (cmp > 0)
              high = mid - 1;
          else
              return mid;
      }

      return -(low + 1);
  }
      public static int[] findAll(String[] vett, String value){
              if (vett == null) throw new NullPointerException("vett is null");
              if (value == null) throw new NullPointerException("value is null");
              ArrayList<Integer> indexes = new ArrayList();

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == null) {}
                      else if(vett[i].equals(value))
                              indexes.add(i);

              int[] result = new int[indexes.size()];
              for(int i=0; i<result.length; i++)
                      result[i] = indexes.get(i);
              return result;
      }
      public static int[] findAllIgnoreCase(String[] vett, String value){
              if (vett == null) throw new NullPointerException("vett is null");
              if (value == null) throw new NullPointerException("value is null");
              ArrayList<Integer> indexes = new ArrayList();

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == null) {}
                      else if(vett[i].equalsIgnoreCase(value))
                              indexes.add(i);

              int[] result = new int[indexes.size()];
              for(int i=0; i<result.length; i++)
                      result[i] = indexes.get(i);
              return result;
      }
      public static int[] findStringPart(String[] vett, String value){
              if (vett == null) throw new NullPointerException("vett is null");
              if (value == null) throw new NullPointerException("value is null");
              ArrayList<Integer> indexes = new ArrayList();

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == null) {}
                      else if(vett[i].contains(value))
                              indexes.add(i);

              int[] result = new int[indexes.size()];
              for(int i=0; i<result.length; i++)
                      result[i] = indexes.get(i);
              return result;
      }
      public static int[] findStringPartIgnoreCase(String[] vett, String value){
              if (vett == null) throw new NullPointerException("vett is null");
              if (value == null) throw new NullPointerException("value is null");
              ArrayList<Integer> indexes = new ArrayList();

              for(int i=0; i<vett.length; i++)
                      if(vett[i] == null) {}
                      else if(vett[i].toLowerCase().contains(value.toLowerCase()))
                              indexes.add(i);

              int[] result = new int[indexes.size()];
              for(int i=0; i<result.length; i++)
                      result[i] = indexes.get(i);
              return result;
      }

      public static void replace(int[] vett, int value, int newValue){
              if (vett == null) throw new NullPointerException("vett is null");
              if(value == newValue) return;
              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              vett[i] = newValue;
      }
      public static void replace(long[] vett, long value, long newValue){
              if (vett == null) throw new NullPointerException("vett is null");
              if(value == newValue) return;
              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              vett[i] = newValue;
      }
      public static void replace(float[] vett, float value, float newValue){
              if (vett == null) throw new NullPointerException("vett is null");
              if(value == newValue) return;
              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              vett[i] = newValue;
      }
      public static void replace(double[] vett, double value, double newValue){
              if (vett == null) throw new NullPointerException("vett is null");
              if(value == newValue) return;
              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              vett[i] = newValue;
      }
      public static void replace(char[] vett, char value, char newValue){
              if (vett == null) throw new NullPointerException("vett is null");
              if(value == newValue) return;
              for(int i=0; i<vett.length; i++)
                      if(vett[i] == value)
                              vett[i] = newValue;
      }
      public static void replace(boolean[] vett, boolean value, boolean newValue){
              if (vett == null) throw new NullPointerException("vett is null");
              if(value == newValue) return;
              for(int i=0; i<vett.length; i++)
                      vett[i] = newValue;
      }
      public static void replace(String[] vett, String value, String newValue){
              if (vett == null) throw new NullPointerException("vett is null");
              if (value == null) throw new NullPointerException("value is null");
              if (newValue == null) throw new NullPointerException("newValue is null");
              if(value.equals(newValue)) return;
              for(int i=0; i<vett.length; i++)
                      if(vett[i] == null) {}
                      else if(vett[i].equals(value))
                              vett[i] = newValue;
      }
      public static void replaceIgnoreCase(String[] vett, String value, String newValue){
              if (vett == null) throw new NullPointerException("vett is null");
              if (value == null) throw new NullPointerException("value is null");
              if (newValue == null) throw new NullPointerException("newValue is null");
              if(value.equalsIgnoreCase(newValue)) return;
              for(int i=0; i<vett.length; i++)
                      if(vett[i] == null) {}
                      else if(vett[i].equalsIgnoreCase(value))
                              vett[i] = newValue;
      }

      public static void replaceMult(int[] vett, int[] values, int[] newValues){
              if (vett == null) throw new NullPointerException("vett is null");
              if (values == null) throw new NullPointerException("values array is null");
              if (newValues == null) throw new NullPointerException("newValues array is null");
              if (values.length != newValues.length) throw new IllegalArgumentException("values array length != newValues array length");

              for(int v=0; v<values.length; v++){
                      int[] ind = findAll(vett, values[v]);
                      for(int i : ind) vett[i] = newValues[v];
              }
      }
      public static void replaceMult(long[] vett, long[] values, long[] newValues){
              if (vett == null) throw new NullPointerException("vett is null");
              if (values == null) throw new NullPointerException("values array is null");
              if (newValues == null) throw new NullPointerException("newValues array is null");
              if (values.length != newValues.length) throw new IllegalArgumentException("values array length != newValues array length");

              for(int v=0; v<values.length; v++){
                      int[] ind = findAll(vett, values[v]);
                      for(int i : ind) vett[i] = newValues[v];
              }
      }
      public static void replaceMult(float[] vett, float[] values, float[] newValues){
              if (vett == null) throw new NullPointerException("vett is null");
              if (values == null) throw new NullPointerException("values array is null");
              if (newValues == null) throw new NullPointerException("newValues array is null");
              if (values.length != newValues.length) throw new IllegalArgumentException("values array length != newValues array length");

              for(int v=0; v<values.length; v++){
                      int[] ind = findAll(vett, values[v]);
                      for(int i : ind) vett[i] = newValues[v];
              }
      }
      public static void replaceMult(double[] vett, double[] values, double[] newValues){
              if (vett == null) throw new NullPointerException("vett is null");
              if (values == null) throw new NullPointerException("values array is null");
              if (newValues == null) throw new NullPointerException("newValues array is null");
              if (values.length != newValues.length) throw new IllegalArgumentException("values array length != newValues array length");

              for(int v=0; v<values.length; v++){
                      int[] ind = findAll(vett, values[v]);
                      for(int i : ind) vett[i] = newValues[v];
              }
      }
      public static void replaceMult(char[] vett, char[] values, char[] newValues){
              if (vett == null) throw new NullPointerException("vett is null");
              if (values == null) throw new NullPointerException("values array is null");
              if (newValues == null) throw new NullPointerException("newValues array is null");
              if (values.length != newValues.length) throw new IllegalArgumentException("values array length != newValues array length");

              for(int v=0; v<values.length; v++){
                      int[] ind = findAll(vett, values[v]);
                      for(int i : ind) vett[i] = newValues[v];
              }
      }
      public static void replaceMult(String[] vett, String[] values, String[] newValues){
              if (vett == null) throw new NullPointerException("vett is null");
              if (values == null) throw new NullPointerException("values array is null");
              if (newValues == null) throw new NullPointerException("newValues array is null");
              if (values.length != newValues.length) throw new IllegalArgumentException("values array length != newValues array length");

              for(int v=0; v<values.length; v++){
                      int[] ind = findAll(vett, values[v]);
                      for(int i : ind) vett[i] = newValues[v];
              }
      }
      public static void replaceMultIgnoreCase(String[] vett, String[] values, String[] newValues){
              if (vett == null) throw new NullPointerException("vett is null");
              if (values == null) throw new NullPointerException("values array is null");
              if (newValues == null) throw new NullPointerException("newValues array is null");
              if (values.length != newValues.length) throw new IllegalArgumentException("values array length != newValues array length");

              for(int v=0; v<values.length; v++){
                      int[] ind = findAllIgnoreCase(vett, values[v]);
                      for(int i : ind) vett[i] = newValues[v];
              }
      }
      
      
      
      private static int randomIndex(int vettLength){
                if(vettLength < 1) vettLength = 1;
                int min = 0, max = vettLength-1;
                return r.nextInt((max-min) + 1) + min;
        }
      
      public static int pickRandom(int[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              return vett[randomIndex(vett.length)];
      }
      public static long pickRandom(long[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              return vett[randomIndex(vett.length)];
      }
      public static float pickRandom(float[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              return vett[randomIndex(vett.length)];
      }
      public static double pickRandom(double[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              return vett[randomIndex(vett.length)];
      }
      public static char pickRandom(char[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              return vett[randomIndex(vett.length)];
      }
      public static boolean pickRandom(boolean[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              return vett[randomIndex(vett.length)];
      }
      public static String pickRandom(String[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              return vett[randomIndex(vett.length)];
      }
      
      public static int[] flip(int[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              int[] vetCopy = new int[vett.length];
              for(int i=0; i<vett.length; i++)
                      vetCopy[vetCopy.length-1 - i] = vett[i];
              return vetCopy;
      }
      public static long[] flip(long[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              long[] vetCopy = new long[vett.length];
              for (int i = 0; i < vett.length; i++)
                  vetCopy[vetCopy.length - 1 - i] = vett[i];
              return vetCopy;
      }
      public static float[] flip(float[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              float[] vetCopy = new float[vett.length];
              for (int i = 0; i < vett.length; i++)
                  vetCopy[vetCopy.length - 1 - i] = vett[i];
              return vetCopy;
      }
      public static double[] flip(double[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              double[] vetCopy = new double[vett.length];
              for (int i = 0; i < vett.length; i++)
                  vetCopy[vetCopy.length - 1 - i] = vett[i];
              return vetCopy;
      }
      public static char[] flip(char[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              char[] vetCopy = new char[vett.length];
              for (int i = 0; i < vett.length; i++)
                  vetCopy[vetCopy.length - 1 - i] = vett[i];
              return vetCopy;
      }
      public static boolean[] flip(boolean[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              boolean[] vetCopy = new boolean[vett.length];
              for (int i = 0; i < vett.length; i++)
                  vetCopy[vetCopy.length - 1 - i] = vett[i];
              return vetCopy;
      }
      public static String[] flip(String[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              String[] vetCopy = new String[vett.length];
              for (int i = 0; i < vett.length; i++)
                  vetCopy[vetCopy.length - 1 - i] = vett[i];
              return vetCopy;
      }

      public static int[] shiftR(int[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              int[] vetCopy = copyOf(vett);
              int tmp = vetCopy[vetCopy.length-1];
              for(int i=vetCopy.length-1; i>0; i--)
                      vetCopy[i] = vetCopy[i-1];
              vetCopy[0] = tmp;
              return vetCopy;
      }
      public static long[] shiftR(long[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              long[] vetCopy = copyOf(vett);
              long tmp = vetCopy[vetCopy.length-1];
              for(int i=vetCopy.length-1; i>0; i--)
                      vetCopy[i] = vetCopy[i-1];
              vetCopy[0] = tmp;
              return vetCopy;
      }
      public static float[] shiftR(float[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              float[] vetCopy = copyOf(vett);
              float tmp = vetCopy[vetCopy.length-1];
              for(int i=vetCopy.length-1; i>0; i--)
                      vetCopy[i] = vetCopy[i-1];
              vetCopy[0] = tmp;
              return vetCopy;
      }
      public static double[] shiftR(double[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              double[] vetCopy = copyOf(vett);
              double tmp = vetCopy[vetCopy.length-1];
              for(int i=vetCopy.length-1; i>0; i--)
                      vetCopy[i] = vetCopy[i-1];
              vetCopy[0] = tmp;
              return vetCopy;
      }
      public static char[] shiftR(char[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              char[] vetCopy = copyOf(vett);
              char tmp = vetCopy[vetCopy.length-1];
              for(int i=vetCopy.length-1; i>0; i--)
                      vetCopy[i] = vetCopy[i-1];
              vetCopy[0] = tmp;
              return vetCopy;
      }
      public static boolean[] shiftR(boolean[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              boolean[] vetCopy = copyOf(vett);
              boolean tmp = vetCopy[vetCopy.length-1];
              for(int i=vetCopy.length-1; i>0; i--)
                      vetCopy[i] = vetCopy[i-1];
              vetCopy[0] = tmp;
              return vetCopy;
      }
      public static String[] shiftR(String[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              String[] vetCopy = copyOf(vett);
              String tmp = vetCopy[vetCopy.length-1];
              for(int i=vetCopy.length-1; i>0; i--)
                      vetCopy[i] = vetCopy[i-1];
              vetCopy[0] = tmp;
              return vetCopy;
      }
      
      public static int[] shiftL(int[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              int[] vetCopy = copyOf(vett);
              int tmp = vetCopy[0];
              for(int i=0; i<vetCopy.length-1; i++)
                      vetCopy[i] = vetCopy[i+1];
              vetCopy[vetCopy.length-1] = tmp;
              return vetCopy;
      }
      public static long[] shiftL(long[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              long[] vetCopy = copyOf(vett);
              long tmp = vetCopy[0];
              for(int i=0; i<vetCopy.length-1; i++)
                      vetCopy[i] = vetCopy[i+1];
              vetCopy[vetCopy.length-1] = tmp;
              return vetCopy;
      }
      public static float[] shiftL(float[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              float[] vetCopy = copyOf(vett);
              float tmp = vetCopy[0];
              for(int i=0; i<vetCopy.length-1; i++)
                      vetCopy[i] = vetCopy[i+1];
              vetCopy[vetCopy.length-1] = tmp;
              return vetCopy;
      }
      public static double[] shiftL(double[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              double[] vetCopy = copyOf(vett);
              double tmp = vetCopy[0];
              for(int i=0; i<vetCopy.length-1; i++)
                      vetCopy[i] = vetCopy[i+1];
              vetCopy[vetCopy.length-1] = tmp;
              return vetCopy;
      }
      public static char[] shiftL(char[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              char[] vetCopy = copyOf(vett);
              char tmp = vetCopy[0];
              for(int i=0; i<vetCopy.length-1; i++)
                      vetCopy[i] = vetCopy[i+1];
              vetCopy[vetCopy.length-1] = tmp;
              return vetCopy;
      }
      public static boolean[] shiftL(boolean[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              boolean[] vetCopy = copyOf(vett);
              boolean tmp = vetCopy[0];
              for(int i=0; i<vetCopy.length-1; i++)
                      vetCopy[i] = vetCopy[i+1];
              vetCopy[vetCopy.length-1] = tmp;
              return vetCopy;
      }
      public static String[] shiftL(String[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              String[] vetCopy = copyOf(vett);
              String tmp = vetCopy[0];
              for(int i=0; i<vetCopy.length-1; i++)
                      vetCopy[i] = vetCopy[i+1];
              vetCopy[vetCopy.length-1] = tmp;
              return vetCopy;
      }

      public static int getMin(int[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              int[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i] < vettCopy[i+1]){
                          int temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static long getMin(long[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              long[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i] < vettCopy[i+1]){
                          long temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static float getMin(float[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              float[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i] < vettCopy[i+1]){
                          float temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static double getMin(double[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              double[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i] < vettCopy[i+1]){
                          double temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static char getMin(char[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              char[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i] < vettCopy[i+1]){
                          char temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static String getMin(String[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              String[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i].compareTo(vettCopy[i+1]) < 0){
                          String temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static String getMinIgnoreCase(String[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              String[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i].compareToIgnoreCase(vettCopy[i+1]) < 0){
                          String temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }

      public static int getMax(int[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              int[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i] > vettCopy[i+1]){
                          int temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static long getMax(long[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              long[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i] > vettCopy[i+1]){
                          long temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static float getMax(float[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              float[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i] > vettCopy[i+1]){
                          float temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static double getMax(double[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              double[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i] > vettCopy[i+1]){
                          double temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static char getMax(char[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              char[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i] > vettCopy[i+1]){
                          char temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static String getMax(String[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              String[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i].compareTo(vettCopy[i+1]) > 0){
                          String temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }
      public static String getMaxIgnoreCase(String[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              if(vett.length == 1) return vett[0];
              String[] vettCopy = copyOf(vett);

              for(int i=0; i<vettCopy.length-1; i++)
                    if(vettCopy[i].compareToIgnoreCase(vettCopy[i+1]) > 0){
                          String temp = vettCopy[i];
                          vettCopy[i] = vettCopy[i+1];
                          vettCopy[i+1] = temp;
                    }
              return vettCopy[vettCopy.length-1];
      }

      public static int getMedian(int[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              return sort(vett)[vett.length / 2];
      }
      public static long getMedian(long[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              return sort(vett)[vett.length / 2];
      }
      public static float getMedian(float[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              return sort(vett)[vett.length / 2];
      }
      public static double getMedian(double[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              return sort(vett)[vett.length / 2];
      }
      public static char getMedian(char[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              return sort(vett)[vett.length / 2];
      }
      public static boolean getMedian(boolean[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              return sort(vett)[vett.length / 2];
      }
      public static String getMedian(String[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              return sort(vett)[vett.length / 2];
      }
      public static String getMedianIgnoreCase(String[] vett){
              if (vett == null) throw new NullPointerException("vett is null");
              if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
              return sortIgnoreCase(vett)[vett.length / 2];
      }

      public static int getAvarage(int[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              long tot = 0;
              for (int n : vett)
                      tot += n;
              return (int) ((double) tot / vett.length);
      }
      public static double getAvarageDouble(int[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              long tot = 0;
              for (int n : vett)
                      tot += n;
              return (double) tot / vett.length;
      }
      public static long getAvarage(long[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              double tot = 0;
              for (long n : vett)
                      tot += n;
              return (long) (tot / vett.length);
      }
      public static double getAvarageDouble(long[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              double tot = 0;
              for (long n : vett)
                      tot += n;
              return tot / vett.length;
      }
      public static float getAvarage(float[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              double tot = 0;
              for (float n : vett)
                      tot += n;
              return (float) (tot / vett.length);
      }
      public static double getAvarageDouble(float[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              double tot = 0;
              for (float n : vett)
                      tot += n;
              return tot / vett.length;
      }
      public static double getAvarage(double[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              double tot = 0;
              for (double n : vett)
                      tot += n;
              return tot / vett.length;
      }
      public static double getAvarageDouble(double[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              return CantoniLib.Arr.getAvarage(vett);
      }
      public static char getAvarage(char[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              long tot = 0;
              for (char n : vett)
                      tot += n;
              return (char) (tot / vett.length);
      }
      public static double getAvarageDouble(char[] vett) {
              if (vett == null) throw new NullPointerException("vett is null");
              long tot = 0;
              for (char n : vett)
                      tot += n;
              return (double) tot / vett.length;
      }

      public static int getTot(int[] vett){
              int tot = 0;
              for(int n : vett) 
                      tot += n;
              return tot;
      }
      public static long getTot(long[] vett){
              long tot = 0;
              for(long n : vett)
                      tot += n;
              return tot;
      }
      public static float getTot(float[] vett){
              float tot = 0;
              for(float n : vett)
                      tot += n;
              return tot;
      }
      public static double getTot(double[] vett){
              double tot = 0;
              for(double n : vett)
                      tot += n;
              return tot;
      }
      public static String getTot(char[] vett){
              String s = "";
              for(char c : vett)
                      s = s.concat(String.valueOf(c));
              return s;
      }
      public static String getTot(String[] vett){
                String tot = "";
                for(String s : vett)
                        tot = tot.concat(s);
                return tot;
        }
}
