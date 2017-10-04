import java.awt.*;
public class Ellipse extends GraphicObject{
	private double semiMajorAxis;
	private double semiMinorAxis;
	
	public Ellipse(double newX, double newY, int red, int green, int blue, double newSemiMajor, double newSemiMinor){
		super(newX, newY, red, green, blue);
		semiMajorAxis = newSemiMajor;
		semiMinorAxis = newSemiMinor;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double getSemiMajor(){
		return semiMajorAxis;
	}
	
	public double getSemiMinor(){
		return semiMinorAxis;
	}
}
