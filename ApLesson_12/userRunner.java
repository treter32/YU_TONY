import java.util.Scanner;
public class userRunner 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("First name:");
		String fN = s.nextLine();
		System.out.println("Last name:");
		String lN = s.nextLine();
		System.out.println("avatar?");
		userClass user;
		if (s.nextLine().equals("yes")) 
		{
			System.out.println("Avatar:");
			user = new userClass(fN, lN, s.nextLine());
		} else 
		{
			user = new userClass(fN, lN);
		}
		System.out.println(user.toString());
	}
}