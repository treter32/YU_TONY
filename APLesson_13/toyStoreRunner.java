import java.util.ArrayList;
import java.util.Scanner;

public class toyStoreRunner
{
	public static void main (String[]args)
	ArrayList<toyStoreClass> toy = new ArrayList<toyStoreClass>();
	toy.add(new aFigureClass("Izaya"));
	toy.add(new carClass("1983 Toyota Sprinter Hatchback"));
	System.out.println(toy);
}