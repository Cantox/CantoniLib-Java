package CantoniLib;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;



public class Arr {
        private static final Random r = new Random();
        private static final DecimalFormatSymbols usDecimalFormatSymbols = DecimalFormatSymbols.getInstance(Locale.US);
        
        private Arr() {}
        
        private static int randomIndex(int vettLength){
                if(vettLength < 1) vettLength = 1;
                int min = 0, max = vettLength-1;
                return r.nextInt((max-min) + 1) + min;
        }
        
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
        public static void print(byte[] vett, int width){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                
                String s = Byte.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Byte.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + s);
                }
        }
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
                
                String s = Byte.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Byte.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + s);
                }
        }
        
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
        public static void print(short[] vett, int width){
                if (vett == null) {
                        System.out.print("null");
                        return;
                }
                if (vett.length == 0) {
                        System.out.print("[]");
                        return;
                }
                
                String s = Short.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Short.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(", " + " ".repeat(padding) + s);
                }
        }
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
                
                String s = Short.toString(vett[0]);
                System.out.print(" ".repeat(Math.max(0, width - s.length())) + s);
                
                for(int i=1; i<vett.length; i++){
                        s = Short.toString(vett[i]);
                        int padding = Math.max(0, width - s.length());
                        System.out.print(separation + " ".repeat(padding) + s);
                }
        }
        
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
        
        public static <T> void print(T[] vett){
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
        public static <T> void print(T[] vett, String separation){
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
        
        
        public static void fill(byte[] vett, byte value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(short[] vett, short value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(int[] vett, int value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(long[] vett, long value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(float[] vett, float value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(double[] vett, double value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(char[] vett, char value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(boolean[] vett, boolean value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(String[] vett, String value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static <T> void fill(T[] vett, T value){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        
        public static void fillRandom(byte[] vett, byte min, byte max){
                if (vett == null) throw new NullPointerException("vett is null");
                if (max < min) throw new IllegalArgumentException("max < min");
                for(int i=0; i<vett.length; i++)
                        vett[i] = (byte) (r.nextInt(max - min + 1) + min);
        }
        public static void fillRandom(short[] vett, short min, short max){
                if (vett == null) throw new NullPointerException("vett is null");
                if (max < min) throw new IllegalArgumentException("max < min");
                for(int i=0; i<vett.length; i++)
                        vett[i] = (short) (r.nextInt(max - min + 1) + min);
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
        public static void fillRandom(char[] vett, char min, char max){
                if (vett == null) throw new NullPointerException("vett is null");
                if (max < min) throw new IllegalArgumentException("max < min");
                for(int i=0; i<vett.length; i++)
                        vett[i] = (char) (r.nextInt((max-min) + 1) + min);
        }
        public static void fillRandom(boolean[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                for(int i=0; i<vett.length; i++)
                        vett[i] = r.nextBoolean();
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
        
        
        public static byte[] copyOf(byte[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                return vett.clone();
        }
        public static short[] copyOf(short[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                return vett.clone();
        }
        public static int[] copyOf(int[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                return vett.clone();
        }
        public static long[] copyOf(long[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                return vett.clone();
        }
        public static float[] copyOf(float[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                return vett.clone();
        }
        public static double[] copyOf(double[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                return vett.clone();
        }
        public static char[] copyOf(char[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                return vett.clone();
        }
        public static boolean[] copyOf(boolean[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                return vett.clone();
        }
        public static String[] copyOf(String[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                return vett.clone();
        }
        public static <T> T[] copyOf(T[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                return vett.clone();
        }
        
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
        public static <T> T[] copyOf(T[] vett, int length){
                if (vett == null) throw new NullPointerException("vett is null");
                if (length < 0) throw new IllegalArgumentException("negative length");
                
                T[] vetCopy = (T[]) java.lang.reflect.Array.newInstance(vett.getClass(), length);
                
                for(int i=0; i<length; i++){
                        if(i<vett.length)
                                vetCopy[i] = vett[i];
                        else
                                vetCopy[i] = null;
                }
                return vetCopy;
        }
        
        
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
        
        public static int[] sort(int[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                int[] vetCopy = copyOf(vett);
                if(vett.length < 47)
                        insertionSort(vetCopy);
                else
                        quickSort(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSort(int[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        int key = arr[i];
                        int j = i - 1;
                        
                        while (j >= 0 && arr[j] > key) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static long[] sort(long[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                long[] vetCopy = copyOf(vett);
                if(vett.length < 47)
                        insertionSort(vetCopy);
                else
                        quickSort(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSort(long[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        long key = arr[i];
                        int j = i - 1;

                        while (j >= 0 && arr[j] > key) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static float[] sort(float[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                float[] vetCopy = copyOf(vett);
                if(vett.length < 47)
                        insertionSort(vetCopy);
                else
                        quickSort(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSort(float[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        float key = arr[i];
                        int j = i - 1;

                        while (j >= 0 && arr[j] > key) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static double[] sort(double[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                double[] vetCopy = copyOf(vett);
                if(vett.length < 47)
                        insertionSort(vetCopy);
                else
                        quickSort(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSort(double[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        double key = arr[i];
                        int j = i - 1;

                        while (j >= 0 && arr[j] > key) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static String[] sort(String[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (vett.length < 2) return copyOf(vett);
                String[] vetCopy = copyOf(vett);
                for(int i=0; i<vetCopy.length; i++)
                        if(vetCopy[i] == null) vetCopy[i] = "";
                if(vett.length < 47)
                        insertionSort(vetCopy);
                else
                        quickSort(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSort(String[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        String key = arr[i];
                        int j = i - 1;

                        while (j >= 0 && arr[j].compareTo(key) > 0) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static String[] sortIgnoreCase(String[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (vett.length < 2) return copyOf(vett);
                String[] vetCopy = copyOf(vett);
                for(int i=0; i<vetCopy.length; i++)
                        if(vetCopy[i] == null) vetCopy[i] = "";
                if(vett.length < 47)
                        insertionSortIgnoreCase(vetCopy);
                else
                        quickSortIgnoreCase(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSortIgnoreCase(String[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        String key = arr[i];
                        int j = i - 1;

                        while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static <T extends Comparable<T>> T[] sort(T[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (vett.length < 2) return vett.clone();

                T[] copy = vett.clone();

                if (vett.length < 47)
                    insertionSort(copy);
                else
                    quickSort(copy, 0, copy.length - 1);

                return copy;
        }
        private static <T extends Comparable<T>> void insertionSort(T[] vett) {
                for (int i = 1; i < vett.length; i++) {
                        T key = vett[i];
                        int j = i - 1;
                        while (j >= 0 && vett[j].compareTo(key) > 0) {
                                vett[j + 1] = vett[j];
                                j--;
                        }
                        vett[j + 1] = key;
                }
        }
        private static <T extends Comparable<T>> void quickSort(T[] vett, int left, int right) {
                if (left >= right) return;
                
                if (vett[left].compareTo(vett[right]) > 0) {
                        T tmp = vett[left]; vett[left] = vett[right]; vett[right] = tmp;
                }

                T p = vett[left], q = vett[right];
                int l = left + 1, g = right - 1, k = l;

                while (k <= g) {
                        if (vett[k].compareTo(p) < 0) {
                                T tmp = vett[k]; vett[k] = vett[l]; vett[l] = tmp;
                                l++;
                        } else if (vett[k].compareTo(q) > 0) {
                                while (vett[g].compareTo(q) > 0 && k < g) 
                                        g--;
                                T tmp = vett[k]; vett[k] = vett[g]; vett[g] = tmp; g--;
                                if (vett[k].compareTo(p) < 0)
                                        tmp = vett[k]; vett[k] = vett[l]; vett[l] = tmp; l++;
                        }
                        k++;
                }

                l--; 
                g++;
                vett[left] = vett[l]; 
                vett[l] = p;
                vett[right] = vett[g]; 
                vett[g] = q;

                quickSort(vett, left, l - 1);
                quickSort(vett, l + 1, g - 1);
                quickSort(vett, g + 1, right);
        }
        
        /**
        *EXAMPLE USAGE
        *class Person {
        *        String name;
        *        int age;
        *        Person(String n, int a) { name = n; age = a; }
        *        public String toString() { return name + "(" + age + ")"; }
        *}
        *
        *Person[] people = {
        *        new Person("Alice", 30),
        *        new Person("Bob", 25),
        *        new Person("Charlie", 35)
        *};
        *       
         * @param <T>
         * @param vett The array to sort
         * @param comparator The comparator for the sort
         * @return A sorted copy
        */
        public static <T> T[] sort(T[] vett, Comparator<T> comparator) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (vett.length < 2) return vett.clone();
                
                T[] copy = vett.clone();
                
                if (vett.length < 47)
                        insertionSort(copy, comparator);
                else
                        quickSort(copy, 0, copy.length - 1, comparator);
                return copy;
        }
        private static <T> void insertionSort(T[] vett, Comparator<T> comp) {
                for (int i = 1; i < vett.length; i++) {
                        T key = vett[i];
                        int j = i - 1;
                        while (j >= 0 && comp.compare(vett[j], key) > 0) {
                                vett[j + 1] = vett[j];
                                j--;
                        }
                        vett[j + 1] = key;
                }
        }
        private static <T> void quickSort(T[] vett, int left, int right, Comparator<T> comp) {
                if (left >= right) return;

                if (comp.compare(vett[left], vett[right]) > 0) {
                        T tmp = vett[left]; 
                        vett[left] = vett[right]; 
                        vett[right] = tmp;
                }

                T p = vett[left], q = vett[right];
                int l = left + 1, g = right - 1, k = l;

                while (k <= g) {
                        if (comp.compare(vett[k], p) < 0) {
                                T tmp = vett[k];
                                vett[k] = vett[l];
                                vett[l] = tmp;
                                l++;
                        } else if (comp.compare(vett[k], q) > 0) {
                                while (comp.compare(vett[g], q) > 0 && k < g) g--;
                                        T tmp = vett[k]; 
                                        vett[k] = vett[g]; 
                                        vett[g] = tmp; 
                                        g--;
                                if (comp.compare(vett[k], p) < 0) {
                                        T tmp2 = vett[k]; 
                                        vett[k] = vett[l]; 
                                        vett[l] = tmp2; 
                                        l++;
                                }
                        }
                        k++;
                    }

                l--; 
                g++;
                vett[left] = vett[l]; 
                vett[l] = p;
                vett[right] = vett[g]; 
                vett[g] = q;

                quickSort(vett, left, l - 1, comp);
                quickSort(vett, l + 1, g - 1, comp);
                quickSort(vett, g + 1, right, comp);
        }
        
        
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
        
        public static int[] sortDesc(int[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                int[] vetCopy = copyOf(vett);
                if(vett.length < 47)
                        insertionSortDesc(vetCopy);
                else
                        quickSortDesc(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSortDesc(int[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        int key = arr[i];
                        int j = i - 1;

                        while (j >= 0 && arr[j] < key) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static long[] sortDesc(long[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                long[] vetCopy = copyOf(vett);
                if(vett.length < 47)
                        insertionSortDesc(vetCopy);
                else
                        quickSortDesc(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSortDesc(long[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        long key = arr[i];
                        int j = i - 1;

                        while (j >= 0 && arr[j] < key) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static float[] sortDesc(float[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                float[] vetCopy = copyOf(vett);
                if(vett.length < 47)
                        insertionSortDesc(vetCopy);
                else
                        quickSortDesc(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSortDesc(float[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        float key = arr[i];
                        int j = i - 1;

                        while (j >= 0 && arr[j] < key) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static double[] sortDesc(double[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length < 2) return copyOf(vett);
                double[] vetCopy = copyOf(vett);
                if(vett.length < 47)
                        insertionSortDesc(vetCopy);
                else
                        quickSortDesc(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSortDesc(double[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        double key = arr[i];
                        int j = i - 1;

                        while (j >= 0 && arr[j] < key) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static String[] sortDesc(String[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (vett.length < 2) return copyOf(vett);
                String[] vetCopy = copyOf(vett);
                for(int i=0; i<vetCopy.length; i++)
                        if(vetCopy[i] == null) vetCopy[i] = "";
                if(vett.length < 47)
                        insertionSortDesc(vetCopy);
                else
                        quickSortDesc(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSortDesc(String[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        String key = arr[i];
                        int j = i - 1;

                        while (j >= 0 && arr[j].compareTo(key) < 0) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static String[] sortDescIgnoreCase(String[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (vett.length < 2) return copyOf(vett);
                String[] vetCopy = copyOf(vett);
                for(int i=0; i<vetCopy.length; i++)
                        if(vetCopy[i] == null) vetCopy[i] = "";
                if(vett.length < 47)
                        insertionSortIgnoreCaseDesc(vetCopy);
                else
                        quickSortDescIgnoreCase(vetCopy, 0, vetCopy.length - 1);
                return vetCopy;
        }
        private static void insertionSortIgnoreCaseDesc(String[] arr) {
                int n = arr.length;

                for (int i = 1; i < n; i++) {
                        String key = arr[i];
                        int j = i - 1;

                        while (j >= 0 && arr[j].compareToIgnoreCase(key) < 0) {
                                arr[j + 1] = arr[j];
                                j--;
                        }

                        arr[j + 1] = key;
                }
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
        
        public static <T extends Comparable<T>> T[] sortDesc(T[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (vett.length < 2) return vett.clone();

                T[] vettCopy = vett.clone();

                if (vett.length < 47)
                        insertionSortDesc(vettCopy);
                else
                        quickSortDesc(vettCopy, 0, vettCopy.length - 1);

                return vettCopy;
        }
        private static <T extends Comparable<T>> void insertionSortDesc(T[] vett) {
                for (int i = 1; i < vett.length; i++) {
                        T key = vett[i];
                        int j = i - 1;

                        while (j >= 0 && vett[j].compareTo(key) < 0) {
                                    vett[j + 1] = vett[j];
                                    j--;
                        }

                        vett[j + 1] = key;
                }
        }
        private static <T extends Comparable<T>> void quickSortDesc(T[] vett, int left, int right) {
                if (left >= right) return;

                if (vett[left].compareTo(vett[right]) < 0) {
                       T tmp = vett[left]; vett[left] = vett[right]; vett[right] = tmp;
                }

                T p = vett[left], q = vett[right];
                int l = left + 1, g = right - 1, k = l;

                while (k <= g) {
                        if (vett[k].compareTo(p) > 0) {
                                T tmp = vett[k]; vett[k] = vett[l]; vett[l] = tmp;
                                l++;
                        } else if (vett[k].compareTo(q) < 0) {
                                while (vett[g].compareTo(q) < 0 && k < g) 
                                        g--;
                                T tmp = vett[k]; vett[k] = vett[g]; vett[g] = tmp; g--;
                                if (vett[k].compareTo(p) > 0) 
                                        tmp = vett[k]; vett[k] = vett[l]; vett[l] = tmp; l++;
                        }
                        k++;
                }

                l--; 
                g++;
                vett[left] = vett[l]; 
                vett[l] = p;
                vett[right] = vett[g]; 
                vett[g] = q;

                quickSortDesc(vett, left, l - 1);
                quickSortDesc(vett, l + 1, g - 1);
                quickSortDesc(vett, g + 1, right);
        }
        
        
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
        public static <T> int find(T[] vett, T value){
                if (vett == null) throw new NullPointerException("vett is null");
                
                for(int i=0; i<vett.length; i++)
                        if(vett[i].equals(value))
                                return i;
                
                return -1;
        }
        public static <T extends Comparable<T>> int find(T[] vett, T value, boolean sortedArray) {
                if (vett == null) throw new NullPointerException("vett is null");

                if (sortedArray) {
                    int ind = binarySearch(vett, value);
                    if(ind < 0)
                                return -1;
                        else
                                return ind;
                }
                
                for (int i = 0; i < vett.length; i++)
                    if (vett[i].equals(value))
                        return i;

                return -1;
        }
        
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
        public static <T extends Comparable<T>> int binarySearch(T[] vett, T value) {
                if (vett == null) throw new NullPointerException("vett is null");

                int low = 0;
                int high = vett.length - 1;

                while (low <= high) {
                        int mid = low + (high - low) / 2;
                        T midVal = vett[mid];

                        int cmp = midVal.compareTo(value);

                        if (cmp < 0)
                            low = mid + 1;
                        else if (cmp > 0)
                            high = mid - 1;
                        else
                            return mid;
                }

                return -(low + 1);
        }
        
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
        public static <T> int[] findAll(T[] vett, T value){
                if (vett == null) throw new NullPointerException("vett is null");
                ArrayList<Integer> indexes = new ArrayList();
                
                for(int i=0; i<vett.length; i++)
                        if(vett[i] .equals(value))
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
        
        
        public static void replace(byte[] vett, byte value, byte newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if(value == newValue) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        public static void replace(short[] vett, short value, short newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if(value == newValue) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
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
        public static <T> void replace(T[] vett, T value, T newValue){
                if (vett == null) throw new NullPointerException("vett is null");
                if(value .equals(newValue)) return;
                for(int i=0; i<vett.length; i++)
                        if(vett[i].equals(value))
                                vett[i] = newValue;
        }
        
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
        public static <T> void replaceMult(T[] vett, T[] values, T[] newValues){
                if (vett == null) throw new NullPointerException("vett is null");
                if (values == null) throw new NullPointerException("values array is null");
                if (newValues == null) throw new NullPointerException("newValues array is null");
                if (values.length != newValues.length) throw new IllegalArgumentException("values array length != newValues array length");
                
                for(int v=0; v<values.length; v++){
                        int[] ind = findAll(vett, values[v]);
                        for(int i : ind) vett[i] = newValues[v];
                }
        }
        
        
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
        public static <T> T[] shuffle(T[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                T[] vetCopy = vett.clone();
                for(int i=0; i<30; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        T t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        
        
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
        public static <T> T[] shuffle(T[] vett, int iterations){
                if (vett == null) throw new NullPointerException("vett is null");
                T[] vetCopy = vett.clone();
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vetCopy.length), ind2 = randomIndex(vetCopy.length);
                        
                        T t = vetCopy[ind1];
                        vetCopy[ind1] = vetCopy[ind2];
                        vetCopy[ind2] = t;
                }
                return vetCopy;
        }
        
        
        public static byte pickRandom(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
        }
        public static short pickRandom(short[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
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
        public static <T> T pickRandom(T[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                return vett[randomIndex(vett.length)];
        }
        
        
        public static byte[] flip(byte[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                byte[] vetCopy = new byte[vett.length];
                for (int i = 0; i < vett.length; i++)
                    vetCopy[vetCopy.length - 1 - i] = vett[i];
                return vetCopy;
        }
        public static short[] flip(short[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
            short[] vetCopy = new short[vett.length];
            for (int i = 0; i < vett.length; i++)
                vetCopy[vetCopy.length - 1 - i] = vett[i];
            return vetCopy;
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
        public static <T> T[] flip(T[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                T[] vetCopy = copyOf(vett);
                for(int i=0; i<vett.length; i++)
                        vetCopy[vetCopy.length-1 - i] = vett[i];
                return vetCopy;
        }
        
        
        public static byte[] shiftR(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                byte[] vetCopy = copyOf(vett);
                byte tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
                return vetCopy;
        }
        public static short[] shiftR(short[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                short[] vetCopy = copyOf(vett);
                short tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
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
        public static <T> T[] shiftR(T[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                T[] vetCopy = copyOf(vett);
                T tmp = vetCopy[vetCopy.length-1];
                for(int i=vetCopy.length-1; i>0; i--)
                        vetCopy[i] = vetCopy[i-1];
                vetCopy[0] = tmp;
                return vetCopy;
        }
        
        public static byte[] shiftL(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                byte[] vetCopy = copyOf(vett);
                byte tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
                return vetCopy;
        }
        public static short[] shiftL(short[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                short[] vetCopy = copyOf(vett);
                short tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
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
        public static <T> T[] shiftL(T[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                T[] vetCopy = copyOf(vett);
                T tmp = vetCopy[0];
                for(int i=0; i<vetCopy.length-1; i++)
                        vetCopy[i] = vetCopy[i+1];
                vetCopy[vetCopy.length-1] = tmp;
                return vetCopy;
        }
        
        
        public static byte getMin(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
                if(vett.length == 1) return vett[0];
                byte[] vettCopy = copyOf(vett);
                
                for(int i=0; i<vettCopy.length-1; i++)
                      if(vettCopy[i] < vettCopy[i+1]){
                            byte temp = vettCopy[i];
                            vettCopy[i] = vettCopy[i+1];
                            vettCopy[i+1] = temp;
                      }
                return vettCopy[vettCopy.length-1];
        }
        public static short getMin(short[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
                if(vett.length == 1) return vett[0];
                short[] vettCopy = copyOf(vett);
                
                for(int i=0; i<vettCopy.length-1; i++)
                      if(vettCopy[i] < vettCopy[i+1]){
                            short temp = vettCopy[i];
                            vettCopy[i] = vettCopy[i+1];
                            vettCopy[i+1] = temp;
                      }
                return vettCopy[vettCopy.length-1];
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
        public static <T extends Comparable<T>> T getMin(T[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
                if(vett.length == 1) return vett[0];
                T[] vettCopy = copyOf(vett);
                
                for(int i=0; i<vettCopy.length-1; i++)
                      if(vettCopy[i].compareTo(vettCopy[i+1]) < 0){
                            T temp = vettCopy[i];
                            vettCopy[i] = vettCopy[i+1];
                            vettCopy[i+1] = temp;
                      }
                return vettCopy[vettCopy.length-1];
        }
        public static <T> T getMin(T[] vett, Comparator<T> comparator) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (comparator == null) throw new NullPointerException("comparator is null");
                if (vett.length == 0) throw new IllegalArgumentException("vett is empty");
                
                if(vett.length == 1) return vett[0];
                T[] vettCopy = copyOf(vett);
                
                for(int i=0; i<vettCopy.length-1; i++)
                      if(comparator.compare(vettCopy[i],vettCopy[i+1]) < 0){
                            T temp = vettCopy[i];
                            vettCopy[i] = vettCopy[i+1];
                            vettCopy[i+1] = temp;
                      }
                return vettCopy[vettCopy.length-1];
        }
        
        public static byte getMax(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
                if(vett.length == 1) return vett[0];
                byte[] vettCopy = copyOf(vett);
                
                for(int i=0; i<vettCopy.length-1; i++)
                      if(vettCopy[i] > vettCopy[i+1]){
                            byte temp = vettCopy[i];
                            vettCopy[i] = vettCopy[i+1];
                            vettCopy[i+1] = temp;
                      }
                return vettCopy[vettCopy.length-1];
        }
        public static short getMax(short[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
                if(vett.length == 1) return vett[0];
                short[] vettCopy = copyOf(vett);
                
                for(int i=0; i<vettCopy.length-1; i++)
                      if(vettCopy[i] > vettCopy[i+1]){
                            short temp = vettCopy[i];
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
        public static <T extends Comparable<T>> T getMax(T[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
                if(vett.length == 1) return vett[0];
                T[] vettCopy = copyOf(vett);
                
                for(int i=0; i<vettCopy.length-1; i++)
                      if(vettCopy[i].compareTo(vettCopy[i+1]) > 0){
                            T temp = vettCopy[i];
                            vettCopy[i] = vettCopy[i+1];
                            vettCopy[i+1] = temp;
                      }
                return vettCopy[vettCopy.length-1];
        }
        public static <T> T getMax(T[] vett, Comparator<T> comparator) {
                if (vett == null) throw new NullPointerException("vett is null");
                if (comparator == null) throw new NullPointerException("comparator is null");
                if (vett.length == 0) throw new IllegalArgumentException("vett is empty");
                
                if(vett.length == 1) return vett[0];
                T[] vettCopy = copyOf(vett);
                
                for(int i=0; i<vettCopy.length-1; i++)
                      if(comparator.compare(vettCopy[i],vettCopy[i+1]) > 0){
                            T temp = vettCopy[i];
                            vettCopy[i] = vettCopy[i+1];
                            vettCopy[i+1] = temp;
                      }
                return vettCopy[vettCopy.length-1];
        }
        
        
        public static byte getMedian(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
                return sort(vett)[vett.length / 2];
        }
        public static short getMedian(short[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
                return sort(vett)[vett.length / 2];
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
        public static <T extends Comparable<T>> T getMedian(T[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
                return sort(vett)[vett.length / 2];
        }
        public static <T> T getMedian(T[] vett, Comparator<T> comparator){
                if (vett == null) throw new NullPointerException("vett is null");
                if(vett.length == 0) throw new IllegalArgumentException("vett is empty");
                return sort(vett,comparator)[vett.length / 2];
        }
        
        public static byte getAvarage(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                int tot = 0;
                for(byte n : vett)
                        tot+=n;
                return (byte)((double) tot / vett.length);
        }
        public static double getAvarageDouble(byte[] vett){
                if (vett == null) throw new NullPointerException("vett is null");
                int tot = 0;
                for(byte n : vett)
                        tot+=n;
                return (double) tot / vett.length;
        }
        public static short getAvarage(short[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                int tot = 0;
                for (short n : vett)
                        tot += n;
                return (short) ((double) tot / vett.length);
        }
        public static double getAvarageDouble(short[] vett) {
                if (vett == null) throw new NullPointerException("vett is null");
                int tot = 0;
                for (short n : vett)
                        tot += n;
                return (double) tot / vett.length;
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
                return Arr.getAvarage(vett);
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
        
        public static byte getTot(byte[] vett){
                byte tot = 0;
                for(byte n : vett)
                        tot += n;
                return tot;
        }
        public static short getTot(short[] vett){
                short tot = 0;
                for(short n : vett)
                        tot += n;
                return tot;
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