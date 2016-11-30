import java.util.Scanner;
public class firstLetter
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
	   first(words);
	}

	public static String first(String[] words)
	{
	   for(int i = 0; i < words.length; i++)
	   {
		   System.out.println(words[i].substring(0, 1));
	   }   
	   return"";
	}
}