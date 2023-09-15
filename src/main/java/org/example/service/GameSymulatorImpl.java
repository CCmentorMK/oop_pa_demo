package org.example.service;

import org.example.model.Game;
import org.example.model.Team;
import org.example.repository.HokeyLeague;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GameSymulatorImpl implements GameSymulator{

    @Override
    public void symulateGames(List<Team> league) {
        for (int i = 0; i < league.size(); i++) {
            for (int j = 0; j < league.size(); j++) {
                if(i <= j){
                    continue;
                }
                int score = new Random().nextInt(3);
                int locIndex = new Random().nextInt(4);
                league.get(i).getHistory().add(new Game(score, HokeyLeague.LOCATIONS[locIndex]));
                league.get(j).getHistory().add(new Game(2 - score, HokeyLeague.LOCATIONS[locIndex]));
            }
        }
    }

    @Override
    public Team getWinner(List<Team> league) {
        return league.stream().max(Comparator.comparing(team -> team.getHistory()
                .stream().mapToInt(Game::getScore).sum()
        )).get();
    }

    @Override
    public int countWins(Team team) {
        return (int) team.getHistory().stream()
                .filter(game -> game.getScore() == 2)
                .count();
    }

    @Override
    public void coutWinsInLeague(List<Team> league) {
        for (int i = 0; i < league.size(); i++) {
            System.out.print(league.get(i));
            System.out.println(countWins(league.get(i)));
            System.out.println();
        }
    }


}
