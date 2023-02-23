package com.entity;

public class Match {
    private Team team;

    private int teamScore;
    private int opponentScore;

    public Match(Team team, int teamScore, int opponentScore) {
        this.team = team;
        this.teamScore = teamScore;
        this.opponentScore = opponentScore;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore = teamScore;
    }

    public int getOpponentScore() {
        return opponentScore;
    }

    public void setOpponentScore(int opponentScore) {
        this.opponentScore = opponentScore;
    }
}
