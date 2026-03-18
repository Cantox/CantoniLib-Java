package Tests;



import CantoniLib.Console;

public class ConsoleTests {
        public static void read(){
                System.out.println("--- CONSOLE READ ---");
                String str = Console.readLine("String: ");
                System.out.println("String read: " + str);
                byte b = Console.readByte("Byte: ");
                System.out.println("Byte read: " + b);
                short s = Console.readShort("Short: ");
                System.out.println("Short read: " + s);
                int i = Console.readInt("Int: ");
                System.out.println("Int read: " + i);
                long l = Console.readLong("Long: ");
                System.out.println("Long read: " + l);
                float f = Console.readFloat("Float: ");
                System.out.println("Float read: " + f);
                double d = Console.readDouble("Double: ");
                System.out.println("Double read: " + d);
                char c = Console.readChar("Char: ");
                System.out.println("Char read: " + c);
                boolean bool = Console.readBoolean("Boolean: ");
                System.out.println("Boolean read: " + bool);
                System.out.println();
        }
        
        public static void format(){
                System.out.println("--- CONSOLE FORMAT ---");
                System.out.println("Byte (Width: 3): " + Console.format((byte)1, 3));
                System.out.println("Short (Width: 10): " + Console.format((short)1, 10));
                System.out.println("Int (Width: 5): " + Console.format(2, 5));
                System.out.println("Long (Width: 3): " + Console.format((long)1, 3));
                System.out.println("Float (Width: 4, Decimals: 2): " + Console.format(2.3f, 2, 4));
                System.out.println("Double (Width: 3, Decimals 3): " + Console.format(3.4, 3, 3));
                System.out.println("Char (Width: 2): " + Console.format('A', 2));
                System.out.println("Boolean (Width: 5): " + Console.format(true, 3));
                System.out.println();
        }
        
        public static void colors(){
                System.out.println("--- CONSOLE COLORING / STYLING ---");
                System.out.println(Console.BLACK + "Black" + Console.RESET);
                System.out.println(Console.RED + "Red" + Console.RESET);
                System.out.println(Console.GREEN + "Green" + Console.RESET);
                System.out.println(Console.YELLOW + "Yellow" + Console.RESET);
                System.out.println(Console.BLUE + "Blue" + Console.RESET);
                System.out.println(Console.PURPLE + "Purple" + Console.RESET);
                System.out.println(Console.CYAN + "Cyan" + Console.RESET);
                System.out.println(Console.WHITE + "White" + Console.RESET);
                
                System.out.println();
                
                System.out.println(Console.LIGHT_BLACK + "Light black" + Console.RESET);
                System.out.println(Console.LIGHT_RED + "Light red" + Console.RESET);
                System.out.println(Console.LIGHT_GREEN + "Light green" + Console.RESET);
                System.out.println(Console.LIGHT_YELLOW + "Light yellow" + Console.RESET);
                System.out.println(Console.LIGHT_BLUE + "Light blue" + Console.RESET);
                System.out.println(Console.LIGHT_PURPLE + "Light purple" + Console.RESET);
                System.out.println(Console.LIGHT_CYAN + "Light cyan" + Console.RESET);
                System.out.println(Console.LIGHT_WHITE + "Light white" + Console.RESET);
                
                System.out.println();
                
                System.out.println(Console.BG_BLACK + "Background black" + Console.RESET);
                System.out.println(Console.BG_RED + "Background red" + Console.RESET);
                System.out.println(Console.BG_GREEN + "Background green" + Console.RESET);
                System.out.println(Console.BG_YELLOW + "Background yellow" + Console.RESET);
                System.out.println(Console.BG_BLUE + "Background blue" + Console.RESET);
                System.out.println(Console.BG_PURPLE + "Background purple" + Console.RESET);
                System.out.println(Console.BG_CYAN + "Background cyan" + Console.RESET);
                System.out.println(Console.BG_WHITE + "Background white" + Console.RESET);
                
                System.out.println();
                
                System.out.println(Console.BG_LIGHT_BLACK + "Background light black" + Console.RESET);
                System.out.println(Console.BG_LIGHT_RED + "Background light red" + Console.RESET);
                System.out.println(Console.BG_LIGHT_GREEN + "Background light green" + Console.RESET);
                System.out.println(Console.BG_LIGHT_YELLOW + "Background light yellow" + Console.RESET);
                System.out.println(Console.BG_LIGHT_BLUE + "Background light blue" + Console.RESET);
                System.out.println(Console.BG_LIGHT_PURPLE + "Background light purple" + Console.RESET);
                System.out.println(Console.BG_LIGHT_CYAN + "Background light cyan" + Console.RESET);
                System.out.println(Console.BG_LIGHT_WHITE + "Background light white" + Console.RESET);
                
                System.out.println();
                
                System.out.println(Console.BOLD + "Bold" + Console.RESET);
                System.out.println(Console.DIM + "Dim" + Console.RESET);
                System.out.println(Console.ITALIC + "Italic" + Console.RESET);
                System.out.println(Console.UNDERLINE + "Underline" + Console.RESET);
                System.out.println(Console.BLINK + "Blink (may be disabled by the terminal and/or seen differently)" + Console.RESET);
                System.out.println(Console.FAST_BLINK + "Fast blink (may be disabled by the terminal and/or seen differently)" + Console.RESET);
                System.out.println(Console.REVERSE + "Reverse" + Console.RESET);
                System.out.println(Console.HIDDEN + "Hidden" + Console.RESET);
                System.out.println(Console.STRIKETHROUGH + "Strikethrough" + Console.RESET);
                System.out.println();
        }
        
        public static void clear(){
                System.out.println("Hello World" + Console.CURSOR_HOME + "We came back, " + Console.MOVE_CURSOR(0, 4) + "DEVASTATING");
                System.out.print("type smth to clear screen: "); Console.readLine();
                System.out.print(Console.CLEAR);
        }
}
