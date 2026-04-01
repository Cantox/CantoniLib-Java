package Extra;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Scrittore {
      private Scrittore() {}
      
      public static void scriviFile(String percorsoFile, String[] righe) {
            try ( PrintWriter file = new PrintWriter( new FileWriter(percorsoFile) ) ) {
                  for (String riga : righe) file.println(riga);
            }
            catch (IOException e) { System.err.println("Errore scrittura file: " + e.getMessage()); }
      }
      public static void scriviFile(String perecorsoFile, String contenuto) {
            try ( PrintWriter file = new PrintWriter( new FileWriter(perecorsoFile) ) ) {
                  file.print(contenuto);
            }
            catch (IOException e) { System.err.println("Errore scrittura file: " + e.getMessage()); }
      }
      
      
      public static void scriviFileBin(String percorsoFile, int[] bytes) {
            try ( FileOutputStream out = new FileOutputStream(percorsoFile) ) {
                  for (int b : bytes) out.write(b);
            }
            catch (IOException e) { System.err.println("Errore scrittura file: " + e.getMessage()); }
      }
      public static void scriviFileBin(String percorsoFile, String contenuto) {
            try (FileOutputStream out = new FileOutputStream(percorsoFile)) {
                  byte[] strBytes = contenuto.getBytes();
                  out.write(strBytes);
            } 
            catch (IOException e) { System.err.println("Errore scrittura file: " + e.getMessage()); }
      }
}
