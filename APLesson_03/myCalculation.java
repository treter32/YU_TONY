import java.util.Scanner;

public class myCalculation
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the length of your rectangle?");
		double length = keyboard.nextDouble();
		
		System.out.println("What is the width of your rectangle?");
		double width = keyboard.nextDouble();
		
		double result = width*length;
		
		
		System.out.println("The area is " + result + ".");
		
		
		
		
	}
}