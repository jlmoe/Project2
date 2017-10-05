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
		StdDraw.setPenColor(color);
		StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
	}

	@Override
	public double calculateArea() {
		double area = semiMajorAxis*semiMinorAxis*Math.PI;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		//the area is calculated by an infinite series as described here:https://www.mathsisfun.com/geometry/ellipse-perimeter.html
		double perimeter = 0;
		double h = Math.pow((semiMajorAxis - semiMinorAxis), 2) / Math.pow((semiMajorAxis + semiMinorAxis), 2);
		for(int i = 0; i < 10; i++){	//bring the series out to 10 terms
			perimeter += Math.PI * (semiMajorAxis + semiMinorAxis) * ((double)1 / (double)Math.pow(4, i)) * (double)Math.pow(h, i);
		}
		
		return perimeter;
	}
	
	public double getSemiMajor(){
		return semiMajorAxis;
	}
	
	public double getSemiMinor(){
		return semiMinorAxis;
	}
	
	public String toString(){
		String result = super.toString() + " " + semiMajorAxis + " " + semiMinorAxis + " ";
		return result;
	}
	
}
