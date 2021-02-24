
public class ShapeFactory extends Factory{
	@Override 
	public Shape createShape(String type) {
		if(type.equals("Circle")) {
			return new Circle();
		}else if(type.contentEquals("Square")) {
			return new Square();
			
		}
		return null;
	}

}
