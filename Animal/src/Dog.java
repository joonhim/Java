
public class Dog extends Animal implements Trainable, Comparable<Dog>
{
	private String color;
	private int age;
	
	public Dog(String n, String c, int a) 
	{
		super(n);
		color = c;
		age = a;
	}
	public int getAge()
	{
		return age;
	}
	public String getColor() 
	{
		return color;
	}
	@Override
	public void speak() 
	{
		System.out.println("Speak");
		System.out.println(getName()+ "Woof.");
	}
	@Override
	public void sit()
	{
		System.out.println("Sits");
		System.out.println(getName()+ "sits.");
	}
	@Override
	public void fetch() 
	{
		System.out.println("You throw stick");
		System.out.println(getName() + "runs to fetch.");
	}
	@Override
	public void laydown() 
	{
		System.out.println("Laydown!");
		System.out.println(getName() + "lays.");
	}
	@Override
	public void doBehavior(int t) 
	{	
		if( t == 1) 
		{
			speak();
		}
		else if (t == 2) 
		{
			sit();
		}
		else if (t == 3) 
		{
			fetch();
		}
		else if (t == 4) 
		{
			laydown();
		}
	}
	@Override
	public int compareTo( Dog d)
	{
		if(age < d.age) {
			return -1;
		}else if (age == d.age) {
			return 0;
		}return 1;
	}
}
