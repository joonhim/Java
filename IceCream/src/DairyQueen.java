public class DairyQueen extends IceCreamShop {

	@Override
	public IceCream getIceCream(String type) {
		IceCream cone = null;
		
		if(type.equals("Chocolate")) {
			cone = new Chocolate();
		}else if(type.equals("Strawberry")) {
			cone = new Strawberry();
		}else if(type.equals("Vanilla")) {
			cone = new Vanilla();
		}
		// TODO Auto-generated method stub
		return cone;
	}
}
