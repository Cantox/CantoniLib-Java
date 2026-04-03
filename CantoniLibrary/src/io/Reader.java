package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Utility class with methods to read files
 * 
 * @author Cantoni Alessandro
 */
public class Reader {
      protected Reader() {}
      
      /**
       * Returns an array containing all the rows of the given file
       * 
       * @param filePath The file path
       * @return The array with the rows
       */
      public static String[] readFile(String filePath) {
            ArrayList<String> rows = new ArrayList();
            
            try ( BufferedReader file = new BufferedReader( new FileReader(filePath) ) ){
                  String row;
                  while( (row = file.readLine()) != null) rows.add(row);
            }
            catch (IOException e) { System.out.println("Error reading file: " + e.getMessage()); return new String[0]; }
            
            return rows.toArray(String[]::new);
      }
      /**
       * Returns a string containing all the rows of the file separated with the
       * given string
       * 
       * @param filePath The file path
       * @param lineSeparator The string that sparates each row in the returned string
       * @return The string containing all the rows
       */
      public static String readFile(String filePath, String lineSeparator) {
            String fileContent = "";
            
            try ( BufferedReader file = new BufferedReader( new FileReader(filePath) ) ){
                  String row;
                  while( (row = file.readLine()) != null) fileContent = fileContent.concat(row + lineSeparator);
            }
            catch (IOException e) { System.out.println("Error reading file: " + e.getMessage()); return ""; }
            
            return fileContent;
      }
      
      /**
       * Returns an array of integers ccontaining all the bytes read
       * 
       * @param filePath The file path
       * @return The array with the bytes
       */
      public static int[] readBinFile(String filePath){
            ArrayList<Integer> bytes = new ArrayList();
            
            try ( FileInputStream in = new FileInputStream(filePath) ) {
                  int byteRead;
                  while ( (byteRead = in.read()) != -1 ) bytes.add(byteRead);
            } 
            catch (IOException e) { System.err.println("Error reading file: " + e.getMessage()); }
            
            int[] result = new int[bytes.size()];
            for (int i = 0; i < bytes.size(); i++) result[i] = bytes.get(i);
            return result;
      }
      /**
       * Returns a string containing all the bytes read separated by the given
       * separator
       * 
       * @param filePath The file path
       * @param byteSeparator The string that separates each byte in the returned string
       * @return The string containing all the bytes
       */
      public static String readBinFile(String filePath, String byteSeparator){
            String fileContent = "";
            
            try ( FileInputStream in = new FileInputStream(filePath) ) {
                  int byteRead;
                  while ( (byteRead = in.read()) != -1 ) fileContent = fileContent.concat(Integer.toString(byteRead) + byteSeparator);
            } 
            catch (IOException e) { System.err.println("Error reading file: " + e.getMessage()); }
            
            return fileContent;
      }
}
