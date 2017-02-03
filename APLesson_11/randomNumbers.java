import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class randomNumbers
{
	
	public static void main(String[]args)
	{
		int[][] nums=new int[4][4];
		
		for(int a=0;a<nums.length;a++)
		{
			for(int b=0;b<nums[a].length;b++)
			{
				nums[a][b]=(int)((Math.random()*100));
			}
		}
		
		for (int a=0;a<nums.length;a++)
		{
			for (int b=0;b<nums[a].length;b++)
			{
				System.out.print(nums[a][b] + "    ");
			}
			System.out.print("\r\n");
		}
	}
	
}
	