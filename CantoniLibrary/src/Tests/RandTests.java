package Tests;



import CantoniLib.Rand;

public class RandTests {
        public static void newData(){
                System.out.println("--- GENERATE DATA ---");
                System.out.println("Byte (0 - 1): " + Rand.newByte((byte)0, (byte)1));
                System.out.println("Short (0 - 1): " + Rand.newShort((short)0, (short)1));
                System.out.println("Int (0 - 5): " + Rand.newInt(0, 5));
                System.out.println("Long (0 - 7): " + Rand.newLong(0, 7));
                System.out.println("Float (0 - 5.5f): " + Rand.newFloat(0, 5.5f));
                System.out.println("Double (0 - 3.3): " + Rand.newDouble(0,3.3));
                System.out.println("Char (a - z): " + Rand.newChar('a', 'z'));
                System.out.println("Boolean: " + Rand.newBoolean());
                System.out.println();
        }
        
        public static void newStrings(){
                System.out.println("--- GENERATE STRINGS ---");
                System.out.println("Letters lowercase: " + Rand.newStringLetters(10, false));
                System.out.println("Letters uppercase: " + Rand.newStringLetters(10, true));
                System.out.println("Numbers: " + Rand.newStringNumbers(10));
                System.out.println("Alphanumerical lowercase: " + Rand.newStringAlphanumerical(10, false));
                System.out.println("Alphanumerical uppercase: " + Rand.newStringAlphanumerical(10, true));
                System.out.println("Letters mixed: " + Rand.newStringLettersMixed(10));
                System.out.println("Alphanumerical mixed: " + Rand.newStringAlphanumericalMixed(10));
                System.out.println();
        }
        
        public static void chance(){
                System.out.println("--- CHANCE 30% (10 TRIES) ---");
                for(int i=0; i<10; i++)
                        System.out.println("Result: " + Rand.chance(0.3));
                System.out.println();
        }
        public static void chance(int tries){
                System.out.println("--- CHANCE 30% (" + tries + " TRIES) ---");
                for(int i=0; i<tries; i++)
                        System.out.println("Result: " + Rand.chance(0.3));
                System.out.println();
        }
        
        public static void dice(){
                System.out.println("--- DICE THROWS ---");
                System.out.println("d4: " + Rand.d4());
                System.out.println("d6: " + Rand.d6());
                System.out.println("d8: " + Rand.d8());
                System.out.println("d10: " + Rand.d10());
                System.out.println("d12: " + Rand.d12());
                System.out.println("d20: " + Rand.d20());
                System.out.println("d50: " + Rand.d50());
                System.out.println("d100: " + Rand.d100());
                System.out.println();
        }
}
