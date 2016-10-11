import java.util.Scanner;

public class BMI
{
	static String condition;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How tall are you in inches?");
		double height = keyboard.nextDouble();
		
		System.out.println("How much do you weigh in pounds?");
		double weight = keyboard.nextDouble();
		double result = weight*703/(height*height);
		
		if(result < 18.5)
		{
			condition = "underweight";
		}
		
		if(result >= 18.5)
		{
			if(result < 24.9)
			{
			condition = "normal";
			}
		}
		
		if(result >= 24.9)
		{
			if(result < 29.9)
			{
			condition = "overweight";
			}
		}
		
			if(result >= 29.9)
		{
			if(result < 34.9)
			{
			condition = "obese";
			}
		}
		
			if(result >= 34.9)
		{
			if(result < 39.9)
			{
			condition = "very obese";
			}
		}
		
		if(result >= 39.9)
		{
				condition = "morbidly obese";
		}
		
		
		System.out.println("Your BMI is " + result + ".");
		System.out.println("You are " + condition + ".");
		
		
		
		
	}
}