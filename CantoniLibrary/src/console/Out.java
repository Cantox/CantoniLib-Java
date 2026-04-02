package console;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Utility class containing constants and methods to
 * format text to print in console
 * 
 * @author Cantoni Alessandro
 */
public class Out {
      private static final DecimalFormatSymbols decimalSymbols = DecimalFormatSymbols.getInstance(Locale.US);
      
      protected Out() {}
      
      /**
       * Adds left padding to make the value occupy
       * at least the amount of characters given by the
       * width parameter
       * 
       * @param number The number to format
       * @param width The minimum character width of the value
       * @return The formatted number
       */
      public static String format(byte number, int width){
            String n = Byte.toString(number), s = " ".repeat(Math.max(0, width - n.length()));
            return s.concat(n);
      }
      
      /**
       * Adds left padding to make the value occupy
       * at least the amount of characters given by the
       * width parameter
       * 
       * @param number The number to format
       * @param width The minimum character width of the value
       * @return The formatted number
       */
      public static String format(short number, int width){
            String n = Short.toString(number), s = " ".repeat(Math.max(0, width - n.length()));
            return s.concat(n);
      }
      
      /**
       * Adds left padding to make the value occupy
       * at least the amount of characters given by the
       * width parameter
       * 
       * @param number The number to format
       * @param width The minimum character width of the value
       * @return The formatted number
       */
      public static String format(int number, int width){
            String n = Integer.toString(number), s = " ".repeat(Math.max(0, width - n.length()));
            return s.concat(n);
      }
      
      /**
       * Adds left padding to make the value occupy
       * at least the amount of characters given by the
       * width parameter
       * 
       * @param number The number to format
       * @param width The minimum character width of the value
       * @return The formatted number
       */
      public static String format(long number, int width){
            String n = Long.toString(number), s = " ".repeat(Math.max(0, width - n.length()));
            return s.concat(n);
      }

      /**
       * Formats the number giving it the given amount of decimal 
       * digits
       * 
       * @param number The number to format
       * @param decimals The amount of decimal digits
       * @return The formatted number
       */
      public static String format(float number, int decimals){
            if(decimals < 1) decimals = 1;

            String pattern = "0." + "0".repeat(decimals);
            DecimalFormat df = new DecimalFormat(pattern, decimalSymbols);

            return df.format(number);
      }
      /**
       * Formats the number giving it the given amount of decimal 
       * digits; then adds left padding to make the integer part occupy
       * at least the amount of characters given by the
       * width parameter
       * 
       * @param number The number to format
       * @param decimals The amount of decimal digits
       * @param width The minimum character width of the value
       * @return The formatted number
       */
      public static String format(float number, int decimals, int width){
            if(decimals < 1) decimals = 1;

            String pattern = "0." + "0".repeat(decimals);
            DecimalFormat df = new DecimalFormat(pattern, decimalSymbols);

            String n = Integer.toString((int)number), s =  " ".repeat(Math.max(0, width - n.length()));

            return s.concat(df.format(number));
      }
      
      /**
       * Formats the number giving it the given amount of decimal 
       * digits
       * 
       * @param number The number to format
       * @param decimals The amount of decimal digits
       * @return The formatted number
       */
      public static String format(double number, int decimals){
            if(decimals < 1) decimals = 1;

            String pattern = "0." + "0".repeat(decimals);
            DecimalFormat df = new DecimalFormat(pattern, decimalSymbols);

            return df.format(number);
      }
      /**
       * Formats the number giving it the given amount of decimal 
       * digits; then adds left padding to make the integer part occupy
       * at least the amount of characters given by the
       * width parameter
       * 
       * @param number The number to format
       * @param decimals The amount of decimal digits
       * @param width The minimum character width of the value
       * @return The formatted number
       */
      public static String format(double number, int decimals, int width){
            if(decimals < 1) decimals = 1;

            String pattern = "0." + "0".repeat(decimals);
            DecimalFormat df = new DecimalFormat(pattern, decimalSymbols);

            String n = Integer.toString((int)number), s =  " ".repeat(Math.max(0, width - n.length()));

            return s.concat(df.format(number));
      }
      
      /**
       * Adds left padding to make the character occupy
       * at least the amount of characters given by the
       * width parameter
       * 
       * @param character The character to format
       * @param width The minimum character width of the value
       * @return The formatted number
       */
      public static String format(char character, int width){
            String s = " ".repeat(width-1);
            return s.concat(String.valueOf(character));
      }
      
      /**
       * Adds left padding to make the boolean value occupy
       * at least the amount of characters given by the
       * width parameter
       * 
       * @param value The boolean value to format
       * @param width The minimum character width of the value
       * @return The formatted number
       */
      public static String format(boolean value, int width){
            String n = Boolean.toString(value), s = " ".repeat(Math.max(0, width - n.length()));
            return s.concat(n);
      }

