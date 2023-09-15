package org.example.model;

import java.util.List;
import java.util.Set;

public class Team {
    private Set<Player> players;
    private String name;
    private List<Game> history;

    public Team(Set<Player> players, String name, List<Game> history) {
        this.players = players;
        this.name = name;
        this.history = history;
    }
    public List<Game> getHistory() {
        return history;
    }

    @Override
    public String toString() {
        return "TEAM: " + name + "\nPLAYERS=" + players +"\nHISTORY=" + history + "\n";
    }
}
