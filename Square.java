import java.awt.*;
public class Square extends GraphicObject{
	private double sideLength;
	
	public Square(double newX, double newY, int red, int green, int blue, double newSideLength){
		super(newX, newY, red, green, blue);
		sideLength = newSideLength;
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
	
	public double getSideLength(){
		return sideLength;
	}
}
