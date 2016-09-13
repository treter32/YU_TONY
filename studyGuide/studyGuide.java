import java.util.Scanner;

public class studyGuide
{
	public static void main(String[]args)
	{
		//question 1 solution
		int num = 45;
		System.out.println("IronMan has " + num + " kinds of weapons in his suit.");
		
		//question 2 solution
		String pres = "Abraham Lincoln";
		String quote = "Whatever you are, be a good one.";
		System.out.println(pres + " once said, " + "\"" + quote + "\"");
	
		//question 3 solution
		int h = 45;
		int w = 64;
		int a = w*h;
	
	
		//question 4 solution
		//You cannot enter a string into an integer input
		
		//question 5 solution
		// b
		
		//question 6 solution
		// a
		
		//question 7 solution
		//use a backslash before the quote to use quotes inside quotes
	
		System.out.println("The area of your rectangle is " + a + ".");
		
		//question 8 solution
		System.out.println("This one goes on top \n" + "This one goes on bottom");
		
		//question 9 solution
		System.out.println("a	b	c\n" + "d	e	f\n" + "g	h	i");
		
		
		
		
		//question 10 solution
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your Math grade: ");
		double math = kb.nextInt();
		System.out.println("Please enter your Science grade: ");
		double science = kb.nextInt();
		System.out.println("Please enter your English grade: ");
		double english = kb.nextInt();
		System.out.println("Please enter your History grade: ");
		double history = kb.nextInt();
		System.out.println("Please enter your COMPSCI grade: ");
		double compsci = kb.nextInt();

		double gpa = (math + science + english + history + compsci)/500;
		System.out.println(gpa);

		
	}
}