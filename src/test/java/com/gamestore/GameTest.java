package test.java.com.gamestore;

import main.java.com.gamestore.Game;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    public void testGameCreation() {
        Game game = new Game("Minecraft", 19.99);
        assertEquals("Minecraft", game.getName());
        assertEquals(19.99, game.getPrice());
    }

    @Test
    public void testToStringReturnsNameAndPrice() {
        Game game = new Game("Halo", 29.99);
        assertEquals("Halo ($29.99)", game.toString());
    }
}