import java.util.Scanner;

public class humanRunner
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("hair: ");
		String hair = keyboard.nextLine();
		
		System.out.println("eyes: ");
		String eyes = keyboard.nextLine();
		
		System.out.println("skin: ");
		String skin = keyboard.nextLine();
		
		humanClass human = new humanClass(hair,eyes,skin);
		
		System.out.println("info");
		System.out.printf("\nHair: %10s", human.getHair());
		System.out.printf("\nEyes: %10s", human.getEyes());
		System.out.printf("\nSkin: %10s", human.getSkin());
		
		human.setCustom("blue","blonde","white");
		
		System.out.println("\n\nFriend's info...");
		System.out.printf("\nHair: %10s", human.getHair());
		System.out.printf("\nEyes: %10s", human.getEyes());
		System.out.printf("\nSkin: %10s", human.getSkin());
		
	}
	
}