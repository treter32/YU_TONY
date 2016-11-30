import java.util.Scanner;
public class fibonacciSequence
{	   
	public static void main(String[]args)
	{
	    Scanner kb = new Scanner(System.in);
	    System.out.println("Please enter your starting number:");
		int start = kb.nextInt(); 
		System.out.println("Please enter your sequence size:");
		int size = kb.nextInt();
		
	    int[] seq = new int[size];
	    
	    for(int i = 0; i < size; i++)
	    {
	 	    if(i < 2)
			{
				seq[i] = start;
			}
			
			if(i>=2)
			{
				seq[i] = seq[i-2] + seq[i-1];
			}	
			
			System.out.println(seq[i] + " ");
	    }   
	}
}