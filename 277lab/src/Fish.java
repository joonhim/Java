
public class Fish extends Animal{
	private String Color;
	
	public Fish(String n,String c) {
		super(n);
		Color = c;
	}
	
	public String getColor() {
		return Color;
	}
	@Override
	public String makeNoise() {
		return "Bubbles";
	}
@Override
public String toString() {
	return "Name: " +getName() + " Color: "+ Color;
}
}