import java.util.Scanner;
public class password
{
	static String user;
	static String pass;
	public static void main (String[]args)
	{		
		login();
	}
	
	public static void login ()
	{	
		Scanner keyboard = new Scanner(System.in);
		user = "Leona";
		pass = "easy";
		
		System.out.println("User?");
		String userInput = keyboard.nextLine();
		
		System.out.println("Pass?");
		String passInput = keyboard.nextLine();
		
		checker(userInput, passInput);
	}
	
	public static void checker (String userInput, String passInput)
	{
		if(userInput.equals(user) && passInput.equals(pass))
		{
			System.out.println("You are granted access!");
		}
		
		else
		{
			if(userInput.equals(user))
			{
				System.out.println("Your password is incorrect!");
				login();
			}
			
			if(passInput.equals(pass))
			{
				System.out.println("Your username is incorrect!");
				login();
			}
			
			if(!userInput.equals(user) && !passInput.equals(pass))
			{
				System.out.println("Your username and password are incorrect!");
				login();
			}
		}	
	}
}