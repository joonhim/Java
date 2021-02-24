
public class Rectangle extends GeometricObject
{
		double width;
		double height;
	
	public Rectangle()
	{
		height = 0;
		width = 0;
	}
	
	public Rectangle( double h, double w)
	{
		height = h;
		width = w;
	}
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
		
	}
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getArea(){

	return width * height;
	}
	
	public double getPerimeter() {
		return 2*(width+height);
	}
	
	}

