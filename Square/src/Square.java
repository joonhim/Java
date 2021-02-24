
public class Square extends Rectangle{
	private Rectangle r;
	
	
	public Square(int length) {
		r = new Rectangle(length, length);
	}
	
	public void setLength(int length) {
		r.setSides(length, length);
	}
	
	public int getLength() {
		return r.getWidth();
	}
	
	public int area() {
		return r.area();
	}
	
	public int perimeter() {
		return r.perimeter();
	}
}
