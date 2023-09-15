package org.example.model;

public class Game {
    private int score;
    private String location;

    public Game(int score, String location) {
        this.score = score;
        this.location = location;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Game{" +
                "score=" + score +
                ", location='" + location + '\'' +
                '}';
    }
}
