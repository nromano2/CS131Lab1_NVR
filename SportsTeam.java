import java.text.DecimalFormat;

/**
 * This is an abstract class used to represent a generic sports team.
 * 
 * @author Nicholas Romano
 * @version 1.0
 * Module 1 Programming Lab
 * Spring 2023 CS131
 */

public abstract class SportsTeam {
	protected String teamName; //used to represent the name of the sports team
	protected String teamMascot; //used to represent the mascot of the sports team
	protected String teamCoach; //used to represent the coach of the sports team
	protected int wins; //used to represent the number of games the sports team had won
	protected int losses; //used to represent the number of games the sports team has lost
	
	DecimalFormat formatting = new DecimalFormat("0.###"); //used to format winPercentage, fieldGoalPercentage, and freeThrowPercentage to 3 decimal places

	/**
	 * The empty-argument SportsTeam constructor initializes teamName, teamMascot, and teamCoach to empty Strings. 
	 * Wins and losses are both initialized to zero.
	 */
	public SportsTeam()
	{
		this.teamName = "";
		this.teamMascot = "";
		this.teamCoach = "";
		this.wins = 0;
		this.losses = 0;
	}//end constructor
	
	/**
	 * The preferred constructor allows the caller to initialize teamName, teamMascot, and teamCoach by passing in Strings. 
	 * The preferred constructor also initializes wins and losses both to zero.
	 * 
	 * @param teamName - the name of the sports team
	 * @param teamMascot - the mascot of the sports team
	 * @param teamCoach - the coach of the sports team
	 */
	public SportsTeam(String teamName, String teamMascot, String teamCoach)
	{
		setTeamName(teamName);
		setTeamMascot(teamMascot);
		setTeamCoach(teamCoach);
		this.wins = 0;
		this.losses = 0;
	}//end constructor
	
	/**
	 * This method calculates and returns the Sports Team's win percentage.
	 * Type casting was used to make the result of the integer division into a double primitive value. 
	 * Then the value is formatted to have 3 decimal places using NumberFormat and then converted back to a double value.
	 * 
	 * @return winPct - the winning percentage of the sports team
	 */
	public double getWinPercentage()
	{
		double winPct = (double) wins / (wins + losses);
		return Double.valueOf(formatting.format(winPct));
	}//end getWinPercentage
	
	/**
	 * Accessor method used to return the name of the SportsTeam
	 * 
	 * @return teamName - the name of the SportsTeam
	 */
	public String getTeamName()
	{
		return teamName;
	}//end getTeamName
	
	/**
	 * Mutator method used to modify the name of the SportsTeam
	 * 
	 * @param teamName - the name of the SportsTeam
	 */
	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}//end setTeamName
	
	/**
	 * Accessor method used to return the mascot
	 * 
	 * @return teamMascot - the mascot of the SportsTeam
	 */
	public String getTeamMascot()
	{
		return teamMascot;
	}//end getTeamMascot
	
	/**
	 * Mutator method used to modify the mascot
	 * 
	 * @param teamMascot - the mascot of the SportsTeam
	 */
	public void setTeamMascot(String teamMascot)
	{
		this.teamMascot = teamMascot;
	}//end setTeamMascot
	
	/**
	 * Accessor method used to return the name of the coach
	 * 
	 * @return teamCoach
	 */
	public String getTeamCoach()
	{
		return teamCoach;
	}//end getTeamCoach
	
	/**
	 * Mutator method used to modify the name of the coach
	 * 
	 * @param teamCoach
	 */
	public void setTeamCoach(String teamCoach)
	{
		this.teamCoach = teamCoach;
	}//end setTeamCoach
	
	/**
	 * Accessor method used to return the number of games won
	 * 
	 * @return wins
	 */
	public int getWins()
	{
		return wins;
	}//end getWins
	
	/**
	 * Mutator method used to modify the number of games won 
	 * 
	 * @param wins
	 */
	public void setWins(int wins)
	{
		this.wins = wins;
	}//end setWins
	
	/**
	 * Accessor method used to return the number of games lost
	 * 
	 * @return losses
	 */
	public int getLosses()
	{
		return losses;
	}//end getLosses
	
	/**
	 * Mutator method used to modify the number of games lost
	 * 
	 * @param losses
	 */
	public void setLosses(int losses)
	{
		this.losses = losses;
	}//end setLosses
	
	/**
	 * Abstract method used to retrieve the statistics of the a given sports team
	 */
	public abstract void getStats(); //end getStats
	
}//end class
