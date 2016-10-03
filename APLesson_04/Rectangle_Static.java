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
		width = Double.parseDouble(swidth);
		
		System.out.println("Enter length (ft):");
		String slength = keyboard.nextLine();
		length = Double.parseDouble(slength);
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
		 perimeter = (2*length+2*width);
	}
	
	public static void print()
	{
		//System.out.println("The rectangle is " + perimeter + " ft around.");
		System.out.printf("Your rectangle is %.5f %s", perimeter, " ft around.");
	}
}
