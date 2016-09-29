import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double average;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		String snum1 = keyboard.nextLine();
		num1 = Double.parseDouble(snum1);
		
		System.out.println("Enter a number:");
		String snum2 = keyboard.nextLine();
		num2 = Double.parseDouble(snum2);
		
		System.out.println("Enter a number:");
		String snum3 = keyboard.nextLine();
		num3 = Double.parseDouble(snum3);
		
		
		average();
		print();
	}
	
	public static void average()
	{
		 average = (num1 + num2 + num3)/3;
	}
	
	public static void print()
	{
		//System.out.println("The rectangle is " + perimeter + " ft around.");
		System.out.printf("The average of %.5f %.5f %.5f %s %.5f", num1, num2, num3, "is", average);
	}
}
