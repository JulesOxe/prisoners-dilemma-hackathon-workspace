package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import Prisoner.Prisoner;
import PrisonerX.PrisonerX;
import java.util.ArrayList;

public class TestPrisonerX {
    Prisoner prisoner;

    @BeforeEach
    public void setUp() {
        prisoner = new PrisonerX();
    }

    @Test
    @Order(1)
    @DisplayName("Empty lists Test")
    void testMakeFirstDecision() {
        Boolean firstDecision = prisoner.makeDecision(new ArrayList<>(), new ArrayList<>());
        assert !firstDecision || firstDecision : "Function can handle empty lists";
    }

    @Test
    @Order(2)
    @DisplayName("Both last decisions true")
    void testBothTrue() {
        Boolean firstDecision = prisoner.makeDecision(new ArrayList<>(), new ArrayList<>());
        ArrayList<Boolean> myDecisionTrue = new ArrayList<>();
        myDecisionTrue.add(true);
        ArrayList<Boolean> opponentDecisionTrue = new ArrayList<>();
        opponentDecisionTrue.add(true);
        Boolean secondDecision = prisoner.makeDecision(myDecisionTrue, opponentDecisionTrue);
        assert !secondDecision || secondDecision : "Function can handle both last decisions true";
    }

    @Test
    @Order(3)
    @DisplayName("Both last decisions false")
    void testBothFalse() {
        Boolean firstDecision = prisoner.makeDecision(new ArrayList<>(), new ArrayList<>());
        ArrayList<Boolean> myDecisionFalse = new ArrayList<>();
        myDecisionFalse.add(false);
        ArrayList<Boolean> opponentDecisionFalse = new ArrayList<>();
        opponentDecisionFalse.add(false);
        Boolean secondDecision = prisoner.makeDecision(myDecisionFalse, opponentDecisionFalse);
        assert !secondDecision || secondDecision : "Function can handle both last decisions false";
    }

    @Test
    @Order(4)
    @DisplayName("My last decision true, opponent last decision false")
    void testTrueAndFalse() {
        Boolean firstDecision = prisoner.makeDecision(new ArrayList<>(), new ArrayList<>());
        ArrayList<Boolean> myDecisionTrue = new ArrayList<>();
        myDecisionTrue.add(true);
        ArrayList<Boolean> opponentDecisionFalse = new ArrayList<>();
        opponentDecisionFalse.add(false);
        Boolean secondDecision = prisoner.makeDecision(myDecisionTrue, opponentDecisionFalse);
        assert !secondDecision || secondDecision : "Function can handle my last decision true, opponent last decision false";
    }

    @Test
    @Order(5)
    @DisplayName("My last decision true, opponent last decision false")
    void testFalseAndTrue() {
        Boolean firstDecision = prisoner.makeDecision(new ArrayList<>(), new ArrayList<>());
        ArrayList<Boolean> myDecisionFalse = new ArrayList<>();
        myDecisionFalse.add(false);
        ArrayList<Boolean> opponentDecisionTrue = new ArrayList<>();
        opponentDecisionTrue.add(true);
        Boolean secondDecision = prisoner.makeDecision(myDecisionFalse, opponentDecisionTrue);
        assert !secondDecision || secondDecision : "Function can handle my last decision false, opponent last decision true";
    }
}
