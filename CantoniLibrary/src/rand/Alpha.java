package rand;

import java.util.Random;

/**
* Utility class with methods to generate random Strings and
* characters
* 
* @author Cantoni Alessandro
*/
public class Alpha {
      private static final Random r = new Random();
      protected Alpha() {}
      
      private static int newInt(int min, int max){
            return r.nextInt(max - min + 1) + min;
      }
      private static boolean newBoolean(){
            return r.nextBoolean();
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
      public static char newChar(char min, char max){
            return (min<=max) ? (char) ( r.nextInt(max - min + 1) + min ) : (char) ( min-1 );
      }
      
      /**
       * Returns a string of the given length containing random letters
       * 
       * @param length The length of the returned string
       * @param uppercase Whether or not the letter should be uppercase
       * @return The string of letters
       */
      public static String newLetters(int length, boolean uppercase){
                if (length <= 0) return "";
                
                String s = "";
                int minChar = (int)'A', maxChar = (int)'Z';
                
                if(!uppercase){
                        minChar += 32;
                        maxChar += 32;
                }
                
                for(int i=0; i<length; i++) s = s.concat(String.valueOf( (char) ( newInt(minChar,maxChar) ) ));
                return s;
        }
      /**
       * Returns a string of the given length containing random numbers
       * 
       * @param length The length of the returned string
       * @return The string of numbers
       */
      public static String newNumbers(int length){
              if (length <= 0) return "";

              String s = "";
              for(int i=0; i<length; i++) s = s.concat(String.valueOf( newChar('0','9') ));
              return s;
      }
      /**
       * Returns a string of the given length containing random letters
       * and numbers
       * 
       * @param length The length of the returned string
       * @param uppercase Whether or not the letter should be uppercase
       * @return The string of letters and numbers
       */
      public static String newAlphanumerical(int length, boolean uppercase){
              if (length <= 0) return "";

              String s = "";
              int minChar = (int)'A', maxChar = (int)'Z';

              if(!uppercase){
                      minChar += 32;
                      maxChar += 32;
              }

              for(int i=0; i<length; i++){
                      if(newInt(0,35) <= 9)
                              s = s.concat(String.valueOf( newChar('0','9') ));
                      else
                              s = s.concat(String.valueOf( (char) ( newInt(minChar,maxChar) ) ));
              }

              return s;
      }
      /**
       * Returns a string of the given length containing random upper and lower
       * case letters
       * 
       * @param length The length of the returned string
       * @return The string of letters
       */
      public static String newLettersMixed(int length){
              if (length <= 0) return "";

              String s = "";
              for(int i=0; i<length; i++)
                    s = (newBoolean()) ? s.concat(String.valueOf( newChar('a','z') )) : s.concat(String.valueOf( newChar('A','Z') ));
              return s;
      }
      /**
       * Returns a string of the given length containing random upper and lower
       * case letters and numbers
       * 
       * @param length The length of the returned string
       * @return The string of letters and numbers
       */
      public static String newAlphanumericalMixed(int length){
                if (length <= 0) return ""; 
               
                String s = "";
                for(int i=0; i<length; i++){
                        if(newInt(0,35) <= 9)
                                s = s.concat(String.valueOf(newChar('0','9')));
                        else 
                              s = (newBoolean()) ? s.concat(String.valueOf( newChar('a','z') )) : s.concat(String.valueOf( newChar('A','Z') ));
                }
                return s;
        }
}
