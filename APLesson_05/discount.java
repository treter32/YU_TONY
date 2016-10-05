import java.util.Scanner;
public class discount
{
	static double subtotal;
	public static void main (String[]args)
	{	
		discount receipt = new discount();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter item 1:");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		String sprice1 = keyboard.nextLine();
		double price1 = Double.parseDouble(sprice1);
		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		String sprice2 = keyboard.nextLine();
		double price2 = Double.parseDouble(sprice2);
		System.out.println("Please enter item 3:");
		String item3 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		String sprice3 = keyboard.nextLine();
		double price3 = Double.parseDouble(sprice3);
		
		System.out.println("Please enter item 4:");
		String item4 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		String sprice4 = keyboard.nextLine();
		double price4 = Double.parseDouble(sprice4);
		
		subtotal = price1 + price2 + price3 + price4;
		receipt.discount();
		
		
		double tax = 0.1 * subtotal;
		double total = tax + subtotal;
		System.out.println("     <<<<<<<__Receipt__>>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		if(subtotal >= 2000)
		{
			System.out.printf("\n%10s ........ %10s", "Discount:", "15%");
		}
		
		if(subtotal < 2000)
		{
			System.out.printf("\n%10s ........ %10s", "Discount:", "0%");
		}
		System.out.printf("\n%10s ........ %10.2f", "Subtotal:", subtotal);
		System.out.printf("\n%10s ........ %10.2f", "Tax:", tax);
		System.out.printf("\n%10s ........ %10.2f", "Total:", total);
	
		System.out.println("\n");
		System.out.println("____________________________");
		System.out.println("* Thank you for your support *");
	}
	
	public void discount()
	{
		if(subtotal >= 2000)
		{
			//subtotal = subtotal*0.85;
		}
	}
	
	
	
	public void format(String item, double price)
	{
		System.out.printf("\n%10s ........ %10.2f", item, price);
	}
}