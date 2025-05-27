package com.gamestore;

public class PurchaseService {
    public void checkout(Cart cart) {
        System.out.println("\n--- Checkout ---");
        for (Game g : cart.getGames()) {
            System.out.println(g);
        }
        System.out.printf("Total: $%.2f%n", cart.getTotal());
        cart.clear();
        System.out.println("Thank you for your purchase!");
    }
}

