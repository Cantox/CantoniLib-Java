package CantoniLib;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import java.util.ArrayList;
import java.util.Random;

public class Vet {
        private static final DecimalFormatSymbols usSymbols = DecimalFormatSymbols.getInstance(Locale.US);
        
        
        public static void print(byte[] vett){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(", " + vett[i]);
        }
        public static void print(byte[] vett, String separation){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + vett[i]);
        }
        public static void print(byte[] vett, int width){
                String s = Byte.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Byte.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + s);
                }
        }
        public static void print(byte[] vett, int width, String separation){
                String s = Byte.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Byte.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + s);
                }
        }
        
        public static void print(short[] vett){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(", " + vett[i]);
        }
        public static void print(short[] vett, String separation){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + vett[i]);
        }
        public static void print(short[] vett, int width){
                String s = Short.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Short.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + s);
                }
        }
        public static void print(short[] vett, int width, String separation){
                String s = Short.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Short.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + s);
                }
        }
        
        public static void print(int[] vett){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(", " + vett[i]);
        }
        public static void print(int[] vett, String separation){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + vett[i]);
        }
        public static void print(int[] vett, int width){
                String s = Integer.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Integer.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + s);
                }
        }
        public static void print(int[] vett, int width, String separation){
                String s = Integer.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Integer.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + s);
                }
        }
        
        public static void print(long[] vett){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(", " + vett[i]);
        }
        public static void print(long[] vett, String separation){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + vett[i]);
        }
        public static void print(long[] vett, int width){
                String s = Long.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Long.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + s);
                }
        }
        public static void print(long[] vett, int width, String separation){
                String s = Long.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Long.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + s);
                }
        }
        
        public static void print(float[] vett){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(", " + vett[i]);
        }
        public static void print(float[] vett, String separation){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + vett[i]);
        }
        public static void print(float[] vett, int decimals){
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                System.out.print(df.format(vett[0]));
                for(int i=1; i<vett.length; i++)
                        System.out.print(", " + df.format(vett[0]));
        }
        public static void print(float[] vett, int decimals, String separation){
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                System.out.print(df.format(vett[0]));
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + df.format(vett[0]));
        }
        
        public static void print(double[] vett){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(", " + vett[i]);
        }
        public static void print(double[] vett, String separation){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + vett[i]);
        }
        public static void print(double[] vett, int decimals){
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                System.out.print(df.format(vett[0]));
                for(int i=1; i<vett.length; i++)
                        System.out.print(", " + df.format(vett[0]));
        }
        public static void print(double[] vett, int decimals, String separation){
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                System.out.print(df.format(vett[0]));
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + df.format(vett[0]));
        }
        
        public static void print(boolean[] vett){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(", " + vett[i]);
        }
        public static void print(boolean[] vett, String separation){
                System.out.print(vett[0]);
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + vett[i]);
        }
        
        public static void fill(int[] vett, int value){
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        
        public static void fillRandom(int[] vett, int min, int max){
                for(int i=0; i<vett.length; i++)
                        vett[i] = VetRand.newInt(min, max);
        }
        
        public static void substituteValue(int[] vett, int value, int newValue){
                for(int i=0; i<vett.length; i++)
                        if(vett[i]==value)
                                vett[i]=newValue;
        }
        public static void sobstituteValue(int[] vett, int[] value, int[] newValue){
                if(value.length != newValue.length)
                        return;
                
                // THE TWO ARRAYS WORK IN PARALLEL, value[0] -> newValue[0]
        }
        
        public static void sort(int[] vett){
                // SORTING CLASS TO IMPLEMENT
        }
        public static void sort(int[] vett, String algorithm){
                // SORTING CLASS TO IMPLEMENT (and a way to chose the algorithm)
        }
        
        public static int find(int[] vett, int value){
                // BINARY SEARCH TO IMPLEMENT
                return -1;
        }
        public static int[] findAll(int[] vett, int value){
                ArrayList<Integer> indexes = new ArrayList();
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                indexes.add(i);
                
                // Convert ArrayList<Integer> to int[]
                int[] result = new int[indexes.size()];
                for (int i = 0; i < indexes.size(); i++) {
                    result[i] = indexes.get(i);
                }

                return result;
        }
        
}

