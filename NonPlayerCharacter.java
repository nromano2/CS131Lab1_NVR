import java.util.Random;

/**
 * The NonPlayerCharacter class inherits the characteristics of the GameCharacter class allowing for the creation of character objects
 * 
 * @author Nicholas Romano
 * @version 1.0
 * Module 1 Programming Lab
 * Spring 2023 CS131
 */
public class NonPlayerCharacter extends GameCharacter{
	private boolean active; //represents whether or not the character is active
	private String intelligenceType; //represents the intelligence level of the character

	/**
	 * The NonPlayerCharacter empty-argument constructor invokes the the GameCharacter empty-argument constructor 
	 * and then initializes the active variable to false and the intelligenceType variable to Average.
	 * 
	 */
	public NonPlayerCharacter()
	{
		super();
		setActive(false);
		setIntelligenceType("Average");
	}//end constructor
	
	/**
	 * The preferred NonPlayerCharacter constructor allows the caller to pass in the uniqueID, personality, active, and intelligenceType variables for the object.
	 * For the uniqueID and personality parameters the preferred GameCharacter constructor is invoked using the super reference and passing 
	 * the uniqueID and personality parameters through it.
	 * 
	 * @param uniqueID - the unique identification number of the non player player.
	 * @param personality - the personality type of the non player character.
	 * @param active - a boolean value representing whether or not the player is active.
	 * @param intellgenceType - the intelligence level of the non player character.
	 */
	public NonPlayerCharacter(String uniqueID, String personality, boolean active, String intelligenceType)
	{
		super(uniqueID, personality);
		setActive(active);
		setIntelligenceType(intelligenceType);
	}//end constructor
	
	/**
	 * This method creates a report of the character object by invoking the reportStructure from the GameCharacter class 
	 * and using the getter methods to add the variables within the NonPlayerCharacter class to the report.
	 * 
	 * @return sb - A string containing the important details of the character
	 */
	public String reportStructure()
	{
		StringBuilder sb = new StringBuilder(super.reportStructure());
		sb.append("\n\tActive: " + getActive() + "\n");
		sb.append("\n\tIntelligence Type: " + getIntelligenceType() + "\n\n");
		sb.append("========================================\n");
		return sb.toString();
		
	}//end reportStructure
	
	/**
	 * This method returns a introductory remark of the character along with the characters uniqueID
	 * 
	 * @return A introductory remark containing the players unique identification
	 */
	public String introduce()
	{
		return ("Hello, my name is " + super.getUniqueID());
	}//end introduce
	
	/**
	 * This method stores predefined remarks in an array of Strings, randomly generates a number within the array's index, 
	 * and then prints the remark at the randomly generated index position
	 * 
	 * @return A randomly selected exclamation
	 */
	public String exclaim()
	{
		Random genertor = new Random();
		String[] remarks = {"Dag Gummit", "Doggonne it", "Holy Cow", "Jeez", "Well cheese and crackers"};
		
		int index = genertor.nextInt(remarks.length);
		return remarks[index];
	}//end exclaim
	
	/**
	 * Accessor method that returns the current active variable associated with the character object.
	 * 
	 * @return active - a boolean value representing whether or not the player active.
	 */
	public boolean getActive()
	{
		return active;
	}//end getActive
	
	/**
	 * Mutator method that sets the active variable to be the boolean value that is passed in the parameter list.
	 * 
	 * @param active - a boolean variable representing whether or not the player is active. True if the player is active, false if not active.
	 */
	public void setActive(boolean active)
	{
		this.active = active;
	}//end setActive
	
	/**
	 * Accessor method that returns that current intelligenceType variable associated with the character object.
	 * 
	 * @return intelligenceType - the intelligence level of the character.
	 */
	public String getIntelligenceType()
	{
		return intelligenceType;
	}//end getIntelligence
	
	/** 
	 * Mutator method that sets the intelligenceType variable to the string that is pass through the parameter list.
	 * 
	 * @param intelligenceType - the intelligence level of the character.
	 */
	public void setIntelligenceType(String intelligenceType)
	{
		this.intelligenceType = intelligenceType;
	}//end setIntelligence
	
	/** 
	 * @return A String representation of the NonPlyaerCharacter object
	 */
	@Override
	public String toString()
	{
		return "Non Player Character [uniqueID= " + uniqueID + ", personality= " + personality + ", active="  + active 
				+ ", intelligenceType= " + intelligenceType + "]";
	}//end toString

}//end class
