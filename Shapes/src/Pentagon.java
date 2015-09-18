import static java.lang.Math.*;

public class Pentagon implements Shape {

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		if (getWidth()>0&getHeight()>0) {

	}
		return getWidth()*getHeight(); 
	}

	@Override
	public void setSideLength(double sideLength) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public double getInteriorAngle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumSides() {
		for (int i=0; i < NumSide.length(); i++);
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSideLength() {
		if (getNumSides()>0){
			// TODO Auto-generated method stu
	}
		return getPerimeter()/getNumSides();
	}
	
}
