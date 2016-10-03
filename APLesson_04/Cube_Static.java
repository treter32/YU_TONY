import java.util.Scanner;
public class Cube_Static
{
	static double side;
	static double sa;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the side:");
		String sside = keyboard.nextLine();
		side = Double.parseDouble(sside);
		
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		 sa = 6*(side*side);
	}
	
	public static void print()
	{
		//System.out.println("The rectangle is " + perimeter + " ft around.");
		System.out.printf("The surface area of a cube with %.5f %s %.5f", side, "sides is", sa);
	}
}
