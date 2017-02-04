import java.lang.Math.*;

public class humanClass
{
	private String hair,eyes,skin;
	
	public humanClass()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public humanClass(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setCustom(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}
	