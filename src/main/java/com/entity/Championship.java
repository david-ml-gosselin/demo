package com.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Championship {

    public Championship(List<Team> listOfTeams) {
        this.listOfTeams = listOfTeams;
    }

    private List<Team> listOfTeams;

    public List<Team> getListOfTeams() {
        return listOfTeams;
    }

    public void setListOfTeams(List<Team> listOfTeams) {
        this.listOfTeams = listOfTeams;
    }

    public String affichagePoints(){
        List<String> listOfResults=new ArrayList<>();
        if(getListOfTeams().size()>0) {
            for(Team team:getListOfTeams()){//pour chaque equipe
                int nbPoints=0;
                for(Match match:team.getListOfMatches()){//pour chaque match
                    //recuperation de la methode de calcul de points (propre au sport pratique par l'equipe)
                    //calcul du nombre de points pour le match
                    //ajout du nombre de points gagnes du match au nombre de points gagnes par l'equipe
                    nbPoints+=match.getTeam().getSport().calculateNbPoints(match);
                }
                listOfResults.add("Equipe "+ team.getName()+" nbPoints="+nbPoints);
            }
        } else {
            listOfResults.add("Pas d'equipe dans championnat;");
        }
        StringBuffer res=new StringBuffer("Nb points");
        for (String resTeam:listOfResults) {
            res.append("\n").append(resTeam);
        }
        return res.toString();
    }
}
