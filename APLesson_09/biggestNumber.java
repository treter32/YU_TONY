import java.util.Scanner;
public class biggestNumber
{	   
	public static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		
		fillArray();
		printArray();
		getBiggest();
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
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);	
		}	
	}
	
	public static void getBiggest()
	{
		int max = 0;
		System.out.println("The biggest number is:");
		for(int i = 0; i < numbers.length-1; i++)
		{
			if(numbers[i] > max)
			{
				max = numbers[i];
			}
		}	
		
		System.out.println(max);
	}
	
	
}