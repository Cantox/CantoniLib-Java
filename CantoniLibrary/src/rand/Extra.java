package rand;

import java.util.Random;

/**
 * Utility class containing various methods that use
 * random values
 * 
 * @author Cantoni Alessandro
 */
public class Extra {
      private static final Random r = new Random();
      protected Extra() {}
      
      /**
       * Returns true with the given probability<br>
       * The probability value must be between 0.0
       * and 1.0 (any value outside the range will be clamped
       * to fit)
       * 
       * @param probability The probability that the mothod will return true
       * @return True with the given probability
       */
      public static boolean chance(double probability){
            if(probability < 0.0) probability = 0.0;
            if(probability > 1.0) probability = 1.0;
            return r.nextDouble() <= probability;
      }
      
      private static int newInt(int min, int max){
            return r.nextInt(max - min + 1) + min;
      }
      
      /**
       * Simulates the throw of a d4
       * 
       * @return The result of the throw
       */
      public static int d4(){
                return newInt(1,4);
        }
      /**
       * Simulates the throw of a d6
       * 
       * @return The result of the throw
       */
      public static int d6(){
            return newInt(1,6);
      }
      /**
       * Simulates the throw of a d8
       * 
       * @return The result of the throw
       */
      public static int d8(){
            return newInt(1,8);
      }
      /**
       * Simulates the throw of a d10
       * 
       * @return The result of the throw
       */
      public static int d10(){
            return newInt(1,10);
      }
      /**
       * Simulates the throw of a d12
       * 
       * @return The result of the throw
       */
      public static int d12(){
            return newInt(1,12);
      }
      /**
       * Simulates the throw of a d20
       * 
       * @return The result of the throw
       */
      public static int d20(){
            return newInt(1,20);
      }
      /**
       * Simulates the throw of a d50
       * 
       * @return The result of the throw
       */
      public static int d50(){
            return newInt(1,50);
      }
      /**
       * Simulates the throw of a d100
       * 
       * @return The result of the throw
       */
      public static int d100(){
            return newInt(1,100);
      }
}
