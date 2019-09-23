 
/**
* Disc class is the class that contains disc information.
* This class will store the color of the chip
*/
public class Disc {
	private String color;
	
	/**
	* The constructor method for the Disc class that will store empty value if the condition is not satisfied
	*/
	public Disc()
	{
		this.color =" ";
	}
	/**
	* Accessor method to get the color of the chip
	* @return string value
	*/
	public String getColor()
	{
		return color;
	}
	/**
	* mutator method to set the color of the chip
	* @param string value
	*/
	public void setColor(String color)
	{
		this.color =color;
	}

}
