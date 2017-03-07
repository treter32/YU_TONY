import java.util.ArrayList;
import java.util.Scanner;

public class toyRunner
{
	public static void main (String[]args)
	ArrayList<toyClass> toy = new ArrayList<toyClass>();
	toy.add(new aFigure("Izaya"));
	toy.add(new carClass("1983 Toyota Sprinter Hatchback"));
	
	for(toyClass x : toy)
	{
		System.out.println(x);
	}
}