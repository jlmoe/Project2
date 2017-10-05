public class Rectangle extends GraphicObject{
	private double length;	//half length
	private double width;	//half width
	
	public Rectangle(double newX, double newY, int red, int green, int blue, double newLength, double newWidth){
		super(newX, newY, red, green, blue);
		length = newLength;
		width = newWidth;
	}

	@Override
	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.rectangle(x, y, width, length);
	}

	@Override
	public double calculateArea() {
		double area = length * width * 4;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = 2 * (length * 2 + width * 2);
		return perimeter;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getWidth(){
		return width;
	}
	
	public String toString(){
		String result = super.toString() + " " + length + " " + width + " ";
		return result;
	}
}
