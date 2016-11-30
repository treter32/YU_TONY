import java.util.Scanner;
public class getOdds
{	   
	public static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		
		fillArray();
		printArray();
		getOdds();
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 101);
		}

	}
	
	public static void printArray()
	{
		for(int i = 1; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);	
		}	
	}
	
	public static void getOdds()
	{
		System.out.println("The odd numbers are:");
		for(int i = 1; i < numbers.length; i++)
		{
			if(numbers[i]%2>0)
			{	
				System.out.println(numbers[i]);	
			}
		}	
	}
	
	
}