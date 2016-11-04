import java.util.Scanner;
public class replaceAts
{
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a string");
		String letter = "";
		String sentence = keyboard.nextLine();
		String newString = "";
		//int aPosition = 0;
		while(sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a")+1);
			//aPosition = sentence.indexOf("a");
			
		}
		
		System.out.println(sentence);
	}	
	

}

