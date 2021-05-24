import java.awt.Color;

public class testShape 
{
	public static void main(String[] args) 
	{
		Ellipse e = new Ellipse(120, 240, 3, 7);
		Rectangle r = new Rectangle(60, 10, 12, 24);
		Circle c = new Circle(30, 90, 2);
		Square s = new Square(325, 460, 14);
		Trapezoid t = new Trapezoid(60, 40, 40, 30, 14, 16);
		
		e.setColor(Color.cyan);
		System.out.println("Color: " + e.getColor());
		System.out.println(e.getArea());
		System.out.println(e.getPerimeter());
		e.drawShape();
		
		System.out.println("\nFill status: " + r.getFill());
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		r.drawShape();
		
		c.setFill(false);
		System.out.println("\n" + c.getArea());
		System.out.println(c.getPerimeter());
		c.drawShape();
		
		System.out.println("\nx and y: " + s.getX() + ", " + s.getY());
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		s.drawShape();
		
		t.setX(115);
		t.setY(93);
		System.out.println("\n" + t.getArea());
		System.out.println(t.getPerimeter());
		t.drawShape();
	}
}
