import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class xsAndOs
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		String[][] xandO = new String[4][4];
		for (int a=0;a<xandO.length;a++)
		{
			for (int b=0; b<xandO[a].length; b++)
			{
				int pick=(int)(Math.random()*2+1);
				if (pick==1)
				{
					xandO[a][b]="x";
				}				
				if (pick==2)
				{
					xandO[a][b]="o";
				}
			}
		}
		for (int a=0;a<xandO.length;a++)
		{
			for (int b=0;b<xandO[a].length;b++)
			{
				System.out.print("    " + xandO[a][b]);
			}
			System.out.print("\n");
		}
	}
	
}