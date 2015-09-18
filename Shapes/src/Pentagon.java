
public class Pentagon implements Shape {

	private double sideLength;
	@Override
	public double getWidth() {
		return ((sideLength)/(2*Math.tan(36)));
	}

	@Override
	public double getHeight() {
		return (((1+Math.sqrt(5))/2)*sideLength);
	}

	@Override
	public double getArea() {
		return ((1/2)*Math.sqrt(5*(5+2*Math.sqrt(5)))*(sideLength));
	}

	@Override
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double getPerimeter() {
		return sideLength*5;
	}

	@Override
	public double getInteriorAngle() {
		return 108;
	}

	@Override
	public int getNumSides() {
		return 5;
	}

	@Override
	public double getSideLength() {
		return sideLength;
	}

}
