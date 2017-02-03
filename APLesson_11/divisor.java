import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class divisor
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[][] nums = new int[4][4];
		
		for (int a=0;a<nums.length;a++)
		{
			for (int b=0;b<nums[a].length;b++)
			{
				nums[a][b]=(int)((Math.random()*100)+1);
			}
		}
		
		for(int a=0;a<nums.length;a++)
		{
			for (int b=0;b<nums[a].length;b++)
			{
				System.out.print(nums[a][b]+ "    ");
			}
			System.out.print("\r\n");
		}
		
		System.out.println("\r\n");
		System.out.println("Enter a number");
		int divisor = keyboard.nextInt();
		
		int count = 0;
		
		for (int a=0; a< nums.length;a++)
		{
			for (int b=0;b< nums[a].length; b++)
			{
				if (nums[a][b]%divisor== 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the array");
		
	}
	
}