
public class Main {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle (2,3);
		
		System.out.println("R1 = " + r1.getWidth() + " "+ r1.getHeight());
		
		System.out.println("Area = "+ r1.area());
		System.out.println("Perimeter = "+ r1.perimeter());

		
		
	Square s1 = new Square(4);
	System.out.println("S1 = " + s1.getLength());
	
	s1.setLength(3);
	System.out.println("S1 = " + s1.getLength());
	
	System.out.println("Area = "+ s1.area());
	System.out.println("Perimeter = "+ s1.perimeter());
		}

}
