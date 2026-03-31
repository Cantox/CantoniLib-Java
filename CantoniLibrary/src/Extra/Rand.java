package Extra;

import java.util.Random;

public class Rand {
      private static final Random r = new Random();
        
        private Rand() {}
        
        public static int generaInt(int min, int max){
                if(min > max) throw new IllegalArgumentException("min > max");
                return r.nextInt((max-min) + 1) + min;
        }
        public static long generaLong(long min, long max){
                if(min > max) throw new IllegalArgumentException("min > max");
                return r.nextLong((max-min)+1) + min;
        }
        public static float generaFloat(float min, float max){
                if(min > max) throw new IllegalArgumentException("min > max");
                return r.nextFloat() * (max-min) + min;
        }
        public static double generaDouble(double min, double max){
                if(min > max) throw new IllegalArgumentException("min > max");
                return r.nextDouble() * (max-min) + min;
        }
        public static char generaChar(char min, char max){
                if(min > max) throw new IllegalArgumentException("min > max");
                return (char) (r.nextInt((max-min) + 1) + min);
        }
        public static boolean generaBoolean(){
                return r.nextBoolean();
        }
        
        public static String generaStringaLettere(int lunghezza, boolean uppercase){
                if (lunghezza < 0) throw new IllegalArgumentException("Lunghezza deve essere positiva");
                
                String s = "";
                int minChar = (int)'A', maxChar = (int)'Z';
                
                if(!uppercase){
                        minChar += 32;
                        maxChar += 32;
                }
                
                for(int i=0; i<lunghezza; i++) s = s.concat(String.valueOf((char) (generaInt(minChar,maxChar))));
                return s;
        }
        public static String generaStringaNumeri(int lunghezza){
                if (lunghezza < 0) throw new IllegalArgumentException("Lunghezza deve essere positiva");
                
                String s = "";
                for(int i=0; i<lunghezza; i++) s = s.concat(String.valueOf(generaChar('0','9')));
                return s;
        }
        public static String generaStringaAlfanumerica(int lunghezza, boolean uppercase){
                if (lunghezza < 0) throw new IllegalArgumentException("Lunghezza deve essere positiva");
                
                String s = "";
                int minChar = (int)'A', maxChar = (int)'Z';
                
                if(!uppercase){
                        minChar += 32;
                        maxChar += 32;
                }
                
                for(int i=0; i<lunghezza; i++){
                        if(generaInt(0,35) <= 9)
                                s = s.concat(String.valueOf(generaChar('0','9')));
                        else
                                s = s.concat(String.valueOf((char) (generaInt(minChar,maxChar))));
                }
                
                return s;
        }
        public static String generaStringaLettereMiste(int lunghezza){
                if (lunghezza < 0) throw new IllegalArgumentException("Lunghezza deve essere positiva");
                
                String s = "";
                
                for(int i=0; i<lunghezza; i++){
                        if(generaBoolean())
                                s = s.concat(String.valueOf(generaChar('a','z')));
                        else
                                s = s.concat(String.valueOf(generaChar('A','Z')));
                }
                
                return s;
        }
        public static String generaStringaAlfanumericaMista(int lunghezza){
                if (lunghezza < 0) throw new IllegalArgumentException("Lunghezza deve essere positiva");
                
                String s = "";
                
                for(int i=0; i<lunghezza; i++){
                        if(generaInt(0,35) <= 9)
                                s = s.concat(String.valueOf(generaChar('0','9')));
                        else{
                                if(generaBoolean())
                                        s = s.concat(String.valueOf(generaChar('a','z')));
                                else
                                        s = s.concat(String.valueOf(generaChar('A','Z')));
                        }
                }
                
                return s;
        }
        
        public static boolean chance(double probabilità){
                if (probabilità < 0.0 || probabilità > 1.0) throw new IllegalArgumentException("Probabilità deve essere tra 0.0 e 1.0");
                return generaDouble(0.0,1.0) <= probabilità;
        }
}
