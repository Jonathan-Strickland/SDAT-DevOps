package main.java.com.gamestore;

public class PurchaseService {
    public boolean purchase(Cart cart) {
        if (cart == null || cart.getItems().isEmpty()) return false;

        cart.clear();
        return true;
    }
}
