public class Animal{
	public String name;
	
	public Animal(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
@Override
public String toString() {
	return name;
}

public abstract String makeNoise();

}
