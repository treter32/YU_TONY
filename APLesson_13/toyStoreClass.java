import java.util.ArrayList;
import java.util.Arrays;

public class toyStoreClass
{
    private ArrayList<toyClass> toyList = new ArrayList<toyClass>();
	
	public toyStoreClass()
	{
		
	}
	
	public toyStoreClass(String toys)	
	{
		this.loadToys(toys);
    }
  
	public void loadToys(String toys)
	{
		ArrayList<String> toys2 = new ArrayList<String>(Arrays.asList(toys.split(", ")));
		for(int i = 0; i < toys2.size(); i+=2)
		{
			String name = toys2.get(i);
			String type = toys2.get(i+1);
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
	
	public toyClass getThatToy(String asd)
	{
		for(toyClass i : toyList)
		{
			if(i.getName().equals(asd))
			{
				return i;
			}
		}
		return null;
	}

    public String getMostFrequentToy()
	{
		String name = "";
		int max = 0;
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
		for(toyClass frequent : toyList)
		{	
			if(frequent.getType()=="Car")
				{
					cars++;
				}	
				
			else if(frequent.getType()=="Action Figure")
				{
					figures++;
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
		
		else if(cars<figures)
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
		return toyList + "";
	}

    
}