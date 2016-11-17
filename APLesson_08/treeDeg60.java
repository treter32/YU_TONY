import java.util.Scanner;
public class treeDeg60
{	   
	public static void main(String[]args)
	{
	   Scanner kb = new Scanner(System.in);
	   System.out.println("Please enter a word:");
	   String word = kb.nextLine();
	   int stop = word.length();
	   int start = 0;
	   tree(stop, start, word);
	}

	public static String tree(int stop, int start, String word)
	{
		if(start <= stop)
		{
			System.out.printf("%20s",word.substring(0, start));
			System.out.println("");
			start = start + 1;
			tree(stop, start, word);
		}
			return "";
	}
}