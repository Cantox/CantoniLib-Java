package Main;

import Tests.*;

public class Main {
        public static void main(String[] args) {
                
                RandTests.newData();
                RandTests.newStrings();
                RandTests.chance(10);
                RandTests.dice();
                separator();
                
                ArrTests.printTest();
                separator();
                ArrTests.fill();
                ArrTests.charFill();
                ArrTests.randFill();
                ArrTests.stringFill();
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
        
        public static void separator(){
                System.out.println("------------------------------------------");
                System.out.println();
        }
        
}