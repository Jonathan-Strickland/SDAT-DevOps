package main.java.com.gamestore;

public class Game {
    private final String title;
    private final double price;

    public Game(String title, double price) {
        if (title == null || title.isBlank()) throw new IllegalArgumentException("Title cannot be empty");
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");

        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " - $" + price;
    }
}
