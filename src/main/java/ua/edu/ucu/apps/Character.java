package ua.edu.ucu.apps;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public boolean isAlive() {
        return hp > 0;
    }

    public void kick(Character enemy) {
        kickStrategy.kick(this, enemy);

    }
}
