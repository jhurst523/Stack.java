public class Pentagon implements Shape {

	private double sideLength;
	private static final int NUMSIDES = 5;

	public double getWidth() {
		return ((sideLength)/(2*Math.tan(36)));
	}

	public double getHeight() {
		return (((1+Math.sqrt(5))/2)*sideLength);
	}

	public double getArea() {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		if (getSideLength()>0) {

	}
		return ((1/14d)*(Math.sqrt(5*(5+25)*(Math.pow(getSideLength(), getSideLength()))))); 
=======
		return ((1/2)*Math.sqrt(5*(5+2*Math.sqrt(5)))*(sideLength));
>>>>>>> 7d0e3cd3416d7c18e9514089bb94249cee3616fa
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public double getPerimeter() {
		return sideLength*5;
	}

	public double getInteriorAngle() {
		return 108;
	}

	public int getNumSides() {
		return NUMSIDES;
	}

	public double getSideLength() {
		return sideLength;
	}
}
