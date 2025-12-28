package Main;

import CantoniLib.Rand;

public class Main {
        public static void main(String[] args) {
                System.out.println("Byte: " + Rand.newByte((byte)0, (byte)1) + "\nShort: " + Rand.newShort((short)0, (short)1) + "\nInt: " + Rand.newInt(0, 5) + "\nLong: " + Rand.newLong(0, 7) + "\nFloat: " + Rand.newFloat(0, 5.5f) + "\nDouble: " + Rand.newDouble(0,3.3) + "\nChar: " + Rand.newChar('a', 'z') + "\nBoolean: " + Rand.newBoolean() + "\n");
        }
        
}
