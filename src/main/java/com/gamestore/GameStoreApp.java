package main.java.com.gamestore;

public class GameStoreApp {
    public static void main(String[] args) {
        Game game1 = new Game("Elden Ring", 59.99);
        Game game2 = new Game("Stardew Valley", 14.99);

        Cart cart = new Cart();
        cart.addGame(game1);
        cart.addGame(game2);

        System.out.println("Cart total: $" + cart.getTotalPrice());

        PurchaseService service = new PurchaseService();
        boolean purchased = service.purchase(cart);

        System.out.println("Purchase successful? " + purchased);
        System.out.println("Cart total after purchase: $" + cart.getTotalPrice());
    }
}
