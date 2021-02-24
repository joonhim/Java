import java.util.ArrayList; 
import java.util.List; 
import java.util.Random; 
import java.util.Scanner;
import java.io.*;
import java.io.PrintWriter;
{
	private ArrayList<item> itemList;

  
/*public class itemGenerator(){
  
    // Drive Function 
    public static void main(String[] args)
    { 
  
        // create a list of Integer type 
        List<Integer> list = new ArrayList<>(); 
        // add 7 element in ArrayList 
        list.add(new Item("gem"));
		list.add(new Item("Health Potion"));
		list.add(new Item("Shield"));
		list.add(new Item("Bag o' Gold"));
		list.add(new Item("Helm"));
		list.add(new Item("Ring"));
		list.add(new Item("Boots")); 
  
		itemGenerator obj = new itemGenerator(); 
  
        // take a random element from list and print them 
        System.out.println(obj.getRandomElement(list)); 
    } 
  
    // Function select an element base on index  
    // and return an element 
    public int getRandomElement() 
    { 
        Random rand = new Random(); 
        return list.get(rand.nextInt(list.size())); 
    } 
} */
public class itemGenerator {
	//global variable
	Scanner read = null;
	   try {
				read = new Scanner(new File("items.txt"));
				while(read.hasNext()) {
					String line = read.nextLine();
					Item item = new Item(line);
					itemList.add(item);
				}

	      read.close();
	   }catch(FileNotFoundException e){
	     System.out.println("File Not Found - place file in the project folder. ");
	   }
				
/*	private Arraylist<Item> itemlist;
	
	//Constructor
	public itemGenerator()
	{
		//Add all of the items into the itemList
		//itemList.add(new Item("gem");
		itemList.add(new Item("gem"));
		itemList.add(new Item("Health Potion"));
		itemList.add(new Item("Shield"));
		itemList.add(new Item("Bag o' Gold"));
		itemList.add(new Item("Helm"));
		itemList.add(new Item("Ring"));
		itemList.add(new Item("Boots"));
		
	}*/
}
	public ItemGenerate.Item()
	{
		//random a radom item
		//Generate a random number
		//return itemList.get(randomNum)
		 Random rand = new Random(); 
	     return list.get(rand.nextInt(list.size())); 
	}

}
