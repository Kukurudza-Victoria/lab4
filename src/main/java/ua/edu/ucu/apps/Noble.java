package ua.edu.ucu.apps;

import java.util.Random;

public class Noble extends Character{
    private static final Random RANDOM = new Random();

    public Noble(int minPower, int maxPower, int minHp, int maxHp) {
        super(RANDOM.nextInt(maxPower-minPower)+5, RANDOM.nextInt(maxHp-minHp)+5, new NobleStrategy());
    }

    
}