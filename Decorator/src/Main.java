
public class Main {
	public static void main(String[] args) {
		pizza p = new pizzaLarge();
		
		p = new Pepperoni(p);
		p = new Mushroom(p);
		
		System.out.println("Total = $ "+ p.cost());
	}

}
