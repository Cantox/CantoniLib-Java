package CantoniLib;

public class Semaphore {
      private int value;

      /**
       * Semaphore constructor
       * 
       * @param value The instances of the resource
       */
      public Semaphore(int value) {
            this.value = value;
      }

      /**
       * If there are no available resource instances (Semaphore 
       * value = 0) the threads gets suspended and put in the queue, 
       * otherwise an instance of the resource is given to it (value--)
       */
      synchronized public void P() {
            while(value<=0) {
                  try { wait(); }   // Thread gets suspendeds and is put in the queue
                  catch (InterruptedException e) {}
            }
            value--;
      }

      /**
       * Releases an istance of the resource (value++)
       * and wakes up the first thread in the queue
       */
      synchronized public void V() {
            value++;
            notify();   // Wakes up first thread in queue
      }
}
