import java.util.ArrayList;
import java.util.Scanner;

public class toyStoreRunner
{
	public static void main (String[]args)
	{
		toyStoreClass toys = new toyStoreClass("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF"); 
		System.out.println(toys);
		System.out.println(toys.getMostFrequentType());
		System.out.println(toys.getMostFrequentToy());
	}
}


