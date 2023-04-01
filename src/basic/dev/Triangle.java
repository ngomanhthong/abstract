package basic.dev;

public class Triangle extends Shape {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return a + b + c;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return (a + b + c) / 2;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
