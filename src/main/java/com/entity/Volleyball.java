package com.entity;

public class Volleyball extends Sport{
    @Override
    public int calculateNbPoints(Match match) {
        if(match!=null) {
            return match.getTeamScore();
        }else {
            return 0;
        }
    }

}
