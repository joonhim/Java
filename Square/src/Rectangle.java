
public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int w, int h) {
		setSides(w,h);
	}
	
	public void setSides(int w, int h) {
		width = w;
		height = h;
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

	public int area() {
		return width * height;
	}
	
	public int perimeter() {
		return 2*(width + height);
	}
}
