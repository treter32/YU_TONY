public abstract class toyClass 
{
    private String name;
    private int count;

    public toyClass()	
	{
		name = "";
		count = 1;
    }
	
	public toyClass(String n)
	{
		name = n;
		count = 1;
	}
	
   
	public String getName()
	{
		return name;
	}	 
	 
	public int getCount()
	{
		return count;
	}
	 
	public void setCount(int c)
	{
		count = c;
	}
	 
	public void setName(String n)
	{
		name = n;
	}
	
	 
	abstract public String getType();
	 
	public String toString()
	{
		return "[" + name + "]" + "[" + count + "]";
	}
	 
}