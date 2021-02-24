
public abstract class PizzaDecorator implements pizza {
	private pizza p;
	public PizzaDecorator( pizza p) {
		this.p = p;
	}
	
	@Override
	public double cost() {
		return p.cost();
	}

}
