package str;

/**
 * Utility class containing methods to 
 * modify Strings
 * 
 * @author Cantoni Alessandro
 */
public class Modify {
      protected Modify() {}
      
      /**
       * Returns a copy of the string truncated at the given index (included)<br>
       * If the index is greater than the length of the string, the whole 
       * string is returned
       * 
       * @param s The string to truncate
       * @param to The index to truncate at
       * @return A truncated copy of the string
       */
      public static String truncated(String s, int to) {
            if(s == null || s.length() == 0) return s;
            if(to >= s.length()) return s;
            String res = "";
            for(int i=0; i<=to; i++) res += s.charAt(i);
            return res;
      }
      /**
       * Returns a copy of the string truncated at the given index (included)<br>
       * If one of the indexes is greater than the length of the string, the whole
       * string is returned<br>
       * If the first index is greater than the second, the string is truncated and the order
       * of the characters is reversed
       * 
       * @param s The string to truncate
       * @param from The index to begin the truncation at
       * @param to The index to truncate at
       * @return A truncated copy of the string
       */
      public static String truncated(String s, int from, int to) {
            if(s == null || s.length() == 0) return s;
            if(from < 0) from = 0;
            if(from >= s.length() || to >= s.length()) return s;
            
            String res = "";
            if(from < to)
                  for(int i=from; i<=to; i++) res += s.charAt(i);
            else
                  for(int i=from; i>=to; i--) res += s.charAt(i);
            return res;
      }
      
      /**
       * Reverses the order of the characters in the string
       * 
       * @param s The string to reverse
       * @return The reversed copy of the string
       */
      public static String reversed(String s) {
            if(s == null || s.length() < 2) return s;
            String res = "";
            for(int i=s.length()-1; i>=0; i--) res += s.charAt(i);
            return res;
      }
      
      
}
