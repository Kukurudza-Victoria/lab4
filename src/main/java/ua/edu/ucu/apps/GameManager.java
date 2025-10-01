package ua.edu.ucu.apps;

import java.util.Random;

public class GameManager {

        private static final Random random = new Random();
    
        public static void fight(Character c1, Character c2) {
            System.out.println("=== BATTLE START ===");
            System.out.println(c1 + " vs " + c2);
            System.out.println();
            
            int round = 1;
            
            while (c1.isAlive() && c2.isAlive()) {
                System.out.println("--- Round " + round + " ---");
                
                if (random.nextBoolean()) {
                    c1.kick(c2);
                    if (c2.isAlive()) {
                        c2.kick(c1);
                    }
                } else {
                    c2.kick(c1);
                    if (c1.isAlive()) {
                        c1.kick(c2);
                    }
                }
                
                System.out.println("After round " + round + ": " + c1 + " | " + c2);
                System.out.println();
                round++;
                
                if (round > 100) {
                    System.out.println("Battle took too long! It's a draw!");
                    break;
                }
            }
            
            System.out.println("=== BATTLE END ===");
            if (c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " WINS!");
            } else if (c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " WINS!");
            } else {
                System.out.println("Both characters died! It's a draw!");
            }
        }
    }

