import java.awt.*;
public class Circle extends GraphicObject{
	private double radius;

	
	public Circle(double newX, double newY, int red, int green, int blue, double newRadius){
		super(newX, newY, red, green, blue);
		radius = newRadius;
	}

	@Override
	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.circle(x,y,radius);
	}


	@Override
	public double calculateArea() {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}


	@Override
	public double calculatePerimeter() {
		double perimeter = 2*Math.PI*radius;
		
		return perimeter;
	}
	
	public double getRadius(){
		return radius;
	}
}
