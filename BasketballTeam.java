
/**
 * This BasketballTeam class inherits the characteristics of the GameCharacter class allowing for the creation of specific objects, 
 * in this case a basketball team
 * 
 * @author Nicholas Romano
 * @version 1.0
 * Module 1 Programming Lab
 * Spring 2023 CS131
 */

public class BasketballTeam extends SportsTeam {
	private int fieldGoals; //used to store the number of field goals made
	private int fieldGoalsAttempted; //used to store the number of field goals attempted
	private int freeThrows; //used to store the number of free throws made
	private int freeThrowsAttempted; //used to store the number of free throws attempted
	private double[] stats; //used to store important basketball statistics (win percentage, field goal percentage, free throw percentage)
	
	/**
	 * The BasketballTeam empty-argument constructor invokes the SportsTeam() empty-argument constructor from the SportsTeam parent class to build off of it. 
	 * The BasketballTeam constructor initializes the fieldGoals, fieldGoalsAttempted, freeThrows, and freeThrowsAttempted variables to zero 
	 * The constructor also initializes the stats array to contain 3 double primitive values.
	 */
	public BasketballTeam()
	{
		super();
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
		this.stats = new double[3];
	} // end constructor
	
	/**
	 * The Basketball preferred constructor invokes the SportsTeam preferred constructor to pass the teamName, teamMascot, and teamCoach variables.
	 * The preferred constructor initializes the fieldGoals, fieldGoalsAttempted, freeThrows, and freeThrowsAttempted variables to zero 
	 * The constructor also initializes the stats array to contain 3 double primitive values.
	 * 
	 * @param teamName
	 * @param teamMascot
	 * @param teamCoach
	 */
	public BasketballTeam(String teamName, String teamMascot, String teamCoach)
	{
		super(teamName, teamMascot, teamCoach);
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
		this.stats = new double[3];
	} // end constructor
	
	/**
	 * This method calculates the basketball team's field goal percentage
	 * 
	 * @return the team's fieldGoalPercentage formatted to 3 decimal places
	 */
	public double fieldGoalPercentage() 
	{
		double fieldGoalPct = (double) fieldGoals/fieldGoalsAttempted;
		return Double.valueOf(formatting.format(fieldGoalPct));
	}// end fieldGoalPercentage
	
	/**
	 * This method calculates the basketball team's free throw percentage
	 * 
	 * @return the team's free throw percentage formatted to 3 decimal places
	 */
	public double freeThrowPercentage()
	{
		double freeThrowPct = (double) freeThrows/freeThrowsAttempted;
		return Double.valueOf(formatting.format(freeThrowPct));
	}//end freeThrowPercentage
	
