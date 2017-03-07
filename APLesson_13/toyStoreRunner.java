import java.util.ArrayList;
import java.util.Scanner;
public class toyStoreRunner
{
   private ArrayList<Toy> toyList = new ArrayList<Toy>();
   
   public toyStoreRunner()
   {
	   this("");
   }
   public toyStoreRunner(String toys)
   {
	   this.loadToys(toys);
   }
}