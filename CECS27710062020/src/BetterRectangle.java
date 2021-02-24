import java.awt.Rectangle;
public class BetterRectangle extends Rectangle{

	public BetterRectangle(int x, int y, int width, int height){
		super(x, y, width, height);
	}
	public int getPerimeter()
	{
		return (2* width) * (2*height);
	}
	
	public int getArea()
	{
		return width * height;
	}
	
	public static void main(String[] args)
	{
		BetterRectangle t = new BetterRectangle(1,2,3,4);
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());
	}

}