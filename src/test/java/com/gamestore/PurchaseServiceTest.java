package com.gamestore;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class PurchaseServiceTest {

    @Test
    public void testCheckoutPrintsAndClearsCart() {
        Cart cart = new Cart();
        cart.addGame(new Game("Zelda", 59.99));
        cart.addGame(new Game("Mario", 49.99));

        PurchaseService service = new PurchaseService();

        // Capture System.out
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        service.checkout(cart);

        System.setOut(originalOut);

        String consoleOutput = output.toString();
        assertTrue(consoleOutput.contains("Zelda"));
        assertTrue(consoleOutput.contains("Mario"));
        assertTrue(consoleOutput.contains("Total: $109.98"));
        assertTrue(consoleOutput.contains("Thank you for your purchase!"));

        assertEquals(0, cart.getGames().size());
    }
}

