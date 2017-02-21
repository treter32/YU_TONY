public class toyClass 
{
    private String manufacturer;
    private String name;
    private int count;

    public toyClass(String n, int c)	
	{
		name = n;
		count = c = 1;
    }
	
	public toyClass ()
	{
		this("");
	}
   
	public String getName()
	{
		return name;
	}	 
	 
	public int getCount()
	{
		return count;
	}	 
	 
	public int setCount(int c)
	{
		count = c;
	}	 
	 
	public String getName(String n)
	{
		name = n;
	}
	 
	abstract public String getType();
	 
	public String toString()
	{
		return "[" + name + "]" + "[" + count + "]";
	}
	 
}