
public class Hungry implements CatState{
	
	public void sleep(Cat c)
	{
		System.out.println("Cat hungry,");
	}
	
	public void eat(Cat c)
	{
		System.out.println("Cat ate.");
	}
	public void play(Cat c)
	{
		System.out.println("Cat too hungry.");
	}
	
	public void ignore(Cat c)
	{
		System.out.println("Cat saids no you.");
	}

}
