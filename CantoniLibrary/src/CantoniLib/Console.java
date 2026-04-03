package CantoniLib;

/**
 * Library containing various methods used to 
 * work with the console
 * 
 * @author Cantoni Alessandro
 */
public class Console {
      private Console() {}
      
      /**
      * Utility class used to get input from user via console
      * 
      * @author Cantoni Alessandro
      */
      public static final class In extends console.In{}
      
      /**
      * Utility class containing constants and methods to
      * format text to print in console
      * 
      * @author Cantoni Alessandro
      */
      public static final class Out extends console.Out {}
}
