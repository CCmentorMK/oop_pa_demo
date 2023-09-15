package org.example;

import org.example.repository.HokeyLeague;
import org.example.service.GameSymulator;
import org.example.service.GameSymulatorImpl;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        GameSymulator gameSymulator = new GameSymulatorImpl();
        gameSymulator.symulateGames(HokeyLeague.LEAGUE);
        System.out.println(HokeyLeague.LEAGUE);
        System.out.println(gameSymulator.getWinner(HokeyLeague.LEAGUE));
        gameSymulator.coutWinsInLeague(HokeyLeague.LEAGUE);
    }
}