import java.util.Scanner;
public class center
{
	public static void main(String[]args)
	{
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Please enter a word: ");
	   String word1 = keyboard.nextLine();
	   System.out.println("Please enter a word: ");
	   String word2 = keyboard.nextLine();
	   System.out.println("Please enter a word: ");
	   String word3 = keyboard.nextLine();
	   center(word1, 20);
	   center(word2, 20);
	   center(word3, 20);
	}

	public static String center(String word, int num)
	{
	   if(word.length() >= num)
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