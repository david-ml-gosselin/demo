package com.utils;

import com.entity.*;

import java.util.ArrayList;

public class Utils {

    public static Championship initChampionship(){
        Championship championship=new Championship(new ArrayList<>());
        Team fc=new FootballTeam("fcb", championship,new ArrayList<>());
        Team vc=new VolleyballTeam("vc", championship,new ArrayList<>());
        championship.getListOfTeams().add(fc);
        championship.getListOfTeams().add(vc);

        Match match1=new Match(fc,1,0);
        fc.getListOfMatches().add(match1);
        Match match2=new Match(fc,1,1);
        fc.getListOfMatches().add(match2);
        Match match3=new Match(fc,0,2);
        fc.getListOfMatches().add(match3);

        Match match4=new Match(vc,3,1);
        vc.getListOfMatches().add(match4);
        Match match5=new Match(vc,2,3);
        vc.getListOfMatches().add(match5);

        return championship;
    }

}
