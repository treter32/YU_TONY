import java.util.Scanner;
public class Cube_Instance
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the side:");
		String sside = keyboard.nextLine();
		double side = Double.parseDouble(sside);
		
		calcSurf(side);
	}
	
	public static void calcSurf(double side)
	{
		 double sa = 6*(side*side);
		 print(side, sa);
	}
	
	public static void print(double side, double sa)
	{
		//System.out.println("The rectangle is " + perimeter + " ft around.");
		System.out.printf("The surface area of a cube with %.5f %s %.5f", side, "sides is", sa);
	}
}
