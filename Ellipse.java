import java.lang.Math;

public class Ellipse extends Shape
{
	protected double radius1, radius2;
	
	
	public Ellipse(double x, double y, double r1, double r2) 
	{
		this.x = x;
		this.y = y;
		this.radius1 = r1;
		this.radius2 = r2;
	}
	
	
	public double getArea() 
	{
		double area = radius1 * radius2 * Math.PI;
		return area;
	}

	public double getPerimeter() 
	{
		double perimeter = 2 * Math.PI * Math.sqrt(((radius1 * radius1)+(radius2 * radius2))/2);
		return perimeter;
	}

	public void drawShape() 
	{
		System.out.println("Position of ellipse: " + x + ", " + y);
		System.out.println("Radius of ellipse: [" + radius1 + " x " + radius2 + "]");
		System.out.println("Color of ellipse: " + this.getColor());
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
