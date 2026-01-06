package CantoniLib;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Vet {
        private static final Random r = new Random();
        private static final DecimalFormatSymbols usSymbols = DecimalFormatSymbols.getInstance(Locale.US);
        
        /**
        * Generates a random index for an array of a given length.
        * <p>
        * The returned index is guaranteed to be within the bounds of the array,
        * i.e., between {@code 0} (inclusive) and {@code vettLength - 1} (inclusive).
        *
        * @param vettLength the length of the array
        * @return a random index in the range {@code 0} to {@code vettLength - 1}
        * @throws IllegalArgumentException if {@code vettLength} is less than 1
        */
        private static int randomIndex(int vettLength){
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
        
        // FILL (modifies the actual array filling it)
        /**
        * Fills the given {@code byte} array with the specified value.
        * <p>
        * Each element of the array is set to {@code value}.
        *
        * @param vett the {@code byte} array to fill
        * @param value the value to assign to each element of the array
        */
        public static void fill(byte[] vett, byte value){
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
        */
        public static void fill(short[] vett, short value){
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
        */
        public static void fill(int[] vett, int value){
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
        */
        public static void fill(long[] vett, long value){
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
        */
        public static void fill(float[] vett, float value){
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
        */
        public static void fill(double[] vett, double value){
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
        */
        public static void fill(char[] vett, char value){
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
        */
        public static void fill(boolean[] vett, boolean value){
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
        */
        public static void fillRandom(byte[] vett, byte min, byte max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
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
        */
        public static void fillRandom(short[] vett, short min, short max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
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
        */
        public static void fillRandom(int[] vett, int min, int max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
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
        */
        public static void fillRandom(long[] vett, long min, long max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
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
        */
        public static void fillRandom(float[] vett, float min, float max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
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
        */
        public static void fillRandom(double[] vett, double min, double max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
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
        */
        public static void fillRandom(char[] vett, char min, char max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
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
        */
        public static void fillRandom(boolean[] vett){
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
        */
        public static void fillLetters(char vett[]){
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
        */
        public static void fillLetters(char vett[], boolean upperCase){
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
        */
        public static void fillNumbers(char[] vett){
                int min = (int)'0', max = (int)'9';
                
                for(int i=0; i<vett.length; i++)
                        vett[i] = (char) (r.nextInt((max-min) + 1) + min);
        }
        /**
        * Fills the given {@code char} array with random alphanumeric characters
        * (digits, uppercase letters, and lowercase letters).
        *
        * @param vett the {@code char} array to fill
        */
        public static void fillAlphanumerical(char[] vett){
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
        */
        public static void fillAlphanumerical(char[] vett, boolean upperCase){
                
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
        
        // SORT (returns a sorted copy, useful if you need to have the original order and the sorted version)
        /**
        * Returns a sorted copy of the given {@code byte} array in ascending order.
        * <p>
        * Uses counting sort internally. The original array is not modified.
        *
        * @param vett the {@code byte} array to sort
        * @return a new array containing the sorted values, or {@code null} if {@code vett} is {@code null}
        */
        public static byte[] sort(byte[] vett) {
                if(vett == null) return null;
                
                byte[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        * @return a new array containing the sorted values, or {@code null} if {@code vett} is {@code null}
        */
        public static short[] sort(short[] vett) {
                if(vett == null) return null;
                
                short[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        * @return a new array containing the sorted values, or {@code null} if {@code vett} is {@code null}
        */
        public static int[] sort(int[] vett) {
                if(vett == null) return null;
                
                int[] vetCopy = Arrays.copyOf(vett, vett.length);
                if(vetCopy.length < 2) 
                        return vetCopy;
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
        * @return a new array containing the sorted values, or {@code null} if {@code vett} is {@code null}
        */
        public static long[] sort(long[] vett) {
                if(vett == null) return null;
                
                long[] vetCopy = Arrays.copyOf(vett,vett.length);
                if (vetCopy.length < 2) 
                        return vetCopy;
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
        * @return a new array containing the sorted values, or {@code null} if {@code vett} is {@code null}
        */
        public static float[] sort(float[] vett) {
                if(vett == null) return null;
                
                float[] vetCopy = Arrays.copyOf(vett, vett.length);
                if (vetCopy.length < 2) 
                        return vetCopy;
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
        * @return a new array containing the sorted values, or {@code null} if {@code vett} is {@code null}
        */
        public static double[] sort(double[] vett) {
                if(vett == null) return null;
                
                double[] vetCopy = Arrays.copyOf(vett, vett.length);
                if (vetCopy.length < 2)
                        return vetCopy;
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
        * @return a new array containing the sorted values, or {@code null} if {@code vett} is {@code null}
        */
        public static char[] sort(char[] vett) {
                if(vett == null) return null;
                
                char[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        * @return a new array containing the sorted values, or {@code null} if {@code vett} is {@code null}
        */
        public static boolean[] sort(boolean[] vett) {
                if(vett == null) return null;
                
                boolean[] vetCopy = Arrays.copyOf(vett, vett.length);
                int falseCount = 0;
                for(boolean b : vetCopy)
                        if(!b) 
                                falseCount++;

                for (int i = 0; i < vetCopy.length; i++)
                        vetCopy[i] = i >= falseCount;
                return vetCopy;
        }
        
        /**
        * Returns a new {@code byte} array containing the elements of {@code vett} sorted in descending order.
        * <p>
        * The original array is not modified. If {@code vett} is {@code null}, {@code null} is returned.
        *
        * @param vett the array to sort
        * @return a new array sorted in descending order, or {@code null} if the input is {@code null}
        */
        public static byte[] sortDesc(byte[] vett) {
                if (vett == null) return null;

                byte[] vetCopy = Arrays.copyOf(vett, vett.length);
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
         * @return a new array sorted in descending order, or {@code null} if the input is {@code null}
         */
        public static short[] sortDesc(short[] vett) {
                if (vett == null) return null;
                
                short[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        * @return a new array sorted in descending order, or {@code null} if the input is {@code null}
        */
        public static int[] sortDesc(int[] vett) {
                if (vett == null) return null;
                
                int[] vetCopy = Arrays.copyOf(vett, vett.length);
                if (vetCopy.length < 2) 
                        return vetCopy;
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
        * @return a new array sorted in descending order, or {@code null} if the input is {@code null}
        */
        public static long[] sortDesc(long[] vett) {
                if (vett == null) return null;
                
                long[] copy = Arrays.copyOf(vett, vett.length);
                if (copy.length < 2) 
                        return copy;
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
        * @return a new array sorted in descending order, or {@code null} if the input is {@code null}
        */
        public static float[] sortDesc(float[] vett) {
                if (vett == null) return null;
                
                float[] vetCopy = Arrays.copyOf(vett, vett.length);
                if (vetCopy.length < 2) 
                        return vetCopy;
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
         * @return a new array sorted in descending order, or {@code null} if the input is {@code null}
         */
        public static double[] sortDesc(double[] vett) {
                if (vett == null) return null;
                
                double[] vetCopy = Arrays.copyOf(vett, vett.length);
                if (vetCopy.length < 2) 
                        return vetCopy;
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
        * @return a new array sorted in descending order, or {@code null} if the input is {@code null}
        */
        public static char[] sortDesc(char[] vett) {
                if (vett == null) return null;
                
                char[] vetCopy = Arrays.copyOf(vett, vett.length);
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
         * @return a new array sorted in descending order, or {@code null} if the input is {@code null}
         */
        public static boolean[] sortDesc(boolean[] vett) {
                if (vett == null) return null;
                
                boolean[] vetCopy = Arrays.copyOf(vett, vett.length);
                int trueCount = 0;
                for (boolean b : vetCopy) 
                        if (b) 
                                trueCount++;
                for (int i = 0; i < vetCopy.length; i++) 
                        vetCopy[i] = i < trueCount;
                return vetCopy;
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
        */
        public static int find(byte[] vett, byte value, boolean sortedArray){
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
        */
        public static int find(short[] vett, short value, boolean sortedArray){
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
        */
        public static int find(int[] vett, int value, boolean sortedArray){
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
         */
        public static int find(long[] vett, long value, boolean sortedArray){
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
        */
        public static int find(float[] vett, float value, boolean sortedArray){
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
        */
        public static int find(double[] vett, double value, boolean sortedArray){
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
        */
        public static int find(char[] vett, char value, boolean sortedArray){
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
        */
        public static int find(boolean[] vett, boolean value, boolean sortedArray){
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
        */
        public static int binarySearch(byte[] vett, byte value) {
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
        */
        public static int binarySearch(short[] vett, short value) {
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
        */
        public static int binarySearch(int[] vett, int value) {
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
        */
        public static int binarySearch(long[] vett, long value) {
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
        */
        public static int binarySearch(float[] vett, float value) {
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
        */
        public static int binarySearch(double[] vett, double value) {
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
        */
        public static int binarySearch(char[] vett, char value) {
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
        */
        public static int binarySearch(boolean[] vett, boolean value) {
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
         */
        public static int[] findAll(byte[] vett, byte value){
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
        */
        public static int[] findAll(short[] vett, short value){
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
        */
        public static int[] findAll(int[] vett, int value){
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
        */
        public static int[] findAll(long[] vett, long value){
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
        */
        public static int[] findAll(float[] vett, float value){
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
        */
        public static int[] findAll(double[] vett, double value){
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
         */
        public static int[] findAll(char[] vett, char value){
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
        */
        public static int[] findAll(boolean[] vett, boolean value){
                ArrayList<Integer> indexes = new ArrayList();
                
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
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
        */
        public static void replace(byte[] vett, byte value, byte newValue){
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
        */
        public static void replace(short[] vett, short value, short newValue){
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
        */
        public static void replace(int[] vett, int value, int newValue){
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
        */
        public static void replace(long[] vett, long value, long newValue){
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
        */
        public static void replace(float[] vett, float value, float newValue){
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
        */
        public static void replace(double[] vett, double value, double newValue){
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
        */
        public static void replace(char[] vett, char value, char newValue){
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
        */
        public static void replace(boolean[] vett, boolean value, boolean newValue){
                for(int i=0; i<vett.length; i++)
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
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        */
        public static void replaceMult(byte[] vett, byte[] values, byte[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
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
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        */
        public static void replaceMult(short[] vett, short[] values, short[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
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
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        */
        public static void replaceMult(int[] vett, int[] values, int[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
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
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        */
        public static void replaceMult(long[] vett, long[] values, long[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
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
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        */
        public static void replaceMult(float[] vett, float[] values, float[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
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
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        */
        public static void replaceMult(double[] vett, double[] values, double[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
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
        * @throws IllegalArgumentException if {@code values.length != newValues.length}
        */
        public static void replaceMult(char[] vett, char[] values, char[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
                for(int v=0; v<values.length; v++){
                        int[] ind = findAll(vett, values[v]);
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
        * @throws IllegalArgumentException if {@code vett} is null
        */
        public static byte[] shuffle(byte[] vett){
                byte[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        * @throws IllegalArgumentException if {@code vett} is null
        */
        public static short[] shuffle(short[] vett){
                short[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        * @throws IllegalArgumentException if {@code vett} is null
        */
        public static int[] shuffle(int[] vett){
                int[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        * @throws IllegalArgumentException if {@code vett} is null
        */
        public static long[] shuffle(long[] vett){
                long[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        * @throws IllegalArgumentException if {@code vett} is null
        */
        public static float[] shuffle(float[] vett){
                float[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        * @throws IllegalArgumentException if {@code vett} is null
        */
        public static double[] shuffle(double[] vett){
                double[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        * @throws IllegalArgumentException if {@code vett} is null
        */
        public static char[] shuffle(char[] vett){
                char[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        * @throws IllegalArgumentException if {@code vett} is null
        */
        public static boolean[] shuffle(boolean[] vett){
                boolean[] vetCopy = Arrays.copyOf(vett, vett.length);
                for(int i=0; i<30; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        boolean t = vetCopy[ind1];
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
        */
        public static byte[] shuffle(byte[] vett, int iterations){
                if(iterations<1) iterations = 1;
                
                byte[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        */
        public static short[] shuffle(short[] vett, int iterations){
                if(iterations<1) iterations = 1;
                
                short[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        */
        public static int[] shuffle(int[] vett, int iterations){
                if(iterations<1) iterations = 1;
                
                int[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        */
        public static long[] shuffle(long[] vett, int iterations){
                if(iterations<1) iterations = 1;
                
                long[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        */
        public static float[] shuffle(float[] vett, int iterations){
                if(iterations<1) iterations = 1;
                
                float[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        */
        public static double[] shuffle(double[] vett, int iterations){
                if(iterations<1) iterations = 1;
                
                double[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        */
        public static char[] shuffle(char[] vett, int iterations){
                if(iterations<1) iterations = 1;
                
                char[] vetCopy = Arrays.copyOf(vett, vett.length);
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
        */
        public static boolean[] shuffle(boolean[] vett, int iterations){
                if(iterations<1) iterations = 1;
                
                boolean[] vetCopy = Arrays.copyOf(vett, vett.length);
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        boolean t = vetCopy[ind1];
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
        * @throws IllegalArgumentException if {@code vett} is null or empty
        */
        public static byte pickRandom(byte[] vett){
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code short} array.
        *
        * @param vett the {@code short} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * @throws IllegalArgumentException if {@code vett} is null or empty
        */
        public static short pickRandom(short[] vett){
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code int} array.
        *
        * @param vett the {@code int} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * @throws IllegalArgumentException if {@code vett} is null or empty
        */
        public static int pickRandom(int[] vett){
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code long} array.
        *
        * @param vett the {@code long} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * @throws IllegalArgumentException if {@code vett} is null or empty
        */
        public static long pickRandom(long[] vett){
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code float} array.
        *
        * @param vett the {@code float} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * @throws IllegalArgumentException if {@code vett} is null or empty
        */
        public static float pickRandom(float[] vett){
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code double} array.
        *
        * @param vett the {@code double} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * @throws IllegalArgumentException if {@code vett} is null or empty
        */
        public static double pickRandom(double[] vett){
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code char} array.
        *
        * @param vett the {@code char} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * @throws IllegalArgumentException if {@code vett} is null or empty
        */
        public static char pickRandom(char[] vett){
                return vett[randomIndex(vett.length)];
        }
        /**
        * Returns a randomly selected element from the specified {@code boolean} array.
        *
        * @param vett the {@code boolean} array from which to pick a random element
        * @return a randomly selected element from {@code vett}
        * @throws IllegalArgumentException if {@code vett} is null or empty
        */
        public static boolean pickRandom(boolean[] vett){
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
        */
        public static byte[] flip(byte[] vett) {
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
        */
        public static short[] flip(short[] vett) {
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
        */
        public static int[] flip(int[] vett){
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
        */
        public static long[] flip(long[] vett) {
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
        */
        public static float[] flip(float[] vett) {
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
        */
        public static double[] flip(double[] vett) {
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
        */
        public static char[] flip(char[] vett) {
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
        */
        public static boolean[] flip(boolean[] vett) {
            boolean[] vetCopy = new boolean[vett.length];
            for (int i = 0; i < vett.length; i++)
                vetCopy[vetCopy.length - 1 - i] = vett[i];
            return vetCopy;
        }
        
        // SHIFT
}