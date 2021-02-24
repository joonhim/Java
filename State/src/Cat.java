
public class Cat {
	private CatState state;
	
	public void setState(CatState s)
	{
		state = s;
	}
	
	public void sleep()
	{
		state.sleep(this);
	}
	
	public void eat()
	{
		state.eat(this);
	}
	
	public void play()
	{
		state.play(this);
	}
	
	public void ignore()
	{
		state.ignore(this);
	}
	
	public Cat()
	{
		state = new Asleep();
	}

}
