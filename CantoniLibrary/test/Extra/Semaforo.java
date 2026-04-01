package Extra;

public class Semaforo {
      private int valore;
      
      public Semaforo(int valore) {
            this.valore = valore;
      }
      
      synchronized public void P() {
            while(valore<=0) {
                  try { wait(); }   // Thread viene sospeso
                  catch (InterruptedException e) {}
            }
            
            valore--;
      }
      
      synchronized public void V() {
            valore++;
            notify();   // Risveglia primo thread in coda
      }
}