      /**Sets the text color to BLACK ("\033[30m") */
      public static final String BLACK = "\033[30m";
      /**Sets the text color to RED ("\033[31m") */
      public static final String RED = "\033[31m";
      /**Sets the text color to GREEN ("\033[32m") */
      public static final String GREEN = "\033[32m";
      /**Sets the text color to YELLOW ("\033[33m") */
      public static final String YELLOW = "\033[33m";
      /**Sets the text color to BLUE ("\033[34m") */
      public static final String BLUE = "\033[34m";
      /**Sets the text color to PURPLE ("\033[35m") */
      public static final String PURPLE = "\033[35m";
      /**Sets the text color to CYAN ("\033[36m") */
      public static final String CYAN = "\033[36m";
      /**Sets the text color to WHITE ("\033[37m") */
      public static final String WHITE = "\033[37m";

      /**Sets the text color to LIGHT_BLACK ("\033[90m") */
      public static final String LIGHT_BLACK = "\033[90m";
      /**Sets the text color to LIGHT_RED ("\033[91m") */
      public static final String LIGHT_RED = "\033[91m";
      /**Sets the text color to LIGHT_GREEN ("\033[92m") */
      public static final String LIGHT_GREEN = "\033[92m";
      /**Sets the text color to LIGHT_YELLOW ("\033[93m") */
      public static final String LIGHT_YELLOW = "\033[93m";
      /**Sets the text color to LIGHT_BLUE ("\033[94m") */
      public static final String LIGHT_BLUE = "\033[94m";
      /**Sets the text color to LIGHT_PURPLE ("\033[95m") */
      public static final String LIGHT_PURPLE = "\033[95m";
      /**Sets the text color to LIGHT_CYAN ("\033[96m") */
      public static final String LIGHT_CYAN = "\033[96m";
      /**Sets the text color to LIGHT_WHITE ("\033[97m") */
      public static final String LIGHT_WHITE = "\033[97m";

      /**Sets the background color to BLACK ("\033[40m") */
      public static final String BG_BLACK = "\033[40m";
      /**Sets the background color to RED ("\033[41m") */
      public static final String BG_RED = "\033[41m";
      /**Sets the background color to GREEN ("\033[42m") */
      public static final String BG_GREEN = "\033[42m";
      /**Sets the background color to YELLOW ("\033[43m") */
      public static final String BG_YELLOW = "\033[43m";
      /**Sets the background color to BLUE ("\033[44m") */
      public static final String BG_BLUE = "\033[44m";
      /**Sets the background color to PURPLE ("\033[45m") */
      public static final String BG_PURPLE = "\033[45m";
      /**Sets the background color to CYAN ("\033[46m") */
      public static final String BG_CYAN = "\033[46m";
      /**Sets the background color to WHITE ("\033[47m") */
      public static final String BG_WHITE = "\033[47m";

      /**Sets the background color to LIGHT_BLACK ("\033[100m") */
      public static final String BG_LIGHT_BLACK = "\033[100m";
      /**Sets the background color to LIGHT_RED ("\033[101m") */
      public static final String BG_LIGHT_RED = "\033[101m";
      /**Sets the background color to LIGHT_GREEN ("\033[102m") */
      public static final String BG_LIGHT_GREEN = "\033[102m";
      /**Sets the background color to LIGHT_YELLOW ("\033[103m") */
      public static final String BG_LIGHT_YELLOW = "\033[103m";
      /**Sets the background color to LIGHT_BLUE ("\033[104m") */
      public static final String BG_LIGHT_BLUE = "\033[104m";
      /**Sets the background color to LIGHT_PURPLE ("\033[105m") */
      public static final String BG_LIGHT_PURPLE = "\033[105m";
      /**Sets the background color to LIGHT_CYAN ("\033[106m") */
      public static final String BG_LIGHT_CYAN = "\033[106m";
      /**Sets the background color to LIGHT_WHITE ("\033[107m") */
      public static final String BG_LIGHT_WHITE = "\033[107m";

      /**Resets all text modifications ("\033[0m") */
      public static final String RESET = "\033[0m";
      /**Sets the text to BOLD ("\033[1m") */
      public static final String BOLD = "\033[1m";
      /**Sets the text to DIM ("\033[2m") */
      public static final String DIM = "\033[2m";
      /**Sets the text to ITALIC ("\033[3m") */
      public static final String ITALIC = "\033[3m";
      /**UNDERLINES the text ("\033[4m") */
      public static final String UNDERLINE = "\033[4m";
      /**Sets the text to BLINK ("\033[5m") -- !On some systems it might not work! */
      public static final String BLINK = "\033[5m";
      /**Sets the text to FAST BLINK ("\033[6m") -- !On some systems it might not work! */
      public static final String FAST_BLINK = "\033[6m";
      /**Switches the text and the bakground color ("\033[7m") */
      public static final String REVERSE = "\033[7m";
      /**HIDES the text ("\033[8m") */
      public static final String HIDDEN = "\033[8m";
      /**STRIKES THROUGHT the text ("\033[9m") */
      public static final String STRIKETHROUGH = "\033[9m";

      /**CLEARS the console ("\033[2J") */
      public static final String CLEAR = "\033[2J";
      /**MOVES the cursor to 0;0 ("\033[H") */
      public static final String CURSOR_HOME = "\033[H";
      /**
       * MOVES the cursor to the given row and column
       * 
       * @param row The row to move the cursor to
       * @param column The column to move the cursor to
       * @return The ASCII code that moves the cursor
       */
      public static String MOVE_CURSOR(int row, int column){
            return "\033[" + Integer.toString(row) + ";" + Integer.toString(column) + "H";
      }
}
