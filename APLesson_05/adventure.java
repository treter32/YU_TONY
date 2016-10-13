import java.util.Scanner;
public class adventure
{
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Press number keys to select your options.");
		System.out.println("You enter a tunnel.");
		System.out.println("You walk in too deep and can no longer see.");
		System.out.println("You reach into your bag and look at your options.");
		System.out.println("You take out a pair of Boots of Swiftness, a box of matches, and a torch.");
		System.out.println("What do you do?.");
		System.out.println("1.) Take your Boots of Swiftness and run it down mid Tyler1 style.");
		System.out.println("2.) Light the matches and torch.");
		System.out.println("3.) Do nothing and proceed.");
		String sresult = keyboard.nextLine();
		double result = Double.parseDouble(sresult);
		if(result == 1)
		{
			 System.out.println("You put on your boots and begin running it down faster than you ever have.");
			 System.out.println("You then run into something and light up your torch.");
			 System.out.println("It is C9 Hai");
			 System.out.println("What do you do?.");
			 System.out.println("1.) Punch him with your alpha arms until he's out cold.");
			 System.out.println("2.) Shove your torch in his face.");
			 sresult = keyboard.nextLine();
			 result = Double.parseDouble(sresult);
			 if(result == 1)
			 {
				 System.out.println("You knock him out cold and move on.");
				 System.out.println("You run into Doubblenoodle and begin to 1v1 him.");
				 System.out.println("C9 Meteos jumps out and ganks you. However, you are able to see him with your torch and light his hair up.");
				 System.out.println("You proceed to beat up Doublenoodle.");
				 System.out.println("Without anymore vision you continue running it down and make it out.");
			 }
			 
			  if(result == 2)
			 {
				 System.out.println("You light him up until he falls. You move on.");
				 System.out.println("You run into Doubblenoodle and begin to 1v1 him.");
				 System.out.println("You run into Doubblenoodle and begin to 1v1 him.");
				 System.out.println("However, without your torch, you now have no vision and C9 Meteos ganks you and you die.");
				 result = 0;
			 }
		}
		if(result == 2)
		{
			 System.out.println("You begin running it down with vision.");
			 System.out.println("Because the cave is lit up, all your foes begin running away from you as they can now see your alpha arms as you continue running it down.");
			 System.out.println("You make it out.");
			 
		}
		
		if(result == 3)
		{
			 System.out.println("You get lost and decide to light up your torch.");
			 System.out.println("It is too late and dunkey guns you down in the middle of the tunnel for the degenerate that you are.");
		}
		
		System.out.println("gg");
	}
}