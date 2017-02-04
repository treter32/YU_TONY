import java.util.Scanner;

public class Circle_Static
{
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double r = keyboard.nextDouble();
		double area = calcArea(r);
		print(r,area);
	}
	
	public static double calcArea(double r)
	{
		return (r*r*3.14);
	}
	
	public static void print(double r, double area)
	{
		System.out.printf("The are of a circle with a radius " + r + " is " + area);	
	}

}
