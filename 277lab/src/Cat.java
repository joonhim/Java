
public class Cat extends Animal{
	private String Color;
	
	public Cat(String n,String c) {
		super(n);
		Color = c;
	}
	
	public String getColor() {
		return Color;
	}
	@Override
	public String makeNoise() {
		return "Meow";
	}
@Override
public String toString() {
	return "Name: " +getName() + " Color: "+ Color;
}
}