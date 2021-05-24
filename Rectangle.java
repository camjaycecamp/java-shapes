
public class Rectangle extends Shape
{
	protected double width, height;
	
	
	public Rectangle(double x, double y, double width, double height) 
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	
	public double getArea() 
	{
		double area = width * height;
		return area;
	}

	public double getPerimeter() 
	{
		double perimeter = 2 * (width + height);
		return perimeter;
	}

	public void drawShape() 
	{
		System.out.println("Position of rectangle: " + x + ", " + y);
		System.out.println("Dimensions of rectangle [W x H]: [" + width + " x " + height + "]");
		System.out.println("Color of rectangle: " + this.getColor());
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
