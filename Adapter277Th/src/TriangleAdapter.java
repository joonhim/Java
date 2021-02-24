
public class TriangleAdapter extends Triangle implements Shape {
	private Triangle t;
	
	public TriangleAdapter(int w, int h) {
		t = new Triangle(w, h);
	}
	
	@Override
	public void draw() {
		t.printTriangle();
	}

}
