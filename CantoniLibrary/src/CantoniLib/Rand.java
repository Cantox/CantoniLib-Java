package CantoniLib;

import java.util.Random;

public class Rand {
        private static Random r = new Random();
        
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
}
