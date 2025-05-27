package com.gamestore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    private Cart cart;

    @BeforeEach
    public void setup() {
        cart = new Cart();
    }

    @Test
    public void testAddGameIncreasesCartSize() {
        cart.addGame(new Game("FIFA", 49.99));
        assertEquals(1, cart.getGames().size());
    }

    @Test
    public void testRemoveGameSuccessfully() {
        cart.addGame(new Game("FIFA", 49.99));
        assertTrue(cart.removeGame("FIFA"));
        assertEquals(0, cart.getGames().size());
    }

    @Test
    public void testRemoveNonexistentGameReturnsFalse() {
        assertFalse(cart.removeGame("Nonexistent Game"));
    }

    @Test
    public void testTotalCalculation() {
        cart.addGame(new Game("FIFA", 49.99));
        cart.addGame(new Game("NBA", 39.99));
        assertEquals(89.98, cart.getTotal(), 0.01);
    }

    @Test
    public void testClearEmptiesCartAndResetsTotal() {
        cart.addGame(new Game("Zelda", 59.99));
        cart.clear();
        assertEquals(0, cart.getGames().size());
        assertEquals(0.0, cart.getTotal());
    }
}

