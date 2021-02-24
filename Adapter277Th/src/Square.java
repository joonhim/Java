
public class Square implements Shape {
	private int length;
	
	public Square(int l) {
		length = l;
	}
	
	public int getLen() {
	return length;	
	}
	
	@Override
	public void draw() {
		for(int i = 0; i < length; i ++) {
			for(int j=0; j < length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	}
