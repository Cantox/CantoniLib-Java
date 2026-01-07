package CantoniLib;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import java.util.ArrayList;
import java.util.Random;

/**
 * Utility class providing a comprehensive set of operations for arrays of all
 * Java primitive data types.
 *
 * <p>Each operation is overloaded to support all primitive array types (
 * {@code int[]}, {@code double[]}, {@code char[]}, {@code boolean[]},
 * {@code byte[]}, {@code short[]}, {@code long[]}, and {@code float[]}) 
 * and {@code String}</p>
 *
 * <p>This class is designed as a static utility container and should not be instantiated.</p>
 * @author Cantoni Alessandro
 */
public class Arr {
        private static final Random r = new Random();
        private static final DecimalFormatSymbols usSymbols = DecimalFormatSymbols.getInstance(Locale.US);
        
        /**
        * Generates a random index for an array of a given length.
        * <p>
        * The returned index is guaranteed to be within the bounds of the array,
        * i.e., between {@code 0} (inclusive) and {@code vettLength - 1} (inclusive).<br>
        * If {@code vettLength} is less than 1, it's setted to 1
        *
        * @param vettLength the length of the array
        * @return a random index in the range {@code 0} to {@code vettLength - 1}
        */
        private static int randomIndex(int vettLength){
                if(vettLength < 1) vettLength = 1;
                int min = 0, max = vettLength-1;
                return r.nextInt((max-min) + 1) + min;
        }
        
