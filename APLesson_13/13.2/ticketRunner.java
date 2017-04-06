import java.util.Scanner;
import java.util.ArrayList;

public class ticketRunner
{
	public static void main (String[]args)
	{
		advanceClass advance = advanceClass(10);
		studentAdvanceClass student = studentAdvanceClass(10);
		walkupClass walkup = walkupClass();
		
		System.out.println(walkup);
		System.out.println(advance);
		System.out.println(student);
	}
}