import java.util.Scanner;
public class Circle_Instance
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the radius:");
		String sr = keyboard.nextLine();
		double r = Double.parseDouble(sr);
		
		calcArea(r);
	}
	
	public static void calcArea(double r)
	{
		 double area = 3.14*(r*r);
		 //System.out.printf("The area of a circle with a radius of %.5f %s %.5f", r, "is is", area);
		 print(area, r);
	}
	
	public static void print(double area, double r)
	{
		System.out.printf("The area of a circle with a radius of %.5f %s %.5f", r, "is is", area);
	}
}
