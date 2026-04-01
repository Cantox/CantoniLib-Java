package Extra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Console {
      private static final DecimalFormatSymbols simboliDecimali = DecimalFormatSymbols.getInstance(Locale.US);
      
      private Console() {}
      
      
      private static void printMsg(String msg){
                System.out.print(msg);
                System.out.flush();
        }
        
        public static String leggiRiga(){
                String s = new String();
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                
                try { s = in.readLine(); }
                catch (java.io.IOException e) { System.out.println("Errore lettura riga: " + e.getMessage()); }
                
                return(s);
        }
        public static String leggiRiga(boolean trim){
                String s = new String();
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                
                try { s = in.readLine(); }
                catch (java.io.IOException e) { System.out.println("Errore lettura riga: " + e.getMessage()); }
                
                return (trim) ?  s.trim() : s;
        }
        public static String leggiRiga(String msg){
                printMsg(msg);
                return Console.leggiRiga();
        }
        
        public static int leggiInt(String msg){
                printMsg(msg);
                while(true){
                        try { return Integer.parseInt(Console.leggiRiga(true)); } 
                        catch(NumberFormatException e) { System.out.print("Il dato inserito non è un intero, riprovare: "); }
                }
        }
        public static long leggiLong(String msg){
                printMsg(msg);
                while(true){
                        try { return Long.parseLong(Console.leggiRiga(true)); } 
                        catch(NumberFormatException e) { System.out.print("Il dato inserito non è un long, riprovare: "); }
                }
        }
        public static float leggiFloat(String msg){
                printMsg(msg);
                while(true){
                        try { return Float.parseFloat(Console.leggiRiga(true)); } 
                        catch(NumberFormatException e) { System.out.print("Il dato inserito non è un float, riprovare: "); }
                }
        }
        public static double leggiDouble(String msg){
                printMsg(msg);
                while(true){
                        try { return Double.parseDouble(Console.leggiRiga(true)); } 
                        catch(NumberFormatException e) { System.out.print("Il dato inserito non è un double, riprovare: "); }
                }
        }
        public static char leggiChar(String msg){
                printMsg(msg);
                while(true){
                        String s = Console.leggiRiga();
                        if(s.length() != 1) System.out.print("Inserire un solo carattere, riprovare: ");
                        else return s.charAt(0);
                }
        }
        
        
        public static String formatta(int numero, int larghezza){
                String n = Integer.toString(numero), s = " ".repeat(Math.max(0, larghezza - n.length()));
                return s.concat(n);
        }
        public static String formatta(long numero, int larghezza){
                String n = Long.toString(numero), s = " ".repeat(Math.max(0, larghezza - n.length()));
                return s.concat(n);
        }
        
        public static String formatta(float numero, int decimali){
                if(decimali < 1) decimali = 1;
                
                String pattern = "0." + "0".repeat(decimali);
                DecimalFormat df = new DecimalFormat(pattern, simboliDecimali);
                
                return df.format(numero);
        }
        public static String formatta(float numero, int decimali, int larghezza){
                if(decimali < 1) decimali = 1;
                
                String pattern = "0." + "0".repeat(decimali);
                DecimalFormat df = new DecimalFormat(pattern, simboliDecimali);

                String n = Integer.toString((int)numero);
                String s =  " ".repeat(Math.max(0, larghezza - n.length()));
                
                return s.concat(df.format(numero));
        }
        public static String formatta(double numero, int decimali){
                if(decimali < 1) decimali = 1;
                
                String pattern = "0." + "0".repeat(decimali);
                DecimalFormat df = new DecimalFormat(pattern, simboliDecimali);
                
                return df.format(numero);
        }
        public static String formatta(double numero, int decimali, int larghezza){
                if(decimali < 1) decimali = 1;
                
                String pattern = "0." + "0".repeat(decimali);
                DecimalFormat df = new DecimalFormat(pattern, simboliDecimali);

                String n = Integer.toString((int)numero);
                String s =  " ".repeat(Math.max(0, larghezza - n.length()));
                
                return s.concat(df.format(numero));
        }
        
        public static String formatta(char carattere, int larghezza){
                String s = " ".repeat(larghezza-1);
                return s.concat(String.valueOf(carattere));
        }
        
        
        public static final String NERO = "\033[30m";
        public static final String ROSSO = "\033[31m";
        public static final String VERDE = "\033[32m";
        public static final String GIALLO = "\033[33m";
        public static final String BLU = "\033[34m";
        public static final String VIOLA = "\033[35m";
        public static final String CIANO = "\033[36m";
        public static final String BIANCO = "\033[37m";
        
        public static final String BG_NERO = "\033[40m";
        public static final String BG_ROSSO = "\033[41m";
        public static final String BG_VERDE = "\033[42m";
        public static final String BG_GIALLO = "\033[43m";
        public static final String BG_BLU = "\033[44m";
        public static final String BG_VIOLA = "\033[45m";
        public static final String BG_CIANO = "\033[46m";
        public static final String BG_BIANCO = "\033[47m";
        
        public static final String RESET = "\033[0m";
        public static final String GRASSETTO = "\033[1m";
        public static final String ITALICO = "\033[3m";
        public static final String SOTTOLINEATO = "\033[4m";
        public static final String BARRATO = "\033[9m";
}
