import java.util.Scanner;
public class underscores
{
	public static void main(String[]args)
	{
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Please enter a sentence: ");
	   String sentence = keyboard.nextLine();
	   replace(sentence, 0);
	}

	public static String replace(String sentence, int num)
	{
	   if(sentence.indexOf(" ") < num)
	   {
		   System.out.println(sentence);
	   }
	   else
	   {
		   sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ")+1);
		   replace(sentence, 0);
	   }
	   return "";
	}	
}