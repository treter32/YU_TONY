import java.util.Scanner;
public class Circle
{
	static double r;
	static double area;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the radius:");
		String sr = keyboard.nextLine();
		r = Double.parseDouble(sr);
		
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
		 r = 3.14*(r*r);
	}
	
	public static void print()
	{
		//System.out.println("The rectangle is " + perimeter + " ft around.");
		System.out.printf("The area of a circle with a radius of %.5f %s %.5f", r, "is is", area);
	}
}
