package org.example.model;

import org.example.model.enums.Position;

public class Player {
    private String name;
    private String address;
    private int number;
    private Position position;

    public Player(String name, String address, int number, Position position) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", position=" + position +
                '}';
    }
}
