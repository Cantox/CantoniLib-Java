package CantoniLib;

import java.util.Random;

public final class Rand {
        private static final Random r = new Random();
        
        private Rand() {}
        
        public static byte newByte(byte min, byte max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return (byte) (r.nextInt(max - min + 1) + min);
        }
        public static short newShort(short min, short max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return (short) (r.nextInt(max - min + 1) + min);
        }
        public static int newInt(int min, int max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return r.nextInt((max-min) + 1) + min;
        }
        public static long newLong(long min, long max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return r.nextLong((max-min)+1) + min;
        }
        public static float newFloat(float min, float max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return r.nextFloat() * (max-min) + min;
        }
        public static double newDouble(double min, double max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return r.nextDouble() * (max-min) + min;
        }
        public static char newChar(char min, char max){
                if(min > max)
                        throw new IllegalArgumentException("min > max");
                
                return (char) (r.nextInt((max-min) + 1) + min);
        }
        public static boolean newBoolean(){
                return r.nextBoolean();
        }
        
        public static String newStringLetters(int length, boolean uppercase){
                if (length < 0)
                        throw new IllegalArgumentException("length cannot be negative");
                
                String s = "";
                int minChar = (int)'A', maxChar = (int)'Z';
                
                if(!uppercase){
                        minChar += 32;
                        maxChar += 32;
                }
                
                for(int i=0; i<length; i++)
                        s = s.concat(String.valueOf((char) (newInt(minChar,maxChar))));
                
                return s;
        }
        public static String newStringNumbers(int length){
                if (length < 0)
                        throw new IllegalArgumentException("length cannot be negative");
                
                String s = "";
                
                for(int i=0; i<length; i++)
                        s = s.concat(String.valueOf(newChar('0','9')));
                
                return s;
        }
        public static String newStringAlphanumerical(int length, boolean uppercase){
                if (length < 0)
                        throw new IllegalArgumentException("length cannot be negative");
                
                String s = "";
                int minChar = (int)'A', maxChar = (int)'Z';
                
                if(!uppercase){
                        minChar += 32;
                        maxChar += 32;
                }
                
                for(int i=0; i<length; i++){
                        if(newInt(0,35) <= 9)
                                s = s.concat(String.valueOf(newChar('0','9')));
                        else
                                s = s.concat(String.valueOf((char) (newInt(minChar,maxChar))));
                }
                
                return s;
        }
        public static String newStringLettersMixed(int length){
                if (length < 0)
                        throw new IllegalArgumentException("length cannot be negative");
                
                String s = "";
                
                for(int i=0; i<length; i++){
                        if(newBoolean())
                                s = s.concat(String.valueOf(newChar('a','z')));
                        else
                                s = s.concat(String.valueOf(newChar('A','Z')));
                }
                
                return s;
        }
        public static String newStringAlphanumericalMixed(int length){
                if (length < 0)
                        throw new IllegalArgumentException("length cannot be negative");
                
                String s = "";
                
                for(int i=0; i<length; i++){
                        if(newInt(0,35) <= 9)
                                s = s.concat(String.valueOf(newChar('0','9')));
                        else{
                                if(newBoolean())
                                        s = s.concat(String.valueOf(newChar('a','z')));
                                else
                                        s = s.concat(String.valueOf(newChar('A','Z')));
                        }
                }
                
                return s;
        }
        
        
        public static boolean chance(double probability){
                if (probability < 0.0 || probability > 1.0)
                        throw new IllegalArgumentException("probability must be between 0.0 and 1.0");
                
                return newDouble(0,1) <= probability;
        }
        
        
        public static int d4(){
                return newInt(1,4);
        }
        public static int d6(){
                return newInt(1,6);
        }
        public static int d8(){
                return newInt(1,8);
        }
        public static int d10(){
                return newInt(1,10);
        }
        public static int d12(){
                return newInt(1,12);
        }
        public static int d20(){
                return newInt(1,20);
        }
        public static int d50(){
                return newInt(1,50);
        }
        public static int d100(){
                return newInt(1,100);
        }
}
