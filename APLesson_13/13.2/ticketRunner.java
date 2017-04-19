import java.util.Scanner;
import java.util.ArrayList;

public class ticketRunner
{
	public static void main (String[]args)
	{
		advanceClass advance = new advanceClass(10);
		studentAdvanceClass student = new studentAdvanceClass(10);
		walkupClass walkup = new walkupClass();
		
		System.out.println(walkup);
		System.out.println(advance);
		System.out.println(student);
	}
}