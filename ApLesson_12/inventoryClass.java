public class inventoryClass 
{
    private String manufacturer;
    private String name;
    private String category;
    private int UPC;
	private double price;

    public inventoryClass(String m, String n) 
	{
	    manufacturer = m;
		name = n;
	    UPC = (int)(Math.random() * 1000000000) + 1;
		category = "N/A";
		price = 1.23;
    }
   
    public inventoryClass(String m, String n, String c, double p) 
	{
	    manufacturer = m;
		name = n;
	    UPC = (int)(Math.random() * 1000000000) + 1;
		category = c;
		price = p;
	}
	
	public String toString() 
	{
	    return "Inventory Info  \nManufacturer: " + manufacturer +
							   "\nName: " + name +
							   "\nCategory: " + category +
							   "\nUPC #: " + UPC +
							   String.format("\nInventory price: $%.2f", price);
	}
}