	/**
	 * This method uses the parameters within it's parameters list to calculate the team's win percentage, field goal percentage, 
	 * and free throw percentage (all formatted to 3 decimal places).
	 * 
	 * The results of these calculations are stored within the stats array.
	 * 
	 * @param wins	- The number of games the basketball team has won.
	 * @param losses - The number of games the basketball team has lost.
	 * @param fieldGoals - The number of field goals the basketball team has made.
	 * @param fieldGoalsAttempted - the number of field goals the basketball team has attempted.
	 * @param freeThrows - The number of free throws the basketball team has made.
	 * @param freeThrowsAttempted - The number of free throws the basketball team has attempted.
	 * 
	 */
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted)
	{
		stats[0] = (double) wins / (wins + losses);
		stats[0] = Double.valueOf(formatting.format(stats[0]));
		
		stats[1] = (double) fieldGoals / fieldGoalsAttempted;
		stats[1] = Double.valueOf(formatting.format(stats[1]));
		
		stats[2] = (double) freeThrows / freeThrowsAttempted;
		stats[2] = Double.valueOf(formatting.format(stats[2]));
	}//end setStats
	
	/**
	 * This method returns the team's win percentage, field goal percentage, and free throw percentage that are stored in the stats array
	 * This method uses a switch statement to label each statistic
	 * 
	 * @return The basketball team's win percentage, field goal percentage, and free throw percentage
	 */
	public void getStats()
	{
		System.out.println("Basketball Team Stats");
		for(int i = 0; i < stats.length; i++)
		{
			switch(i)
			{
				case 0:
					System.out.println("Win Percentage: " + stats[i]);
					break;
				
				case 1:
					System.out.println("Field Goal Percentage: " + stats[i]);
					break;
					
				case 2:
					System.out.println("Free Throw Percentage: " + stats[i]);
					break;
				
				default:
					System.out.println("Unlabeled Statistic: " + stats[i]);
					break;
			}
		}
	}//end getStats
	
	/**
	 * This method accesses the number the field goals that the basketball team made
	 * 
	 * @return the number of field goals that the basketball team made
	 */
	public int getFieldGoals()
	{
		return fieldGoals;
	}//end getFieldGoals
	
	/**
	 * This method modifies the number of field goals that the basketball team made
	 * 
	 * @param fieldGoals - the number of field goals that the basketball team made
	 */
	public void setFieldGoals(int fieldGoals)
	{
		this.fieldGoals = fieldGoals;
	}//end setFieldGoals
	
	/**
	 * This method accesses the number of field goals that the basketball team attempted
	 * 
	 * @return the number of field goals that the basketball team attempted
	 */
	public int getFieldGoalsAttempted()
	{
		return fieldGoalsAttempted;
	}//end getFieldGoalsAttempted
	
	/**
	 * This method modifies the number of field goals that the basketball team attempted to the number passed in the parameter list
	 * 
	 * @param fieldGoalsAttempted - the updated number of field goals that basketball team attempted
	 */
	public void setFieldGoalsAttempted(int fieldGoalsAttempted)
	{
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}//end setFieldGoalsAttempted
	
	/**
	 * This method accesses the number of free throws that the basketball team made
	 * 
	 * @return the number of free throws that the basketball team made
	 */
	public int getFreeThrows()
	{
		return freeThrows;
	}//end getFreeThrows
	
	/**
	 * This method modifies the number of free throws that the basketball team made
	 * 
	 * @param freeThrows - the updated number of free throws that the basketball team made
	 */
	public void setFreeThrows(int freeThrows)
	{
		this.freeThrows = freeThrows;
	}//end setFreeThrows
	
	/**
	 * This method accesses the number of free throws that the basketball team attempted
	 * 
	 * @return the number of free throws that the basketball team attempted
	 */
	public int getFreeThrowsAttempted()
	{
		return freeThrowsAttempted;
	}//end getFreeThrowsAttempted
	
	/**
	 * This method modifies the number of free throws that the basketball team attempted
	 * 
	 * @param freeThrowsAttempted - the updated number of free throws that the basketball team attempted
	 */
	public void setFreeThrowsAttempted(int freeThrowsAttempted)
	{
		this.freeThrowsAttempted = freeThrowsAttempted;
	}//end setFreeThrowsAttempted
	
	/**
	 * The toString() method returns a String representation of a BasketballTeam object
	 * 
	 * @return The basketball team's information along with the basketball team's statistics
	 */
	@Override
	public String toString()
	{
		return "Basketball Team [Team Name: " + teamName + ", Team Mascot: " + teamMascot + ", Team Coach: " + teamCoach
				+ ", Team Wins: " + wins + ", Team Losses: " + losses + ", Team Winning Percentage: " + getWinPercentage() 
				+ ", Field Goals: " + fieldGoals + ", Field Goals Attempted: " + fieldGoalsAttempted + ", Field Goal Percentage: " + fieldGoalPercentage()  
				+ ", Field Goals: " + freeThrows + ", Field Goals Attempted: " + freeThrowsAttempted + ", Field Goal Percentage: " + freeThrowPercentage();
	}//end toString
}//end class