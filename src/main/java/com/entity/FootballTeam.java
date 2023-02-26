package com.entity;

import java.util.List;

public class FootballTeam extends Team {
    public FootballTeam(String name, Championship championship, List<Match> listOfMatches) {
        super(name, championship, listOfMatches);

    }

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
