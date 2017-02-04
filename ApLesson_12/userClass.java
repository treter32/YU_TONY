import java.lang.Math.*;
public class userClass 
{
    private String firstName;
    private String lastName;
    private String avatar;
    private int userID;
    
    public userClass() 
	{
	    firstName = "first name";
	    lastName = "last name";
	    avatar = "none";
		userID = (int)(Math.random() * 1000000) + 1;
    }
   
    public userClass(String fN, String lN) 
	{
	    firstName = fN;
	    lastName = lN;
	    avatar = "none";
	    userID = (int)(Math.random() * 1000000) + 1;
    }
   
    public userClass(String fN, String lN, String av) 
	{
	    firstName = fN;
	    lastName = lN;
	    avatar = av;
	    userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString() 
	{
	    return "Customer Info   \nFirst Name: " + firstName +
							   "\nLast Name: " + lastName +
							   "\nAvatar: " + avatar +
							   "\nUser ID#: " + userID;
	}
}