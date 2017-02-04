import java.util.Scanner;

public class Cube_Static
{
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the side: ");
		double s = keyboard.nextDouble();

		double sa = calcSurf(s);
		
		print(s,sa);
	}
	
	public static double calcSurf(double s)
	{
		return (6 * s * s);
	}
	
	public static void print(double s, double sa)
	{
		System.out.println("The surface area of a cube with sides " + s + " is " + sa);	
	}

}