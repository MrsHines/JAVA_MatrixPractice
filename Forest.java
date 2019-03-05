//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Forest
{
	private Thing[][] grid;

	public Forest(int rows, int cols)
	{
		final String[] typeList = "cat dog tree rock".split(" ");
		final String[] nameList = "a b c d e f g h i j k l m n o p q r t s u v w x y z".split(" ");
		
		
		//load a Thing into in each spot the grid
		//each Thing should have a randomly chosen type, name, and size
		//types and names come from the lists above.  Size is a random number between one and twenty.
		
	}


	//replace the trapped animal with null
	public int setTrappedToNull( )
	{
		return 0;
	}
	
	//if location ! a rock && 
	//is surrounded by > 5 trees or rocks larger than 10
	public boolean isTrapped( int r, int c)
	{
		return false;
	}

	//make sure the space you are checking is in bounds
	private boolean inBounds( int r, int c)
	{
		return false;
	}

	//create a string that details how the grid should print out.
	public String toString()
	{
		return "";
	}
}


