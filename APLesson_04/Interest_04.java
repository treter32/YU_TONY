import java.util.Scanner;

public class Interest_04
{
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter interest rate:");
		String sinterest = keyboard.nextLine();
		double interest = Double.parseDouble(sinterest);
		
		System.out.println("Enter principal(initial amount):");
		String sprincipal = keyboard.nextLine();
		double principal = Double.parseDouble(sprincipal);
		
		System.out.println("Enter how many times the loan is compunded per year:");
		String scompound = keyboard.nextLine();
		double compound = Double.parseDouble(scompound);
		
		System.out.println("Enter the time of the loan in years:");
		String stime = keyboard.nextLine();
		double time = Double.parseDouble(stime);
		
		double nt = compound*time;
		double mPayment = Math.pow((1+(interest/compound)), (nt))*principal / (time * 12);
		double tPayment = Math.pow((1+(interest/compound)), (nt))*principal;
		
		
		System.out.printf("Your total monthly payment is " + "$" + "%.2f" + ".", mPayment);
		System.out.println("\n");
		System.out.printf("Your total monthly payment is " + "$" + "%.2f" + ".", tPayment);
		
	}
}