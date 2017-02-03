import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class gameHealth
{
	public static Integer HEALTHLOAD = 6, healthCount;
	public static String[] health;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		String turn = "";
		Integer damage = 0; //controls if damage is + or -
		Integer amount = 0; //controls the amount of damage
		healthCount = 6;
		health = new String[HEALTHLOAD];
		
		while (!turn.equals("Q")&&healthCount>0)
		{
			System.out.println("Your Turn! Hit Enter When Ready:");
			turn = keyboard.nextLine();
			damage = (int)((Math.random() * 2) + 1);
			amount = (int)((Math.random() * 6) + 1);
			System.out.println(takeDamage(damage,amount));
			printClip();
			
		}
		
		System.out.println("You Died!!!");
	}
	
	public static String takeDamage(int dmg, int amt)
	{
		if (dmg==1)
		{
			healthCount = amt - 1;
			return "Taking " + amt + " Damage!";
		}
		else
		{
			if (healthCount + amt < HEALTHLOAD)
			{
				healthCount += amt;
			}
			else
			{
				healthCount = HEALTHLOAD;
			}
			return "Power Up " + amt;
		}
	}
	
	public static void printClip()
	{
		String output = "Health:\t";
		for (int i=0;i<HEALTHLOAD;i++)
		{
			if (i<healthCount)
			{
				health[i]="@";
			}
			else 
			{
				health[i]="[]";
			}
			output += health[i];
		}
		
		System.out.println(output);
	}
}