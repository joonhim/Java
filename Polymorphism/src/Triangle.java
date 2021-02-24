
public class Triangle extends GeometricObject
{
	double a;
	double b;
	double c;


public Triangle()
{
	 a = 0;
	 b = 0;
	 c = 0;
	
}

public Triangle( double s1, double s2, double s3)
{
	 a = s1;
	 b = s2;
	 c = s3;
	
}
public double getA()
{
	return a;
}

public void setA(double a)
{
	this.a = a;
	
}
public double getB()
{
	return b;
}

public void setB(double b)
{
	this.b = b;
}
public double getC()
{
	return c;
}

public void setC(double c)
{
	this.c = c;
}

public double getArea(){

return sqrt(s(s-a)(s-b)(s-c));
}

public double getPerimeter() {
	return s = a + b + c;
}

}