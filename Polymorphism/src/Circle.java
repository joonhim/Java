
public class Circle extends GeometricObject
{
	private double radius;
	
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	
	public double getDiameter()
	{
		return 2*radius;
	}
	
	public Circle()
	{
		super();
		radius =1;
	}
	
	
	public Circle(int r)
	{
		super();
		radius = r;
	}
}
