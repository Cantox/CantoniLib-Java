package Main;

import Tests.*;

public class Main {
        public static void main(String[] args) {
                rand();
                arr();
                console();
        }
        
        private static void rand(){
                RandTests.newData();
                RandTests.newStrings();
                RandTests.chance(10);
                RandTests.dice();
                separator();
        }
        
        private static void arr(){
                ArrTests.fill();
                ArrTests.charFill();
                ArrTests.randFill();
                ArrTests.stringFill();
                separator();
                
                ArrTests.printTest();
                separator();
                
                ArrTests.copyTest();
                separator();
                
                ArrTests.sortTest();
                separator();
                
                ArrTests.find();
                ArrTests.replace();
                ArrTests.shuffle();
                ArrTests.pickRandom();
                ArrTests.flip();
                ArrTests.shift();
                separator();
                
                ArrTests.min_max();
                ArrTests.median_avarage();
                ArrTests.tot();
                separator();
        }
        
        private static void console(){
                //ConsoleTests.read();
                ConsoleTests.format();
                ConsoleTests.colors();
                //ConsoleTests.clear();
        }
        
        private static void separator(){
                System.out.println("------------------------------------------");
                System.out.println();
        }
        
}