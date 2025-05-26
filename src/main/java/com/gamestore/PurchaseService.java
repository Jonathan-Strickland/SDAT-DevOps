package main.java.com.gamestore;

public class PurchaseService {
    public boolean purchase(Cart cart) {
        if (cart == null || cart.getItems().isEmpty()) return false;

        // Simulate successful purchase logic
        cart.clear();
        return true;
    }
}
