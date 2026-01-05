package CantoniLib;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import java.util.ArrayList;
import java.util.Random;

public class Vet {
        private static final Random r = new Random();
        private static final DecimalFormatSymbols usSymbols = DecimalFormatSymbols.getInstance(Locale.US);
        
        private static int randomIndex(int vettLength){
                int min = 0, max = vettLength-1;
                return r.nextInt((max-min) + 1) + min;
        }
        
        // MISSING PARAMETER CONTROLS IN SOME METHODS AND JAVADOCS
        
        // PRINT
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
                if (width < 0) width = 0;
                
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
                if (width < 0) width = 0;
                
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
                if (width < 0) width = 0;
                
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
                if (width < 0) width = 0;
                
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
                if (width < 0) width = 0;
                
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
                if (width < 0) width = 0;
                
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
                if (width < 0) width = 0;
                
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
                if (width < 0) width = 0;
                
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
                if (decimals < 0) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

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
                if (decimals < 0) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                System.out.print(df.format(vett[0]));
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + df.format(vett[i]));
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
                if (decimals < 0) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

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
                if (decimals < 0) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern,usSymbols);

                System.out.print(df.format(vett[0]));
                for(int i=1; i<vett.length; i++)
                        System.out.print(separation + df.format(vett[i]));
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
                if (width < 0) width = 0;
                
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
                if (width < 0) width = 0;
                
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
        
        // FILL
        public static void fill(byte[] vett, byte value){
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(short[] vett, short value){
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(int[] vett, int value){
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(long[] vett, long value){
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(float[] vett, float value){
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(double[] vett, double value){
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(char[] vett, char value){
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        public static void fill(boolean[] vett, boolean value){
                for(int i=0; i<vett.length; i++)
                        vett[i] = value;
        }
        
        public static void fillRandom(byte[] vett, byte min, byte max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
                for(int i=0; i<vett.length; i++)
                        vett[i] = (byte) (r.nextInt(max - min + 1) + min);
        }
        public static void fillRandom(short[] vett, short min, short max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
                for(int i=0; i<vett.length; i++)
                        vett[i] = (short) (r.nextInt(max - min + 1) + min);
        }
        public static void fillRandom(int[] vett, int min, int max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
                for(int i=0; i<vett.length; i++)
                        vett[i] = r.nextInt((max-min) + 1) + min;
        }
        public static void fillRandom(long[] vett, long min, long max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
                for(int i=0; i<vett.length; i++)
                        vett[i] = r.nextLong((max-min)+1) + min;
        }
        public static void fillRandom(float[] vett, float min, float max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
                for(int i=0; i<vett.length; i++)
                        vett[i] = r.nextFloat() * (max-min) + min;
        }
        public static void fillRandom(double[] vett, double min, double max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
                for(int i=0; i<vett.length; i++)
                        vett[i] = r.nextDouble() * (max-min) + min;
        }
        public static void fillRandom(char[] vett, char min, char max){
                if (max < min)
                        throw new IllegalArgumentException("max < min");
                
                for(int i=0; i<vett.length; i++)
                        vett[i] = (char) (r.nextInt((max-min) + 1) + min);
        }
        public static void fillRandom(boolean[] vett){
                for(int i=0; i<vett.length; i++)
                        vett[i] = r.nextBoolean();
        }
        
        // Letters fills
        
        // SORT
        public static void sort(byte[] vett) {
                int[] count = new int[256];

                for (byte b : vett) 
                        count[b & 0xFF]++;

                int i = 0;
                for (int v = 0; v < 256; v++) {
                        while (count[v]-- > 0)
                                vett[i++] = (byte) v;
                }
        }
        public static void sort(short[] vett) {
                int[] count = new int[65536];

                for (short s : vett) 
                        count[s & 0xFFFF]++;

                int i = 0;
                for (int v = 0; v < count.length; v++) {
                        while (count[v]-- > 0)
                                vett[i++] = (short) v;
                }
        }
        public static void sort(int[] vett) {
                if (vett == null || vett.length < 2) 
                        return;
                quickSort(vett, 0, vett.length - 1);
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
        public static void sort(long[] vett) {
                if (vett == null || vett.length < 2) 
                        return;
                quickSort(vett, 0, vett.length - 1);
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
        public static void sort(float[] vett) {
                if (vett == null || vett.length < 2) 
                        return;
                quickSort(vett, 0, vett.length - 1);
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
        public static void sort(double[] vett) {
                if (vett == null || vett.length < 2)
                        return;
                quickSort(vett, 0, vett.length - 1);
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
        public static void sort(char[] vett) {
                int[] count = new int[65536];

                for (char c : vett) 
                        count[c]++;

                int i = 0;
                for (int v = 0; v < count.length; v++) {
                        while (count[v]-- > 0)
                                vett[i++] = (char) v;
                }
        }
        public static void sort(boolean[] vett) {
                int falseCount = 0;
                for(boolean b : vett)
                        if(!b) 
                                falseCount++;

                for (int i = 0; i < vett.length; i++)
                        vett[i] = i >= falseCount;
        }
        
        // FIND
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
        
                        // SE NON TROVATO --> Ritorna il punto di inserimento che mantiene ordine ( punto di inserimento = -(ind+1) )
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
        
        // REPLACE
        public static void replace(byte[] vett, byte value, byte newValue){
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        public static void replace(short[] vett, short value, short newValue){
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        public static void replace(int[] vett, int value, int newValue){
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        public static void replace(long[] vett, long value, long newValue){
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        public static void replace(float[] vett, float value, float newValue){
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        public static void replace(double[] vett, double value, double newValue){
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        public static void replace(char[] vett, char value, char newValue){
                for(int i=0; i<vett.length; i++)
                        if(vett[i] == value)
                                vett[i] = newValue;
        }
        public static void replace(boolean[] vett, boolean value, boolean newValue){
                for(int i=0; i<vett.length; i++)
                        vett[i] = newValue;
        }
        
        public static void replaceMult(byte[] vett, byte[] values, byte[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
                for(int v=0; v<values.length; v++){
                        int[] ind = findAll(vett, values[v]);
                        for(int i : ind) vett[i] = newValues[v];
                }
        }
        public static void replaceMult(short[] vett, short[] values, short[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
                for(int v=0; v<values.length; v++){
                        int[] ind = findAll(vett, values[v]);
                        for(int i : ind) vett[i] = newValues[v];
                }
        }
        public static void replaceMult(int[] vett, int[] values, int[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
                for(int v=0; v<values.length; v++){
                        int[] ind = findAll(vett, values[v]);
                        for(int i : ind) vett[i] = newValues[v];
                }
        }
        public static void replaceMult(long[] vett, long[] values, long[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
                for(int v=0; v<values.length; v++){
                        int[] ind = findAll(vett, values[v]);
                        for(int i : ind) vett[i] = newValues[v];
                }
        }
        public static void replaceMult(float[] vett, float[] values, float[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
                for(int v=0; v<values.length; v++){
                        int[] ind = findAll(vett, values[v]);
                        for(int i : ind) vett[i] = newValues[v];
                }
        }
        public static void replaceMult(double[] vett, double[] values, double[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
                for(int v=0; v<values.length; v++){
                        int[] ind = findAll(vett, values[v]);
                        for(int i : ind) vett[i] = newValues[v];
                }
        }
        public static void replaceMult(char[] vett, char[] values, char[] newValues){
                if (values.length != newValues.length)
                        throw new IllegalArgumentException("values array length != newValues array length");
                
                for(int v=0; v<values.length; v++){
                        int[] ind = findAll(vett, values[v]);
                        for(int i : ind) vett[i] = newValues[v];
                }
        }
        
        // SHUFFLE
        public static void shuffle(byte[] vett){
                for(int i=0; i<20; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        byte t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(short[] vett){
                for(int i=0; i<20; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        short t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(int[] vett){
                for(int i=0; i<20; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        int t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(long[] vett){
                for(int i=0; i<20; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        long t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(float[] vett){
                for(int i=0; i<20; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        float t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(double[] vett){
                for(int i=0; i<20; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        double t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(char[] vett){
                for(int i=0; i<20; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        char t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(boolean[] vett){
                for(int i=0; i<20; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        boolean t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        
        public static void shuffle(byte[] vett, int iterations){
                if(iterations<0) iterations = 1;
                
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        byte t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(short[] vett, int iterations){
                if(iterations<0) iterations = 1;
                
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        short t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(int[] vett, int iterations){
                if(iterations<0) iterations = 1;
                
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        int t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(long[] vett, int iterations){
                if(iterations<0) iterations = 1;
                
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        long t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(float[] vett, int iterations){
                if(iterations<0) iterations = 1;
                
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        float t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(double[] vett, int iterations){
                if(iterations<0) iterations = 1;
                
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        double t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(char[] vett, int iterations){
                if(iterations<0) iterations = 1;
                
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        char t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        public static void shuffle(boolean[] vett, int iterations){
                if(iterations<0) iterations = 1;
                
                for(int i=0; i<iterations; i++){
                        int ind1 = randomIndex(vett.length), ind2 = randomIndex(vett.length);
                        
                        boolean t = vett[ind1];
                        vett[ind1] = vett[ind2];
                        vett[ind2] = t;
                }
        }
        
        // PICK
        public static byte pickRandom(byte[] vett){
                return vett[randomIndex(vett.length)];
        }
        public static short pickRandom(short[] vett){
                return vett[randomIndex(vett.length)];
        }
        public static int pickRandom(int[] vett){
                return vett[randomIndex(vett.length)];
        }
        public static long pickRandom(long[] vett){
                return vett[randomIndex(vett.length)];
        }
        public static float pickRandom(float[] vett){
                return vett[randomIndex(vett.length)];
        }
        public static double pickRandom(double[] vett){
                return vett[randomIndex(vett.length)];
        }
        public static char pickRandom(char[] vett){
                return vett[randomIndex(vett.length)];
        }
        public static boolean pickRandom(boolean[] vett){
                return vett[randomIndex(vett.length)];
        }
}