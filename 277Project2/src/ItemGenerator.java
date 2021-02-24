import java.util.ArrayList; 
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ItemGenerator{
	private PrintWriter writer;
	private static ArrayList<Item> itemList = null;
	/** * Constructor for ItemGenerator using itemList.txt, add every item to itemList
	* @throws FileNotFoundException when itemList.txt cannot be found
	*/
	private ItemGenerator()
	{
		//Scanner read = null;
		ItemGenerator.itemList = new ArrayList<Item>();
		//Get item information from itemList.txt and store in itemList
	   	try 
	   	{
			/*read*/ writer = new PrintWriter /*Scanner*/(new File("itemList.txt"));
			while(/*read*/writer.hasNext()) {
				String line = /*read*/writer.nextLine();

				Item item = new Item(line);
				ItemGenerator.itemList.add(item);
			}
			/*read*/writer.close();
	   	}
	   	catch(FileNotFoundException e)
	   	{
	     	System.out.println("FNF - place file in the project folder. ");
	   	}
	}
	

	/** * Return a random Item from itemList
	* @return random Item from itemList
	*/
	public static Item generateItem()
	{
		if(itemList == null) {
			itemList = new ArrayList<Item>();
		}
		return itemList;
	}
		/*Random rand = new Random();
		final int NUM_ITEMS = this.itemList.size();
        return this.itemList.get(rand.nextInt(NUM_ITEMS));
	}*/
	public void writeMsg( String msg) {
		writer.println( msg);
		writer.flush();
	}
}