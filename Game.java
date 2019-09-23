 
/**
 * Game class is the class that contains the main method. This method calls all other class and
 * functions of those classes.
 * @author  
 * @version (Stage 2)
 */
public class Game {

	/**
     * Main method for the connect four game
     * It will ask the user for the players name and stores the name in array associating with the player class
     * It will terminate with the certain given condition.
     */
	public static void main(String[] args) {
		Player[] players; 
		players = new Player[2];
		Board board;
		board = new Board();
		Reader reads;
		reads = new Reader();
		System.out.println("Welcome to the connect four game");//welcome message
		String input;
		do
		{
		
		for( int i = 0; i < 2; i++) // for loop for accessing the players stored in an array
		{
			
			System.out.println("Player " + (i+1) + " name?");
			
			
			players[i] = new Player(reads.getRead()); // reads the input from the command line
			System.out.println("Player " + (i+1) +": " + players[i].getPlayer());
			System.out.println("Choose color for player"+(i+1)+ "      Red or black");
			players[i].setColor(reads.getRead());//setting color for the player from the command line as chosen by the user
			System.out.println("Player"+ (i+1) +" disc color is: " +players[i].getDicsColor());	
		}
		System.out.println("Follow the players turn and provide the coloum number to drop the disc. Type quit to quit the current game");
		board.iniBoard(); // initiating board will null value in the array
		int counter=0;
		board.printBoard();
		while (counter <42)
		{
			System.out.println(players[counter%2].getPlayer()+":");// printing current player name
			input = reads.getRead();// reading the user input from the command line
			if (input.compareToIgnoreCase("quit")== 0)
			{
				break;
			}
			else if (board.checkSpace(Integer.parseInt(input)-1)== -1)
			{
				counter=counter;  
			}
			else
			{
				
			
			board.dropChip((Integer.parseInt(input)-1), players[counter % 2].getDicsColor());// dropping chip in the array of the string
			
			board.printBoard();//printing the current condition of the board.
			if (board.whoWonGame())// condition to check which player has won the game
			{
				System.out.println(players[counter%2].getPlayer()+ " has won the game.");
				break;
			}
			else if (counter == 41)
			{
				System.out.println("The game is tie");
				break;
			}
			else
			{
				counter ++;
				
			}
			
			}
		
		}
		
		
		System.out.println("Do you want to quit?y/n or Y/N");
		String start;
		start = reads.getRead();
		if (start.compareToIgnoreCase("y")==0)// condition to ask user to start new game
		{
			System.out.println("Thank you for playing connect four game. You have a nice day.");
			break;
		}
		
		}while (true);
	}

}
// end of stage 1 project- connectfour