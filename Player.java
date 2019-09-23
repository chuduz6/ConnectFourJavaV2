 
/**
 * Player class contains the information about the players  .
 * Name is for the player name and the color is for the color of the chip
 * 
 */
public class Player {
	// creating the field for the player class
	private String name;
	private Disc discs;
	
	/**
     * Constructor for the Player class
     * initialize fields name and color.
     * @param String
     */
	// constructor for the player class
	public Player(String Name)
	{
		setPlayer(Name);
		discs = new Disc();
	}
	
	/**
     * To get the name of the player.
     * @return String name of the player.
     */
	
	public String getPlayer() //accessor method 
	{
		return name;
	}
	
	/**
     * Set name of the player
     * @param String player name
     */
	public void setPlayer(String Player)// mutator method
	{
		this.name = Player;
	}
	
	public boolean setColor(String colors)
	{
		if (colors.compareToIgnoreCase("Black")==0)
		{
			discs.setColor("+");
			return true;
		}
		else if (colors.compareToIgnoreCase("Red")==0)
		{
			discs.setColor("X");
			return true;
		}
		else
			return false;
			
	}
	public String getDicsColor()
	{
		return discs.getColor();
	}
	/**
     * set color for the chip as desired by the user
     * @param String color choice
     */
	/*
	public void setColor(String color) 
	{
		if(color.compareToIgnoreCase("red") == 0)
		{
			this.color =  "X";
		}
		else if(color.compareToIgnoreCase("black") == 0)
		{
			this.color = "+";
		}
	}
	
	/**
     * Access the color
     * @return String the value set in the color field.
     */
	/*
	public String getColor()
	{
		return color;
	}
	*/
}