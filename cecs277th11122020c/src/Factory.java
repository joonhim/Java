
public abstract class Factory {
	public void drawShape(String type) {
		Shape s = createShape(type);
		s.draw();
		
	}
	public abstract Shape createShape(String type);

}