        // PRINT (just prints, doesn't modify the array)
        /**
        * Prints the contents of a {@code byte} array to standard output.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - Otherwise, elements are printed separated by a comma and a space.
        *
        * @param vett the {@code byte} array to print
        */
        public static void print(byte[] vett){
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
        /**
        * Prints the contents of a {@code byte} array to standard output using a custom separator.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - Otherwise, elements are printed in order, separated by the specified string.
        *
        * @param vett the {@code byte} array to print
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
        public static void print(byte[] vett, String separation){
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
        /**
        * Prints the contents of a {@code byte} array to standard output, formatting each element
        * with a fixed minimum width.
        * <p>
        * Each value is right-aligned within the specified width using leading spaces.
        * Elements are separated by {@code ", "}.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code width} is negative, it is treated as {@code 0}.
        *
        * @param vett the {@code byte} array to print
        * @param width the minimum width for each element; values shorter than this
        *              width are padded on the left with spaces
        */
        public static void print(byte[] vett, int width){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (width < 0) width = 0;
                
                String s = Byte.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Byte.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + s);
                }
        }
        /**
        * Prints the contents of a {@code byte} array to standard output, using a custom separator
        * and formatting each element with a fixed minimum width.
        * <p>
        * Each value is right-aligned within the specified width using leading spaces.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - If {@code width} is negative, it is treated as {@code 0}.
        *
        * @param vett the {@code byte} array to print
        * @param width the minimum width for each element; values shorter than this
        *              width are padded on the left with spaces
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
        public static void print(byte[] vett, int width, String separation){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (separation == null) separation = ", ";
                if (width < 0) width = 0;
                
                String s = Byte.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Byte.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + s);
                }
        }
        
        /**
        * Prints the contents of a {@code short} array to standard output.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - Otherwise, elements are printed separated by a comma and a space.
        *
        * @param vett the {@code short} array to print
        */
        public static void print(short[] vett){
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
        /**
        * Prints the contents of a {@code short} array to standard output using a custom separator.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - Otherwise, elements are printed in order, separated by the specified string.
        *
        * @param vett the {@code short} array to print
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
        public static void print(short[] vett, String separation){
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
        /**
        * Prints the contents of a {@code short} array to standard output, formatting each element
        * with a fixed minimum width.
        * <p>
        * Each value is right-aligned within the specified width using leading spaces.
        * Elements are separated by {@code ", "}.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code width} is negative, it is treated as {@code 0}.
        *
        * @param vett the {@code short} array to print
        * @param width the minimum width for each element; values shorter than this
        *              width are padded on the left with spaces
        */
        public static void print(short[] vett, int width){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (width < 0) width = 0;
                
                String s = Short.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Short.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + s);
                }
        }
        /**
        * Prints the contents of a {@code short} array to standard output, using a custom separator
        * and formatting each element with a fixed minimum width.
        * <p>
        * Each value is right-aligned within the specified width using leading spaces.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - If {@code width} is negative, it is treated as {@code 0}.
        *
        * @param vett the {@code short} array to print
        * @param width the minimum width for each element; values shorter than this
        *              width are padded on the left with spaces
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
        public static void print(short[] vett, int width, String separation){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (separation == null) separation = ", ";
                if (width < 0) width = 0;
                
                String s = Short.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Short.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + s);
                }
        }
        
        /**
        * Prints the contents of a {@code int} array to standard output.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - Otherwise, elements are printed separated by a comma and a space.
        *
        * @param vett the {@code int} array to print
        */
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
        /**
        * Prints the contents of a {@code int} array to standard output using a custom separator.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - Otherwise, elements are printed in order, separated by the specified string.
        *
        * @param vett the {@code int} array to print
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
        /**
        * Prints the contents of a {@code int} array to standard output, formatting each element
        * with a fixed minimum width.
        * <p>
        * Each value is right-aligned within the specified width using leading spaces.
        * Elements are separated by {@code ", "}.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code width} is negative, it is treated as {@code 0}.
        *
        * @param vett the {@code int} array to print
        * @param width the minimum width for each element; values shorter than this
        *              width are padded on the left with spaces
        */
        public static void print(int[] vett, int width){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (width < 0) width = 0;
                
                String s = Integer.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Integer.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + s);
                }
        }
        /**
        * Prints the contents of a {@code int} array to standard output, using a custom separator
        * and formatting each element with a fixed minimum width.
        * <p>
        * Each value is right-aligned within the specified width using leading spaces.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - If {@code width} is negative, it is treated as {@code 0}.
        *
        * @param vett the {@code int} array to print
        * @param width the minimum width for each element; values shorter than this
        *              width are padded on the left with spaces
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
                if (width < 0) width = 0;
                
                String s = Integer.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Integer.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + s);
                }
        }
        
        /**
        * Prints the contents of a {@code long} array to standard output.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - Otherwise, elements are printed separated by a comma and a space.
        *
        * @param vett the {@code long} array to print
        */
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
        /**
        * Prints the contents of a {@code long} array to standard output using a custom separator.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - Otherwise, elements are printed in order, separated by the specified string.
        *
        * @param vett the {@code long} array to print
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
        /**
        * Prints the contents of a {@code long} array to standard output, formatting each element
        * with a fixed minimum width.
        * <p>
        * Each value is right-aligned within the specified width using leading spaces.
        * Elements are separated by {@code ", "}.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code width} is negative, it is treated as {@code 0}.
        *
        * @param vett the {@code long} array to print
        * @param width the minimum width for each element; values shorter than this
        *              width are padded on the left with spaces
        */
        public static void print(long[] vett, int width){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (width < 0) width = 0;
                
                String s = Long.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Long.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + s);
                }
        }
        /**
        * Prints the contents of a {@code long} array to standard output, using a custom separator
        * and formatting each element with a fixed minimum width.
        * <p>
        * Each value is right-aligned within the specified width using leading spaces.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - If {@code width} is negative, it is treated as {@code 0}.
        *
        * @param vett the {@code long} array to print
        * @param width the minimum width for each element; values shorter than this
        *              width are padded on the left with spaces
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
                if (width < 0) width = 0;
                
                String s = Long.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Long.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + s);
                }
        }
        
        /**
        * Prints the contents of a {@code float} array to standard output.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - Otherwise, elements are printed separated by a comma and a space.
        *
        * @param vett the {@code float} array to print
        */
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
        /**
        * Prints the contents of a {@code float} array to standard output using a custom separator.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - Otherwise, elements are printed in order, separated by the specified string.
        *
        * @param vett the {@code float} array to print
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
        /**
        * Prints the contents of a {@code float} array to standard output, formatting each value
        * with a fixed number of decimal places.
        * <p>
        * Elements are separated by {@code ", "}.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code decimals} is negative, it defaults to {@code 1}.
        *
        * @param vett the {@code float} array to print
        * @param decimals the number of digits to display after the decimal point;
        *                 if negative, {@code 1} is used
        */
        public static void print(float[] vett, int decimals){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (decimals < 0) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                System.out.print(df.format(vett[0]));
                for(int i=1; i<vett.length; i++)
                        System.out.print(", " + df.format(vett[i]));
        }
        /**
        * Prints the contents of a {@code float} array to standard output, formatting each value
        * with a fixed number of decimal places and using a custom separator.
        * <p>
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code decimals} is negative, it defaults to {@code 1}.<br>
        * - If {@code separation} is {@code null}, {@code ", "} is used as default.
        *
        * @param vett the {@code floar} array to print
        * @param decimals the number of digits to display after the decimal point;
        *                 if negative, {@code 1} is used
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
                if (decimals < 0) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                System.out.print(df.format(vett[0]));
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + df.format(vett[i]));
        }
        /**
        * Prints the contents of a {@code float} array to standard output, formatting each value
        * with a fixed number of decimal places and aligning elements to a fixed width.
        * <p>
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code decimals} is negative, it defaults to {@code 1}.<br>
        * - If {@code width} is less than {@code 1}, no padding is applied.
        *
        * @param vett the {@code float} array to print
        * @param decimals the number of digits to display after the decimal point;
        *                 if negative, {@code 1} is used
        * @param width the minimum width used to align each element; if less than {@code 1},
        *              no alignment is applied
        */
        public static void print(float[] vett, int decimals, int width){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (decimals < 0) decimals = 1;
                if(width < 1) width = 0;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                String s = Integer.toString((int)vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(vett[0]));
                for(int i=1; i<vett.length; i++){
                        s = Integer.toString((int)vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + df.format(vett[0]));
                }
        }
        /**
        * Prints the contents of a {@code float} array to standard output, formatting each value
        * with a fixed number of decimal places, aligning elements to a fixed width, and using
        * a custom separator.
        * <p>
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code decimals} is negative, it defaults to {@code 1}.<br>
        * - If {@code width} is less than {@code 1}, no padding is applied.<br>
        * - If {@code separation} is {@code null}, {@code ", "} is used as default.
        *
        * @param vett the {@code float} array to print
        * @param decimals the number of digits to display after the decimal point;
        *                 if negative, {@code 1} is used
        * @param width the minimum width used to align each element; if less than {@code 1},
        *              no alignment is applied
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
        public static void print(float[] vett, int decimals, int width, String separation){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (decimals < 0) decimals = 1;
                if(width < 1) width = 0;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                String s = Integer.toString((int)vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(vett[0]));
                for(int i=1; i<vett.length; i++){
                        s = Integer.toString((int)vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + df.format(vett[0]));
                }
        }
        
        /**
        * Prints the contents of a {@code double} array to standard output.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - Otherwise, elements are printed separated by a comma and a space.
        *
        * @param vett the {@code double} array to print
        */
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
        /**
        * Prints the contents of a {@code double} array to standard output using a custom separator.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - Otherwise, elements are printed in order, separated by the specified string.
        *
        * @param vett the {@code double} array to print
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
        /**
        * Prints the contents of a {@code double} array to standard output, formatting each value
        * with a fixed number of decimal places.
        * <p>
        * Elements are separated by {@code ", "}.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code decimals} is negative, it defaults to {@code 1}.
        *
        * @param vett the {@code double} array to print
        * @param decimals the number of digits to display after the decimal point;
        *                 if negative, {@code 1} is used
        */
        public static void print(double[] vett, int decimals){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (decimals < 0) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                System.out.print(df.format(vett[0]));
                for(int i=1; i<vett.length; i++)
                        System.out.print(", " + df.format(vett[i]));
        }
        /**
        * Prints the contents of a {@code double} array to standard output, formatting each value
        * with a fixed number of decimal places and using a custom separator.
        * <p>
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code decimals} is negative, it defaults to {@code 1}.<br>
        * - If {@code separation} is {@code null}, {@code ", "} is used as default.
        *
        * @param vett the {@code double} array to print
        * @param decimals the number of digits to display after the decimal point;
        *                 if negative, {@code 1} is used
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
                if (decimals < 0) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                System.out.print(df.format(vett[0]));
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + df.format(vett[i]));
        }
        /**
        * Prints the contents of a {@code double} array to standard output, formatting each value
        * with a fixed number of decimal places and aligning elements to a fixed width.
        * <p>
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code decimals} is negative, it defaults to {@code 1}.<br>
        * - If {@code width} is less than {@code 1}, no padding is applied.
        *
        * @param vett the {@code double} array to print
        * @param decimals the number of digits to display after the decimal point;
        *                 if negative, {@code 1} is used
        * @param width the minimum width used to align each element; if less than {@code 1},
        *              no alignment is applied
        */
        public static void print(double[] vett, int decimals, int width){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (decimals < 0) decimals = 1;
                if(width < 1) width = 0;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                String s = Integer.toString((int)vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(vett[0]));
                for(int i=1; i<vett.length; i++){
                        s = Integer.toString((int)vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + df.format(vett[0]));
                }
        }
        /**
        * Prints the contents of a {@code douuble} array to standard output, formatting each value
        * with a fixed number of decimal places, aligning elements to a fixed width, and using
        * a custom separator.
        * <p>
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code decimals} is negative, it defaults to {@code 1}.<br>
        * - If {@code width} is less than {@code 1}, no padding is applied.<br>
        * - If {@code separation} is {@code null}, {@code ", "} is used as default.
        *
        * @param vett the {@code double} array to print
        * @param decimals the number of digits to display after the decimal point;
        *                 if negative, {@code 1} is used
        * @param width the minimum width used to align each element; if less than {@code 1},
        *              no alignment is applied
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
        public static void print(double[] vett, int decimals, int width, String separation){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (decimals < 0) decimals = 1;
                if(width < 1) width = 0;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                String s = Integer.toString((int)vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + df.format(vett[0]));
                for(int i=1; i<vett.length; i++){
                        s = Integer.toString((int)vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + df.format(vett[0]));
                }
        }
        
        /**
        * Prints the contents of a {@code char} array to standard output.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - Otherwise, elements are printed separated by a comma and a space.
        *
        * @param vett the {@code char} array to print
        */
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
        /**
        * Prints the contents of a {@code char} array to standard output using a custom separator.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - Otherwise, elements are printed in order, separated by the specified string.
        *
        * @param vett the {@code char } array to print
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
        /**
        * Prints the contents of a {@code char} array to standard output, formatting each element
        * with a fixed minimum width.
        * <p>
        * Each value is right-aligned within the specified width using leading spaces.
        * Elements are separated by {@code ", "}.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code width} is negative, it is treated as {@code 0}.
        *
        * @param vett the {@code char} array to print
        * @param width the minimum width for each element; values shorter than this
        *              width are padded on the left with spaces
        */
        public static void print(char[] vett, int width){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                if (width < 0) width = 0;
                
                String s = String.valueOf(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = String.valueOf(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + s);
                }
        }
        /**
        * Prints the contents of a {@code char} array to standard output, using a custom separator
        * and formatting each element with a fixed minimum width.
        * <p>
        * Each value is right-aligned within the specified width using leading spaces.<br>
        * <br>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - If {@code width} is negative, it is treated as {@code 0}.
        *
        * @param vett the {@code char} array to print
        * @param width the minimum width for each element; values shorter than this
        *              width are padded on the left with spaces
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
                if (width < 0) width = 0;
                
                String s = String.valueOf(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = String.valueOf(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + s);
                }
        }
        
        /**
        * Prints the contents of a {@code boolean} array to standard output.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - Otherwise, elements are printed separated by a comma and a space.
        *
        * @param vett the {@code boolean} array to print
        */
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
        /**
        * Prints the contents of a {@code boolean} array to standard output using a custom separator.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - Otherwise, elements are printed in order, separated by the specified string.
        *
        * @param vett the {@code boolean} array to print
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
        
        /**
        * Prints the contents of a {@code String} array to standard output.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - Otherwise, elements are printed separated by a comma and a space.
        *
        * @param vett the {@code String} array to print
        */
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
        /**
        * Prints the contents of a {@code String} array to standard output using a custom separator.
        * <p>
        * - If the array is {@code null}, the string {@code "null"} is printed.<br>
        * - If the array is empty, {@code "[]"} is printed.<br>
        * - If {@code separation} is {@code null}, a default separator {@code ", "} is used.<br>
        * - Otherwise, elements are printed in order, separated by the specified string.
        *
        * @param vett the {@code String} array to print
        * @param separation the string used to separate elements; if {@code null},
        *                   {@code ", "} is used as default
        */
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
        
        // FILL (modifies the actual array filling it)
        /**
        * Fills the given {@code byte} array with the specified value.
        * <p>
        * Each element of the array is set to {@code value}.
        *
        * @param vett the {@code byte} array to fill
        * @param value the value to assign to each element of the array
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fill(byte[] vett, byte value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        /**
        * Fills the given {@code short} array with the specified value.
        * <p>
        * Each element of the array is set to {@code value}.
        *
        * @param vett the {@code short} array to fill
        * @param value the value to assign to each element of the array
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fill(short[] vett, short value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        /**
        * Fills the given {@code int} array with the specified value.
        * <p>
        * Each element of the array is set to {@code value}.
        *
        * @param vett the {@code int} array to fill
        * @param value the value to assign to each element of the array
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fill(int[] vett, int value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        /**
        * Fills the given {@code long} array with the specified value.
        * <p>
        * Each element of the array is set to {@code value}.
        *
        * @param vett the {@code long} array to fill
        * @param value the value to assign to each element of the array
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fill(long[] vett, long value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        /**
        * Fills the given {@code float} array with the specified value.
        * <p>
        * Each element of the array is set to {@code value}.
        *
        * @param vett the {@code float} array to fill
        * @param value the value to assign to each element of the array
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fill(float[] vett, float value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        /**
        * Fills the given {@code double} array with the specified value.
        * <p>
        * Each element of the array is set to {@code value}.
        *
        * @param vett the {@code double} array to fill
        * @param value the value to assign to each element of the array
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fill(double[] vett, double value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        /**
        * Fills the given {@code char} array with the specified value.
        * <p>
        * Each element of the array is set to {@code value}.
        *
        * @param vett the {@code char} array to fill
        * @param value the value to assign to each element of the array
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fill(char[] vett, char value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        /**
        * Fills the given {@code boolean} array with the specified value.
        * <p>
        * Each element of the array is set to {@code value}.
        *
        * @param vett the {@code boolean} array to fill
        * @param value the value to assign to each element of the array
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fill(boolean[] vett, boolean value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        /**
        * Fills the given {@code String} array with the specified value.
        * <p>
        * Each element of the array is set to {@code value}.
        *
        * @param vett the {@code String} array to fill
        * @param value the value to assign to each element of the array
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fill(String[] vett, String value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        
        /**
        * Fills the given {@code byte} array with random values within a specified range.
        * <p>
        * Each element is assigned a pseudo-random {@code byte} value between
        * {@code min} and {@code max} (both inclusive).
        *
        * @param vett the {@code byte} array to fill
        * @param min the minimum value (inclusive)
        * @param max the maximum value (inclusive)
        *
        * @throws IllegalArgumentException if {@code max} is less than {@code min}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillRandom(byte[] vett, byte min, byte max){
                if (vett == null) throw new NullPointerException("vett is null");
                if (max < min) throw new IllegalArgumentException("max < min");
                for(int i=0; i<vett.length; i++)
                        vett[i] = (byte) (r.nextInt(max - min + 1) + min);
        }
        /**
        * Fills the given {@code short} array with random values within a specified range.
        * <p>
        * Each element is assigned a pseudo-random {@code short} value between
        * {@code min} and {@code max} (both inclusive).
        *
        * @param vett the {@code short} array to fill
        * @param min the minimum value (inclusive)
        * @param max the maximum value (inclusive)
        *
        * @throws IllegalArgumentException if {@code max} is less than {@code min}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillRandom(short[] vett, short min, short max){
                if (vett == null) throw new NullPointerException("vett is null");
                if (max < min) throw new IllegalArgumentException("max < min");
                for(int i=0; i<vett.length; i++)
                        vett[i] = (short) (r.nextInt(max - min + 1) + min);
        }
        /**
        * Fills the given {@code int} array with random values within a specified range.
        * <p>
        * Each element is assigned a pseudo-random {@code int} value between
        * {@code min} and {@code max} (both inclusive).
        *
        * @param vett the {@code int} array to fill
        * @param min the minimum value (inclusive)
        * @param max the maximum value (inclusive)
        *
        * @throws IllegalArgumentException if {@code max} is less than {@code min}
        * @throws IllegalArgumentException if {@code vett} is {@code null}
        */
        public static void fillRandom(int[] vett, int min, int max){
                if (vett == null) throw new NullPointerException("vett is null");
                if (max < min) throw new IllegalArgumentException("max < min");
                for(int i=0; i<vett.length; i++)
                        vett[i] = r.nextInt((max-min) + 1) + min;
        }
        /**
        * Fills the given {@code long} array with random values within a specified range.
        * <p>
        * Each element is assigned a pseudo-random {@code long} value between
        * {@code min} and {@code max} (both inclusive).
        *
        * @param vett the {@code long} array to fill
        * @param min the minimum value (inclusive)
        * @param max the maximum value (inclusive)
        *
        * @throws IllegalArgumentException if {@code max} is less than {@code min}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillRandom(long[] vett, long min, long max){
                if (vett == null) throw new NullPointerException("vett is null");
                if (max < min) throw new IllegalArgumentException("max < min");
                for(int i=0; i<vett.length; i++)
                        vett[i] = r.nextLong((max-min)+1) + min;
        }
        /**
        * Fills the given {@code float} array with random values within a specified range.
        * <p>
        * Each element is assigned a pseudo-random {@code float} value in the interval
        * {@code [min, max)}.
        *
        * @param vett the {@code float} array to fill
        * @param min the lower bound of the range (inclusive)
        * @param max the upper bound of the range (exclusive)
        *
        * @throws IllegalArgumentException if {@code max} is less than {@code min}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillRandom(float[] vett, float min, float max){
                if (vett == null) throw new NullPointerException("vett is null");
                if (max < min) throw new IllegalArgumentException("max < min");
                for(int i=0; i<vett.length; i++)
                        vett[i] = r.nextFloat() * (max-min) + min;
        }
        /**
        * Fills the given {@code double} array with random values within a specified range.
        * <p>
        * Each element is assigned a pseudo-random {@code double} value in the interval
        * {@code [min, max)}.
        *
        * @param vett the {@code double} array to fill
        * @param min the lower bound of the range (inclusive)
        * @param max the upper bound of the range (exclusive)
        *
        * @throws IllegalArgumentException if {@code max} is less than {@code min}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillRandom(double[] vett, double min, double max){
                if (vett == null) throw new NullPointerException("vett is null");
                if (max < min) throw new IllegalArgumentException("max < min");
                for(int i=0; i<vett.length; i++)
                        vett[i] = r.nextDouble() * (max-min) + min;
        }
        /**
        * Fills the given {@code char} array with random values within a specified range.
        * <p>
        * Each element is assigned a pseudo-random {@code char} value between
        * {@code min} and {@code max} (both inclusive).
        *
        * @param vett the {@code char} array to fill
        * @param min the minimum value (inclusive)
        * @param max the maximum value (inclusive)
        *
        * @throws IllegalArgumentException if {@code max} is less than {@code min}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillRandom(char[] vett, char min, char max){
                if (vett == null) throw new NullPointerException("vett is null");
                if (max < min) throw new IllegalArgumentException("max < min");
                for(int i=0; i<vett.length; i++)
                        vett[i] = (char) (r.nextInt((max-min) + 1) + min);
        }
        /**
        * Fills the given {@code boolean} array with random values.
        * <p>
        * Each element is assigned either {@code true} or {@code false}
        * with equal probability.
        *
        * @param vett the {@code boolean} array to fill
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillRandom(boolean[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = r.nextBoolean();
        }
        
        /**
        * Fills the given {@code char} array with random letters (both uppercase and lowercase).
        * <p>
        * Each element is randomly assigned a character from {@code 'A'} to {@code 'Z'} or
        * from {@code 'a'} to {@code 'z'}.
        *
        * @param vett the {@code char} array to fill
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Fills the given {@code char} array with random letters, either uppercase or lowercase.
        *
        * @param vett the {@code char} array to fill
        * @param upperCase if {@code true}, fills with uppercase letters; otherwise lowercase
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Fills the given {@code char} array with random digits ('0' to '9').
        *
        * @param vett the {@code char} array to fill
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillNumbers(char[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                int min = (int)'0', max = (int)'9';
                
                for(int i=0; i<vett.length; i++)
                        vett[i] = (char) (r.nextInt((max-min) + 1) + min);
        }
        /**
        * Fills the given {@code char} array with random alphanumeric characters
        * (digits, uppercase letters, and lowercase letters).
        *
        * @param vett the {@code char} array to fill
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Fills the given {@code char} array with random alphanumeric characters,
        * optionally only letters of a specific case.
        *
        * @param vett the {@code char} array to fill
        * @param upperCase if {@code true}, letters will be uppercase; if {@code false}, lowercase
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        
        /**
        * Fills a {@code String} array with randomly generated alphabetic strings
        * of a fixed length.
        * <p>
        * <p>
        * - If {@code stringLength} is less than {@code 1}, all elements are set to
        *   the empty string {@code ""}.<br>
        * - Generated strings contain only lowercase alphabetic characters.
        *
        * @param vett the {@code String} array to fill
        * @param stringLength the length of each generated string; if less than {@code 1},
        *                     empty strings are assigned
        *
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillLetters(String vett[], int stringLength){
                if (vett == null) throw new NullPointerException("vett is null");
                if(stringLength < 1)
                        for(int i=0; i<vett.length; i++)
                                vett[i] = "";
                else
                        for(int i=0; i<vett.length; i++){
                                char[] a = new char[stringLength];
                                fillLetters(a);
                                for(char c : a)
                                        vett[i] = vett[i].concat(String.valueOf(c));
                        }
        }
        /**
        * Fills a {@code String} array with randomly generated alphabetic strings
        * of a fixed length, with optional uppercase characters.
        * <p>
        * <p>
        * - If {@code stringLength} is less than {@code 1}, all elements are set to
        *   the empty string {@code ""}.<br>
        * - Generated strings contain only alphabetic characters, either lowercase
        *   or uppercase depending on {@code upperCase}.
        *
        * @param vett the {@code String} array to fill
        * @param stringLength the length of each generated string; if less than {@code 1},
        *                     empty strings are assigned
        * @param upperCase whether generated letters should be uppercase
        *
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillLetters(String vett[], int stringLength, boolean upperCase){
                if (vett == null) throw new NullPointerException("vett is null");
                if(stringLength < 1)
                        for(int i=0; i<vett.length; i++)
                                vett[i] = "";
                else
                        for(int i=0; i<vett.length; i++){
                                char[] a = new char[stringLength];
                                fillLetters(a, upperCase);
                                for(char c : a)
                                        vett[i] = vett[i].concat(String.valueOf(c));
                        }
        }
        /**
        * Fills a {@code String} array with randomly generated numeric strings
        * of a fixed length.
        * <p>
        * <p>
        * - If {@code stringLength} is less than {@code 1}, all elements are set to
        *   the empty string {@code ""}.<br>
        * - Generated strings contain only numeric characters ({@code 0–9}).
        *
        * @param vett the {@code String} array to fill
        * @param stringLength the length of each generated string; if less than {@code 1},
        *                     empty strings are assigned
        *
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillNumbers(String vett[], int stringLength){
                if (vett == null) throw new NullPointerException("vett is null");
                if(stringLength < 1)
                        for(int i=0; i<vett.length; i++)
                                vett[i] = "";
                else
                        for(int i=0; i<vett.length; i++){
                                char[] a = new char[stringLength];
                                fillNumbers(a);
                                for(char c : a)
                                        vett[i] = vett[i].concat(String.valueOf(c));
                        }
        }
        /**
        * Fills a {@code String} array with randomly generated alphanumeric strings
        * of a fixed length.
        * <p>
        * <p>
        * - If {@code stringLength} is less than {@code 1}, all elements are set to
        *   the empty string {@code ""}.<br>
        * - Generated strings contain lowercase letters and numeric characters.
        *
        * @param vett the {@code String} array to fill
        * @param stringLength the length of each generated string; if less than {@code 1},
        *                     empty strings are assigned
        *
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillAlphanumerical(String vett[], int stringLength){
                if (vett == null) throw new NullPointerException("vett is null");
                if(stringLength < 1)
                        for(int i=0; i<vett.length; i++)
                                vett[i] = "";
                else
                        for(int i=0; i<vett.length; i++){
                                char[] a = new char[stringLength];
                                fillAlphanumerical(a);
                                for(char c : a)
                                        vett[i] = vett[i].concat(String.valueOf(c));
                        }
        }
        /**
        * Fills a {@code String} array with randomly generated alphanumeric strings
        * of a fixed length, with optional uppercase letters.
        * <p>
        * <p>
        * - If {@code stringLength} is less than {@code 1}, all elements are set to
        *   the empty string {@code ""}.<br>
        * - Generated strings contain alphabetic and numeric characters, with
        *   letter casing controlled by {@code upperCase}.
        *
        * @param vett the {@code String} array to fill
        * @param stringLength the length of each generated string; if less than {@code 1},
        *                     empty strings are assigned
        * @param upperCase whether generated letters should be uppercase
        *
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void fillAlphanumerical(String vett[], int stringLength, boolean upperCase){
                if (vett == null) throw new NullPointerException("vett is null");
                if(stringLength < 1)
                        for(int i=0; i<vett.length; i++)
                                vett[i] = "";
                else
                        for(int i=0; i<vett.length; i++){
                                char[] a = new char[stringLength];
                                fillAlphanumerical(a, upperCase);
                                for(char c : a)
                                        vett[i] = vett[i].concat(String.valueOf(c));
                        }
        }
        
        // COPY (returns a copy of the array)
        /**
        * Returns a new {@code byte} array containing a copy of the elements of the specified array.
        * <p>
        * The original array is not modified.
        *
        * @param vett the array to copy
        * @return a new array containing the same elements as {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static byte[] copyOf(byte[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                byte[] vetCopy = new byte[vett.length];
                System.arraycopy(vett, 0, vetCopy, 0, vett.length);
                return vetCopy;
        }
        /**
        * Returns a new {@code short} array containing a copy of the elements of the specified array.
        * <p>
        * The original array is not modified.
        *
        * @param vett the array to copy
        * @return a new array containing the same elements as {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static short[] copyOf(short[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                short[] vetCopy = new short[vett.length];
                System.arraycopy(vett, 0, vetCopy, 0, vett.length);
                return vetCopy;
        }
        /**
        * Returns a new {@code int} array containing a copy of the elements of the specified array.
        * <p>
        * The original array is not modified.
        *
        * @param vett the array to copy
        * @return a new array containing the same elements as {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int[] copyOf(int[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                int[] vetCopy = new int[vett.length];
                System.arraycopy(vett, 0, vetCopy, 0, vett.length);
                        return vetCopy;
        }
        /**
        * Returns a new {@code long} array containing a copy of the elements of the specified array.
        * <p>
        * The original array is not modified.
        *
        * @param vett the array to copy
        * @return a new array containing the same elements as {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static long[] copyOf(long[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                long[] vetCopy = new long[vett.length];
                System.arraycopy(vett, 0, vetCopy, 0, vett.length);
                return vetCopy;
        }
        /**
        * Returns a new {@code float} array containing a copy of the elements of the specified array.
        * <p>
        * The original array is not modified.
        *
        * @param vett the array to copy
        * @return a new array containing the same elements as {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static float[] copyOf(float[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                float[] vetCopy = new float[vett.length];
                System.arraycopy(vett, 0, vetCopy, 0, vett.length);
                return vetCopy;
        }
        /**
        * Returns a new {@code double} array containing a copy of the elements of the specified array.
        * <p>
        * The original array is not modified.
        *
        * @param vett the array to copy
        * @return a new array containing the same elements as {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static double[] copyOf(double[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                double[] vetCopy = new double[vett.length];
                System.arraycopy(vett, 0, vetCopy, 0, vett.length);
                return vetCopy;
        }
        /**
        * Returns a new {@code char} array containing a copy of the elements of the specified array.
        * <p>
        * The original array is not modified.
        *
        * @param vett the array to copy
        * @return a new array containing the same elements as {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static char[] copyOf(char[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                char[] vetCopy = new char[vett.length];
                System.arraycopy(vett, 0, vetCopy, 0, vett.length);
                return vetCopy;
        }
        /**
        * Returns a new {@code boolean} array containing a copy of the elements of the specified array.
        * <p>
        * The original array is not modified.
        *
        * @param vett the array to copy
        * @return a new array containing the same elements as {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static boolean[] copyOf(boolean[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                boolean[] vetCopy = new boolean[vett.length];
                System.arraycopy(vett, 0, vetCopy, 0, vett.length);
                return vetCopy;
        }
        /**
        * Returns a new {@code String} array containing a copy of the elements of the specified array.
        * <p>
        * The original array is not modified.
        *
        * @param vett the array to copy
        * @return a new array containing the same elements as {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String[] copyOf(String[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                String[] vetCopy = new String[vett.length];
                System.arraycopy(vett, 0, vetCopy, 0, vett.length);
                return vetCopy;
        }
        
        /**
        * Returns a new {@code byte} array containing a copy of the elements of the specified array,
        * truncated or padded with zeros to obtain the specified length.
        * <p>
        * If {@code length} is greater than {@code vett.length}, the extra elements are set to 0.
        * If {@code length} is smaller, the array is truncated.
        *
        * @param vett the array to copy
        * @param length the desired length of the new array
        * @return a new array containing the elements of {@code vett}, adjusted to the specified length
        * 
        * @throws IllegalArgumentException if {@code length} is less than {@code 0}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static byte[] copyOf(byte[] vett, int length){
                if (vett == null) throw new NullPointerException("vett is null");
                if (length < 0) throw new IllegalArgumentException("negative length");
                byte[] vetCopy = new byte[length];
                for(int i=0; i<length; i++){
                        if(i<vett.length)
                                vetCopy[i] = vett[i];
                        else
                                vetCopy[i] = 0;
                }
                return vetCopy;
        }
        /**
        * Returns a new {@code short} array containing a copy of the elements of the specified array,
        * truncated or padded with zeros to obtain the specified length.
        * <p>
        * If {@code length} is greater than {@code vett.length}, the extra elements are set to 0.
        * If {@code length} is smaller, the array is truncated.
        *
        * @param vett the array to copy
        * @param length the desired length of the new array
        * @return a new array containing the elements of {@code vett}, adjusted to the specified length
        * 
        * @throws IllegalArgumentException if {@code length} is less than {@code 0}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static short[] copyOf(short[] vett, int length){
                if (vett == null) throw new NullPointerException("vett is null");
                if (length < 0) throw new IllegalArgumentException("negative length");
                short[] vetCopy = new short[length];
                for(int i=0; i<length; i++){
                        if(i<vett.length)
                                vetCopy[i] = vett[i];
                        else
                                vetCopy[i] = 0;
                }
                return vetCopy;
        }
        /**
        * Returns a new {@code int} array containing a copy of the elements of the specified array,
        * truncated or padded with zeros to obtain the specified length.
        * <p>
        * If {@code length} is greater than {@code vett.length}, the extra elements are set to 0.
        * If {@code length} is smaller, the array is truncated.
        *
        * @param vett the array to copy
        * @param length the desired length of the new array
        * @return a new array containing the elements of {@code vett}, adjusted to the specified length
        * 
        * @throws IllegalArgumentException if {@code length} is less than {@code 0}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int[] copyOf(int[] vett, int length){
                if (vett == null) throw new NullPointerException("vett is null");
                if (length < 0) throw new IllegalArgumentException("negative length");
                int[] vetCopy = new int[length];
                for(int i=0; i<length; i++){
                        if(i<vett.length)
                                vetCopy[i] = vett[i];
                        else
                                vetCopy[i] = 0;
                }
                return vetCopy;
        }
        /**
        * Returns a new {@code long} array containing a copy of the elements of the specified array,
        * truncated or padded with zeros to obtain the specified length.
        * <p>
        * If {@code length} is greater than {@code vett.length}, the extra elements are set to 0.
        * If {@code length} is smaller, the array is truncated.
        *
        * @param vett the array to copy
        * @param length the desired length of the new array
        * @return a new array containing the elements of {@code vett}, adjusted to the specified length
        * 
        * @throws IllegalArgumentException if {@code length} is less than {@code 0}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static long[] copyOf(long[] vett, int length){
                if (vett == null) throw new NullPointerException("vett is null");
                if (length < 0) throw new IllegalArgumentException("negative length");
                long[] vetCopy = new long[length];
                for(int i=0; i<length; i++){
                        if(i<vett.length)
                                vetCopy[i] = vett[i];
                        else
                                vetCopy[i] = 0;
                }
                return vetCopy;
        }
        /**
        * Returns a new {@code float} array containing a copy of the elements of the specified array,
        * truncated or padded with zeros to obtain the specified length.
        * <p>
        * If {@code length} is greater than {@code vett.length}, the extra elements are set to 0.
        * If {@code length} is smaller, the array is truncated.
        *
        * @param vett the array to copy
        * @param length the desired length of the new array
        * @return a new array containing the elements of {@code vett}, adjusted to the specified length
        * 
        * @throws IllegalArgumentException if {@code length} is less than {@code 0}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static float[] copyOf(float[] vett, int length){
                if (vett == null) throw new NullPointerException("vett is null");
                if (length < 0) throw new IllegalArgumentException("negative length");
                float[] vetCopy = new float[length];
                for(int i=0; i<length; i++){
                        if(i<vett.length)
                                vetCopy[i] = vett[i];
                        else
                                vetCopy[i] = 0;
                }
                return vetCopy;
        }
        /**
        * Returns a new {@code double} array containing a copy of the elements of the specified array,
        * truncated or padded with zeros to obtain the specified length.
        * <p>
        * If {@code length} is greater than {@code vett.length}, the extra elements are set to 0.
        * If {@code length} is smaller, the array is truncated.
        *
        * @param vett the array to copy
        * @param length the desired length of the new array
        * @return a new array containing the elements of {@code vett}, adjusted to the specified length
        * 
        * @throws IllegalArgumentException if {@code length} is less than {@code 0}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static double[] copyOf(double[] vett, int length){
                if (vett == null) throw new NullPointerException("vett is null");
                if (length < 0) throw new IllegalArgumentException("negative length");
                double[] vetCopy = new double[length];
                for(int i=0; i<length; i++){
                        if(i<vett.length)
                                vetCopy[i] = vett[i];
                        else
                                vetCopy[i] = 0;
                }
                return vetCopy;
        }
        /**
        * Returns a new {@code char} array containing a copy of the elements of the specified array,
        * truncated or padded with the null character '\0' to obtain the specified length.
        * <p>
        * If {@code length} is greater than {@code vett.length}, the extra elements are set to '\0'.
        * If {@code length} is smaller, the array is truncated.
        *
        * @param vett the array to copy
        * @param length the desired length of the new array
        * @return a new array containing the elements of {@code vett}, adjusted to the specified length
        * 
        * @throws IllegalArgumentException if {@code length} is less than {@code 0}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static char[] copyOf(char[] vett, int length){
                if (vett == null) throw new NullPointerException("vett is null");
                if (length < 0) throw new IllegalArgumentException("negative length");
                char[] vetCopy = new char[length];
                for(int i=0; i<length; i++){
                        if(i<vett.length)
                                vetCopy[i] = vett[i];
                        else
                                vetCopy[i] = '\0';
                }
                return vetCopy;
        }
        /**
        * Returns a new {@code boolean} array containing a copy of the elements of the specified array,
        * truncated or padded with {@code false} to obtain the specified length.
        * <p>
        * If {@code length} is greater than {@code vett.length}, the extra elements are set to {@code false}.
        * If {@code length} is smaller, the array is truncated.
        *
        * @param vett the array to copy
        * @param length the desired length of the new array
        * @return a new array containing the elements of {@code vett}, adjusted to the specified length
        * 
        * @throws IllegalArgumentException if {@code length} is less than {@code 0}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static boolean[] copyOf(boolean[] vett, int length){
                if (vett == null) throw new NullPointerException("vett is null");
                if (length < 0) throw new IllegalArgumentException("negative length");
                boolean[] vetCopy = new boolean[length];
                for(int i=0; i<length; i++){
                        if(i<vett.length)
                                vetCopy[i] = vett[i];
                        else
                                vetCopy[i] = false;
                }
                return vetCopy;
        }
        /**
        * Returns a new {@code String} array containing a copy of the elements of the specified array,
        * truncated or padded with the null character '\0' to obtain the specified length.
        * <p>
        * If {@code length} is greater than {@code vett.length}, the extra elements are set to '\0'.
        * If {@code length} is smaller, the array is truncated.
        *
        * @param vett the array to copy
        * @param length the desired length of the new array
        * @return a new array containing the elements of {@code vett}, adjusted to the specified length
        * 
        * @throws IllegalArgumentException if {@code length} is less than {@code 0}
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String[] copyOf(String[] vett, int length){
                if (vett == null) throw new NullPointerException("vett is null");
                if (length < 0) throw new IllegalArgumentException("negative length");
                String[] vetCopy = new String[length];
                for(int i=0; i<length; i++){
                        if(i<vett.length)
                                vetCopy[i] = vett[i];
                        else
                                vetCopy[i] = "";
                }
                return vetCopy;
        }
        
        
        // SORT (returns a sorted copy, useful if you need to have the original order and the sorted version)
        /**
        * Returns a sorted copy of the given {@code byte} array in ascending order.
        * <p>
        * Uses counting sort internally. The original array is not modified.
        *
        * @param vett the {@code byte} array to sort
        * @return a new array containing the sorted values
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static byte[] sort(byte[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                byte[] vetCopy = copyOf(vett);
                int[] count = new int[256];

                for (byte b : vetCopy) 
                        count[b & 0xFF]++;

                int i = 0;
                for (int v = 0; v < 256; v++) {
                        while (count[v]-- > 0)
                                vetCopy[i++] = (byte) v;
                }
                return vetCopy;
        }
        /**
        * Returns a sorted copy of the given {@code short} array in ascending order.
        * <p>
        * Uses counting sort internally. The original array is not modified.
        *
        * @param vett the {@code short} array to sort
        * @return a new array containing the sorted values
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static short[] sort(short[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                short[] vetCopy = copyOf(vett);
                int[] count = new int[65536];

                for (short s : vetCopy) 
                        count[s & 0xFFFF]++;

                int i = 0;
                for (int v = 0; v < count.length; v++) {
                        while (count[v]-- > 0)
                                vetCopy[i++] = (short) v;
                }
                return vetCopy;
        }
        /**
        * Returns a sorted copy of the given {@code int} array in ascending order.
        * <p>
        * Uses a 3-way quicksort internally. The original array is not modified.
        *
        * @param vett the {@code int} array to sort
        * @return a new array containing the sorted values
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int[] sort(int[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                int[] vetCopy = copyOf(vett);
                quickSort(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void quickSort(int[] a, int left, int right) {
                if (left >= right) return;
                
                if (a[left] > a[right]) {
                        int t = a[left];
                        a[left] = a[right];
                        a[right] = t;
                }

                int p = a[left];
                int q = a[right];

                int l = left + 1;
                int g = right - 1;
                int k = l;

                while (k <= g) {
                        if (a[k] < p) {
                                int t = a[k];
                                a[k] = a[l];
                                a[l] = t;
                                l++;
                        }
                        else if (a[k] > q) {
                                while (a[g] > q && k < g) 
                                        g--;
                                
                                int t = a[k];
                                a[k] = a[g];
                                a[g] = t;
                                g--;
                                
                                if (a[k] < p) {
                                        t = a[k];
                                        a[k] = a[l];
                                        a[l] = t;
                                        l++;
                                }
                        }
                        
                        k++;
                }

                l--;
                g++;

                a[left] = a[l];
                a[l] = p;

                a[right] = a[g];
                a[g] = q;

                quickSort(a, left, l - 1);
                quickSort(a, l + 1, g - 1);
                quickSort(a, g + 1, right);
        }
        /**
        * Returns a sorted copy of the given {@code long} array in ascending order.
        * <p>
        * Uses a 3-way quicksort internally. The original array is not modified.
        *
        * @param vett the {@code long} array to sort
        * @return a new array containing the sorted values
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static long[] sort(long[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                long[] vetCopy = copyOf(vett);
                quickSort(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void quickSort(long[] a, int left, int right) {
                if (left >= right) return;
                
                if (a[left] > a[right]) {
                        long t = a[left];
                        a[left] = a[right];
                        a[right] = t;
                }

                long p = a[left];
                long q = a[right];

                int l = left + 1;
                int g = right - 1;
                int k = l;

                while (k <= g) {
                        if (a[k] < p) {
                                long t = a[k];
                                a[k] = a[l];
                                a[l] = t;
                                l++;
                        } 
                        else if (a[k] > q) {
                                while (a[g] > q && k < g) 
                                        g--;
                                
                                long t = a[k];
                                a[k] = a[g];
                                a[g] = t;
                                g--;
                                
                                if (a[k] < p) {
                                        t = a[k];
                                        a[k] = a[l];
                                        a[l] = t;
                                        l++;
                                }
                        }
                        
                        k++;
                }

                l--;
                g++;

                a[left] = a[l];
                a[l] = p;

                a[right] = a[g];
                a[g] = q;

                quickSort(a, left, l - 1);
                quickSort(a, l + 1, g - 1);
                quickSort(a, g + 1, right);
        }
        /**
        * Returns a sorted copy of the given {@code float} array in ascending order.
        * <p>
        * Uses a 3-way quicksort internally. {@code NaN} values are handled according to
        * {@link Float#compare}. The original array is not modified.
        *
        * @param vett the {@code float} array to sort
        * @return a new array containing the sorted values
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static float[] sort(float[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                float[] vetCopy = copyOf(vett);
                quickSort(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void quickSort(float[] a, int left, int right) {
                if (left >= right) return;
                
                if (Float.compare(a[left], a[right]) > 0) {
                        float t = a[left];
                        a[left] = a[right];
                        a[right] = t;
                }

                float p = a[left];
                float q = a[right];

                int l = left + 1;
                int g = right - 1;
                int k = l;

                while (k <= g) {
                        if (Float.compare(a[k], p) < 0) {
                                float t = a[k];
                                a[k] = a[l];
                                a[l] = t;
                                l++;
                        } 
                        else if (Float.compare(a[k], q) > 0) {
                                while (Float.compare(a[g], q) > 0 && k < g) 
                                        g--;
                                
                                float t = a[k];
                                a[k] = a[g];
                                a[g] = t;
                                g--;
                                
                                if (Float.compare(a[k], p) < 0) {
                                        t = a[k];
                                        a[k] = a[l];
                                        a[l] = t;
                                        l++;
                                }
                        }
                        
                        k++;
                }

                l--;
                g++;

                a[left] = a[l];
                a[l] = p;

                a[right] = a[g];
                a[g] = q;

                quickSort(a, left, l - 1);
                quickSort(a, l + 1, g - 1);
                quickSort(a, g + 1, right);
        }
        /**
        * Returns a sorted copy of the given {@code double} array in ascending order.
        * <p>
        * Uses a 3-way quicksort internally. {@code NaN} values are handled according to
        * {@link Double#compare}. The original array is not modified.
        *
        * @param vett the {@code double} array to sort
        * @return a new array containing the sorted values
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static double[] sort(double[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                double[] vetCopy = copyOf(vett);
                quickSort(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void quickSort(double[] a, int left, int right) {
            if (left >= right) return;
            
            if (Double.compare(a[left], a[right]) > 0) {
                        double t = a[left];
                        a[left] = a[right];
                        a[right] = t;
            }

            double p = a[left];
            double q = a[right];

            int l = left + 1;
            int g = right - 1;
            int k = l;

            while (k <= g) {
                        if (Double.compare(a[k], p) < 0) {
                                double t = a[k];
                                a[k] = a[l];
                                a[l] = t;
                                l++;
                        } 
                        else if (Double.compare(a[k], q) > 0) {
                                while (Double.compare(a[g], q) > 0 && k < g) 
                                        g--;
                                
                                double t = a[k];
                                a[k] = a[g];
                                a[g] = t;
                                g--;
                                
                                if (Double.compare(a[k], p) < 0) {
                                        t = a[k];
                                        a[k] = a[l];
                                        a[l] = t;
                                        l++;
                                }
                        }
                        
                        k++;
            }

            l--;
            g++;

            a[left] = a[l];
            a[l] = p;

            a[right] = a[g];
            a[g] = q;

            quickSort(a, left, l - 1);
            quickSort(a, l + 1, g - 1);
            quickSort(a, g + 1, right);
        }
        /**
        * Returns a sorted copy of the given {@code char} array in ascending order.
        * <p>
        * Uses counting sort internally. The original array is not modified.
        *
        * @param vett the {@code char} array to sort
        * @return a new array containing the sorted values
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static char[] sort(char[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                char[] vetCopy = copyOf(vett);
                int[] count = new int[65536];

                for (char c : vetCopy) 
                        count[c]++;

                int i = 0;
                for (int v = 0; v < count.length; v++) {
                        while (count[v]-- > 0)
                                vetCopy[i++] = (char) v;
                }
                return vetCopy;
        }
        /**
        * Returns a sorted copy of the given {@code boolean} array.
        * <p>
        * {@code false} values will appear before {@code true} values. The original array
        * is not modified.
        *
        * @param vett the {@code boolean} array to sort
        * @return a new array containing the sorted values
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static boolean[] sort(boolean[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                boolean[] vetCopy = copyOf(vett);
                int falseCount = 0;
                for(boolean b : vetCopy)
                        if(!b) 
                                falseCount++;

                for (int i = 0; i < vetCopy.length; i++)
                        vetCopy[i] = i >= falseCount;
                return vetCopy;
        }
        /**
        * Returns a sorted copy of the specified {@code String} array in ascending
        * lexicographical order.
        * <p>
        * <p>
        * - If the array has fewer than two elements, a shallow copy of the array
        *   is returned.<br>
        * - The original array is never modified.<br>
        * - Sorting is performed using a quicksort-based algorithm.
        *
        * @param vett the {@code String} array to sort
        * @return a new {@code String} array containing the elements sorted in
        *         ascending order
        *
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String[] sort(String[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (vett.length < 2) return copyOf(vett);
                String[] vetCopy = copyOf(vett);
                quickSort(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void quickSort(String[] a, int left, int right) {
                if (left >= right)
                    return;
                
                if (a[left].compareTo(a[right]) > 0) {
                    String tmp = a[left];
                    a[left] = a[right];
                    a[right] = tmp;
                }

                String p = a[left];
                String q = a[right];

                int l = left + 1;
                int g = right - 1;
                int k = l;

                while (k <= g) {
                    if (a[k].compareTo(p) < 0) {
                        String tmp = a[k];
                        a[k] = a[l];
                        a[l] = tmp;
                        l++;
                    } else if (a[k].compareTo(q) > 0) {
                        while (a[g].compareTo(q) > 0 && k < g)
                            g--;

                        String tmp = a[k];
                        a[k] = a[g];
                        a[g] = tmp;
                        g--;

                        if (a[k].compareTo(p) < 0) {
                            tmp = a[k];
                            a[k] = a[l];
                            a[l] = tmp;
                            l++;
                        }
                    }
                    k++;
                }

                l--;
                g++;

                a[left] = a[l];
                a[l] = p;

                a[right] = a[g];
                a[g] = q;

                quickSort(a, left, l - 1);
                quickSort(a, l + 1, g - 1);
                quickSort(a, g + 1, right);
        }
        /**
        * Returns a sorted copy of the specified {@code String} array in ascending
        * lexicographical order, ignoring case considerations.
        * <p>
        * <p>
        * - If the array has fewer than two elements, a shallow copy of the array
        *   is returned.<br>
        * - The original array is never modified.<br>
        * - Sorting is performed using a quicksort-based algorithm.
        *
        * @param vett the {@code String} array to sort
        * @return a new {@code String} array containing the elements sorted in
        *         ascending order
        *
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String[] sortIgnoreCase(String[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (vett.length < 2) return copyOf(vett);
                String[] vetCopy = copyOf(vett);
                quickSortIgnoreCase(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void quickSortIgnoreCase(String[] a, int left, int right) {
                if (left >= right)
                    return;
                
                if (a[left].compareToIgnoreCase(a[right]) > 0) {
                    String tmp = a[left];
                    a[left] = a[right];
                    a[right] = tmp;
                }

                String p = a[left];
                String q = a[right];

                int l = left + 1;
                int g = right - 1;
                int k = l;

                while (k <= g) {
                    if (a[k].compareToIgnoreCase(p) < 0) {
                        String tmp = a[k];
                        a[k] = a[l];
                        a[l] = tmp;
                        l++;
                    } else if (a[k].compareToIgnoreCase(q) > 0) {
                        while (a[g].compareToIgnoreCase(q) > 0 && k < g)
                            g--;

                        String tmp = a[k];
                        a[k] = a[g];
                        a[g] = tmp;
                        g--;

                        if (a[k].compareToIgnoreCase(p) < 0) {
                            tmp = a[k];
                            a[k] = a[l];
                            a[l] = tmp;
                            l++;
                        }
                    }
                    k++;
                }

                l--;
                g++;

                a[left] = a[l];
                a[l] = p;

                a[right] = a[g];
                a[g] = q;

                quickSortIgnoreCase(a, left, l - 1);
                quickSortIgnoreCase(a, l + 1, g - 1);
                quickSortIgnoreCase(a, g + 1, right);
        }
        
        /**
        * Returns a new {@code byte} array containing the elements of {@code vett} sorted in descending order.
        * <p>
        * The original array is not modified. If {@code vett} is {@code null}, {@code null} is returned.
        *
        * @param vett the array to sort
        * @return a new array sorted in descending order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static byte[] sortDesc(byte[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                byte[] vetCopy = copyOf(vett);
                int[] count = new int[256];
                for (byte b : vetCopy) 
                        count[b & 0xFF]++;
                int i = 0;
                for (int v = 255; v >= 0; v--)
                        while (count[v]-- > 0) 
                                vetCopy[i++] = (byte) v;

                return vetCopy;
        }
        /**
         * Returns a new {@code short} array containing the elements of {@code vett} sorted in descending order.
         * <p>
         * The original array is not modified. If {@code vett} is {@code null}, {@code null} is returned.
         *
         * @param vett the array to sort
         * @return a new array sorted in descending order
         * 
         * @throws NullPointerException if {@code vett} is {@code null}
         */
        public static short[] sortDesc(short[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                short[] vetCopy = copyOf(vett);
                int[] count = new int[65536];
                for (short s : vetCopy)
                        count[s & 0xFFFF]++;
                int i = 0;
                for (int v = 65535; v >= 0; v--)
                        while (count[v]-- > 0)
                                vetCopy[i++] = (short) v;
                
                return vetCopy;
        }
        /**
        * Returns a new {@code int} array containing the elements of {@code vett} sorted in descending order.
        * <p>
        * The original array is not modified. If {@code vett} is {@code null}, {@code null} is returned.
        * Uses a modified quicksort algorithm.
        *
        * @param vett the array to sort
        * @return a new array sorted in descending order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int[] sortDesc(int[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                int[] vetCopy = copyOf(vett);
                quickSortDesc(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void quickSortDesc(int[] a, int left, int right) {
                if (left >= right) return;
                
                if (a[left] < a[right]) { 
                        int t = a[left]; 
                        a[left] = a[right]; 
                        a[right] = t; 
                }
                
                int p = a[left], q = a[right];
                int l = left + 1, g = right - 1, k = l;
                while (k <= g) {
                        if (a[k] > p) { 
                                int t = a[k]; 
                                a[k] = a[l]; 
                                a[l] = t; l++; 
                        }
                        else if (a[k] < q) {
                                while (a[g] < q && k < g) 
                                        g--;
                                int t = a[k]; 
                                a[k] = a[g];
                                a[g] = t; 
                                g--;
                                if (a[k] > p) { 
                                        t = a[k]; 
                                        a[k] = a[l]; 
                                        a[l] = t; l++; 
                                }
                        }
                        k++;
                }
                
                l--; 
                g++;
                a[left] = a[l]; 
                a[l] = p; 
                a[right] = a[g]; 
                a[g] = q;
                quickSortDesc(a, left, l - 1);
                quickSortDesc(a, l + 1, g - 1);
                quickSortDesc(a, g + 1, right);
        }
        /**
        * Returns a new {@code long} array containing the elements of {@code vett} sorted in descending order.
        * <p>
        * The original array is not modified. If {@code vett} is {@code null}, {@code null} is returned.
        * Uses a modified quicksort algorithm.
        *
        * @param vett the array to sort
        * @return a new array sorted in descending order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static long[] sortDesc(long[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                long[] copy = copyOf(vett);
                quickSortDesc(copy, 0, copy.length - 1);
                return copy;
        }
        private static void quickSortDesc(long[] a, int left, int right) {
                if (left >= right) return;
                
                if (a[left] < a[right]) { 
                        long t = a[left];
                        a[left] = a[right]; 
                        a[right] = t; 
                }
                
                long p = a[left], q = a[right];
                int l = left + 1, g = right - 1, k = l;
                while (k <= g) {
                        if (a[k] > p) { 
                                long t = a[k]; 
                                a[k] = a[l]; 
                                a[l] = t; 
                                l++; 
                        }
                        else if (a[k] < q) {
                                while (a[g] < q && k < g) 
                                        g--;
                                long t = a[k]; 
                                a[k] = a[g]; 
                                a[g] = t; 
                                g--;
                                if (a[k] > p) { 
                                        t = a[k]; 
                                        a[k] = a[l]; 
                                        a[l] = t; 
                                        l++; }
                        }
                        k++;
                }
                l--; 
                g++;
                a[left] = a[l]; 
                a[l] = p; 
                a[right] = a[g]; 
                a[g] = q;
                quickSortDesc(a, left, l - 1);
                quickSortDesc(a, l + 1, g - 1);
                quickSortDesc(a, g + 1, right);
        }
        /**
        * Returns a new {@code float} array containing the elements of {@code vett} sorted in descending order.
        * <p>
        * The original array is not modified. If {@code vett} is {@code null}, {@code null} is returned.
        * Uses a modified quicksort algorithm.
        *
        * @param vett the array to sort
        * @return a new array sorted in descending order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static float[] sortDesc(float[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                float[] vetCopy = copyOf(vett);
                quickSortDesc(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void quickSortDesc(float[] a, int left, int right) {
                if (left >= right) return;
                
                if (Float.compare(a[left], a[right]) < 0) { 
                        float t = a[left]; 
                        a[left] = a[right]; 
                        a[right] = t; 
                }
                
                float p = a[left], q = a[right];
                int l = left + 1, g = right - 1, k = l;
                while (k <= g) {
                        if (Float.compare(a[k], p) > 0) { 
                                float t = a[k]; 
                                a[k] = a[l]; 
                                a[l] = t; 
                                l++; 
                        }
                        else if (Float.compare(a[k], q) < 0) {
                                while (Float.compare(a[g], q) < 0 && k < g) 
                                        g--;
                                float t = a[k]; 
                                a[k] = a[g]; 
                                a[g] = t; 
                                g--;
                                if (Float.compare(a[k], p) > 0) { 
                                        t = a[k]; 
                                        a[k] = a[l]; 
                                        a[l] = t; 
                                        l++; }
                        }
                        k++;
                }
                l--; 
                g++;
                a[left] = a[l]; 
                a[l] = p; 
                a[right] = a[g]; 
                a[g] = q;
                quickSortDesc(a, left, l - 1);
                quickSortDesc(a, l + 1, g - 1);
                quickSortDesc(a, g + 1, right);
        }
        /**
         * Returns a new {@code double} array containing the elements of {@code vett} sorted in descending order.
         * <p>
         * The original array is not modified. If {@code vett} is {@code null}, {@code null} is returned.
         * Uses a modified quicksort algorithm.
         *
         * @param vett the array to sort
         * @return a new array sorted in descending order
         * 
         * @throws NullPointerException if {@code vett} is {@code null}
         */
        public static double[] sortDesc(double[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                double[] vetCopy = copyOf(vett);
                quickSortDesc(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void quickSortDesc(double[] a, int left, int right) {
                if (left >= right) return;
                
                if (Double.compare(a[left], a[right]) < 0) { 
                        double t = a[left]; 
                        a[left] = a[right]; 
                        a[right] = t; 
                }
                
                double p = a[left], q = a[right];
                int l = left + 1, g = right - 1, k = l;
                while (k <= g) {
                        if (Double.compare(a[k], p) > 0) { 
                                double t = a[k]; 
                                a[k] = a[l]; 
                                a[l] = t; 
                                l++; 
                        }
                        else if (Double.compare(a[k], q) < 0) {
                                while (Double.compare(a[g], q) < 0 && k < g) 
                                        g--;
                                double t = a[k]; 
                                a[k] = a[g]; 
                                a[g] = t; 
                                g--;
                                if (Double.compare(a[k], p) > 0) { 
                                        t = a[k]; 
                                        a[k] = a[l]; 
                                        a[l] = t; 
                                        l++; 
                                }
                        }
                        k++;
                }
                l--; 
                g++;
                a[left] = a[l]; 
                a[l] = p; 
                a[right] = a[g]; 
                a[g] = q;
                quickSortDesc(a, left, l - 1);
                quickSortDesc(a, l + 1, g - 1);
                quickSortDesc(a, g + 1, right);
        }
        /**
        * Returns a new {@code char} array containing the elements of {@code vett} sorted in descending order.
        * <p>
        * The original array is not modified. If {@code vett} is {@code null}, {@code null} is returned.
        *
        * @param vett the array to sort
        * @return a new array sorted in descending order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static char[] sortDesc(char[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                char[] vetCopy = copyOf(vett);
                int[] count = new int[65536];
                for (char c : vetCopy) 
                        count[c]++;
                int i = 0;
                for (int v = 65535; v >= 0; v--)
                        while (count[v]-- > 0)
                                vetCopy[i++] = (char) v;
                return vetCopy;
        }
        /**
         * Returns a new {@code boolean} array containing the elements of {@code vett} sorted in descending order.
         * <p>
         * {@code true} values appear before {@code false} values. The original array is not modified.
         * If {@code vett} is {@code null}, {@code null} is returned.
         *
         * @param vett the array to sort
         * @return a new array sorted in descending order
         * 
         * @throws NullPointerException if {@code vett} is {@code null}
         */
        public static boolean[] sortDesc(boolean[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                boolean[] vetCopy = copyOf(vett);
                int trueCount = 0;
                for (boolean b : vetCopy) 
                        if (b) 
                                trueCount++;
                for (int i = 0; i < vetCopy.length; i++) 
                        vetCopy[i] = i < trueCount;
                return vetCopy;
        }
        /**
        * Returns a sorted copy of the specified {@code String} array in descending
        * lexicographical order.
        * <p>
        * <p>
        * - If the array has fewer than two elements, a shallow copy of the array
        *   is returned.<br>
        * - The original array is never modified.<br>
        * - Sorting is performed using a quicksort-based algorithm.
        *
        * @param vett the {@code String} array to sort
        * @return a new {@code String} array containing the elements sorted in
        *         descending order
        *
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String[] sortDesc(String[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (vett.length < 2) return copyOf(vett);
                String[] vetCopy = copyOf(vett);
                quickSortDesc(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void quickSortDesc(String[] a, int left, int right) {
                if (left >= right)
                    return;
                
                if (a[left].compareTo(a[right]) < 0) {
                    String tmp = a[left];
                    a[left] = a[right];
                    a[right] = tmp;
                }

                String p = a[left];   
                String q = a[right];  

                int l = left + 1;
                int g = right - 1;
                int k = l;

                while (k <= g) {
                    if (a[k].compareTo(p) > 0) {
                        String tmp = a[k];
                        a[k] = a[l];
                        a[l] = tmp;
                        l++;
                    } else if (a[k].compareTo(q) < 0) {
                        while (a[g].compareTo(q) < 0 && k < g)
                            g--;

                        String tmp = a[k];
                        a[k] = a[g];
                        a[g] = tmp;
                        g--;

                        if (a[k].compareTo(p) > 0) {
                            tmp = a[k];
                            a[k] = a[l];
                            a[l] = tmp;
                            l++;
                        }
                    }
                    k++;
                }

                l--;
                g++;

                a[left] = a[l];
                a[l] = p;

                a[right] = a[g];
                a[g] = q;

                quickSortDesc(a, left, l - 1);
                quickSortDesc(a, l + 1, g - 1);
                quickSortDesc(a, g + 1, right);
        }
        /**
        * Returns a sorted copy of the specified {@code String} array in descending
        * lexicographical order, ignoring case considerations.
        * <p>
        * <p>
        * - If the array has fewer than two elements, a shallow copy of the array
        *   is returned.<br>
        * - The original array is never modified.<br>
        * - Sorting is performed using a quicksort-based algorithm.
        *
        * @param vett the {@code String} array to sort
        * @return a new {@code String} array containing the elements sorted in
        *         descending order
        *
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String[] sortDescIgnoreCase(String[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (vett.length < 2) return copyOf(vett);
                String[] vetCopy = copyOf(vett);
                quickSortDescIgnoreCase(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void quickSortDescIgnoreCase(String[] a, int left, int right) {
                if (left >= right)
                    return;
                
                if (a[left].compareToIgnoreCase(a[right]) < 0) {
                    String tmp = a[left];
                    a[left] = a[right];
                    a[right] = tmp;
                }

                String p = a[left];   
                String q = a[right];  

                int l = left + 1;
                int g = right - 1;
                int k = l;

                while (k <= g) {
                    if (a[k].compareToIgnoreCase(p) > 0) {
                        String tmp = a[k];
                        a[k] = a[l];
                        a[l] = tmp;
                        l++;
                    } else if (a[k].compareToIgnoreCase(q) < 0) {
                        while (a[g].compareToIgnoreCase(q) < 0 && k < g)
                            g--;

                        String tmp = a[k];
                        a[k] = a[g];
                        a[g] = tmp;
                        g--;

                        if (a[k].compareToIgnoreCase(p) > 0) {
                            tmp = a[k];
                            a[k] = a[l];
                            a[l] = tmp;
                            l++;
                        }
                    }
                    k++;
                }

                l--;
                g++;

                a[left] = a[l];
                a[l] = p;

                a[right] = a[g];
                a[g] = q;

                quickSortDescIgnoreCase(a, left, l - 1);
                quickSortDescIgnoreCase(a, l + 1, g - 1);
                quickSortDescIgnoreCase(a, g + 1, right);
        }
        
        // FIND (returns an index, doesn't modify the array)
        /**
        * Finds the index of a value in a {@code byte} array.
        * <p>
        * If {@code sortedArray} is {@code true}, a binary search is used (array must be sorted in ascending order).
        * If {@code sortedArray} is {@code false}, a linear search is performed.
        *
        * @param vett the array to search
        * @param value the value to find
        * @param sortedArray {@code true} if the array is sorted, {@code false} otherwise
        * @return the index of the value, or {@code -1} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int find(byte[] vett, byte value, boolean sortedArray){
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
        /**
        * Finds the index of a value in a {@code short} array.
        * <p>
        * If {@code sortedArray} is {@code true}, a binary search is used (array must be sorted in ascending order).
        * If {@code sortedArray} is {@code false}, a linear search is performed.
        *
        * @param vett the array to search
        * @param value the value to find
        * @param sortedArray {@code true} if the array is sorted, {@code false} otherwise
        * @return the index of the value, or {@code -1} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int find(short[] vett, short value, boolean sortedArray){
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
        /**
        * Finds the index of a value in an {@code int} array.
        * <p>
        * If {@code sortedArray} is {@code true}, a binary search is used (array must be sorted in ascending order).
        * If {@code sortedArray} is {@code false}, a linear search is performed.
        *
        * @param vett the array to search
        * @param value the value to find
        * @param sortedArray {@code true} if the array is sorted, {@code false} otherwise
        * @return the index of the value, or {@code -1} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
         * Finds the index of a value in a {@code long} array.
         * <p>
         * If {@code sortedArray} is {@code true}, a binary search is used (array must be sorted in ascending order).
         * If {@code sortedArray} is {@code false}, a linear search is performed.
         *
         * @param vett the array to search
         * @param value the value to find
         * @param sortedArray {@code true} if the array is sorted, {@code false} otherwise
         * @return the index of the value, or {@code -1} if not found
         * 
         * @throws NullPointerException if {@code vett} is {@code null}
         */
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
        /**
        * Finds the index of a value in a {@code float} array.
        * <p>
        * If {@code sortedArray} is {@code true}, a binary search is used (array must be sorted in ascending order).
        * Comparisons use {@link Float#compare(float, float)}. If {@code sortedArray} is {@code false}, a linear search is performed.
        *
        * @param vett the array to search
        * @param value the value to find
        * @param sortedArray {@code true} if the array is sorted, {@code false} otherwise
        * @return the index of the value, or {@code -1} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Finds the index of a value in a {@code double} array.
        * <p>
        * If {@code sortedArray} is {@code true}, a binary search is used (array must be sorted in ascending order).
        * Comparisons use {@link Double#compare(double, double)}. If {@code sortedArray} is {@code false}, a linear search is performed.
        *
        * @param vett the array to search
        * @param value the value to find
        * @param sortedArray {@code true} if the array is sorted, {@code false} otherwise
        * @return the index of the value, or {@code -1} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Finds the index of a value in a {@code char} array.
        * <p>
        * If {@code sortedArray} is {@code true}, a binary search is used (array must be sorted in ascending order).
        * If {@code sortedArray} is {@code false}, a linear search is performed.
        *
        * @param vett the array to search
        * @param value the value to find
        * @param sortedArray {@code true} if the array is sorted, {@code false} otherwise
        * @return the index of the value, or {@code -1} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Finds the index of a value in a {@code boolean} array.
        * <p>
        * If {@code sortedArray} is {@code true}, a binary search is used (array must be sorted in ascending order, {@code false} before {@code true}).
        * If {@code sortedArray} is {@code false}, a linear search is performed.
        *
        * @param vett the array to search
        * @param value the value to find
        * @param sortedArray {@code true} if the array is sorted, {@code false} otherwise
        * @return the index of the value, or {@code -1} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        
        /**
        * Performs a binary search on a sorted {@code byte} array for the specified value.
        * <p>
        * The array must be sorted in ascending order. If the value is found, its index is returned.
        * Otherwise, {@code -(insertion point + 1)} is returned, where the insertion point is the index
        * at which the value would need to be inserted to maintain the sort order.
        *
        * @param vett the sorted array to search
        * @param value the value to search for
        * @return the index of the search key, or {@code -(insertion point + 1)} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int binarySearch(byte[] vett, byte value) {
                if (vett == null) throw new NullPointerException("vett is null");
                int low = 0;
                int high = vett.length - 1;

                while (low <= high) {
                        int mid = low + ((high - low) >>> 1);
                        byte midVal = vett[mid];

                        if (midVal < value)
                                low = mid + 1;
                        else if (midVal > value)
                                high = mid - 1;
                        else
                                return mid;
                }

                return -(low + 1);
        }
        /**
        * Performs a binary search on a sorted {@code short} array for the specified value.
        * <p>
        * The array must be sorted in ascending order. If the value is found, its index is returned.
        * Otherwise, {@code -(insertion point + 1)} is returned, where the insertion point is the index
        * at which the value would need to be inserted to maintain the sort order.
        *
        * @param vett the sorted array to search
        * @param value the value to search for
        * @return the index of the search key, or {@code -(insertion point + 1)} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int binarySearch(short[] vett, short value) {
                if (vett == null) throw new NullPointerException("vett is null");
                int low = 0;
                int high = vett.length - 1;

                while (low <= high) {
                        int mid = low + ((high - low) >>> 1);
                        short midVal = vett[mid];

                        if (midVal < value)
                            low = mid + 1;
                        else if (midVal > value)
                            high = mid - 1;
                        else
                            return mid;
                }

                return -(low + 1);
        }
        /**
        * Performs a binary search on a sorted {@code int} array for the specified value.
        * <p>
        * The array must be sorted in ascending order. If the value is found, its index is returned.
        * Otherwise, {@code -(insertion point + 1)} is returned, where the insertion point is the index
        * at which the value would need to be inserted to maintain the sort order.
        *
        * @param vett the sorted array to search
        * @param value the value to search for
        * @return the index of the search key, or {@code -(insertion point + 1)} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Performs a binary search on a sorted {@code long} array for the specified value.
        * <p>
        * The array must be sorted in ascending order. If the value is found, its index is returned.
        * Otherwise, {@code -(insertion point + 1)} is returned, where the insertion point is the index
        * at which the value would need to be inserted to maintain the sort order.
        *
        * @param vett the sorted array to search
        * @param value the value to search for
        * @return the index of the search key, or {@code -(insertion point + 1)} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Performs a binary search on a sorted {@code float} array for the specified value.
        * <p>
        * The array must be sorted in ascending order. Comparisons are performed using {@link Float#compare(float, float)}.
        * If the value is found, its index is returned. Otherwise, {@code -(insertion point + 1)} is returned,
        * where the insertion point is the index at which the value would need to be inserted to maintain the sort order.
        *
        * @param vett the sorted array to search
        * @param value the value to search for
        * @return the index of the search key, or {@code -(insertion point + 1)} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Performs a binary search on a sorted {@code double} array for the specified value.
        * <p>
        * The array must be sorted in ascending order. Comparisons are performed using {@link Double#compare(double, double)}.
        * If the value is found, its index is returned. Otherwise, {@code -(insertion point + 1)} is returned,
        * where the insertion point is the index at which the value would need to be inserted to maintain the sort order.
        *
        * @param vett the sorted array to search
        * @param value the value to search for
        * @return the index of the search key, or {@code -(insertion point + 1)} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Performs a binary search on a sorted {@code char} array for the specified value.
        * <p>
        * The array must be sorted in ascending order. If the value is found, its index is returned.
        * Otherwise, {@code -(insertion point + 1)} is returned, where the insertion point is the index
        * at which the value would need to be inserted to maintain the sort order.
        *
        * @param vett the sorted array to search
        * @param value the value to search for
        * @return the index of the search key, or {@code -(insertion point + 1)} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Performs a binary search on a sorted {@code boolean} array for the specified value.
        * <p>
        * The array must be sorted in ascending order ({@code false} before {@code true}).  
        * If the value is found, its index is returned. Otherwise, {@code -(insertion point + 1)} is returned,
        * where the insertion point is the index at which the value would need to be inserted to maintain the sort order.
        *
        * @param vett the sorted array to search
        * @param value the value to search for
        * @return the index of the search key, or {@code -(insertion point + 1)} if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        
        /**
         * Finds all occurrences of a {@code byte} value in an array.
         *
         * @param vett the array to search
         * @param value the value to find
         * @return an array of indexes where {@code value} occurs; empty if not found
         * 
         * @throws NullPointerException if {@code vett} is {@code null}
         */
        public static int[] findAll(byte[] vett, byte value){
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
        /**
        * Finds all occurrences of a {@code short} value in an array.
        *
        * @param vett the array to search
        * @param value the value to find
        * @return an array of indexes where {@code value} occurs; empty if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int[] findAll(short[] vett, short value){
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
        /**
        * Finds all occurrences of an {@code int} value in an array.
        *
        * @param vett the array to search
        * @param value the value to find
        * @return an array of indexes where {@code value} occurs; empty if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Finds all occurrences of a {@code long} value in an array.
        *
        * @param vett the array to search
        * @param value the value to find
        * @return an array of indexes where {@code value} occurs; empty if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Finds all occurrences of a {@code float} value in an array.
        *
        * @param vett the array to search
        * @param value the value to find
        * @return an array of indexes where {@code value} occurs; empty if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
        * Finds all occurrences of a {@code double} value in an array.
        *
        * @param vett the array to search
        * @param value the value to find
        * @return an array of indexes where {@code value} occurs; empty if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        /**
         * Finds all occurrences of a {@code char} value in an array.
         *
         * @param vett the array to search
         * @param value the value to find
         * @return an array of indexes where {@code value} occurs; empty if not found
         * 
         * @throws NullPointerException if {@code vett} is {@code null}
         */
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
        /**
        * Finds all occurrences of a {@code boolean} value in an array.
        *
        * @param vett the array to search
        * @param value the value to find
        * @return an array of indexes where {@code value} occurs; empty if not found
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
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
        
        /**
        * Searches for the first occurrence of a {@code String} in the specified array.
        * <p>
        * <p>
        * - If {@code sortedArray} is {@code true}, a binary search is used and the
        *   array must be sorted in ascending lexicographical order.<br>
        * - If {@code sortedArray} is {@code false}, a linear search is performed.<br>
        * - If the value is not found, {@code -1} is returned.
        *
        * @param vett the {@code String} array to search
        * @param value the {@code String} value to search for
        * @param sortedArray whether the array is already sorted
        * @return the index of the first matching element, or {@code -1} if not found
        *
        * @throws NullPointerException if {@code vett} or {@code value} is {@code null}
        */
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
                
                for(int i=0; i<vett.length; i++)
                        if(vett[i].equals(value))
                                return i;
                
                return -1;
        }
        /**
        * Searches for a {@code String} in a sorted array using binary search.
        * <p>
        * <p>
        * - The array must be sorted in ascending lexicographical order<br>
        * - If the value is not found, a negative value is returned indicating the
        *   insertion point.
        *
        * @param vett the sorted {@code String} array to search
        * @param value the {@code String} value to search for
        * @return the index of the matching element, or {@code -(insertionPoint + 1)}
        *         if the value is not found
        *
        * @throws NullPointerException if {@code vett} or {@code value} is {@code null}
        */
        public static int binarySearch(String[] vett, String value) {
        if (vett == null) throw new NullPointerException("vett is null");
        if (value == null) throw new NullPointerException("value is null");

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
        /**
        * Searches for the first occurrence of a {@code String} in the specified array,
        * ignoring case considerations.
        * <p>
        * <p>
        * - If {@code sortedArray} is {@code true}, a binary search is used and the
        *   array must be sorted in ascending lexicographical order (case-insensitive).<br>
        * - If {@code sortedArray} is {@code false}, a linear search is performed.<br>
        * - If the value is not found, {@code -1} is returned.
        *
        * @param vett the {@code String} array to search
        * @param value the {@code String} value to search for
        * @param sortedArray whether the array is already sorted
        * @return the index of the first matching element, or {@code -1} if not found
        *
        * @throws NullPointerException if {@code vett} or {@code value} is {@code null}
        */
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
                        if(vett[i].equalsIgnoreCase(value))
                                return i;
                
                return -1;
        }
        /**
        * Searches for a {@code String} in a sorted array using a case-insensitive
        * binary search.
        * <p>
        * <p>
        * - The array must be sorted in ascending lexicographical order,
        *   ignoring case.<br>
        * - If the value is not found, a negative value is returned indicating the
        *   insertion point.
        *
        * @param vett the sorted {@code String} array to search
        * @param value the {@code String} value to search for
        * @return the index of the matching element, or {@code -(insertionPoint + 1)}
        *         if the value is not found
        *
        * @throws NullPointerException if {@code vett} or {@code value} is {@code null}
        */
        public static int binarySearchIgnoreCase(String[] vett, String value) {
        if (vett == null) throw new NullPointerException("vett is null");
        if (value == null) throw new NullPointerException("value is null");

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
        /**
        * Finds all occurrences of a {@code String} in the specified array.
        * <p>
        * <p>
        * - If no matches are found, an empty array is returned.
        *
        * @param vett the {@code String} array to search
        * @param value the {@code String} value to search for
        * @return an array containing the indexes of all matching elements
        *
        * @throws NullPointerException if {@code vett} or {@code value} is {@code null}
        */
        public static int[] findAll(String[] vett, String value){
                if (vett == null) throw new NullPointerException("vett is null");
                if (value == null) throw new NullPointerException("value is null");
                ArrayList<Integer> indexes = new ArrayList();
                
                for(int i=0; i<vett.length; i++)
                        if(vett[i].equals(value))
                                indexes.add(i);
                
                int[] result = new int[indexes.size()];
                for(int i=0; i<result.length; i++)
                        result[i] = indexes.get(i);
                return result;
        }
        /**
        * Finds all occurrences of a {@code String} in the specified array,
        * ignoring case considerations.
        * <p>
        * <p>
        * - If no matches are found, an empty array is returned.
        *
        * @param vett the {@code String} array to search
        * @param value the {@code String} value to search for
        * @return an array containing the indexes of all matching elements
        *
        * @throws NullPointerException if {@code vett} or {@code value} is {@code null}
        */
        public static int[] findAllIgnoreCase(String[] vett, String value){
                if (vett == null) throw new NullPointerException("vett is null");
                if (value == null) throw new NullPointerException("value is null");
                ArrayList<Integer> indexes = new ArrayList();
                
                for(int i=0; i<vett.length; i++)
                        if(vett[i].equalsIgnoreCase(value))
                                indexes.add(i);
                
                int[] result = new int[indexes.size()];
                for(int i=0; i<result.length; i++)
                        result[i] = indexes.get(i);
                return result;
        }
        /**
        * Finds all elements in the specified array that contain the given substring.
        * <p>
        * <p>
        * - Matching is case-sensitive.<br>
        * - If no matches are found, an empty array is returned.
        *
        * @param vett the {@code String} array to search
        * @param value the substring to search for
        * @return an array containing the indexes of all elements that contain
        *         the specified substring
        *
        * @throws NullPointerException if {@code vett} or {@code value} is {@code null}
        */
        public static int[] findStringPart(String[] vett, String value){
                if (vett == null) throw new NullPointerException("vett is null");
                if (value == null) throw new NullPointerException("value is null");
                ArrayList<Integer> indexes = new ArrayList();
                
                for(int i=0; i<vett.length; i++)
                        if(vett[i].contains(value))
                                indexes.add(i);
                
                int[] result = new int[indexes.size()];
                for(int i=0; i<result.length; i++)
                        result[i] = indexes.get(i);
                return result;
        }
        /**
        * Finds all elements in the specified array that contain the given substring,
        * ignoring case considerations.
        * <p>
        * <p>
        * - Matching is case-insensitive.<br>
        * - If no matches are found, an empty array is returned.
        *
        * @param vett the {@code String} array to search
        * @param value the substring to search for
        * @return an array containing the indexes of all elements that contain
        *         the specified substring
        *
        * @throws NullPointerException if {@code vett} or {@code value} is {@code null}
        */
        public static int[] findStringPartIgnoreCase(String[] vett, String value){
                if (vett == null) throw new NullPointerException("vett is null");
                if (value == null) throw new NullPointerException("value is null");
                ArrayList<Integer> indexes = new ArrayList();
                
                for(int i=0; i<vett.length; i++)
                        if(vett[i].toLowerCase().contains(value.toLowerCase()))
                                indexes.add(i);
                
                int[] result = new int[indexes.size()];
                for(int i=0; i<result.length; i++)
                        result[i] = indexes.get(i);
                return result;
        }
        
        // REPLACE (modifies the array directly changing the values)
        /**
        * Replaces all occurrences of a specific {@code byte} value in the given array with a new value.
        *
        * @param vett the {@code byte} array to modify
        * @param value the value to be replaced
        * @param newValue the value to replace with
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void replace(byte[] vett, byte value, byte newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if(value == newValue) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        /**
        * Replaces all occurrences of a specific {@code short} value in the given array with a new value.
        *
        * @param vett the {@code short} array to modify
        * @param value the value to be replaced
        * @param newValue the value to replace with
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void replace(short[] vett, short value, short newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if(value == newValue) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        /**
        * Replaces all occurrences of a specific {@code int} value in the given array with a new value.
        *
        * @param vett the {@code int} array to modify
        * @param value the value to be replaced
        * @param newValue the value to replace with
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void replace(int[] vett, int value, int newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if(value == newValue) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        /**
        * Replaces all occurrences of a specific {@code long} value in the given array with a new value.
        *
        * @param vett the {@code long} array to modify
        * @param value the value to be replaced
        * @param newValue the value to replace with
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void replace(long[] vett, long value, long newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if(value == newValue) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        /**
        * Replaces all occurrences of a specific {@code float} value in the given array with a new value.
        *
        * @param vett the {@code float} array to modify
        * @param value the value to be replaced
        * @param newValue the value to replace with
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void replace(float[] vett, float value, float newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if(value == newValue) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        /**
        * Replaces all occurrences of a specific {@code double} value in the given array with a new value.
        *
        * @param vett the {@code double} array to modify
        * @param value the value to be replaced
        * @param newValue the value to replace with
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void replace(double[] vett, double value, double newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if(value == newValue) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        /**
        * Replaces all occurrences of a specific {@code char} value in the given array with a new value.
        *
        * @param vett the {@code char} array to modify
        * @param value the value to be replaced
        * @param newValue the value to replace with
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void replace(char[] vett, char value, char newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if(value == newValue) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        /**
        * Replaces all elements in the given {@code boolean} array with the specified value.
        *
        * @param vett the {@code boolean} array to modify
        * @param value the value to be replaced (ignored, as all elements are replaced)
        * @param newValue the value to set for all elements
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static void replace(boolean[] vett, boolean value, boolean newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if(value == newValue) return;
                for(int i=0; i<vett.length; i++)
                        vett[i] = newValue;
        }
        /**
        * Replaces all occurrences of a specific {@code String} value in the given array with a new value.
        *
        * @param vett the {@code String} array to modify
        * @param value the value to be replaced
        * @param newValue the value to replace with
        * 
        * @throws NullPointerException if {@code vett}, {@code value} or {@code newValue} is {@code null}
        */
        public static void replace(String[] vett, String value, String newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if (value == null) throw new NullPointerException("value is null");
                if (newValue == null) throw new NullPointerException("newValue is null");
                if(value.equals(newValue)) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i].equals(value))
                                vett[i] = newValue;
        }
        /**
        * Replaces all occurrences of a specific {@code String} value in the given array with a new value,
        * ignoring case considerations
        *
        * @param vett the {@code String} array to modify
        * @param value the value to be replaced
        * @param newValue the value to replace with
        * 
        * @throws NullPointerException if {@code vett}, {@code value} or {@code newValue} is {@code null}
        */
        public static void replaceIgnoreCase(String[] vett, String value, String newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if (value == null) throw new NullPointerException("value is null");
                if (newValue == null) throw new NullPointerException("newValue is null");
                if(value.equalsIgnoreCase(newValue)) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i].equalsIgnoreCase(value))
                                vett[i] = newValue;
        }
        
        /**
        * Replaces multiple {@code byte} values in the array with their corresponding new values.
        * <p>
        * Each element in {@code values} will be replaced by the element at the same index in {@code newValues}.
        * Both arrays must have the same length.
        *
        * @param vett the {@code byte} array to modify
        * @param values the array of values to be replaced
        * @param newValues the array of new values to replace with
        * 
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        * @throws NullPointerException if {@code vett}, {@code values} or {@code newValues} is {@code null}
        */
        public static void replaceMult(byte[] vett, byte[] values, byte[] newValues){
                if (vett == null) throw new NullPointerException("vett is null");
                if (values == null) throw new NullPointerException("values array is null");
                if (newValues == null) throw new NullPointerException("newValues array is null");
                if (values.length != newValues.length) throw new IllegalArgumentException("values array length != newValues array length");
                
                for(int v=0; v<values.length; v++){
                        int[] ind = findAll(vett, values[v]);
                        for(int i : ind) vett[i] = newValues[v];
                }
        }
        /**
        * Replaces multiple {@code short} values in the array with their corresponding new values.
        * <p>
        * Each element in {@code values} will be replaced by the element at the same index in {@code newValues}.
        * Both arrays must have the same length.
        *
        * @param vett the {@code short} array to modify
        * @param values the array of values to be replaced
        * @param newValues the array of new values to replace with
        * 
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        * @throws NullPointerException if {@code vett}, {@code values} or {@code newValues} is {@code null}
        */
        public static void replaceMult(short[] vett, short[] values, short[] newValues){
                if (vett == null) throw new NullPointerException("vett is null");
                if (values == null) throw new NullPointerException("values array is null");
                if (newValues == null) throw new NullPointerException("newValues array is null");
                if (values.length != newValues.length) throw new IllegalArgumentException("values array length != newValues array length");
                
                for(int v=0; v<values.length; v++){
                        int[] ind = findAll(vett, values[v]);
                        for(int i : ind) vett[i] = newValues[v];
                }
        }
        /**
        * Replaces multiple {@code int} values in the array with their corresponding new values.
        * <p>
        * Each element in {@code values} will be replaced by the element at the same index in {@code newValues}.
        * Both arrays must have the same length.
        *
        * @param vett the {@code int} array to modify
        * @param values the array of values to be replaced
        * @param newValues the array of new values to replace with
        * 
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        * @throws NullPointerException if {@code vett}, {@code values} or {@code newValues} is {@code null}
        */
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
        /**
        * Replaces multiple {@code long} values in the array with their corresponding new values.
        * <p>
        * Each element in {@code values} will be replaced by the element at the same index in {@code newValues}.
        * Both arrays must have the same length.
        *
        * @param vett the {@code long} array to modify
        * @param values the array of values to be replaced
        * @param newValues the array of new values to replace with
        * 
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        * @throws NullPointerException if {@code vett}, {@code values} or {@code newValues} is {@code null}
        */
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
        /**
        * Replaces multiple {@code float} values in the array with their corresponding new values.
        * <p>
        * Each element in {@code values} will be replaced by the element at the same index in {@code newValues}.
        * Both arrays must have the same length.
        *
        * @param vett the {@code float} array to modify
        * @param values the array of values to be replaced
        * @param newValues the array of new values to replace with
        * 
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        * @throws NullPointerException if {@code vett}, {@code values} or {@code newValues} is {@code null}
        */
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
        /**
        * Replaces multiple {@code double} values in the array with their corresponding new values.
        * <p>
        * Each element in {@code values} will be replaced by the element at the same index in {@code newValues}.
        * Both arrays must have the same length.
        *
        * @param vett the {@code double} array to modify
        * @param values the array of values to be replaced
        * @param newValues the array of new values to replace with
        * 
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        * @throws NullPointerException if {@code vett}, {@code values} or {@code newValues} is {@code null}
        */
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
        /**
        * Replaces multiple {@code char} values in the array with their corresponding new values.
        * <p>
        * Each element in {@code values} will be replaced by the element at the same index in {@code newValues}.
        * Both arrays must have the same length.
        *
        * @param vett the {@code char} array to modify
        * @param values the array of values to be replaced
        * @param newValues the array of new values to replace with
        * 
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        * @throws NullPointerException if {@code vett}, {@code values} or {@code newValues} is {@code null}
        */
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
        /**
        * Replaces multiple {@code String} values in the array with their corresponding new values.
        * <p>
        * Each element in {@code values} will be replaced by the element at the same index in {@code newValues}.
        * Both arrays must have the same length.
        *
        * @param vett the {@code String} array to modify
        * @param values the array of values to be replaced
        * @param newValues the array of new values to replace with
        * 
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        * @throws NullPointerException if {@code vett}, {@code values} or {@code newValues} is {@code null}
        */
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
        /**
        * Replaces multiple {@code String} values in the array with their corresponding new values, 
        * ignoring case considerations.
        * <p>
        * Each element in {@code values} will be replaced by the element at the same index in {@code newValues}.
        * Both arrays must have the same length.
        *
        * @param vett the {@code String} array to modify
        * @param values the array of values to be replaced
        * @param newValues the array of new values to replace with
        * 
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        * @throws NullPointerException if {@code vett}, {@code values} or {@code newValues} is {@code null}
        */
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
        
        // SHUFFLE (returns a copy, useful to keep the original order and the shuffled one)
        /**
        * Returns a shuffled copy of the specified {@code byte} array.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements for a
        * total of 30 iterations.
        * 
        * @param vett the array to shuffle
        * @return a new array containing the elements of {@code vett} in random order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static byte[] shuffle(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                byte[] vetCopy = copyOf(vett);
                for(int i=0; i<30; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        byte t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code short} array.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements for a
        * total of 30 iterations.
        * 
        * @param vett the array to shuffle
        * @return a new array containing the elements of {@code vett} in random order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static short[] shuffle(short[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                short[] vetCopy = copyOf(vett);
                for(int i=0; i<30; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        short t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code int} array.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements for a
        * total of 30 iterations.
        * 
        * @param vett the array to shuffle
        * @return a new array containing the elements of {@code vett} in random order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int[] shuffle(int[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                int[] vetCopy = copyOf(vett);
                for(int i=0; i<30; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        int t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code long} array.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements for a
        * total of 30 iterations.
        * 
        * @param vett the array to shuffle
        * @return a new array containing the elements of {@code vett} in random order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static long[] shuffle(long[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                long[] vetCopy = copyOf(vett);
                for(int i=0; i<30; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        long t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code float} array.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements for a
        * total of 30 iterations.
        * 
        * @param vett the array to shuffle
        * @return a new array containing the elements of {@code vett} in random order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static float[] shuffle(float[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                float[] vetCopy = copyOf(vett);
                for(int i=0; i<30; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        float t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code double} array.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements for a
        * total of 30 iterations.
        * 
        * @param vett the array to shuffle
        * @return a new array containing the elements of {@code vett} in random order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static double[] shuffle(double[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                double[] vetCopy = copyOf(vett);
                for(int i=0; i<30; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        double t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code char} array.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements for a
        * total of 30 iterations.
        * 
        * @param vett the array to shuffle
        * @return a new array containing the elements of {@code vett} in random order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static char[] shuffle(char[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                char[] vetCopy = copyOf(vett);
                for(int i=0; i<30; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        char t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code boolean} array.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements for a
        * total of 30 iterations.
        * 
        * @param vett the array to shuffle
        * @return a new array containing the elements of {@code vett} in random order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static boolean[] shuffle(boolean[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                boolean[] vetCopy = copyOf(vett);
                for(int i=0; i<30; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        boolean t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code String} array.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements for a
        * total of 30 iterations.
        * 
        * @param vett the array to shuffle
        * @return a new array containing the elements of {@code vett} in random order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String[] shuffle(String[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                String[] vetCopy = copyOf(vett);
                for(int i=0; i<30; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        String t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        
        /**
        * Returns a shuffled copy of the specified {@code byte} array, shuffled for a given number of iterations.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements.
        * If {@code iterations} is less than 1, it defaults to 1.
        *
        * @param vett the array to shuffle
        * @param iterations the number of random swaps to perform
        * @return a new array containing the elements of {@code vett} in shuffled order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static byte[] shuffle(byte[] vett, int iterations){
                if (vett == null) throw new NullPointerException("vett is null");
                if(iterations<1) iterations = 1;
                
                byte[] vetCopy = copyOf(vett);
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        byte t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code short} array, shuffled for a given number of iterations.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements.
        * If {@code iterations} is less than 1, it defaults to 1.
        *
        * @param vett the array to shuffle
        * @param iterations the number of random swaps to perform
        * @return a new array containing the elements of {@code vett} in shuffled order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static short[] shuffle(short[] vett, int iterations){
                if (vett == null) throw new NullPointerException("vett is null");
                if(iterations<1) iterations = 1;
                
                short[] vetCopy = copyOf(vett);
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        short t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code int} array, shuffled for a given number of iterations.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements.
        * If {@code iterations} is less than 1, it defaults to 1.
        *
        * @param vett the array to shuffle
        * @param iterations the number of random swaps to perform
        * @return a new array containing the elements of {@code vett} in shuffled order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int[] shuffle(int[] vett, int iterations){
                if (vett == null) throw new NullPointerException("vett is null");
                if(iterations<1) iterations = 1;
                
                int[] vetCopy = copyOf(vett);
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        int t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code long} array, shuffled for a given number of iterations.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements.
        * If {@code iterations} is less than 1, it defaults to 1.
        *
        * @param vett the array to shuffle
        * @param iterations the number of random swaps to perform
        * @return a new array containing the elements of {@code vett} in shuffled order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static long[] shuffle(long[] vett, int iterations){
                if (vett == null) throw new NullPointerException("vett is null");
                if(iterations<1) iterations = 1;
                
                long[] vetCopy = copyOf(vett);
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        long t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code float} array, shuffled for a given number of iterations.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements.
        * If {@code iterations} is less than 1, it defaults to 1.
        *
        * @param vett the array to shuffle
        * @param iterations the number of random swaps to perform
        * @return a new array containing the elements of {@code vett} in shuffled order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static float[] shuffle(float[] vett, int iterations){
                if (vett == null) throw new NullPointerException("vett is null");
                if(iterations<1) iterations = 1;
                
                float[] vetCopy = copyOf(vett);
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        float t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code double} array, shuffled for a given number of iterations.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements.
        * If {@code iterations} is less than 1, it defaults to 1.
        *
        * @param vett the array to shuffle
        * @param iterations the number of random swaps to perform
        * @return a new array containing the elements of {@code vett} in shuffled order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static double[] shuffle(double[] vett, int iterations){
                if (vett == null) throw new NullPointerException("vett is null");
                if(iterations<1) iterations = 1;
                
                double[] vetCopy = copyOf(vett);
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        double t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code char} array, shuffled for a given number of iterations.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements.
        * If {@code iterations} is less than 1, it defaults to 1.
        *
        * @param vett the array to shuffle
        * @param iterations the number of random swaps to perform
        * @return a new array containing the elements of {@code vett} in shuffled order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static char[] shuffle(char[] vett, int iterations){
                if (vett == null) throw new NullPointerException("vett is null");
                if(iterations<1) iterations = 1;
                
                char[] vetCopy = copyOf(vett);
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        char t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code boolean} array, shuffled for a given number of iterations.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements.
        * If {@code iterations} is less than 1, it defaults to 1.
        *
        * @param vett the array to shuffle
        * @param iterations the number of random swaps to perform
        * @return a new array containing the elements of {@code vett} in shuffled order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static boolean[] shuffle(boolean[] vett, int iterations){
                if (vett == null) throw new NullPointerException("vett is null");
                if(iterations<1) iterations = 1;
                
                boolean[] vetCopy = copyOf(vett);
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        boolean t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        /**
        * Returns a shuffled copy of the specified {@code String} array, shuffled for a given number of iterations.
        * <p>
        * The original array is not modified. Each iteration randomly swaps two elements.
        * If {@code iterations} is less than 1, it defaults to 1.
        *
        * @param vett the array to shuffle
        * @param iterations the number of random swaps to perform
        * @return a new array containing the elements of {@code vett} in shuffled order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String[] shuffle(String[] vett, int iterations){
                if (vett == null) throw new NullPointerException("vett is null");
                if(iterations<1) iterations = 1;
                
                String[] vetCopy = copyOf(vett);
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        String t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }

        // PICK (returns a value, doesn't modify the array)
        /**
        * Returns a randomly selected element from the specified {@code byte} array.
        *
        * @param vett the {@code byte} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static byte pickRandom(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code short} array.
        *
        * @param vett the {@code short} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static short pickRandom(short[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code int} array.
        *
        * @param vett the {@code int} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int pickRandom(int[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code long} array.
        *
        * @param vett the {@code long} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static long pickRandom(long[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code float} array.
        *
        * @param vett the {@code float} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static float pickRandom(float[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code double} array.
        *
        * @param vett the {@code double} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static double pickRandom(double[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code char} array.
        *
        * @param vett the {@code char} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static char pickRandom(char[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code boolean} array.
        *
        * @param vett the {@code boolean} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static boolean pickRandom(boolean[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code char} array.
        *
        * @param vett the {@code char} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String pickRandom(String[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
        }
        
        // FLIP (returns a copy, can be useful especially if used as a method argument)
        /**
        * Returns a reversed copy of the specified {@code byte} array.
        * <p>
        * The original array is not modified. The elements are copied in reverse order.
        *
        * @param vett the array to flip
        * @return a new array containing the elements of {@code vett} in reverse order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static byte[] flip(byte[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                byte[] vetCopy = new byte[vett.length];
                for (int i = 0; i < vett.length; i++)
                    vetCopy[vetCopy.length - 1 - i] = vett[i];
                return vetCopy;
        }
        /**
        * Returns a reversed copy of the specified {@code short} array.
        * <p>
        * The original array is not modified. The elements are copied in reverse order.
        *
        * @param vett the array to flip
        * @return a new array containing the elements of {@code vett} in reverse order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static short[] flip(short[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
            short[] vetCopy = new short[vett.length];
            for (int i = 0; i < vett.length; i++)
                vetCopy[vetCopy.length - 1 - i] = vett[i];
            return vetCopy;
        }
        /**
        * Returns a reversed copy of the specified {@code int} array.
        * <p>
        * The original array is not modified. The elements are copied in reverse order.
        *
        * @param vett the array to flip
        * @return a new array containing the elements of {@code vett} in reverse order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int[] flip(int[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                int[] vetCopy = new int[vett.length];
                for(int i=0; i<vett.length; i++)
                        vetCopy[vetCopy.length-1 - i] = vett[i];
                return vetCopy;
        }
        /**
        * Returns a reversed copy of the specified {@code long} array.
        * <p>
        * The original array is not modified. The elements are copied in reverse order.
        *
        * @param vett the array to flip
        * @return a new array containing the elements of {@code vett} in reverse order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static long[] flip(long[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                long[] vetCopy = new long[vett.length];
                for (int i = 0; i < vett.length; i++)
                    vetCopy[vetCopy.length - 1 - i] = vett[i];
                return vetCopy;
        }
        /**
        * Returns a reversed copy of the specified {@code float} array.
        * <p>
        * The original array is not modified. The elements are copied in reverse order.
        *
        * @param vett the array to flip
        * @return a new array containing the elements of {@code vett} in reverse order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static float[] flip(float[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                float[] vetCopy = new float[vett.length];
                for (int i = 0; i < vett.length; i++)
                    vetCopy[vetCopy.length - 1 - i] = vett[i];
                return vetCopy;
        }
        /**
        * Returns a reversed copy of the specified {@code double} array.
        * <p>
        * The original array is not modified. The elements are copied in reverse order.
        *
        * @param vett the array to flip
        * @return a new array containing the elements of {@code vett} in reverse order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static double[] flip(double[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                double[] vetCopy = new double[vett.length];
                for (int i = 0; i < vett.length; i++)
                    vetCopy[vetCopy.length - 1 - i] = vett[i];
                return vetCopy;
        }
        /**
        * Returns a reversed copy of the specified {@code char} array.
        * <p>
        * The original array is not modified. The elements are copied in reverse order.
        *
        * @param vett the array to flip
        * @return a new array containing the elements of {@code vett} in reverse order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static char[] flip(char[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                char[] vetCopy = new char[vett.length];
                for (int i = 0; i < vett.length; i++)
                    vetCopy[vetCopy.length - 1 - i] = vett[i];
                return vetCopy;
        }
        /**
        * Returns a reversed copy of the specified {@code boolean} array.
        * <p>
        * The original array is not modified. The elements are copied in reverse order.
        *
        * @param vett the array to flip
        * @return a new array containing the elements of {@code vett} in reverse order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static boolean[] flip(boolean[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                boolean[] vetCopy = new boolean[vett.length];
                for (int i = 0; i < vett.length; i++)
                    vetCopy[vetCopy.length - 1 - i] = vett[i];
                return vetCopy;
        }
        /**
        * Returns a reversed copy of the specified {@code String} array.
        * <p>
        * The original array is not modified. The elements are copied in reverse order.
        *
        * @param vett the array to flip
        * @return a new array containing the elements of {@code vett} in reverse order
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String[] flip(String[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                String[] vetCopy = new String[vett.length];
                for (int i = 0; i < vett.length; i++)
                    vetCopy[vetCopy.length - 1 - i] = vett[i];
                return vetCopy;
        }
        
        // SHIFT
        /**
        * Returns a new {@code byte} array with all elements shifted one position to the right.
        * <p>
        * The last element of the array is moved to the first position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted right by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static byte[] shiftR(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                byte[] vetCopy = copyOf(vett);
                byte tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code short} array with all elements shifted one position to the right.
        * <p>
        * The last element of the array is moved to the first position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted right by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static short[] shiftR(short[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                short[] vetCopy = copyOf(vett);
                short tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code int} array with all elements shifted one position to the right.
        * <p>
        * The last element of the array is moved to the first position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted right by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int[] shiftR(int[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                int[] vetCopy = copyOf(vett);
                int tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code long} array with all elements shifted one position to the right.
        * <p>
        * The last element of the array is moved to the first position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted right by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static long[] shiftR(long[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                long[] vetCopy = copyOf(vett);
                long tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code float} array with all elements shifted one position to the right.
        * <p>
        * The last element of the array is moved to the first position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted right by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static float[] shiftR(float[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                float[] vetCopy = copyOf(vett);
                float tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code double} array with all elements shifted one position to the right.
        * <p>
        * The last element of the array is moved to the first position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted right by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static double[] shiftR(double[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                double[] vetCopy = copyOf(vett);
                double tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code char} array with all elements shifted one position to the right.
        * <p>
        * The last element of the array is moved to the first position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted right by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static char[] shiftR(char[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                char[] vetCopy = copyOf(vett);
                char tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code boolean} array with all elements shifted one position to the right.
        * <p>
        * The last element of the array is moved to the first position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted right by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static boolean[] shiftR(boolean[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                boolean[] vetCopy = copyOf(vett);
                boolean tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code String} array with all elements shifted one position to the right.
        * <p>
        * The last element of the array is moved to the first position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted right by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String[] shiftR(String[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                String[] vetCopy = copyOf(vett);
                String tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
                return vetCopy;
        }
        
        /**
        * Returns a new {@code byte} array with all elements shifted one position to the left.
        * <p>
        * The first element of the array is moved to the last position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted left by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static byte[] shiftL(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                byte[] vetCopy = copyOf(vett);
                byte tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code short} array with all elements shifted one position to the left.
        * <p>
        * The first element of the array is moved to the last position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted left by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static short[] shiftL(short[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                short[] vetCopy = copyOf(vett);
                short tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code int} array with all elements shifted one position to the left.
        * <p>
        * The first element of the array is moved to the last position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted left by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static int[] shiftL(int[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                int[] vetCopy = copyOf(vett);
                int tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code long} array with all elements shifted one position to the left.
        * <p>
        * The first element of the array is moved to the last position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted left by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static long[] shiftL(long[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                long[] vetCopy = copyOf(vett);
                long tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code float} array with all elements shifted one position to the left.
        * <p>
        * The first element of the array is moved to the last position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted left by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static float[] shiftL(float[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                float[] vetCopy = copyOf(vett);
                float tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code double} array with all elements shifted one position to the left.
        * <p>
        * The first element of the array is moved to the last position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted left by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static double[] shiftL(double[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                double[] vetCopy = copyOf(vett);
                double tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code char} array with all elements shifted one position to the left.
        * <p>
        * The first element of the array is moved to the last position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted left by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static char[] shiftL(char[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                char[] vetCopy = copyOf(vett);
                char tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code boolean} array with all elements shifted one position to the left.
        * <p>
        * The first element of the array is moved to the last position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted left by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static boolean[] shiftL(boolean[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                boolean[] vetCopy = copyOf(vett);
                boolean tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
                return vetCopy;
        }
        /**
        * Returns a new {@code String} array with all elements shifted one position to the left.
        * <p>
        * The first element of the array is moved to the last position.
        * The original array is not modified.
        *
        * @param vett the array to shift
        * @return a new array with elements shifted left by one position
        * 
        * @throws NullPointerException if {@code vett} is {@code null}
        */
        public static String[] shiftL(String[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                String[] vetCopy = copyOf(vett);
                String tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
                return vetCopy;
        }
}