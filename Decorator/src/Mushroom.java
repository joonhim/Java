
public class Mushroom extends PizzaDecorator {
	public Mushroom(pizza p) {
		super(p);
	}
	public double cost() {
		return .5 + super.cost();
	}
	public void display() {
		System.out.println("Mushroom... $.50");
	}

}
