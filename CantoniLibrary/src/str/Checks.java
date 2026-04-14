package str;

/**
 * Utility class containing methods to 
 * obtain informations about a string or its content
 * 
 * @author Cantoni Alessandro
 */
public class Checks {
      protected Checks() {}
      
      public static boolean contains(String string, char character) {
            for(int i=0; i<string.length(); i++) 
                  if(string.charAt(i) == character) return true;
            return false;
      }
      
      public static int count(String string, char character) {
            int res = 0;
            for(int i=0; i<string.length(); i++)
                  if(string.charAt(i) == character) res++;
            return res;
      }
}
