public class carClass
{
	private String paint, interior, engine, tires;
	public carClass()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	public carClass(String p,  String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public void setAssets(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	
	
	public String getPaint()
	{
		return paint;
	}
	
	public String getInterior()
	{
		return interior;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	public String getTires()
	{
		return tires;
	}
}