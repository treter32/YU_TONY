import java.util.Scanner;
public class carDriver
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("paint color: ");
		String paint = keyboard.nextLine();
		System.out.println("interior: ");
		String interior = keyboard.nextLine();
		System.out.println("engine: ");
		String engine = keyboard.nextLine();
		System.out.println("tires: ");
		String tires = keyboard.nextLine();
	
		carClass car = new carClass(paint,interior,engine,tires);
		
		System.out.println("Your car is ready \n Paint: " + car.getPaint() + "\n Interior: " + car.getInterior() + "\n Engine: " + car.getEngine() + "\n Tires: " + car.getTires());
		

		
		
		
	}
}