import java.util.Scanner;

public class BMICalc
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How tall are you in inches?");
		double height = keyboard.nextDouble();
		
		System.out.println("How much do you weigh in pounds?");
		double weight = keyboard.nextDouble();
		double result = weight*703/(height*height);
		
		System.out.println("Your BMI is " + result);
		
		
		
		
	}
}