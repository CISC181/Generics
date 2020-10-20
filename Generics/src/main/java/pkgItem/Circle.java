package pkgItem;

public class Circle {

	private int iRadius;

	public Circle(int iRadius) {
		super();
		this.iRadius = iRadius;
	}

	public int getiRadius() {
		return iRadius;
	}

	public void setiRadius(int iRadius) {
		this.iRadius = iRadius;
	}
	
	public double getArea()
	{
		return Math.PI * this.iRadius * this.iRadius;
	}
}
