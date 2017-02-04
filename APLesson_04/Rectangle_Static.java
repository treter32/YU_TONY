import java.util.Scanner;
public class Rectangle_Static
{

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter width (ft) ");
		double width = keyboard.nextDouble();
		
		System.out.println("Enter length (ft) ");
		double length = keyboard.nextDouble();
		
		double perimeter = calcPerim(length,width);
		
		print(perimeter);
	}
	
	public static double calcPerim(double length, double width)
	{
		return (2*length) + (2*width);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("The Perimeter Of Your Rectangle Is: %.5f feet around",perimeter);
	}
}