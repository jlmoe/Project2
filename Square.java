public class Square extends GraphicObject{
	private double sideLength;

	public Square(double newX, double newY, int red, int green, int blue, double newSideLength){
		super(newX, newY, red, green, blue);
		sideLength = newSideLength;
	}

	@Override
	public void draw() {
		StdDraw.setPenColor(color);		
		StdDraw.square(x, y, sideLength);
	}

	@Override
	public double calculateArea() {
		double area = Math.pow((2*sideLength),2);
		return area;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = sideLength*4;
		return perimeter;
	}

	public double getSideLength(){
		return sideLength;
	}
	
	public String toString(){
		String result = super.toString() + " " + sideLength + " ";
		return result;
	}
}
