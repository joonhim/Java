
public class Dog extends Animal{
	private String Color;
	
	public Dog(String n,String c) {
		super(n);
		Color = c;
	}
	
	public String getColor() {
		return Color;
	}
	@Override
	public String makeNoise(){
		return "Warf!";
	}
	@Override
	public boolean equals(Object o){
		if (o instanceof Dog) {
			Dog d = (Dog)o;
			return this.getName().contentEquals(d.getName()) && this.Color.equals(d.Color);
		}
		return false;
	}

public String toString() {
	return "Name: " +getName() + " Color: "+ Color;
}
}
