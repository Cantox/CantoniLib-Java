package CantoniLib;

import java.util.Random;

/**
 * Utility class offering a collection of methods for generating random values
 * across different data types.
 *
 * <p>All methods rely on an internal instance of {@link java.util.Random} to ensure
 * consistent and efficient random value generation.</p>
 *
 * <p>This class is intended as a static utility container and should not be instantiated.</p>
 * @author Cantoni Alessandro
 */
public final class Rand {
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
        
        /**
        * Generates a {@code String} of the given length filled with random letters.
        *
        * <p>The letters will be uppercase ('A'-'Z') if {@code uppercase} is {@code true},
        * otherwise lowercase ('a'-'z').</p>
        *
        * @param length the length of the generated string; must be non-negative
        * @param uppercase whether the letters will be uppercase
        * @return a {@code String} of random letters
        * @throws IllegalArgumentException if {@code length < 0}
        */
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
        /**
        * Generates a {@code String} of the given length filled with random digits ('0'-'9').
        *
        * @param length the length of the generated string; must be non-negative
        * @return a {@code String} of random digits
        * @throws IllegalArgumentException if {@code length < 0}
        */
        public static String newStringNumbers(int length){
                if (length < 0)
                        throw new IllegalArgumentException("length cannot be negative");
                
                String s = "";
                
                for(int i=0; i<length; i++)
                        s = s.concat(String.valueOf(newChar('0','9')));
                
                return s;
        }
        /**
        * Generates a {@code String} of the given length filled with random letters and digits.
        *
        * <p>Letters will be uppercase ('A'-'Z') if {@code uppercase} is {@code true}, 
        * otherwise lowercase ('a'-'z'). Digits ('0'-'9') are included as well.</p>
        *
        * @param length the length of the generated string; must be non-negative
        * @param uppercase whether letters will be uppercase
        * @return a {@code String} of random alphanumeric characters
        * @throws IllegalArgumentException if {@code length < 0}
        */
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
        /**
         * Generates a {@code String} of the given length filled with random letters
         * of mixed case ('a'-'z' and 'A'-'Z').
         *
         * @param length the length of the generated string; must be non-negative
         * @return a {@code String} of random letters with mixed case
         * @throws IllegalArgumentException if {@code length < 0}
         */
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
        /**
        * Generates a {@code String} of the given length filled with random letters (mixed case)
        * and digits ('0'-'9').
        *
        * @param length the length of the generated string; must be non-negative
        * @return a {@code String} of random alphanumeric characters with mixed case letters
        * @throws IllegalArgumentException if {@code length < 0}
        */
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
        
        /**
        * Returns {@code true} with the specified {@code probability}, and {@code false} otherwise.
        *
        * <p>The {@code probability} must be between {@code 0.0} (never) and {@code 1.0} (always).
        * For example, a {@code probability} of {@code 0.3} means there is a 30% chance of returning {@code true}.</p>
        *
        * @param probability the probability of returning {@code true}; must be between {@code 0.0} and {@code 1.0}
        * @return {@code true} with the given probability, {@code false} otherwise
        * @throws IllegalArgumentException if {@code probability} is not between {@code 0.0} and {@code 1.0}
        */
        public static boolean chance(double probability){
                if (probability < 0.0 || probability > 1.0)
                        throw new IllegalArgumentException("probability must be between 0.0 and 1.0");
                
                return newDouble(0,1) <= probability;
        }
        
        /**
        * Simulates a throw of a four-sided die (d4).
        *
        * <p>Returns a random {@code int} between {@code 1} and {@code 4}, inclusive.</p>
        *
        * @return a random {@code int} between {@code 1} and {@code 4}
        */
        public static int d4(){
                return newInt(1,4);
        }
         /**
        * Simulates a throw of a six-sided die (d6).
        *
        * <p>Returns a random {@code int} between {@code 1} and {@code 6}, inclusive.</p>
        *
        * @return a random {@code int} between {@code 1} and {@code 6}
        */
        public static int d6(){
                return newInt(1,6);
        }
         /**
        * Simulates a throw of an eight-sided die (d8).
        *
        * <p>Returns a random {@code int} between {@code 1} and {@code 8}, inclusive.</p>
        *
        * @return a random {@code int} between {@code 1} and {@code 8}
        */
        public static int d8(){
                return newInt(1,8);
        }
         /**
        * Simulates a throw of a ten-sided die (d10).
        *
        * <p>Returns a random {@code int} between {@code 1} and {@code 10}, inclusive.</p>
        *
        * @return a random {@code int} between {@code 1} and {@code 10}
        */
        public static int d10(){
                return newInt(1,10);
        }
         /**
        * Simulates a throw of a twelve-sided die (d12).
        *
        * <p>Returns a random {@code int} between {@code 1} and {@code 12}, inclusive.</p>
        *
        * @return a random {@code int} between {@code 1} and {@code 12}
        */
        public static int d12(){
                return newInt(1,12);
        }
         /**
        * Simulates a throw of a twenty-sided die (d20).
        *
        * <p>Returns a random {@code int} between {@code 1} and {@code 20}, inclusive.</p>
        *
        * @return a random {@code int} between {@code 1} and {@code 20}
        */
        public static int d20(){
                return newInt(1,20);
        }
         /**
        * Simulates a throw of a fifty-sided die (d50).
        *
        * <p>Returns a random {@code int} between {@code 1} and {@code 50}, inclusive.</p>
        *
        * @return a random {@code int} between {@code 1} and {@code 50}
        */
        public static int d50(){
                return newInt(1,50);
        }
         /**
        * Simulates a throw of a hundred-sided die (d100).
        *
        * <p>Returns a random {@code int} between {@code 1} and {@code 100}, inclusive.</p>
        *
        * @return a random {@code int} between {@code 1} and {@code 100}
        */
        public static int d100(){
                return newInt(1,100);
        }
}
