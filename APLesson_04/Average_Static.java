import java.util.Scanner;

public class Average_Static
{

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		double num1 = keyboard.nextDouble();
		
		System.out.println("Enter a number ");
		double num2 = keyboard.nextDouble();
		
		System.out.println("Enter a number ");
		double num3 = keyboard.nextDouble();
		
		double average = average(num1,num2,num3);
		
		print(num1,num2,num3,average);
	}
	
	
	public static double average(double n1,double n2,double n3)
	{
		return ((n1+n2+n3)/3);
	}

	public static void print(double n1, double n2, double n3, double avg)
	{
		System.out.printf("The Average Of %.5f, %.5f, And %.5f Is: %.5f",n1,n2,n3,avg);
	}

}