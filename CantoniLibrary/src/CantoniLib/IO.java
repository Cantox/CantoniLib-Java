package CantoniLib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class IO {
      private static final String RED = "\033[31m";
      private static final String RESET = "\033[0m";
      
      private IO() {}
      
      public static String[] readLines(String filePath) {
            ArrayList<String> rows = new ArrayList();
            
            BufferedReader file;
            try { file = new BufferedReader( new FileReader(filePath) ); }
            catch (IOException e) { System.out.println(RED + "IOEexception: " + e + RESET); return new String[0]; }
            
            String row = new String();
            while(row!=null) {
                  try { row = file.readLine(); }
                  catch (IOException e) { System.out.println(RED + "IOEexception: " + e + RESET); }
                  
                  if(row!=null) rows.add(row);
            }
            
            try { file.close(); }
            catch (IOException e) { System.out.println(RED + "IOEexception: " + e + RESET); }
            
            return (String[]) rows.toArray();
      }
      
      public static String readFile(String filePath) {
            String fileContent = "";
            
            BufferedReader file;
            try { file = new BufferedReader( new FileReader(filePath) ); }
            catch (IOException e) { System.out.println(RED + "IOEexception: " + e + RESET); return ""; }
            
            String row = new String();
            while(row!=null) {
                  try { row = file.readLine(); }
                  catch (IOException e) { System.out.println(RED + "IOEexception: " + e + RESET); }
                  
                  if(row!=null) fileContent = fileContent.concat(row);
            }
            
            try { file.close(); }
            catch (IOException e) { System.out.println(RED + "IOEexception: " + e + RESET); }
            
            return fileContent;
      }
      
      public static void writeFile(String filePath, String[] rows) {
            PrintWriter file;
            try { file = new PrintWriter( new FileWriter(filePath) ); }
            catch (IOException e) { System.out.println(RED + "IOEexception: " + e + RESET); return; }
            
            for(String row : rows)
                  file.println(row);
            
            file.close();
      }
      public static void writeFile(String filePath, String content) {
            PrintWriter file;
            try { file = new PrintWriter( new FileWriter(filePath) ); }
            catch (IOException e) { System.out.println(RED + "IOEexception: " + e + RESET); return; }
            
            file.print(content);
            
            file.close();
      }
      
}
