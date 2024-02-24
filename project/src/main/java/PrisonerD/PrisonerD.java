package PrisonerD;

import Prisoner.Prisoner;

import java.util.ArrayList;

public class PrisonerD extends Prisoner {

    //TODO set your team name
    public PrisonerD() {
        teamName = "test";
    }


    //TODO implement the decision making process
    public Boolean makeDecision(ArrayList<Boolean> myDecisions, ArrayList<Boolean> opponentDecisions) {

        return true;
    }

    //TODO if you need to reset any variables at the end of each game, do so here
    public void reset() {
    }

}
