
public class Enemy {
	private Item item;
	public Enemy( Str n, int mHp, Item i)
	{
		
	    	super();
	    	mHp = 0;
	    	
	    }
	    //Getter
	    public Item getItem() {
	         return item;
	    }
	    //Setter
	    public void setName(String item) {//modifier
	         this.item = item;
	    }
	    
	    @Override
	    public String toString() {
	         return "You got this" + name;
	}
	

}
