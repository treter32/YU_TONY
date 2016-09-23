import java.util.Scanner;
public class Subwoofer_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter height (inches):");
		String sheight = keyboard.nextLine();
		double height = Double.parseDouble(sheight);
		
		System.out.println("Enter length (inches):");
		String slength = keyboard.nextLine();
		double length = Double.parseDouble(slength);
		
		System.out.println("Enter width (inches):");
		String swidth = keyboard.nextLine();
		double width = Double.parseDouble(swidth);
		
		double volume = (width * length * height) / 1728;
		
		System.out.printf("The volume is " + "%.2f" + " cubic feet", volume);
	}
}
