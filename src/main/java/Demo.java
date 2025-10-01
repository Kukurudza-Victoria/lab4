import ua.edu.ucu.apps.CharacterFactory;
import ua.edu.ucu.apps.GameManager;

import java.lang.reflect.InvocationTargetException;
import ua.edu.ucu.apps.Character;
public class Demo {
    public static void main(String args[]) 
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        GameManager.fight(c1, c2);

    }
}
