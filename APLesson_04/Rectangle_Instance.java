import java.util.Scanner;
public class Rectangle_Instance
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter width (ft):");
		String swidth = keyboard.nextLine();
	    double width = Double.parseDouble(swidth);
		
		System.out.println("Enter length (ft):");
		String slength = keyboard.nextLine();
		double length = Double.parseDouble(slength);
		calcPerim(length, width);
	}
	
	public static void calcPerim(double length, double width)
	{
		 double perimeter = (2*length+2*width);
		 print(perimeter);
	}
	
	public static void print(double perimeter)
	{
		//System.out.println("The rectangle is " + perimeter + " ft around.");
		System.out.printf("Your rectangle is %.5f %s", perimeter, " ft around.");
	}
}
