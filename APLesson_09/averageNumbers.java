import java.util.Scanner;
public class averageNumbers
{	   
	public static void main(String[]args)
	{
	    Scanner kb = new Scanner(System.in);
	    System.out.println("Please enter a 5 words:");
	 
	    int[] numbers = new int[10];
	    
	    for(int i = 0; i < numbers.length; i++)
	    {
	 	    numbers[i] = kb.nextInt();
	    }      
	   average(numbers);
	}

	public static int average(int[] numbers)
	{
		int average = 0;
		for(int i = 0; i < numbers.length; i++)
	    {
		    average = average + numbers[i];
	    }   
		System.out.println(average/10);
	    return 0;
	}
}