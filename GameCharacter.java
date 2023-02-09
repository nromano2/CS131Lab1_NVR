import java.util.*;

/**
 * This is the base GameCharacter object from which
 * all other characters will be derived. 
 * 
 * @author Rob Kelley, Nicholas Romano
 * @version 1.3.1
 * Module 1 Programming Lab
 * Spring 2023 CS131
 */

public class GameCharacter
{
	//instance variables - visibility is protected so subclasses can manipulate the data directly.
	protected String uniqueID; //unique identifier assigned to each character object.
	protected String personality; //personality data type for the character.
	
	/**
	 *  The empty argument constructor generates an ID
	 *  by calling a static method from the GameUtilities class
	 *  
	 *  Note: Had to change line 30 from setUniqueID(Integer.toString(id)); to setUniqueID(String.valueOf(id)); due to the line throwing an error message
	 */
	public GameCharacter()
	{
		Random r = new Random();
		r.setSeed(1000);
		int id = r.nextInt(1000);
		setUniqueID(String.valueOf(id));
		setPersonality("Neutral");
	}
	
	/**
	 * This constructor allows the caller to pass in
	 * the uniqueID and personality for the object.
	 * 
	 * @param uniqueID
	 * @param personality
	 */
	public GameCharacter(String uniqueID, String personality)
	{
		setUniqueID(uniqueID);
		setPersonality(personality);
	}
	
	/**
	 * Returns the structure of the object in a specially
	 * formatted representation. This is the preferred
	 * method for printing out the object structure.
	 * 
	 * @return
	 */
	public String reportStructure()
	{
		StringBuilder sb = new StringBuilder("=======================================\n\n");
		sb.append("\tUniqueID: " + getUniqueID() + "\n\n");
		sb.append("\tPersonality: " + getPersonality() + "\n\n");
		sb.append("=======================================\n");
		return sb.toString();	
	}
	
	/**
	 * Getter for uniqueID 
	 * @return uniqueID
	 */
	public String getUniqueID()
	{
		return uniqueID;
	}
	
	/**
	 * Setter for uniqueID
	 * @param name
	 */
	public void setUniqueID(String name)
	{
		this.uniqueID = name;
	}
	
	/**
	 * Getter for personality
	 * @return personality
	 */
	public String getPersonality()
	{
		return personality;
	}
	
	/**
	 * Setter for personality
	 * @param personality
	 */
	public void setPersonality(String personality)
	{
		this.personality = personality;
	}
	
	/**
	 * Used for test purposes only using the toString
	 * format generated by Eclipse.
	 */
	@Override
	public String toString()
	{
		return "GameCharacter [uniqueID=" + uniqueID + ", personality=" + personality + "]";
	}//end toString
	
}//end class