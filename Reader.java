 
import java.io.*;
/**
 * Reader class is specially build to read the input from the user.
 * It read the command line input from the user.
 */
public class Reader {
	//private String read;
	
	
	/**
	 * Constructor for the Reader class
	 */
	public Reader()
	{
		//read = null;
	}
	
	/**
	 * Method to read the input from the command line
	 * @return String the input from the user
	 */

	public String getRead()
	{
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	      String read = null;

	      //  using try and catch method to get the user input from the command line
	      try {
	    	  System.out.print(">");
	         read = buffer.readLine();
	      } catch (IOException ioe) {
	         System.out.println("Error reading");
	         System.exit(1);
	      }

	      return read;

	}
	

}
