
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Elf;
import ua.edu.ucu.apps.GameManager;
import ua.edu.ucu.apps.Hobbit;
import ua.edu.ucu.apps.King;
import ua.edu.ucu.apps.Knight;

import static org.junit.jupiter.api.Assertions.*;

class GameManegerTest {

    @Test
    public void testFightEndsWithWinner() {
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        
        GameManager.fight(elf, hobbit);
        
        assertTrue(elf.isAlive());
        assertFalse(hobbit.isAlive());
    }

    @Test
    public void testFightCompletesWithoutError() {
        King king = new King();
        Knight knight = new Knight();
        
        assertDoesNotThrow(() -> GameManager.fight(king, knight));
    }

    @Test
    public void testFightBetweenSameTypeEnds() {
        Hobbit hobbit1 = new Hobbit();
        Hobbit hobbit2 = new Hobbit();
        
        GameManager.fight(hobbit1, hobbit2);
        
        assertFalse(!hobbit1.isAlive() || !hobbit2.isAlive());
    }

    @Test
    public void testFightWithDeadCharacter() {
        Hobbit deadHobbit = new Hobbit();
        deadHobbit.setHp(0);
        
        Elf elf = new Elf();
        
        GameManager.fight(deadHobbit, elf);
        
        assertTrue(elf.isAlive());
        assertFalse(deadHobbit.isAlive());
    }
}