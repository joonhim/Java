
public class Pepperoni extends PizzaDecorator {
	public Pepperoni(pizza p) {
		super(p);
	}
	public double cost() {
		return 1 + super.cost();
	}
	public void display() {
		System.out.println("Pepperoni... $1.00");
	}
}
