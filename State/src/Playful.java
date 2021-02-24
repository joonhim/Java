
public class Playful implements CatState{
	public void sleep(Cat c)
	{
		System.out.println("The cat wants sleep.");
	}
	
	public void eat(Cat c)
	{
		System.out.println("The cat is tired ");
		c.setState(new Asleep());
	}
	
	public void play(Cat c)
	{
		System.out.println("The cat hungry.");
		c.setState(new Hungry());
	}
	
	public void ignore(Cat c)
	{
		System.out.println("The cat wants to play.");
	}

}
