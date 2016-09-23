import java.util.Scanner;

public class ID_04
{
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = keyboard.nextLine();
		
		System.out.println("Enter your last name:");
		String lastName = keyboard.nextLine();
		
		System.out.println("Enter your title:");
		String title = keyboard.nextLine();
		
		System.out.println("Enter your school:");
		String school = keyboard.nextLine();
		
		System.out.println("Enter the year:");
		String year = keyboard.nextLine();
		
		System.out.println("What is yout subject?");
		String subject = keyboard.nextLine();
		
		System.out.println("***********************************");
		System.out.println("*                                 *");
		System.out.printf("* %10s %10s           *", school, year);
		System.out.println("\n");
		System.out.printf("* %10s %10s           *", firstName, lastName);
		System.out.println("\n");
		System.out.printf("* %10s %10s           *", title, subject);
		System.out.println("\n");
		System.out.println("*                                 *");
		System.out.println("***********************************");
		
		
		
		
		
	}
}