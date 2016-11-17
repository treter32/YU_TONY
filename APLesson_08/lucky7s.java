import java.util.Scanner;
public class lucky7s
{
	public static void main(String[]args)
	{
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Please enter a word: ");
	   String snum = keyboard.nextLine();
	   Number num = Integer.parseInteger(snum);
	   center(num);
	}

	public static String center(int num)
	{
	   if(num > 6)
	   {
		   System.out.println(word);
	   }
	   else
	   {
		word = " " + word + " ";
		center(word, 20);
	   }
	   return "";
	}	
}