package Extra;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lettore {
      private Lettore() {}
      
      public static String[] leggiFile(String percorsoFile) {
            ArrayList<String> righe = new ArrayList();
            
            try ( BufferedReader file = new BufferedReader( new FileReader(percorsoFile) ) ){
                  String riga;
                  while( (riga = file.readLine()) != null) righe.add(riga);
            }
            catch (IOException e) { System.out.println("Errore lettura file: " + e.getMessage()); }
            
            return righe.toArray(String[]::new);
      }
      public static String leggiFile(String percorsoFile, String separatoreRighe) {
            String contenutiFile = "";
            
            try ( BufferedReader file = new BufferedReader( new FileReader(percorsoFile) ) ){
                  String riga;
                  while( (riga = file.readLine()) != null) contenutiFile = contenutiFile.concat(riga + separatoreRighe);
            }
            catch (IOException e) { System.out.println("Errore lettura file: " + e.getMessage()); }
            
            return contenutiFile;
      }
      
      
      public static int[] leggiFileBinario(String percorsoFile){
            ArrayList<Integer> bytes = new ArrayList();
            
            try ( FileInputStream in = new FileInputStream(percorsoFile) ) {
                  int byteLetto;
                  while ( (byteLetto = in.read()) != -1 ) bytes.add(byteLetto);
            } 
            catch (IOException e) { System.err.println("Errore lettura file: " + e.getMessage()); }
            
            int[] ris = new int[bytes.size()];
            for (int i = 0; i < bytes.size(); i++) ris[i] = bytes.get(i);
            return ris;
      }
      public static String leggiFileBinario(String percorsoFile, String separatoreByte){
            String contenutiFile = "";
            
            try ( FileInputStream in = new FileInputStream(percorsoFile) ) {
                  int byteLetto;
                  while ( (byteLetto = in.read()) != -1 ) contenutiFile = contenutiFile.concat(Integer.toString(byteLetto) + separatoreByte);
            } 
            catch (IOException e) { System.err.println("Errore lettura file: " + e.getMessage()); }
            
            return contenutiFile;
      }
}
