package console;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Utility class used to get input from user via console
 * 
 * @author Cantoni Alessandro
 */
public class In {
      protected In() {}
      
      private static void printMsg(String msg){
            System.out.print(msg);
            System.out.flush();
      }

      /**
       * Reads the string input from the console
       * 
       * @return The read string
       */
      public static String readLine(){
            String s = new String();
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            try { s = in.readLine(); }
            catch (java.io.IOException e) { System.out.println("Line reading error" + e); }

            return(s);
      }
      /**
       * Reads the string input from the console and
       * trims it (if parameter trim is true)
       * 
       * @param trim Whether or not to trim the input string
       * @return The read string
       */
      public static String readLine(boolean trim){
            String s = new String();
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            try { s = in.readLine(); }
            catch (java.io.IOException e) { System.out.println("Line reading error" + e); }

            if(trim) s = s.trim();
            return(s);
      }
      /**
       * Prints the message, then reads the string input from the console
       * 
       * @param msg The printed message
       * @return The read string
       */
      public static String readLine(String msg){
            printMsg(msg);
            return readLine();
      }
      /**
       * Prints the message, then reads the string input from the console and
       * trims it (if parameter trim is true)
       * 
       * @param msg The printed message
       * @param trim Whether or not to trim the input string
       * @return The read string
       */
      public static String readLine(String msg, boolean trim){
            printMsg(msg);
            return readLine(trim);
      }
      
      /**
       * Prints the message, then reads the input String until 
       * it's able to convert it to a byte value
       * 
       * @param msg The printed message
       * @return The byte read
       */
      public static byte readByte(String msg){
            printMsg(msg);
            while(true){
                  try { return Byte.parseByte(readLine(true)); } 
                  catch(NumberFormatException e) { System.out.print("Not a byte, retry: "); }
            }
      }
      
      /**
       * Prints the message, then reads the input String until 
       * it's able to convert it to a short value
       * 
       * @param msg The printed message
       * @return The short read
       */
      public static short readShort(String msg){
            printMsg(msg);
            while(true){
                  try { return Short.parseShort(readLine(true)); } 
                  catch(NumberFormatException e) { System.out.print("Not a short, retry: "); }
            }
      }
      
      /**
       * Prints the message, then reads the input String until 
       * it's able to convert it to a int value
       * 
       * @param msg The printed message
       * @return The int read
       */
      public static int readInt(String msg){
            printMsg(msg);
            while(true){
                  try { return Integer.parseInt(readLine(true)); } 
                  catch(NumberFormatException e) { System.out.print("Not an integer, retry: "); }
            }
      }
      
      /**
       * Prints the message, then reads the input String until 
       * it's able to convert it to a long value
       * 
       * @param msg The printed message
       * @return The long read
       */
      public static long readLong(String msg){
            printMsg(msg);
            while(true){
                  try { return Long.parseLong(readLine(true)); } 
                  catch(NumberFormatException e) { System.out.print("Not a long, retry: "); }
            }
      }
      
      /**
       * Prints the message, then reads the input String until 
       * it's able to convert it to a float value
       * 
       * @param msg The printed message
       * @return The float read
       */
      public static float readFloat(String msg){
            printMsg(msg);
            while(true){
                  try { return Float.parseFloat(readLine(true)); } 
                  catch(NumberFormatException e) { System.out.print("Not a float, retry: "); }
            }
      }
      
      /**
       * Prints the message, then reads the input String until 
       * it's able to convert it to a double value
       * 
       * @param msg The printed message
       * @return The double read
       */
      public static double readDouble(String msg){
            printMsg(msg);
            while(true){
                  try { return Double.parseDouble(readLine(true)); } 
                  catch(NumberFormatException e) { System.out.print("Not a double, retry: "); }
            }
      }
      
      /**
       * Prints the message, then reads the input String until 
       * it's able to convert it to a char value
       * 
       * @param msg The printed message
       * @return The char read
       */
      public static char readChar(String msg){
            printMsg(msg);
            while(true){
                  String s = readLine();
                  if(s.length() != 1) System.out.print("Only one character, retry: ");
                  else return s.charAt(0);
            }
      }
      
      /**
       * Prints the message, then reads the input String until 
       * it's able to convert it to a boolean value
       * 
       * @param msg The printed message
       * @return The boolean read
       */
      public static boolean readBoolean(String msg){
            printMsg(msg);
            while(true){
                  try { return Boolean.parseBoolean(readLine(true)); }
                  catch(NumberFormatException e) { System.out.print("Not a boolean value (0 = false, 1 = true), retry: "); }
            }
      }
}
