package Item;

public class Item {
			  
			    public String name;
			    
			    public Item(String n)//constructor (function)
			    {
			    	this.name = name;
			    }
			    //Getter
			    public String getName() {
			         return name;
			    }
			    //Setter
			    public void setName(String name) {//modifier
			         this.name = name;
			    }
			    
			    @Override
			    public String toString() {
			         return "You chose this" + name;
			    }
			}
		 

