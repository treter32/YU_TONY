import java.util.ArrayList;
import java.util.Scanner;

public class toyStoreClass
{
    private ArrayList<toyClass> toyList = new ArrayList<toyClass>();
	
	public toyStoreClass()
	{
		this(" ");
	}
	
	public toyStoreClass(String toys)	
	{
		this.loadToys(toys);
    }
  
	public void loadToys(String toys)
	{
		ArrayList<String> toys = new ArrayList,Sring>(Arrays.asList(toys.split(", ")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			toyClass object = this.getThatToy(name);
			
			if(object == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new carClass(name));
				}
				
				else
				{
					toyList.add(new aFigureClass(name));
				}
			}
			
			else
			{
				object.setCount(object.getCount() + 1);
			}
		}
	}
	
	public toyClass getThatToy(String name)
	{
		for(toyClass i : toyList)
		{
			if(i.getName().equals(name))
			{
				return i;
			}
		}
		return null;
	}

    public String getMostFrequentToy()
	{
		String name;
		int max = Integer.MIN_VALUE;
		for(toyClass object : toyList)
		{
			if(max<object.getCount())
			{
				max = object.getCount();
				name = object.getName();
			}		
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		
		int cars = 0;
		int figures = 0;
		for(toyClass object : toyList)
		{	
			if(object.getType="Car")
				{
					cars =+ 1;
				}	
				
			if(object.getType="Action Figure")
				{
					figures =+ 1;
				}	
				
			else
				{
					System.out.println("derp herp");
				}
		}

		if(cars>figures)
		{
			return "Cars";
		}
		
		if(cars<figures)
		{
			return "Action Figures";
		}
		
		else
		{
			return "Equal amounts of action figures and cars!";
		}
			
			
	}
		
	public String toString()
	{
		return toyList;
	}

    
}