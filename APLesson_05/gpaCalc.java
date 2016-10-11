import java.util.Scanner;
public class gpaCalc
{
	static double gpa;
	static double mathGpa;
	static double englishGpa;
	static double scienceGpa;
	static double historyGpa;
	static double languageGpa;
	static double electiveGpa;
	static double PEGpa;
	static String math;
	static String english;
	static String science;
	static String history;
	static String language;
	static String elective;
	static String PE;
	
	public static void main (String[]args)
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please your math grade:");
		math = keyboard.nextLine();
		
		System.out.println("Please enter your english grade:");
		english = keyboard.nextLine();
		
		System.out.println("Please enter science grade:");
		science = keyboard.nextLine();
		
		System.out.println("Please enter your history grade:");
		history = keyboard.nextLine();
		
		System.out.println("Please enter your language grade:");
		language = keyboard.nextLine();
		
		System.out.println("Please enter your elective grade:");
		elective = keyboard.nextLine();
		
		System.out.println("Please enter your P.E.:");
		PE = keyboard.nextLine();
		
		calcPoints();
		
		System.out.println("Your GPA is " + gpa + ".");
	
	}
	
	public static void calcPoints()
	{
		
		
		if(math.equals("A"))
		{
			mathGpa = 4.0;
		}
		
		if(math.equals("B"))
		{
			mathGpa = 3.0;
		}
		
		if(math.equals("C"))
		{
			mathGpa = 2.0;
		}
		
		if(math.equals("D"))
		{
			mathGpa = 1.0;
		}
		
		if(math.equals("F"))
		{
			mathGpa = 0.0;
		}
		
		if(english.equals("A"))
		{
			englishGpa = 4.0;
		}
		
		if(english.equals("B"))
		{
			englishGpa = 3.0;
		}
		
		if(english.equals("C"))
		{
			englishGpa = 2.0;
		}
		
		if(english.equals("D"))
		{
			englishGpa = 1.0;
		}
		
		if(english.equals("F"))
		{
			englishGpa = 0.0;
		}
		
		if(science.equals("A"))
		{
			scienceGpa = 4.0;
		}
		
		if(science.equals("B"))
		{
			scienceGpa = 3.0;
		}
		
		if(science.equals("C"))
		{
			scienceGpa = 2.0;
		}
		
		if(science.equals("D"))
		{
			scienceGpa = 1.0;
		}
		
		if(science.equals("F"))
		{
			scienceGpa = 0.0;
		}
		
		if(history.equals("A"))
		{
			historyGpa = 4.0;
		}
		
		if(history.equals("B"))
		{
			historyGpa = 3.0;
		}
		
		if(history.equals("C"))
		{
			historyGpa = 2.0;
		}
		
		if(history.equals("D"))
		{
			historyGpa = 1.0;
		}
		
		if(history.equals("F"))
		{
			historyGpa = 0.0;
		}
		
		if(language.equals("A"))
		{
			languageGpa = 4.0;
		}
		
		if(language.equals("B"))
		{
			languageGpa = 3.0;
		}
		
		if(language.equals("C"))
		{
			languageGpa = 2.0;
		}
		
		if(language.equals("D"))
		{
			languageGpa = 1.0;
		}
		
		if(language.equals("F"))
		{
			languageGpa = 0.0;
		}
		
		if(elective.equals("A"))
		{
			electiveGpa = 4.0;
		}
		
		if(math.equals("B"))
		{
			electiveGpa = 3.0;
		}
		
		if(math.equals("C"))
		{
			electiveGpa = 2.0;
		}
		
		if(math.equals("D"))
		{
			electiveGpa = 1.0;
		}
		
		if(math.equals("F"))
		{
			electiveGpa = 0.0;
		}
		
		if(PE.equals("A"))
		{
			PEGpa = 4.0;
		}
		
		if(PE.equals("B"))
		{
			PEGpa = 3.0;
		}
		
		if(PE.equals("C"))
		{
			PEGpa = 2.0;
		}
		
		if(PE.equals("D"))
		{
			PEGpa = 1.0;
		}
		
		if(PE.equals("F"))
		{
			PEGpa = 0.0;
		}
		
		
		
		gpa = (mathGpa + englishGpa + scienceGpa + historyGpa + languageGpa + electiveGpa + PEGpa)/7;
	
		
		
		
	}
	
	
}


