import java.util.Scanner;
public class Average_Instance
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		String snum1 = keyboard.nextLine();
		double num1 = Double.parseDouble(snum1);
		
		System.out.println("Enter a number:");
		String snum2 = keyboard.nextLine();
		double num2 = Double.parseDouble(snum2);
		
		System.out.println("Enter a number:");
		String snum3 = keyboard.nextLine();
		double num3 = Double.parseDouble(snum3);
		
		
		average(num1, num2, num3);
	}
	
	public static void average(double num1, double num2, double num3)
	{
		double average = (num1 + num2 + num3)/3;
		print(average, num1, num2, num3);
	}
	
	public static void print(double average, double num1, double num2, double num3)
	{
		//System.out.println("The rectangle is " + perimeter + " ft around.");
		System.out.printf("The average of %.5f %.5f %.5f %s %.5f", num1, num2, num3, "is", average);
	}
}
