import java.util.Scanner;
public class Rectangle_Static
{
	static double width;
	static double length;
	static double perimeter;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter width (ft):");
		String swidth = keyboard.nextLine();
		double width = Double.parseDouble(swidth);
		
		System.out.println("Enter length (ft):");
		String slength = keyboard.nextLine();
		double length = Double.parseDouble(slength);
		calcPerim(width, length);
	}
	
	public static void calcPerim(double length, double width)
	{
		 perimeter = (2*length+2*width);
		 print(perimeter);
	}
	
	public static void print(double perimeter)
	{
		//System.out.println("The rectangle is " + perimeter + " ft around.");
		System.out.printf("Your rectangle is %.5f %s", perimeter, " ft around.");
	}
}
