package CantoniLib;

import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Console {
        private static final DecimalFormatSymbols decimalSymbols = DecimalFormatSymbols.getInstance(Locale.US);
        private static void printMsg(String msg){
                System.out.print(msg);
                System.out.flush();
        }
        
        public static String readLine(){
                String s = new String();
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                
                try { s = in.readLine(); }
                catch (java.io.IOException e) { System.out.println("Line reading error" + e); }
                
                return(s);
        }
        public static String readLine(boolean trim){
                String s = new String();
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                
                try { s = in.readLine(); }
                catch (java.io.IOException e) { System.out.println("Line reading error" + e); }
                
                if(trim) s = s.trim();
                return(s);
        }
        public static String readLine(String msg){
                printMsg(msg);
                return readLine();
        }
        public static String readLine(String msg, boolean trim){
                printMsg(msg);
                return readLine(trim);
        }
        public static byte readByte(String msg){
                printMsg(msg);
                while(true){
                        try { return Byte.parseByte(readLine(true)); } 
                        catch(NumberFormatException e) { System.out.print("Not a byte, retry: "); }
                }
        }
        public static short readShort(String msg){
                printMsg(msg);
                while(true){
                        try { return Short.parseShort(readLine(true)); } 
                        catch(NumberFormatException e) { System.out.print("Not a short, retry: "); }
                }
        }
        public static int readInt(String msg){
                printMsg(msg);
                while(true){
                        try { return Integer.parseInt(readLine(true)); } 
                        catch(NumberFormatException e) { System.out.print("Not an integer, retry: "); }
                }
        }
        public static long readLong(String msg){
                printMsg(msg);
                while(true){
                        try { return Long.parseLong(readLine(true)); } 
                        catch(NumberFormatException e) { System.out.print("Not a long, retry: "); }
                }
        }
        public static float readFloat(String msg){
                printMsg(msg);
                while(true){
                        try { return Float.parseFloat(readLine(true)); } 
                        catch(NumberFormatException e) { System.out.print("Not a float, retry: "); }
                }
        }
        public static double readDouble(String msg){
                printMsg(msg);
                while(true){
                        try { return Double.parseDouble(readLine(true)); } 
                        catch(NumberFormatException e) { System.out.print("Not a double, retry: "); }
                }
        }
        public static char readChar(String msg){
                printMsg(msg);
                while(true){
                        String s = readLine();
                        if(s.length() != 1)
                                System.out.print("Only one character, retry: ");
                        else
                                return s.charAt(0);
                }
        }
        public static boolean readBoolean(String msg){
                printMsg(msg);
                while(true){
                        try { return Boolean.parseBoolean(readLine(true)); } 
                        catch(NumberFormatException e) { System.out.print("Not a boolean value (0 = false, 1 = true), retry: "); }
                }
        }
        
        public static String format(byte number, int width){
                String n = Byte.toString(number), s = " ".repeat(Math.max(0, width - n.length()));
                return s.concat(n);
        }
        public static String format(short number, int width){
                String n = Short.toString(number), s = " ".repeat(Math.max(0, width - n.length()));
                return s.concat(n);
        }
        public static String format(int number, int width){
                String n = Integer.toString(number), s = " ".repeat(Math.max(0, width - n.length()));
                return s.concat(n);
        }
        public static String format(long number, int width){
                String n = Long.toString(number), s = " ".repeat(Math.max(0, width - n.length()));
                return s.concat(n);
        }
        public static String format(float number, int decimals){
                if(decimals < 1) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern, decimalSymbols);
                
                return df.format(number);
        }
        public static String format(float number, int decimals, int width){
                if(decimals < 1) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals); // Make the formatting patter
                DecimalFormat df = new DecimalFormat(pattern, decimalSymbols); // Creating the decimal formatter obj

                String n = Integer.toString((int)number); // Get the width of the integer part
                String s =  " ".repeat(Math.max(0, width - n.length())); // Calculate the space to add behind
                
                return s.concat(df.format(number)); // Return space + formatted number
        }
        public static String format(double number, int decimals){
                if(decimals < 1) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals);
                DecimalFormat df = new DecimalFormat(pattern, decimalSymbols);
                
                return df.format(number);
        }
        public static String format(double number, int decimals, int width){
                if(decimals < 1) decimals = 1;
                
                String pattern = "0." + "0".repeat(decimals); // Make the formatting patter
                DecimalFormat df = new DecimalFormat(pattern, decimalSymbols); // Creating the decimal formatter obj

                String n = Integer.toString((int)number); // Get the width of the integer part
                String s =  " ".repeat(Math.max(0, width - n.length())); // Calculate the space to add behind
                
                return s.concat(df.format(number)); // Return space + formatted number
        }
        public static String format(char character, int width){
                String s = " ".repeat(width-1);
                return s.concat(String.valueOf(character));
        }
        public static String format(boolean value, int width){
                String n = Boolean.toString(value), s = " ".repeat(Math.max(0, width - n.length()));
                return s.concat(n);
        }
        
        public static final String BLACK = "\033[30m";
        public static final String RED = "\033[31m";
        public static final String GREEN = "\033[32m";
        public static final String YELLOW = "\033[33m";
        public static final String BLUE = "\033[34m";
        public static final String PURPLE = "\033[35m";
        public static final String CYAN = "\033[36m";
        public static final String WHITE = "\033[37m";
        
        public static final String LIGHT_BLACK = "\033[90m";
        public static final String LIGHT_RED = "\033[91m";
        public static final String LIGHT_GREEN = "\033[92m";
        public static final String LIGHT_YELLOW = "\033[93m";
        public static final String LIGHT_BLUE = "\033[94m";
        public static final String LIGHT_PURPLE = "\033[95m";
        public static final String LIGHT_CYAN = "\033[96m";
        public static final String LIGHT_WHITE = "\033[97m";
        
        public static final String BG_BLACK = "\033[40m";
        public static final String BG_RED = "\033[41m";
        public static final String BG_GREEN = "\033[42m";
        public static final String BG_YELLOW = "\033[43m";
        public static final String BG_BLUE = "\033[44m";
        public static final String BG_PURPLE = "\033[45m";
        public static final String BG_CYAN = "\033[46m";
        public static final String BG_WHITE = "\033[47m";
        
        public static final String BG_LIGHT_BLACK = "\033[100m";
        public static final String BG_LIGHT_RED = "\033[101m";
        public static final String BG_LIGHT_GREEN = "\033[102m";
        public static final String BG_LIGHT_YELLOW = "\033[103m";
        public static final String BG_LIGHT_BLUE = "\033[104m";
        public static final String BG_LIGHT_PURPLE = "\033[105m";
        public static final String BG_LIGHT_CYAN = "\033[106m";
        public static final String BG_LIGHT_WHITE = "\033[107m";
        
        public static final String RESET = "\033[0m";
        public static final String BOLD = "\033[1m";
        public static final String DIM = "\033[2m";
        public static final String ITALIC = "\033[3m";
        public static final String UNDERLINE = "\033[4m";
        public static final String BLINK = "\033[5m";
        public static final String FAST_BLINK = "\033[6m";
        public static final String REVERSE = "\033[7m";
        public static final String HIDDEN = "\033[8m";
        public static final String STRIKETHROUGH = "\033[9m";
        
        public static final String CLEAR = "\033[2J";
        public static final String CURSOR_HOME = "\033[H";
        public static String MOVE_CURSOR(int row, int column){
                return "\033[" + Integer.toString(row) + ";" + Integer.toString(column) + "H";
        }
}

