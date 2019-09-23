 
/**
 * Board class is a Multi Dimention array with row 6 and column 7  .
 * It Contains two locally accessed fields named ROW and COLUMN
 */
public class Board {
	public static final int ROW =6; //board row number
	public static final int COLUMN= 7;// board column number
	
	private String[][] grid; // decelaration of  multidimention array of string 
	/**
     * Constructor for the Board class
     */
	public Board()
	{
		grid = new String[ROW][COLUMN]; // initializing string array
		
	}
	/**
     * Method to access the element in the Board
     * @param int row Board's row.
     * @param int column Board's column.
     * @return String the contents in the grid
     */
	public String getBoard(int row, int column)
	{
		return grid[row][column]; 
	}
	/**
     * Method to check for the empty space in row of the particular coloum
     * @param int column 
     * @return int the empty row if any or -1
     */
	public int checkSpace(int column)
	{
		if (column<0 || column>=7){
			return -1;
		}
		else
		{
		for (int row =0; row<ROW; row ++ )
		{
			
			if(grid[row][column]==null)
			{
				return row;
			}
		}
		return -1;
		}// return -1 if the condition is not satisfied
	}
	/**
     * Method to drop chip in the board
     * @param int column 
     * @param String value
     */
	
	public boolean dropChip(int column, String disc)
	{
		if (checkSpace(column)== -1)
		{
			return false;
		}
		else 
		{
			grid[checkSpace(column)][column]= disc; 
			return true;
		}
	}
	/**
     * Method to initialize board with null value
     */
	public void iniBoard()
	{
		for(int row = (ROW - 1); row >= 0; row--)
		{

			for(int column = 0; column < COLUMN; column++)
			{
				
					grid[row][column]=null;
			}
			
		}
		
	}
	/**
     * Method to print elements in the Board
     */
	public void printBoard()
	{
		System.out.println("===================="); // print the boundary line
		for(int row = (ROW - 1); row >= 0; row--)
		{

			for(int column = 0; column < COLUMN; column++)
			{
				if (grid[row][column]==null)
				{
					System.out.print(" o "); // setting the null value of element in an array to "o"
				}
				else
				{
					System.out.print(" " + grid[row][column]+" ");
			    }
			}
			System.out.println();
		}
		System.out.println("====================");

	}
	/**
     * Method to check the status of the winner
     * @return bollean value.
     * it returns true if the condition is satisfied otherwise it will return false value.
     */
	
	public boolean whoWonGame()
	{
		boolean result = false;//setting the initial value of the result to false
		for (int row=0;row<ROW;row++)// to check for the horizental condition 
		{
			for (int column = 0; column<4 ; column++)
			{
				if (grid[row][column]!= null && grid[row][column] == grid[row][column+1] && grid[row][column] == grid[row][column+2] && grid[row][column]==grid[row][column+3])
				{
					result = true;
				}
			}
		}
		for (int row=0;row<4;row++)// to check for the vetical condition for the row win
		{
			for (int column = 0; column<COLUMN ; column++)
			{
				if (grid[row][column]!= null && grid[row][column] == grid[row+1][column] && grid[row][column] == grid[row+2][column] && grid[row][column]==grid[row+3][column])
				{
					result = true;
				}
			}
		}
		for (int row=0;row<3;row++)// to check the diagonal condition from right hand side
		{
			for (int column = 0; column<4 ; column++)
			{
				if (grid[row][column]!= null && grid[row][column] == grid[row+1][column+1] && grid[row][column] == grid[row+2][column+2] && grid[row][column]==grid[row+3][column+3])
				{
					result = true;
				}
			}
		}
		for (int row=3;row<6;row++)// to check the diagonal condition from the left hand side
		{
			for (int column = 0; column<4 ; column++)
			{
				if (grid[row][column]!= null && grid[row][column] == grid[row-1][column+1] && grid[row][column] == grid[row-2][column+2] && grid[row][column]==grid[row-3][column+3])
				{
					result = true;
				}
			}
		}
		return result;
	}
	
	
	
	
}
	