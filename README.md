# Prisoner's Dilemma Hackathon - Workspace
## Expose
A small hackathon project in which a group of friends can develop several small algorithms that then compete against each other in the context of the Prisoner's dilemma. This is the workspace through which the various algorithms created can be collected. The main project can be found at: [Main Repository](https://github.com/JulesOxe/prisoners-dilemma-hackathon)

## Preperations
For each participant, create a copy of the package `PrisonerX` under _src/main/java_ and rename it and the class in it to the correct letter of the participant.  
Do the same for the `TestPrisonerX` class under _src/test/java_. Make sure that an object of the correct class is created in the `setUp()` function.

## Procedure
Each participant creates his own branch on which he then designs his algorithm in his associated package. Once everyone has finished and pushed their results, the leader of the hackathon can collect the individual PrisonerX classes and continue with the main project.


## Testing
GitHub Actions automatically executes the test class every time you push. This checks whether the coder compiles at all and whether the submitted algorithm for starting a duel can handle empty array lists and whether general combinations from recent decisions such as: 
- myDecision: `true`, opponentDecision: `true`
- myDecision: `false`, opponentDecision: `false`
- myDecision: `true`, opponentDecision: `false`
- myDecision: `false`, opponentDecision: `true`

functinories. If tests fail, the algorithm should be run over until all tests have been completed to ensure a smooth evaluation.