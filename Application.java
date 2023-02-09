
/**
 * @author Nicholas Romano
 * @version 1.0
 * Module 1 Programming Lab
 * Spring 2023 CS131
 */
public class Application {

	public static void main(String[] args) {
		NonPlayerCharacter npc = new NonPlayerCharacter(); //creating an instance of the NonPlayerCharacter class by creating an object with the name mpc
		
		System.out.println("Character Report: \n" + npc.reportStructure()); //printing the npc's report structure
		System.out.println("Character Remarks"); 
		System.out.println("Greeting: " + npc.introduce()); //printing the npc's introductory remark
		System.out.println("Exclamation: " + npc.exclaim()); //printing the npc's exclamation
		System.out.println("\n");
		
		BasketballTeam team = new BasketballTeam(); //creating an instance of the BasketballTeam class by creating an object with the name team
		team.setWins(25); //setting team wins
		team.setLosses(9); //setting team losses
		team.setFieldGoals(345); //setting team field goals
		team.setFieldGoalsAttempted(657); //setting team field goals attempted
		team.setFreeThrows(123); //setting team free throws
		team.setFreeThrowsAttempted(153); //setting team free throws attempted
		team.setStats(team.getWins(), team.getLosses(), team.getFieldGoals(), team.getFieldGoalsAttempted(), 
				      team.getFreeThrows(), team.getFreeThrowsAttempted()); //setting team statistics using the accessor methods foe each statistic
		team.getStats(); //returning team statistics
	}//end main

}//end Application
