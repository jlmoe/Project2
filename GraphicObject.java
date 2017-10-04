import java.awt.*;
abstract public class GraphicObject {
	double x;
	double y;
	Color color;
	
	
	//constructor
	public GraphicObject(double newX, double newY, int red, int green, int blue){
		x = newX;
		y = newY;
		color = new Color(red, green, blue);
	}
	
	
	//getters
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public Color getColor(){		// TODO Auto-generated method stub
		return color;
	}
	
	public String toString(){	//make this work
		String result = new String();
		result += x + " " + y + " " + color.getRed() + " " + color.getGreen() + " " + color.getBlue() + " ";	
		return result;
	}
	
	
	//abstract methods
	abstract public void draw();
	abstract public double calculateArea();
	abstract public double calculatePerimeter();
}
