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
		}
	}
	

    
}