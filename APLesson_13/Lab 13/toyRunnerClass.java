import java.util.ArrayList;
import java.util.Scanner;

public class toyRunnerClass
{
	public static void main (String[]args)
	{
		ArrayList<toyClass> toy = new ArrayList<toyClass>();
		toy.add(new aFigureClass("Izaya"));
		toy.add(new carClass("1983 Toyota Sprinter Hatchback"));
	
		for(toyClass i : toy)
		{
			System.out.println(i);
		}
	}
}