package io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.IOException;

/**
* Utility class with methods to write files
* 
* @author Cantoni Alessandro
*/
public class Writer {
      protected Writer() {}
      
      /**
       * Writes all the rows in the array in the given file<br>
       * If the given file doesn't exits, it creates it
       * 
       * @param filePath The file path
       * @param rows The rows to write in the file
       */
      public static void writeFile(String filePath, String[] rows) {
            try ( PrintWriter file = new PrintWriter( new FileWriter(filePath) ) ) {
                  for (String row : rows) file.println(row);
            }
            catch (IOException e) { System.err.println("Error writing file: " + e.getMessage()); }
      }
      /**
       * Writes the string in the given file<br>
       * If the given file doesn't exits, it creates it
       * 
       * @param filePath The file path
       * @param content The string to write in the file
       */
      public static void writeFile(String filePath, String content) {
            try ( PrintWriter file = new PrintWriter( new FileWriter(filePath) ) ) {
                  file.print(content);
            }
            catch (IOException e) { System.err.println("Error writing file: " + e.getMessage()); }
      }
      
      /**
       * Writes all the bytes in the array in the given file<br>
       * If the given file doesn't exits, it creates it
       * 
       * @param filePath The file path
       * @param bytes The bytes to write in the file
       */
      public static void writeBinFile(String filePath, int[] bytes) {
            try ( FileOutputStream out = new FileOutputStream(filePath) ) {
                  for (int b : bytes) out.write(b);
            }
            catch (IOException e) { System.err.println("Error writing file: " + e.getMessage()); }
      }
      /**
       * Writes the string (converted to bytes) in the given file<br>
       * If the given file doesn't exits, it creates it
       * 
       * @param filePath The file path
       * @param content The string to write in the file
       */
      public static void writeBinFile(String filePath, String content) {
            try (FileOutputStream out = new FileOutputStream(filePath)) {
                  byte[] strBytes = content.getBytes();
                  out.write(strBytes);
            } 
            catch (IOException e) { System.err.println("Error writing file: " + e.getMessage()); }
      }
}
