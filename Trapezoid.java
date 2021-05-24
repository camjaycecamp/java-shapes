
public class Trapezoid extends Shape
{
	protected double bottom, top, side1, side2;
	
	
	public Trapezoid(double x, double y, double bottom, double top, double side1, double side2) 
	{
		this.x = x;
		this.y = y;
		this.bottom = bottom;
		this.top = top;
		this.side1 = side1;
		this.side2 = side2;
	}
	
	
	public double getArea() 
	{
		double s = 2*(bottom - top);
		System.out.println((s-side1) + " " + (s-side2) + " " + (s-(bottom-top)));
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-(bottom-top)));
		return area;
	}

	public double getPerimeter() 
	{
		double perimeter = (bottom + top + side1 + side2);
		return perimeter;
	}

	public void drawShape() 
	{
		System.out.println("Position of trapezoid: " + x + ", " + y);
		System.out.println("length of bottom, top, and each side of the trapezoid, respectively: [" + bottom + ", " + top + ", " + side1 + ", " + side2 + "]");
		System.out.println("Color of trapezoid: " + this.getColor());
		if(fill) 
		{
			System.out.println("it's filled in with color");
		}
		else 
		{
			System.out.println("it's NOT filled in with color");
		}
	}
}
