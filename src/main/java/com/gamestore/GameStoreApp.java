package com.gamestore;

import java.util.Scanner;

public class GameStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        PurchaseService purchaseService = new PurchaseService();

        while (true) {
            System.out.println("\n1. Add Game");
            System.out.println("2. Remove Game");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Game name: ");
                    String name = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    cart.addGame(new Game(name, price));
                    break;

                case 2:
                    System.out.print("Game name to remove: ");
                    String toRemove = scanner.nextLine();
                    if (cart.removeGame(toRemove)) {
                        System.out.println("Removed.");
                    } else {
                        System.out.println("Not found.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Cart ---");
                    for (Game g : cart.getGames()) {
                        System.out.println(g);
                    }
                    System.out.printf("Total: $%.2f%n", cart.getTotal());
                    break;

                case 4:
                    if (cart.getGames().isEmpty()) {
                        System.out.println("Cart is empty.");
                    } else {
                        purchaseService.checkout(cart);
                    }
                    break;

                case 5:
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Invalid.");
            }
        }
    }
}
