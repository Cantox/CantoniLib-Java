package rand;

import java.util.Random;

/**
 * Utility class used to generate random values (Using
 * java.util.Random methods)
 * 
 * @author Cantoni Alessandro
 */
public class Num {
      private static final Random r = new Random();
      protected Num() {}
      
      /**
       * Generates a random value between min (included) and 
       * max (included)<br>
       * If max < min returns min-1
       * 
       * @param min The minimum value
       * @param max The maximum value
       * @return A random value between min and max
       */
      public static byte newByte(byte min, byte max){
            return (min<=max) ? (byte) ( r.nextInt(max - min + 1) + min ) : (byte) ( min-1 );
      }
      /**
       * Generates a random value between min (included) and 
       * max (included)<br>
       * If max < min returns min-1
       * 
       * @param min The minimum value
       * @param max The maximum value
       * @return A random value between min and max
       */
      public static short newShort(short min, short max){
            return (min<=max) ? (short) ( r.nextInt(max - min + 1) + min ) : (short) ( min-1 );
      }
      /**
       * Generates a random value between min (included) and 
       * max (included)<br>
       * If max < min returns min-1
       * 
       * @param min The minimum value
       * @param max The maximum value
       * @return A random value between min and max
       */
      public static int newInt(int min, int max){
            return (min<=max) ? r.nextInt(max - min + 1) + min : min-1;
      }
      /**
       * Generates a random value between min (included) and 
       * max (included)<br>
       * If max < min returns min-1
       * 
       * @param min The minimum value
       * @param max The maximum value
       * @return A random value between min and max
       */
      public static long newLong(long min, long max){
            return (min<=max) ? r.nextLong(max - min + 1) + min : min-1;
      }
      /**
       * Generates a random value between min (included) and 
       * max (excluded)<br>
       * If max < min returns min-1
       * 
       * @param min The minimum value
       * @param max The maximum value
       * @return A random value between min and max
       */
      public static float newFloat(float min, float max){
            return (min<=max) ? r.nextFloat() * (max-min) + min : min-1;
      }
      /**
       * Generates a random value between min (included) and 
       * max (excluded)<br>
       * If max < min returns min-1
       * 
       * @param min The minimum value
       * @param max The maximum value
       * @return A random value between min and max
       */
      public static double newDouble(double min, double max){
            return (min<=max) ? r.nextDouble() * (max-min) + min : min-1;
      }
      /**
       * Generates a random boolean value
       * 
       * @return A random boolean value
       */
      public static boolean newBoolean(){
            return r.nextBoolean();
      }
}
