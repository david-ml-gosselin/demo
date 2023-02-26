package com.entity;

import java.util.List;

public abstract class Team {
    private String name;

    private Championship championship;
    private List<Match> listOfMatches;

    public Team(String name, Championship championship, List<Match> listOfMatches) {
        this.name=name;
        this.championship = championship;
        this.listOfMatches = listOfMatches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Championship getChampionship() {
        return championship;
    }

    public void setChampionship(Championship championship) {
        this.championship = championship;
    }

    public List<Match> getListOfMatches() {
        return listOfMatches;
    }

    public void setListOfMatches(List<Match> listOfMatches) {
        this.listOfMatches = listOfMatches;
    }

    public abstract int calculateNbPoints(Match match);
}
