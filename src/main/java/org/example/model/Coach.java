package org.example.model;

import org.example.model.enums.Accreditation;

public class Coach {
    private String name;
    private String address;
    private Accreditation accreditation;
    private int experience;
    private Team team;

    public Coach(String name, String address, Accreditation accreditation, int experience, Team team) {
        this.name = name;
        this.address = address;
        this.accreditation = accreditation;
        this.experience = experience;
        this.team = team;
    }
}