class VetRand{
        private static final Random r = new Random();
        
        /**
        * Returns a random {@code byte} value between {@code min} and {@code max}, inclusive.
        *
        * <p>The returned value {@code v} satisfies: {@code min <= v <= max}.</p>
        *
        * @param min the minimum value (inclusive)
        * @param max the maximum value (inclusive)
        * @return a random {@code byte} between {@code min} and {@code max}, inclusive
        * @throws IllegalArgumentException if {@code min > max}
        */
        public static byte newByte(byte min, byte max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return (byte) (r.nextInt(max - min + 1) + min);
        }
        /**
        * Returns a random {@code short} value between {@code min} and {@code max}, inclusive.
        *
        * <p>The returned value {@code v} satisfies: {@code min <= v <= max}.</p>
        *
        * @param min the minimum value (inclusive)
        * @param max the maximum value (inclusive)
        * @return a random {@code short} between {@code min} and {@code max}, inclusive
        * @throws IllegalArgumentException if {@code min > max}
        */
        public static short newShort(short min, short max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return (short) (r.nextInt(max - min + 1) + min);
        }
        /**
        * Returns a random {@code int} value between {@code min} and {@code max}, inclusive.
        *
        * <p>The returned value {@code v} satisfies: {@code min <= v <= max}.</p>
        *
        * @param min the minimum value (inclusive)
        * @param max the maximum value (inclusive)
        * @return a random {@code int} between {@code min} and {@code max}, inclusive
        * @throws IllegalArgumentException if {@code min > max}
        */
        public static int newInt(int min, int max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return r.nextInt((max-min) + 1) + min;
        }
        /**
        * Returns a random {@code long} value between {@code min} and {@code max}, inclusive.
        *
        * <p>The returned value {@code v} satisfies: {@code min <= v <= max}.</p>
        *
        * <p>Note: This method may overflow if {@code max - min + 1} exceeds {@code Long.MAX_VALUE}.</p>
        *
        * @param min the minimum value (inclusive)
        * @param max the maximum value (inclusive)
        * @return a random {@code long} between {@code min} and {@code max}, inclusive
        * @throws IllegalArgumentException if {@code min > max}
        */
        public static long newLong(long min, long max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return r.nextLong((max-min)+1) + min;
        }
        /**
        * Returns a random {@code float} value between {@code min} (inclusive) and {@code max} (exclusive).
        *
        * <p>The returned value {@code v} satisfies: {@code min <= v < max}.</p>
        *
        * @param min the minimum value (inclusive)
        * @param max the maximum value (exclusive)
        * @return a random {@code float} between {@code min} (inclusive) and {@code max} (exclusive)
        * @throws IllegalArgumentException if {@code min > max}
        */
        public static float newFloat(float min, float max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return r.nextFloat() * (max-min) + min;
        }
        /**
        * Returns a random {@code double} value between {@code min} (inclusive) and {@code max} (exclusive).
        *
        * <p>The returned value {@code v} satisfies: {@code min <= v < max}.</p>
        *
        * @param min the minimum value (inclusive)
        * @param max the maximum value (exclusive)
        * @return a random {@code double} between {@code min} (inclusive) and {@code max} (exclusive)
        * @throws IllegalArgumentException if {@code min > max}
        */
        public static double newDouble(double min, double max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return r.nextDouble() * (max-min) + min;
        }
        /**
        * Returns a random {@code char} value between {@code min} and {@code max}, inclusive.
        *
        * <p>The returned value {@code v} satisfies: {@code min <= v <= max}.</p>
        *
        * @param min the minimum value (inclusive)
        * @param max the maximum value (inclusive)
        * @return a random {@code char} between {@code min} and {@code max}, inclusive
        * @throws IllegalArgumentException if {@code min > max}
        */
        public static char newChar(char min, char max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return (char) (r.nextInt((max-min) + 1) + min);
        }
        /**
        * Returns a random {@code boolean} value.
        *
        * @return a random {@code boolean}, either {@code true} or {@code false}
        */
        public static boolean newBoolean(){
                return r.nextBoolean();
        }
}
