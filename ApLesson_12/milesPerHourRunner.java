import java.util.Scanner;

public class milesPerHourRunner
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Distance?");
		int distance = keyboard.nextInt();
		
		System.out.println("Hours?");
		int hour = keyboard.nextInt();
		
		System.out.println("Minutes? ");
		int minute = keyboard.nextInt();
		
		milesPerHourClass mph = new milesPerHourClass(distance,hour,minute);
		
		System.out.println(distance + " miles in " + hour + " hours and " + minute + " minutes is about " + mph.getMPH() + " mph.");
		
		
	}
	
	
}
	