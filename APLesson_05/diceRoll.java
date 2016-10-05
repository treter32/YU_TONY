public class diceRoll
{
	static String winner;
	public static void main(String[]args)
	{
		int player = 1 + (int)((Math.random()* 6));
		int computer = 1 + (int)((Math.random()* 6));
		System.out.println("You rolled a " + player);
		System.out.println("The computer rolled a " + computer);
		rollDice(player, computer);
		System.out.println(winner + " the winner");
		
	}
	
	public static void rollDice(int player, int computer)
	{
		if(player>computer)
		{
			winner = "You are";
		}
		
		if(computer>player)
		{
			winner = "The computer is";
		}
		
		if(player == computer)
		{
			winner = "No one is";
		}
		
	}
	

}
