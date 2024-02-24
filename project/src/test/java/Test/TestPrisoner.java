package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Prisoner.Prisoner;
import Prisoner.PrisonerA;

import java.util.ArrayList;

public class TestPrisoner {
    Prisoner prisoner;

    @BeforeEach
    public void setUp() {
        prisoner = new PrisonerA();
    }

    @DisplayName("Empty lists Test")
    void testMakeFirstDecision() {
        Boolean firstDecision = prisoner.makeDecision(new ArrayList<>(), new ArrayList<>());
        assert !firstDecision || firstDecision : "Function can handle empty lists";
    }

    @Test
    @DisplayName("Both last decisions true")
    void testBothTrue(){
       Boolean firstDecision = prisoner.makeDecision(new ArrayList<>(), new ArrayList<>());
       ArrayList<Boolean> myDecisionTrue = new ArrayList<>();
       myDecisionTrue.add(true);
       ArrayList<Boolean> opponentDecisionTrue = new ArrayList<>();
       opponentDecisionTrue.add(true);
       Boolean secondDecision = prisoner.makeDecision(myDecisionTrue, opponentDecisionTrue);
         assert !secondDecision || secondDecision : "Function can handle both last decisions true";
    }

    @Test
    @DisplayName("Both last decisions false")
    void testBothFalse(){
        Boolean firstDecision = prisoner.makeDecision(new ArrayList<>(), new ArrayList<>());
        ArrayList<Boolean> myDecisionFalse = new ArrayList<>();
        myDecisionFalse.add(false);
        ArrayList<Boolean> opponentDecisionFalse = new ArrayList<>();
        opponentDecisionFalse.add(false);
        Boolean secondDecision = prisoner.makeDecision(myDecisionFalse, opponentDecisionFalse);
        assert !secondDecision || secondDecision : "Function can handle both last decisions false";
    }

    @Test
    @DisplayName("My last decision true, opponent last decision false")
    void testTrueAndFalse(){
        Boolean firstDecision = prisoner.makeDecision(new ArrayList<>(), new ArrayList<>());
        ArrayList<Boolean> myDecisionTrue = new ArrayList<>();
        myDecisionTrue.add(true);
        ArrayList<Boolean> opponentDecisionFalse = new ArrayList<>();
        opponentDecisionFalse.add(false);
        Boolean secondDecision = prisoner.makeDecision(myDecisionTrue, opponentDecisionFalse);
        assert !secondDecision || secondDecision : "Function can handle my last decision true, opponent last decision false";
    }

    @Test
    @DisplayName("My last decision true, opponent last decision false")
    void testFalseAndTrue(){
        Boolean firstDecision = prisoner.makeDecision(new ArrayList<>(), new ArrayList<>());
        ArrayList<Boolean> myDecisionFalse = new ArrayList<>();
        myDecisionFalse.add(false);
        ArrayList<Boolean> opponentDecisionTrue = new ArrayList<>();
        opponentDecisionTrue.add(true);
        Boolean secondDecision = prisoner.makeDecision(myDecisionFalse, opponentDecisionTrue);
        assert !secondDecision || secondDecision : "Function can handle my last decision false, opponent last decision true";
    }
}