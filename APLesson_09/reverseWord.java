import java.util.Scanner;
public class reverseWord
{	   
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter a 5 words:");
	
	   String[] words = new String[5];
	   
	   for(int i = 0; i < words.length; i++)
	   {
		   words[i] = kb.nextLine();
	   }   
	   
	   System.out.println("In Order");
	   
	   for(int i = 0; i < words.length; i++)
	   {
		   System.out.println(words[i]);
	   }   
	   
	   System.out.println("In Reverse");
	   
	   reverse(words);
	}

	public static String reverse(String[] words)
	{
	   for(int i = 4; i >= 0; i--)
	   {
		   System.out.println(words[i]);
	   }   
	   return"";
	}
}