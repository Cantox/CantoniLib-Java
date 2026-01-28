/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tests;

import CantoniLib.Arr;

/**
 *
 * @author User
 */
public class ArrTests {
        private static byte[] bArr = new byte[5];
        private static short[] sArr = new short[5];
        private static int[] iArr = new int[5];
        private static long[] lArr = new long[5];
        private static float[] fArr = new float[5];
        private static double[] dArr = new double[5];
        private static char[] cArr = new char[5];
        private static boolean[] boolArr = new boolean[5];
        private static String[] stringArr = new String[5];
        
        public static void printTest(){
                System.out.println("--- PRINT ARRAYS ---");
                
                int[] v = null;
                System.out.print("NULL: "); Arr.print(v);
                v = new int[0];
                System.out.print("\nEMPTY: "); Arr.print(v);
                System.out.println("\n");
                
                System.out.print("Byte: "); Arr.print(bArr);
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr);
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr);
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr);
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr);
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr);
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr);
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr);
                System.out.println("\n");
                
                System.out.print("Byte (Width: 4, Separation: \" || \"): "); Arr.print(bArr,4," || ");
                System.out.println();
                System.out.print("Short (Width: 5, Separation: \"\\n\"): "); Arr.print(sArr, 5,"\n");
                System.out.println();
                System.out.print("Int (Width: 8, Separation: \" -- \"): "); Arr.print(iArr,8," -- ");
                System.out.println();
                System.out.print("Long (Width: 10, Separation: \" / \"): "); Arr.print(lArr,10," / ");
                System.out.println();
                System.out.print("Float (Decimals: 3, Width: 5, Separation: \",\\n\"): "); Arr.print(fArr,3,5,",\n");
                System.out.println();
                System.out.print("Double (Decimals: 9, Separation: \"__\\n\"): "); Arr.print(dArr,9,"__\n");
                System.out.println();
                System.out.print("Char (Width: 2, Separation: \"; \"): "); Arr.print(cArr,2,"; ");
                System.out.println();
                System.out.print("Boolean (Separation: \"\\t\"): "); Arr.print(boolArr,"\t");
                System.out.println();
                System.out.print("String (Separation: \" | \"): "); Arr.print(stringArr," | ");
                System.out.println("\n");
        }
        
        public static void fill(){
                System.out.println("--- FILL ARRAYS ---");
                Arr.fill(bArr, (byte)1);
                Arr.fill(sArr, (short)2);
                Arr.fill(iArr, 5);
                Arr.fill(lArr, 10);
                Arr.fill(fArr, 3.4f);
                Arr.fill(dArr, 7.5);
                Arr.fill(cArr, 'N');
                Arr.fill(boolArr, true);
                Arr.fill(stringArr, "Hello");
                
                System.out.print("Byte (1): "); Arr.print(bArr);
                System.out.println();
                System.out.print("Short (2): "); Arr.print(sArr);
                System.out.println();
                System.out.print("Int (5): "); Arr.print(iArr);
                System.out.println();
                System.out.print("Long (10): "); Arr.print(lArr);
                System.out.println();
                System.out.print("Float (3.4f): "); Arr.print(fArr);
                System.out.println();
                System.out.print("Double (7.5): "); Arr.print(dArr);
                System.out.println();
                System.out.print("Char ('N'): "); Arr.print(cArr);
                System.out.println();
                System.out.print("Boolean (true): "); Arr.print(boolArr);
                System.out.println();
                System.out.print("String (\"Hello\"): "); Arr.print(stringArr);
                System.out.println("\n");
        }
        
        public static void charFill(){
                System.out.println("--- CHAR FILL ARRAYS ---");
                char[] c = new char[20];
                Arr.fillLetters(c);
                System.out.print("Fill letters: "); Arr.print(c);
                System.out.println();
                c = Arr.sort(c);
                System.out.print("Fill letters (sorted): "); Arr.print(c);
                System.out.println();
                
                Arr.fillLetters(c,true);
                System.out.print("Fill letters (upper case): "); Arr.print(c);
                System.out.println();
                c = Arr.sort(c);
                System.out.print("Fill letters (upper case) (sorted): "); Arr.print(c);
                System.out.println();
                
                Arr.fillLetters(c, false);
                System.out.print("Fill letters (lower case): "); Arr.print(c);
                System.out.println();
                c = Arr.sort(c);
                System.out.print("Fill letters (lower case) (sorted): "); Arr.print(c);
                System.out.println();
                
                Arr.fillNumbers(c);
                System.out.print("Fill numbers: "); Arr.print(c);
                System.out.println();
                c = Arr.sort(c);
                System.out.print("Fill numbers (sorted): "); Arr.print(c);
                System.out.println();
                
                Arr.fillAlphanumerical(c);
                System.out.print("Fill alphanumerical: "); Arr.print(c);
                System.out.println();
                c = Arr.sort(c);
                System.out.print("Fill alphanumerical (sorted): "); Arr.print(c);
                System.out.println();
                
                Arr.fillAlphanumerical(c,true);
                System.out.print("Fill alphanumerical (upper case): "); Arr.print(c);
                System.out.println();
                c = Arr.sort(c);
                System.out.print("Fill alphanumerical (upper case) (sorted): "); Arr.print(c);
                System.out.println();
                
                Arr.fillAlphanumerical(c,false);
                System.out.print("Fill alphanumerical (lower case): "); Arr.print(c);
                System.out.println();
                c = Arr.sort(c);
                System.out.print("Fill alphanumerical (lower case) (sorted): "); Arr.print(c);
                System.out.println("\n");
        }
        
        public static void randFill(){
                System.out.println("--- RANDOM FILL ARRAYS ---");
                Arr.fillRandom(bArr, (byte)0, (byte)3);
                Arr.fillRandom(sArr, (short)2,  (short)7);
                Arr.fillRandom(iArr, 5,10);
                Arr.fillRandom(lArr, 10,20);
                Arr.fillRandom(fArr, 3.4f,5.76f);
                Arr.fillRandom(dArr, 7.5,10.345);
                Arr.fillRandom(cArr, 'N','s');
                Arr.fillRandom(boolArr);
                
                System.out.print("Byte (0 - 3): "); Arr.print(bArr);
                System.out.println();
                System.out.print("Short (2 - 7): "); Arr.print(sArr);
                System.out.println();
                System.out.print("Int (5 - 10): "); Arr.print(iArr);
                System.out.println();
                System.out.print("Long (10 - 20): "); Arr.print(lArr);
                System.out.println();
                System.out.print("Float (3.4f - 5.76f): "); Arr.print(fArr);
                System.out.println();
                System.out.print("Double (7.5 - 10.345): "); Arr.print(dArr);
                System.out.println();
                System.out.print("Char ('N' - 's'): "); Arr.print(cArr);
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.println("\n");
        }
        
        public static void stringFill(){
                System.out.println("--- STRING FILL ARRAYS (Array length = 5, Strings length = 5) ---");
                String[] s = new String[5]; // String array
                int l = 5; // Length of the strings in the array
                Arr.fillLetters(s,l);
                System.out.print("Fill letters: "); Arr.print(s);
                System.out.println();
                s = Arr.sort(s);
                System.out.print("Fill letters (sorted): "); Arr.print(s);
                System.out.println();
                
                Arr.fillLetters(s,l,true);
                System.out.print("Fill letters (upper case): "); Arr.print(s);
                System.out.println();
                s = Arr.sort(s);
                System.out.print("Fill letters (upper case) (sorted): "); Arr.print(s);
                System.out.println();
                
                Arr.fillLetters(s, l, false);
                System.out.print("Fill letters (lower case): "); Arr.print(s);
                System.out.println();
                s = Arr.sort(s);
                System.out.print("Fill letters (lower case) (sorted): "); Arr.print(s);
                System.out.println();
                
                Arr.fillNumbers(s,l);
                System.out.print("Fill numbers: "); Arr.print(s);
                System.out.println();
               s = Arr.sort(s);
                System.out.print("Fill numbers (sorted): "); Arr.print(s);
                System.out.println();
                
                Arr.fillAlphanumerical(s,l);
                System.out.print("Fill alphanumerical: "); Arr.print(s);
                System.out.println();
                s = Arr.sort(s);
                System.out.print("Fill alphanumerical (sorted): "); Arr.print(s);
                System.out.println();
                
                Arr.fillAlphanumerical(s,l,true);
                System.out.print("Fill alphanumerical (upper case): "); Arr.print(s);
                System.out.println();
                s = Arr.sort(s);
                System.out.print("Fill alphanumerical (upper case) (sorted): "); Arr.print(s);
                System.out.println();
                
                Arr.fillAlphanumerical(s,l,false);
                System.out.print("Fill alphanumerical (lower case): "); Arr.print(s);
                System.out.println();
                s = Arr.sort(s);
                System.out.print("Fill alphanumerical (lower case) (sorted): "); Arr.print(s);
                System.out.println("\n");
        }
        
        public static void copyTest(){
                System.out.print("Byte: "); Arr.print(bArr);
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr);
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr);
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr);
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr);
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr);
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr);
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr);
                System.out.println("\n");
                
                System.out.print("Copy of Byte: "); Arr.print(Arr.copyOf(bArr));
                System.out.println();
                System.out.print("Copy of Byte (Length: 3): "); Arr.print(Arr.copyOf(bArr,3));
                System.out.println();
                System.out.print("Copy of Short: "); Arr.print(Arr.copyOf(sArr));
                System.out.println();
                System.out.print("Copy of Short (Length: 4): "); Arr.print(Arr.copyOf(sArr,4));
                System.out.println();
                System.out.print("Copy of Int: "); Arr.print(Arr.copyOf(iArr));
                System.out.println();
                System.out.print("Copy of Int (Length: 5): "); Arr.print(Arr.copyOf(iArr,5));
                System.out.println();
                System.out.print("Copy of Long: "); Arr.print(Arr.copyOf(lArr));
                System.out.println();
                System.out.print("Copy of Long (Length: 6): "); Arr.print(Arr.copyOf(lArr,6));
                System.out.println();
                System.out.print("Copy of Float: "); Arr.print(Arr.copyOf(fArr),2);
                System.out.println();
                System.out.print("Copy of Float (Length: 5): "); Arr.print(Arr.copyOf(fArr,5),2);
                System.out.println();
                System.out.print("Copy of Double: "); Arr.print(Arr.copyOf(dArr),3);
                System.out.println();
                System.out.print("Copy of Double (Length: 7): "); Arr.print(Arr.copyOf(dArr,7),3);
                System.out.println();
                System.out.print("Copy of Char: "); Arr.print(Arr.copyOf(cArr));
                System.out.println();
                System.out.print("Copy of Char (Length: 6): "); Arr.print(Arr.copyOf(cArr,6));
                System.out.println();
                System.out.print("Copy of Boolean: "); Arr.print(Arr.copyOf(boolArr));
                System.out.println();
                System.out.print("Copy of Boolean (Length: 3): "); Arr.print(Arr.copyOf(boolArr,3));
                System.out.println();
                System.out.print("Copy of String: "); Arr.print(Arr.copyOf(stringArr));
                System.out.println();
                System.out.print("Copy of String (Length: 8): "); Arr.print(Arr.copyOf(stringArr,8));
                System.out.println("\n");
        }
        
        public static void sortTest(){
                System.out.println("--- SORT ARRAYS ---\n");
                Arr.fillRandom(bArr, (byte)0, (byte)3);
                Arr.fillRandom(sArr, (short)2,  (short)7);
                Arr.fillRandom(iArr, 5,10);
                Arr.fillRandom(lArr, 10,20);
                Arr.fillRandom(fArr, 3.4f,5.76f);
                Arr.fillRandom(dArr, 7.5,10.345);
                Arr.fillRandom(cArr, 'N','s');
                Arr.fillRandom(boolArr);
                Arr.fillAlphanumerical(stringArr, 3);
                
                System.out.println("Arrays:");
                System.out.print("Byte (0 - 3): "); Arr.print(bArr);
                System.out.println();
                System.out.print("Short (2 - 7): "); Arr.print(sArr);
                System.out.println();
                System.out.print("Int (5 - 10): "); Arr.print(iArr);
                System.out.println();
                System.out.print("Long (10 - 20): "); Arr.print(lArr);
                System.out.println();
                System.out.print("Float (3.4f - 5.76f): "); Arr.print(fArr);
                System.out.println();
                System.out.print("Double (7.5 - 10.345): "); Arr.print(dArr);
                System.out.println();
                System.out.print("Char ('N' - 's'): "); Arr.print(cArr);
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.println();
                System.out.print("String (Alphanumerical, String length: 3): "); Arr.print(stringArr);
                System.out.println("\n");
                
                bArr = Arr.sort(bArr);
                sArr = Arr.sort(sArr);
                iArr = Arr.sort(iArr);
                lArr = Arr.sort(lArr);
                fArr = Arr.sort(fArr);
                dArr = Arr.sort(dArr);
                cArr = Arr.sort(cArr);
                boolArr = Arr.sort(boolArr);
                stringArr = Arr.sort(stringArr);
                
                System.out.println("Sorted arrays (Ascending order):");
                System.out.print("Byte (0 - 3): "); Arr.print(bArr);
                System.out.println();
                System.out.print("Short (2 - 7): "); Arr.print(sArr);
                System.out.println();
                System.out.print("Int (5 - 10): "); Arr.print(iArr);
                System.out.println();
                System.out.print("Long (10 - 20): "); Arr.print(lArr);
                System.out.println();
                System.out.print("Float (3.4f - 5.76f): "); Arr.print(fArr);
                System.out.println();
                System.out.print("Double (7.5 - 10.345): "); Arr.print(dArr);
                System.out.println();
                System.out.print("Char ('N' - 's'): "); Arr.print(cArr);
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.println();
                System.out.print("String (Alphanumerical, String length: 3): "); Arr.print(stringArr);
                System.out.println();
                
                stringArr = Arr.sortIgnoreCase(stringArr);
                System.out.print("String (Alphanumerical, String length: 3) (Ignoring case): "); Arr.print(stringArr);
                System.out.println("\n");
                
                bArr = Arr.sortDesc(bArr);
                sArr = Arr.sortDesc(sArr);
                iArr = Arr.sortDesc(iArr);
                lArr = Arr.sortDesc(lArr);
                fArr = Arr.sortDesc(fArr);
                dArr = Arr.sortDesc(dArr);
                cArr = Arr.sortDesc(cArr);
                boolArr = Arr.sortDesc(boolArr);
                stringArr = Arr.sortDesc(stringArr);
                
                System.out.println("Sorted arrays (Descending order):");
                System.out.print("Byte (0 - 3): "); Arr.print(bArr);
                System.out.println();
                System.out.print("Short (2 - 7): "); Arr.print(sArr);
                System.out.println();
                System.out.print("Int (5 - 10): "); Arr.print(iArr);
                System.out.println();
                System.out.print("Long (10 - 20): "); Arr.print(lArr);
                System.out.println();
                System.out.print("Float (3.4f - 5.76f): "); Arr.print(fArr);
                System.out.println();
                System.out.print("Double (7.5 - 10.345): "); Arr.print(dArr);
                System.out.println();
                System.out.print("Char ('N' - 's'): "); Arr.print(cArr);
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.println();
                System.out.print("String (Alphanumerical, String length: 3): "); Arr.print(stringArr);
                System.out.println();
                
                stringArr = Arr.sortDescIgnoreCase(stringArr);
                System.out.print("String (Alphanumerical, String length: 3) (Ignoring case): "); Arr.print(stringArr);
                System.out.println("\n");
        }
        
        public static void find(){
                bArr[2] = (byte) 4;
                sArr[3] = (short) 1;
                iArr[0] = 70;
                lArr[4] = 60;
                fArr[4] = 7.56f;
                dArr[1] = 0.034;
                Arr.fillRandom(cArr,'C','M');
                Arr.fillRandom(boolArr);
                stringArr[2] = "World";
                
                System.out.println("--- FIND ELEMENT ---");
                System.out.println("Unsorted arrays:");
                System.out.print("Byte: "); Arr.print(bArr); 
                System.out.println("\nFind: 4 (pos: 2) --> " + Arr.find(bArr, (byte) 4, false));
                System.out.print("Short: "); Arr.print(sArr); 
                System.out.println("\nFind: 1 (pos: 3) --> " + Arr.find(sArr, (short) 1, false));
                System.out.print("Int: "); Arr.print(iArr);
                System.out.println("\nFind: 70 (pos: 0) --> " + Arr.find(iArr, 70, false));
                System.out.print("Long: "); Arr.print(lArr);
                System.out.println("\nFind: 60 (pos: 4) --> " + Arr.find(lArr, 60, false));
                System.out.print("Float: "); Arr.print(fArr,2); 
                System.out.println("\nFind: 7.56f (pos: 4) --> " + Arr.find(fArr, 7.56f, false));
                System.out.print("Double: "); Arr.print(dArr,3);
                System.out.println("\nFind: 0.034 (pos: 1) --> " + Arr.find(dArr, 0.034, false));
                System.out.print("Char: "); Arr.print(cArr); 
                System.out.println("\nFind: 'A' (pos: XX) --> " + Arr.find(cArr, 'A', false) + "\n");
                
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.println("\nFind: false (pos: ???) --> " + Arr.find(boolArr, false, false));
                System.out.print("Find: false (findAll) --> "); Arr.print(Arr.findAll(boolArr, false));
                System.out.println("\n");
                
                System.out.print("String: "); Arr.print(stringArr);
                System.out.println("\nFind: \"world\" (pos: XX) --> " + Arr.find(stringArr, "world", false));
                System.out.println("Find: \"world\" (pos: 2) (Ignoring case) --> " + Arr.findIgnoreCase(stringArr, "World", false));
                System.out.print("Find: \"world\" (findAll) --> "); Arr.print(Arr.findAll(stringArr, "world")); System.out.println();
                System.out.print("Find: \"world\" (findAll) (Ignoring case) --> "); Arr.print(Arr.findAllIgnoreCase(stringArr, "world"));  System.out.println();
                System.out.print("Find: \"Ld\" (findStringPart) --> "); Arr.print(Arr.findStringPart(stringArr, "Ld"));  System.out.println();
                System.out.print("Find: \"Ld\" (findStringPart) (Ignoring case) --> "); Arr.print(Arr.findStringPartIgnoreCase(stringArr, "Ld"));
                System.out.println("\n");
                
                bArr = Arr.sort(bArr);
                sArr = Arr.sort(sArr);
                iArr = Arr.sort(iArr);
                lArr = Arr.sort(lArr);
                fArr = Arr.sort(fArr);
                dArr = Arr.sort(dArr);
                cArr = Arr.sort(cArr);
                boolArr = Arr.sort(boolArr);
                stringArr = Arr.sort(stringArr);
                
                System.out.println("Sorted arrays:");
                System.out.print("Byte: "); Arr.print(bArr);
                System.out.println("\nFind: 4 --> " + Arr.find(bArr, (byte) 4, true));
                System.out.println("Find: 4 (Binary search) --> " + Arr.binarySearch(bArr, (byte) 4));
                System.out.print("Short: "); Arr.print(sArr);
                System.out.println("\nFind: 1 --> " + Arr.find(sArr, (short) 1, true));
                System.out.println("Find: 1 (Binary search) --> " + Arr.binarySearch(sArr, (short) 1));
                System.out.print("Int: "); Arr.print(iArr);
                System.out.println("\nFind: 70 --> " + Arr.find(iArr, 70, true));
                System.out.println("Find: 70 (Binary search) --> " + Arr.binarySearch(iArr, 70));
                System.out.print("Long: "); Arr.print(lArr);
                System.out.println("\nFind: 60 --> " + Arr.find(lArr, 60, true));
                System.out.println("Find: 60 (Binary search) --> " + Arr.binarySearch(lArr, 60));
                System.out.print("Float: "); Arr.print(fArr,2);
                System.out.println("\nFind: 7.56 --> " + Arr.find(fArr, 7.56f, true));
                System.out.println("Find: 7.56 (Binary search) --> " + Arr.binarySearch(fArr, 7.56f));
                System.out.print("Double: "); Arr.print(dArr,3);
                System.out.println("\nFind: 0.034 --> " + Arr.find(dArr, 0.034, true));
                System.out.println("Find: 0.034 (Binary search) --> " + Arr.binarySearch(dArr, 0.034));
                System.out.print("Char: "); Arr.print(cArr);
                System.out.println("\nFind: 'A' --> " + Arr.find(cArr, 'A', true));
                System.out.println("Find: 'A' (Binary search) --> " + Arr.binarySearch(cArr, 'A'));
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.println("\nFind: false --> " + Arr.find(boolArr, false, true));
                System.out.print("Find: false (Binary search) --> " + Arr.binarySearch(boolArr, false));
                System.out.println("\n");
        }
        
        public static void replace(){
                System.out.println("--- REPLACE ELEMENT ---");
                System.out.println("Single element:");
                System.out.print("Byte: "); Arr.print(bArr);
                Arr.replace(bArr, (byte) 4, (byte) 5);
                System.out.print("\nByte (4 --> 5): "); Arr.print(bArr);
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr);
                Arr.replace(sArr, (short) 1, (short) 6);
                System.out.print("\nShort (1--> 6): "); Arr.print(sArr);
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr);
                Arr.replace(iArr,  70, 11);
                System.out.print("\nInt (70 --> 11): "); Arr.print(iArr);
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr);
                Arr.replace(lArr,  60, 11);
                System.out.print("\nLong (60 --> 11): "); Arr.print(lArr);
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr,2);
                Arr.replace(fArr,  7.56f, 11.23f);
                System.out.print("\nFloat (7.56f --> 11.23f): "); Arr.print(fArr,1);
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr,3);
                Arr.replace(dArr,  0.034, 20.3);
                System.out.print("\nDouble (0.034 --> 20.3): "); Arr.print(dArr,3);
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr);
                Arr.replace(cArr,  'b', 'z');
                System.out.print("\nChar ('b' --> 'z'): "); Arr.print(cArr);
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr);
                Arr.replace(boolArr,  false, true);
                System.out.print("\nBoolean (false --> true): "); Arr.print(boolArr);
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr);
                Arr.replace(stringArr,  "world", "hi");
                System.out.print("\nString (\"world\" --> \"hi\"): "); Arr.print(stringArr);
                Arr.replaceIgnoreCase(stringArr,  "world", "hi");
                System.out.print("\nString (\"world\" --> \"hi\") (Ignoring case): "); Arr.print(stringArr);
                System.out.println("\n");
                
                
                Arr.fillRandom(bArr, (byte)1, (byte)3);
                Arr.fillRandom(sArr, (short)1,  (short)3);
                Arr.fillRandom(iArr, 1,3);
                Arr.fillRandom(lArr, 1,3);
                Arr.fillRandom(fArr, 1.5f,3.5f);
                Arr.fillRandom(dArr, 1.5,3.5);
                Arr.fillRandom(cArr, 'A','C');
                Arr.fillRandom(boolArr);
                for(int i=0; i<stringArr.length; i++){
                        if(i%2==0) stringArr[i] = "ss";
                        else stringArr[i] = "dd";
                }
                
                System.out.println("Multiple element:");
                byte[] bSrc = {(byte)1, (byte)2}, bSub = {(byte)5, (byte)6};
                System.out.print("Byte: "); Arr.print(bArr);
                Arr.replaceMult(bArr, bSrc, bSub);
                System.out.print("\nByte (1 --> 5, 2 --> 6): "); Arr.print(bArr);
                System.out.println();
                
                short[] sSrc = {(short)1, (short)2}, sSub = {(short)5, (short)6};
                System.out.print("Short: "); Arr.print(sArr);
                Arr.replaceMult(sArr, sSrc, sSub);
                System.out.print("\nShort (1 --> 5, 2 --> 6): "); Arr.print(sArr);
                System.out.println();
                
                int[] iSrc = {1, 2}, iSub = {5, 6};
                System.out.print("Int: "); Arr.print(iArr);
                Arr.replaceMult(iArr,  iSrc, iSub);
                System.out.print("\nInt (1 --> 5, 2 --> 6): "); Arr.print(iArr);
                System.out.println();
                
                long[] lSrc = {1, 2}, lSub = {5, 6};
                System.out.print("Long: "); Arr.print(lArr);
                Arr.replaceMult(lArr,  lSrc, lSub);
                System.out.print("\nLong (1 --> 5, 2 --> 6): "); Arr.print(lArr);
                System.out.println();
                
                float[] fSrc = {1.5f, 2.5f}, fSub = {5.5f, 6.5f};
                System.out.print("Float: "); Arr.print(fArr,2);
                Arr.replaceMult(fArr,  fSrc, fSub);
                System.out.print("\nFloat (1.5f --> 5.5f, 2.5f --> 6.5f): "); Arr.print(fArr,2);
                System.out.println();
                
                double[] dSrc = {1.5, 2.5}, dSub = {5.5, 6.5};
                System.out.print("Double: "); Arr.print(dArr,3);
                Arr.replaceMult(dArr,  dSrc, dSub);
                System.out.print("\nDouble (1.5 --> 5.5, 2.5 --> 6.5): "); Arr.print(dArr,3);
                System.out.println();
                
                char[] cSrc = {'A', 'B'}, cSub = {'X', 'Y'};
                System.out.print("Char: "); Arr.print(cArr);
                Arr.replaceMult(cArr,  cSrc, cSub);
                System.out.print("\nChar ('A' --> 'X', 'B' --> 'Y'): "); Arr.print(cArr);
                System.out.println();
                
                String[] stSrc = {"DD", "ss"}, stSub = {"qu", "er"};
                System.out.print("String: "); Arr.print(stringArr);
                Arr.replaceMult(stringArr,  stSrc, stSub);
                System.out.print("\nString (\"DD\" --> \"qu\", \"ss\" --> \"er\"): "); Arr.print(stringArr);
                System.out.println();
                
                for(int i=0; i<stringArr.length; i++){
                        if(i%2==0) stringArr[i] = "ss";
                        else stringArr[i] = "dd";
                }
                System.out.print("String: "); Arr.print(stringArr);
                Arr.replaceMultIgnoreCase(stringArr,  stSrc, stSub);
                System.out.print("\nString (\"DD\" --> \"qu\", \"ss\" --> \"er\") (Ignoring case): "); Arr.print(stringArr);
                System.out.println("\n");
        }
        
        public static void shuffle(){
                System.out.println("--- SHUFFLE ARRAY ---");
                System.out.print("Byte: "); Arr.print(bArr);
                System.out.print("\nByte: "); Arr.print(Arr.shuffle(bArr));
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr);
                System.out.print("\nShort: "); Arr.print(Arr.shuffle(sArr));
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr);
                System.out.print("\nInt (30 iterations): "); Arr.print(Arr.shuffle(iArr, 30));
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr);
                System.out.print("\nLong (1 iteration): "); Arr.print(Arr.shuffle(lArr, 1));
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr,2);
                System.out.print("\nFloat (22 iterations): "); Arr.print(Arr.shuffle(fArr, 22),2);
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr,3);
                System.out.print("\nDouble: "); Arr.print(Arr.shuffle(dArr),3);
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr);
                System.out.print("\nChar: "); Arr.print(Arr.shuffle(cArr));
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.print("\nBoolean: "); Arr.print(Arr.shuffle(boolArr));
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr);
                System.out.print("\nString: "); Arr.print(Arr.shuffle(stringArr));
                System.out.println("\n");
        }
        
        public static void pickRandom(){
                System.out.println("--- PICK RANDOM ELEMENT ---");
                System.out.print("Byte: "); Arr.print(bArr); System.out.print(" --> " + Arr.pickRandom(bArr));
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr); System.out.print(" --> " + Arr.pickRandom(sArr));
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr); System.out.print(" --> " + Arr.pickRandom(iArr));
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr); System.out.print(" --> " + Arr.pickRandom(lArr));
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr,2); System.out.print(" --> " + Arr.pickRandom(fArr));
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr,3); System.out.print(" --> " + Arr.pickRandom(dArr));
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr); System.out.print(" --> " + Arr.pickRandom(cArr));
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr); System.out.print(" --> " + Arr.pickRandom(boolArr));
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr); System.out.print(" --> " + Arr.pickRandom(stringArr));
                System.out.println("\n");
        }
        
        public static void flip(){
                System.out.println("--- FLIP ARRAY ---");
                System.out.print("Byte: "); Arr.print(bArr);
                System.out.print("\nByte: "); Arr.print(Arr.flip(bArr));
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr);
                System.out.print("\nShort: "); Arr.print(Arr.flip(sArr));
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr);
                System.out.print("\nInt: "); Arr.print(Arr.flip(iArr));
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr);
                System.out.print("\nLong: "); Arr.print(Arr.flip(lArr));
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr,2);
                System.out.print("\nFloat: "); Arr.print(Arr.flip(fArr),2);
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr,3);
                System.out.print("\nDouble: "); Arr.print(Arr.flip(dArr),3);
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr);
                System.out.print("\nChar: "); Arr.print(Arr.flip(cArr));
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.print("\nBoolean: "); Arr.print(Arr.flip(boolArr));
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr);
                System.out.print("\nString: "); Arr.print(Arr.flip(stringArr));
                System.out.println("\n");
        }
        
        public static void shift(){
                System.out.println("--- SHIFT ARRAY ---");
                System.out.println("Shift right:");
                System.out.print("Byte: "); Arr.print(bArr);
                System.out.print("\nByte: "); Arr.print(Arr.shiftR(bArr));
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr);
                System.out.print("\nShort: "); Arr.print(Arr.shiftR(sArr));
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr);
                System.out.print("\nInt: "); Arr.print(Arr.shiftR(iArr));
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr);
                System.out.print("\nLong: "); Arr.print(Arr.shiftR(lArr));
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr,2);
                System.out.print("\nFloat: "); Arr.print(Arr.shiftR(fArr),2);
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr,3);
                System.out.print("\nDouble: "); Arr.print(Arr.shiftR(dArr),3);
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr);
                System.out.print("\nChar: "); Arr.print(Arr.shiftR(cArr));
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.print("\nBoolean: "); Arr.print(Arr.shiftR(boolArr));
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr);
                System.out.print("\nString: "); Arr.print(Arr.shiftR(stringArr));
                System.out.println("\n");
                
                System.out.println("Shift left:");
                System.out.print("Byte: "); Arr.print(bArr);
                System.out.print("\nByte: "); Arr.print(Arr.shiftL(bArr));
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr);
                System.out.print("\nShort: "); Arr.print(Arr.shiftL(sArr));
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr);
                System.out.print("\nInt: "); Arr.print(Arr.shiftL(iArr));
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr);
                System.out.print("\nLong: "); Arr.print(Arr.shiftL(lArr));
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr,2);
                System.out.print("\nFloat: "); Arr.print(Arr.shiftL(fArr),2);
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr,3);
                System.out.print("\nDouble: "); Arr.print(Arr.shiftL(dArr),3);
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr);
                System.out.print("\nChar: "); Arr.print(Arr.shiftL(cArr));
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr);
                System.out.print("\nBoolean: "); Arr.print(Arr.shiftL(boolArr));
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr);
                System.out.print("\nString: "); Arr.print(Arr.shiftL(stringArr));
                System.out.println("\n");
        }
        
        public static void min_max(){
                System.out.println("--- FIND MIN ---");
                System.out.print("Byte: "); Arr.print(bArr); System.out.print(" --> " + Arr.min(bArr));
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr); System.out.print(" --> " + Arr.min(sArr));
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr); System.out.print(" --> " + Arr.min(iArr));
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr); System.out.print(" --> " + Arr.min(lArr));
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr,2); System.out.print(" --> " + Arr.min(fArr));
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr,3); System.out.print(" --> " + Arr.min(dArr));
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr); System.out.print(" --> " + Arr.min(cArr));
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr); System.out.print(" --> " + Arr.min(boolArr));
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr); System.out.print(" --> " + Arr.min(stringArr));
                System.out.println("\n");
                
                System.out.println("--- FIND MAX ---");
                System.out.print("Byte: "); Arr.print(bArr); System.out.print(" --> " + Arr.max(bArr));
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr); System.out.print(" --> " + Arr.max(sArr));
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr); System.out.print(" --> " + Arr.max(iArr));
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr); System.out.print(" --> " + Arr.max(lArr));
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr,2); System.out.print(" --> " + Arr.max(fArr));
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr,3); System.out.print(" --> " + Arr.max(dArr));
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr); System.out.print(" --> " + Arr.max(cArr));
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr); System.out.print(" --> " + Arr.max(boolArr));
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr); System.out.print(" --> " + Arr.max(stringArr));
                System.out.println("\n");
        }
        
        public static void median_avarage(){
                System.out.println("--- FIND MEDIAN ---");
                System.out.print("Byte: "); Arr.print(bArr); System.out.print(" --> " + Arr.median(bArr));
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr); System.out.print(" --> " + Arr.median(sArr));
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr); System.out.print(" --> " + Arr.median(iArr));
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr); System.out.print(" --> " + Arr.median(lArr));
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr,2); System.out.print(" --> " + Arr.median(fArr));
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr,3); System.out.print(" --> " + Arr.median(dArr));
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr); System.out.print(" --> " + Arr.median(cArr));
                System.out.println();
                System.out.print("Boolean: "); Arr.print(boolArr); System.out.print(" --> " + Arr.median(boolArr));
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr); System.out.print(" --> " + Arr.median(stringArr));
                System.out.println("\n");
                
                System.out.println("--- AVERAGE ---");
                System.out.print("Byte: "); Arr.print(bArr); System.out.print(" --> " + Arr.average(bArr) + " / " + Arr.averageRD(bArr));
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr); System.out.print(" --> " + Arr.average(sArr) + " / " + Arr.averageRD(sArr));
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr); System.out.print(" --> " + Arr.average(iArr) + " / " + Arr.averageRD(iArr));
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr); System.out.print(" --> " + Arr.average(lArr) + " / " + Arr.averageRD(lArr));
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr,2); System.out.print(" --> " + Arr.average(fArr) + " / " + Arr.averageRD(fArr));
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr,3); System.out.print(" --> " + Arr.average(dArr) + " / " + Arr.averageRD(dArr));
                System.out.println();
                System.out.print("Char: "); Arr.print(cArr); System.out.print(" --> " + Arr.average(cArr) + " / " + Arr.averageRD(cArr));
                System.out.println("\n");
        }
        
        public static void tot(){
                System.out.println("--- TOT ---");
                System.out.print("Byte: "); Arr.print(bArr); System.out.print(" --> " + Arr.tot(bArr));
                System.out.println();
                System.out.print("Short: "); Arr.print(sArr); System.out.print(" --> " + Arr.tot(sArr));
                System.out.println();
                System.out.print("Int: "); Arr.print(iArr); System.out.print(" --> " + Arr.tot(iArr));
                System.out.println();
                System.out.print("Long: "); Arr.print(lArr); System.out.print(" --> " + Arr.tot(lArr));
                System.out.println();
                System.out.print("Float: "); Arr.print(fArr,2); System.out.print(" --> " + Arr.tot(fArr));
                System.out.println();
                System.out.print("Double: "); Arr.print(dArr,3); System.out.print(" --> " + Arr.tot(dArr));
                System.out.println();
                System.out.print("String: "); Arr.print(stringArr); System.out.print(" --> " + Arr.tot(stringArr));
                System.out.println("\n");
        }
}
