import java.util.Scanner;
public class inventoryRunner 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Manufacturer:");
		String m = s.nextLine();
		System.out.println("Name:");
		String n = s.nextLine();
		System.out.println("inventory?");
		inventoryClass item1;
		if (s.nextLine().equals("yes")) 
		{
			System.out.println("Category:");
			String c = s.nextLine();
			System.out.println("Price:");
			double p = s.nextDouble();
			item1 = new inventoryClass(m, n, c, p);
		} else {
			item1 = new inventoryClass(m, n);
		}
		System.out.println(item1.toString());
	}
}