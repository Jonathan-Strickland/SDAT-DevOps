package main.java.com.gamestore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Game> items = new ArrayList<>();

    public void addGame(Game game) {
        if (game == null) throw new IllegalArgumentException("Game cannot be null");
        items.add(game);
    }

    public boolean removeGame(Game game) {
        return items.remove(game);
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Game::getPrice).sum();
    }

    public List<Game> getItems() {
        return new ArrayList<>(items); // Return copy to protect internal list
    }

    public void clear() {
        items.clear();
    }
}
