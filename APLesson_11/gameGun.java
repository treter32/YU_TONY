import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class gameGun
{
	public static int bulletCount = 96, CLIPSIZE = 16, shotCount = 0;
	public static String[] clip;
	
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		clip = new String[CLIPSIZE];
		resetClip();
		
		while(bulletCount>0||shotCount>0)
		{
			System.out.println("Action: ");
			String action = keyboard.next();
			
			if (action.equals("R"))
			{
				reload();
			}
			if (action.equals("S"))
			{
				System.out.println(Shoot());
			}
			System.out.println(printClip());
			
		}
		System.out.println("Out Of Bullets!!!");
		
	}
	
	public static void reload()
	{
		if (bulletCount>=CLIPSIZE)
		{
			bulletCount=bulletCount - CLIPSIZE;
			shotCount=CLIPSIZE;
		}
		else
		{
			shotCount=bulletCount;
			bulletCount=0;
		}
		
		resetClip();
		
		for (int i=0;i<shotCount;i++)
		{
			clip[i] = "*";
		}
		
	}
	
	public static String Shoot()
	{
		if (shotCount>0)
		{
			clip[shotCount - 1] = "[]";
			shotCount--;
			return ("BOOM!!!");	
		}
		else
		{
			return ("Reload!!!");
		}
	}
	
	
	public static void resetClip()
	{
		for(int i=0;i<CLIPSIZE;i++)
		{
			clip[i] = "[]";
		}
	}
	public static String printClip()
	{
		String output="";
		output += "Bullets: " + " " + bulletCount + "\n" + "Clip: " + "\t" ;
		for (int i=0;i<CLIPSIZE;i++)
		{
			output += clip[i];
		}
		return output;
	}
	
}