package org.example.service;

import org.example.model.Team;

import java.util.List;

public interface GameSymulator {
    void symulateGames(List<Team> league);
    Team getWinner(List<Team> league);
    int countWins(Team team);
    void coutWinsInLeague(List<Team> league);
}
