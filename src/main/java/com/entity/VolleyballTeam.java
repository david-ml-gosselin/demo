package com.entity;

import java.util.List;

public class VolleyballTeam extends Team {
    public VolleyballTeam(String name, Championship championship, List<Match> listOfMatches) {
        super(name, championship, listOfMatches);
    }

    @Override
    public int calculateNbPoints(Match match) {
        if(match!=null) {
            return match.getTeamScore();
        }else {
            return 0;
        }
    }

}
