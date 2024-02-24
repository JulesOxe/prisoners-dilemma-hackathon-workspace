package Prisoner;

import java.util.ArrayList;

public class PrisonerA extends Prisoner {

    //TODO set your team name
    public PrisonerA() {
        teamName = "The Informätics";
    }


    //TODO implement the decision making process
    public Boolean makeDecision(ArrayList<Boolean> myDecisions, ArrayList<Boolean> opponentDecisions) {

        return myDecisions.get(myDecisions.size() - 1);
    }

    //TODO if you need to reset any variables at the end of each game, do so here
    public void reset() {
    }

}
