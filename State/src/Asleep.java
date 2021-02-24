
public class Asleep implements CatState{
	public void sleep(Cat c)
	{
		System.out.println("Cat is out cold,");
	}
	
	public void eat(Cat c)
	{
		System.out.println("Cat woke up to munch.");
	}
	public void play(Cat c)
	{
		System.out.println("Cat passed out.");
	}
	
	public void ignore(Cat c)
	{
		System.out.println("Cat snors.");
	}

}
