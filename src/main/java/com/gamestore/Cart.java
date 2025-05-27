package com.gamestore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Game> games = new ArrayList<>();

    public void addGame(Game game) {
        games.add(game);
    }

    public boolean removeGame(String name) {
        return games.removeIf(g -> g.getName().equalsIgnoreCase(name));
    }

    public List<Game> getGames() {
        return games;
    }

    public double getTotal() {
        return games.stream().mapToDouble(Game::getPrice).sum();
    }

    public void clear() {
        games.clear();
    }
}

