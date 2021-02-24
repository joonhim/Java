
public class Main {
	public static void main(String[] args) {
		Square s = new Square(3);
		
		Triangle t = new Triangle(5, 5);
		
		drawShape(s);
		drawShape(t);
	}
	public static void drawShape (Shape s) {
		s.draw();
	}

}
