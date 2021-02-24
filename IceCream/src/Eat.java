
public class Eat {
	public static void main(String[] args) {
		IceCreamShop dairyQueen = new DairyQueen();
		
		//Chocolate
		IceCream cone;
		cone = dairyQueen.orderCone("Chocolate");
		System.out.println("Enjoying"+" " + cone.getDescription() + "costs" + cone.cost());
		
		//Strawberry
		IceCream cone2;
		cone = dairyQueen.orderCone("Strawberry");
		System.out.println("Enjoying"+" " + cone.getDescription() + "costs" + cone.cost());
		
		//Strawberry
		IceCream cone3;
		cone = dairyQueen.orderCone("Vanilla");
		System.out.println("Enjoying"+" " + cone.getDescription() + "costs" + cone.cost());
		
	}

}
