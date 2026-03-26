package CantoniLib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.ArrayList;

public class IO {
      
      private IO() {}
      
      public static String[] readFile(String filePath) {
            ArrayList<String> rows = new ArrayList();
            
            try ( BufferedReader file = new BufferedReader( new FileReader(filePath) ) ){
                  String row;
                  while( (row = file.readLine()) != null) 
                        rows.add(row);
            }
            catch (IOException e) { System.out.println("Error reading file: " + e.getMessage()); return new String[0]; }
            
            return rows.toArray(String[]::new);
      }
      public static String readFile(String filePath, String lineSeparator) {
            String fileContent = "";
            
            try ( BufferedReader file = new BufferedReader( new FileReader(filePath) ) ){
                  String row;
                  while( (row = file.readLine()) != null) 
                        fileContent = fileContent.concat(row + lineSeparator);
            }
            catch (IOException e) { System.out.println("Error reading file: " + e.getMessage()); return ""; }
            
            return fileContent;
      }
      
      public static void writeFile(String filePath, String[] rows) {
            try ( PrintWriter file = new PrintWriter( new FileWriter(filePath) ) ) {
                  for (String row : rows) 
                        file.println(row);
            }
            catch (IOException e) { System.err.println("Error writing file: " + e.getMessage()); }
      }
      public static void writeFile(String filePath, String content) {
            try ( PrintWriter file = new PrintWriter( new FileWriter(filePath) ) ) {
                  file.print(content);
            }
            catch (IOException e) { System.err.println("Error writing file: " + e.getMessage()); }
      }
      
      public static int[] readBinFile(String filePath){
            ArrayList<Integer> bytes = new ArrayList();
            
            try ( FileInputStream in = new FileInputStream(filePath) ) {
                  int byteRead;
                  while ( (byteRead = in.read()) != -1 ) 
                        bytes.add(byteRead);
            } 
            catch (IOException e) { System.err.println("Error reading file: " + e.getMessage()); }
            
            int[] result = new int[bytes.size()];
            for (int i = 0; i < bytes.size(); i++) result[i] = bytes.get(i);
            return result;
      }
      public static String readBinFile(String filePath, String byteSeparator){
            String fileContent = "";
            
            try ( FileInputStream in = new FileInputStream(filePath) ) {
                  int byteRead;
                  while ( (byteRead = in.read()) != -1 ) 
                        fileContent = fileContent.concat(Integer.toString(byteRead) + byteSeparator);
            } 
            catch (IOException e) { System.err.println("Error reading file: " + e.getMessage()); }
            
            return fileContent;
      }
      
      public static void writeBinFile(String filePath, int[] bytes) {
            try ( FileOutputStream out = new FileOutputStream(filePath) ) {
                  for (int b : bytes)
                        out.write(b);
            }
            catch (IOException e) { System.err.println("Error writing file: " + e.getMessage()); }
      }
      public static void writeBinFile(String filePath, String content) {
            try (FileOutputStream out = new FileOutputStream(filePath)) {
                  byte[] strBytes = content.getBytes();
                  out.write(strBytes);
            } 
            catch (IOException e) { System.err.println("Error writing file: " + e.getMessage()); }
      }
}
