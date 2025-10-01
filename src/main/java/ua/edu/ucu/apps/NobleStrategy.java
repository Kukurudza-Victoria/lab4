package ua.edu.ucu.apps;

import java.util.Random;

public class NobleStrategy extends KickStrategy{
    private static final Random RANDOM = new Random();

    @Override
    public void kick(Character main, Character enemy) {
        int enemyHp = enemy.getHp();
        enemy.setHp(enemyHp-RANDOM.nextInt(main.getPower()));
    }
}
