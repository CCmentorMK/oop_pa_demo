package org.example.repository;

import org.example.model.Coach;
import org.example.model.Player;
import org.example.model.Team;
import org.example.model.enums.Accreditation;
import org.example.model.enums.Position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public interface HokeyLeague {
    String [] LOCATIONS = {"Loc A", "Loc B", "Loc C", "Loc D"};

    List<Team> LEAGUE = new ArrayList<>(
            Arrays.asList(
                new Team(new HashSet<>(Arrays.asList(
                        new Player("P1", "A1", 1, Position.ATTACKER),
                        new Player("P2", "A2", 2, Position.ATTACKER),
                        new Player("P3", "A3", 3, Position.DEFENDER),
                        new Player("P4", "A4", 4, Position.DEFENDER),
                        new Player("P5", "A5", 5, Position.DEFENDER),
                        new Player("P6", "A6", 6, Position.GOALKEEPER)
                )), "TEAM 1", new ArrayList<>()),
                    new Team(new HashSet<>(Arrays.asList(
                            new Player("P7", "A7", 1, Position.ATTACKER),
                            new Player("P8", "A8", 2, Position.ATTACKER),
                            new Player("P9", "A9", 3, Position.DEFENDER),
                            new Player("P10", "A10", 4, Position.DEFENDER),
                            new Player("P11", "A11", 5, Position.DEFENDER),
                            new Player("P12", "A12", 6, Position.GOALKEEPER)
                    )), "TEAM 2", new ArrayList<>()),
                    new Team(new HashSet<>(Arrays.asList(
                            new Player("P13", "A13", 1, Position.ATTACKER),
                            new Player("P14", "A14", 2, Position.ATTACKER),
                            new Player("P15", "A15", 3, Position.DEFENDER),
                            new Player("P16", "A16", 4, Position.DEFENDER),
                            new Player("P17", "A17", 5, Position.DEFENDER),
                            new Player("P18", "A18", 6, Position.GOALKEEPER)
                    )), "TEAM 3", new ArrayList<>()),
                    new Team(new HashSet<>(Arrays.asList(
                            new Player("P19", "A19", 1, Position.ATTACKER),
                            new Player("P20", "A20", 2, Position.ATTACKER),
                            new Player("P21", "A21", 3, Position.DEFENDER),
                            new Player("P22", "A22", 4, Position.DEFENDER),
                            new Player("P23", "A23", 5, Position.DEFENDER),
                            new Player("P24", "A24", 6, Position.GOALKEEPER)
                    )), "TEAM 4", new ArrayList<>())
            )

    );
    List<Coach> COACHES = new ArrayList<>(
            Arrays.asList(
                    new Coach("Coach 1", "Address 1", Accreditation.SENIOR, 10, LEAGUE.get(0)),
                    new Coach("Coach 2", "Address 2", Accreditation.EXPERT, 15, LEAGUE.get(1))
            )
    );
}
