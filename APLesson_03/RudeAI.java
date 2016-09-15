import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println(name + "? Trash name.");
		
		System.out.println("How old are you?");
		String age = keyboard.nextLine();
		System.out.println(age + "? That's the worst time of your life.");
		
		System.out.println("What do you do for fun?");
		String hobby = keyboard.nextLine();
		System.out.println("Haha," + hobby + " is for losers.");
		
		System.out.println("What kind of music do you like?");
		String music = keyboard.nextLine();
		System.out.println(music + " is the worst kind of music.");
		
		System.out.println("How many siblings do you have?");
		String siblings = keyboard.nextLine();
		System.out.println(siblings +"? Well I bet it sucks to be your sibling.");
		
		System.out.println("What do you want to be when you grow up?");
		String dream = keyboard.nextLine();
		System.out.println(dream + "? Get a life.");
		
		
		
	}
}