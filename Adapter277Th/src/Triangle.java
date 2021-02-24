
public class Triangle {
	private int width, height;
	
	public Triangle(int w, int h) {
		width = w;
		height = h;
	}
	
	public void printTriangle() {
		for(int i=0; i<height; i ++) {
			for(int j =0; j<i+1; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
