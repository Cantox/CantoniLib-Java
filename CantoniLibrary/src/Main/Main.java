package Main;

import CantoniLib.Rand;

public class Main {
        public static void main(String[] args) {
                System.out.println("Byte: " + Rand.newByte((byte)0, (byte)1) + "\nShort: " + Rand.newShort((short)0, (short)1) + "\nInt: " + Rand.newInt(0, 5) + "\nLong: " + Rand.newLong(0, 7) + "\nFloat: " + Rand.newFloat(0, 5.5f) + "\nDouble: " + Rand.newDouble(0,3.3) + "\nChar: " + Rand.newChar('a', 'z') + "\nBoolean: " + Rand.newBoolean() + "\n");
                
                System.out.println("Letters lowercase: " + Rand.newStringLetters(10, false) + "\nLetters uppercase: " + Rand.newStringLetters(10, true) + "\nNumbers: " + Rand.newStringNumbers(10) + "\nAlphanumerical lowercase: " + Rand.newStringAlphanumerical(10, false) + "\nAlphanumerical uppercase: " + Rand.newStringAlphanumerical(10, true) + "\nLetters mixed: " + Rand.newStringLettersMixed(10) + "\nAlphanumerical mixed: " + Rand.newStringAlphanumericalMixed(10) + "\n");
                
                for(int i=0; i<10; i++)
                        System.out.println("Chance 30%: " + Rand.chance(0.3));
                System.out.println();
                
                System.out.println("d4: " + Rand.d4() + "\nd6: " + Rand.d6() + "\nd8: " + Rand.d8() + "\nd10: " + Rand.d10() + "\nd12: " + Rand.d12() + "\nd20: " + Rand.d20() + "\nd50: " + Rand.d50() + "\nd100: " + Rand.d100() + "\n");
        }
        
}
