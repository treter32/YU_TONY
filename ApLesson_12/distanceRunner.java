import java.util.Scanner;
public class distanceRunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("x1?");
		int xOne = keyboard.nextInt();
		System.out.println("x2?");
		int xTwo = keyboard.nextInt();
		System.out.println("y1?");
		int yOne = keyboard.nextInt();
		System.out.println("y2?");
		int yTwo = keyboard.nextInt();
		
		distanceClass distance = new distanceClass(xOne,xTwo,yOne,yTwo);
		
		System.out.println("Distance is " + distance.getDistance());
		
	}
}