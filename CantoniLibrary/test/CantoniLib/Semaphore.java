package CantoniLib;

public class Semaphore {
      private int value;
      
      public Semaphore(int value) {
            this.value = value;
      }
      
      synchronized public void P() {
            while(value<=0) {
                  try { wait(); }   // Thread gets suspendeds and is put in the queue
                  catch (InterruptedException e) {}
            }
            
            value--;
      }
      
      synchronized public void V() {
            value++;
            notify();   // Wakes up first thread in queue
      }
}
