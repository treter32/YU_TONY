public class toyStoreClass
{
    private ArrayList<toy> toyList;
	
	public toyStoreClass()
	{
		this(" ");
	}
	
	public toyStoreClass(String toys)	
	{
		this.loadToys(toys);
    }
  
	public loadToys(ArrayList<String> toys)
	{
		for(int i = 0; i < toys.size(); i++)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy object = this.toyWithName(name);
			for(int i = 0; i < toys.size(); i+=2)
			{
				String name = toys.get(i);
				String type = toys.get(i+1);
				Toy object = this.toyWithName(name);
				
				if(object = null)
				{
					if(type=="Car")
					{
						toyList.add(new Car(name));
					}
					if(type=="AFigure")	
					{
						toyList.add(new AFigure(name));
					}
				}	
				else
				{
					object.setCount(object.getCount() + 1);
				}
			}
		}
	}
	
	public getThatToy(String name)
	{
		for(Toy object : toyList)
		{
			if(object.getName==name)
			{
				return object;
			}
			
			else
			{
				return null;
			}
			
			
		}
	}

    public getMostFrequentToy()
	{
		String name;
		int max = Integer.MIN_VALUE;
		for(Toy object : toyList)
		{
			if(max<object.getCount())
			{
				max = object.getCount();
				name = object.getName();
			}		
		}
		return name;
	}
	
	public getMostFrequentType()
	{
		
		int cars = 0;
		int figures = 0;
		for(Toy object : toyList)
		{	
			if(object.getType="Car")
				{
					cars =+ 1;
				}	
				
			if(object.getType="AF")
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
		
	public toString()
	{
		return toyList;
	}
}