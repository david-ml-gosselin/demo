package com.entity;

public class Football extends Sport{
    @Override
    public int calculateNbPoints(Match match) {
        if(match!=null && match.getTeamScore()>match.getOpponentScore()) {
            return 3;
        } else if(match!=null && match.getTeamScore()==match.getOpponentScore()) {
            return 1;
        } else {
            return 0;
        }
    }
}
