import java.util.*;

abstract class area {
	
	abstract void shape();
}

class triangle extends area {

	Scanner s = new Scanner(System.in);

	void shape(){

		System.out.println("\nenter base and height of triangle: ");
		double base, height;

		base = s.nextDouble();
		height = s.nextDouble();

		double area = (0.5)*base*height;

		System.out.println("area of triangle = " + area);
	}
}

class square extends area {
	Scanner s = new Scanner(System.in);
	void shape(){
		System.out.println("\nenter side of square: ");

		double side;

		side = s.nextDouble();
		double area = side*side;

		System.out.println("area of square = " + area);
	}
}

class circle extends area {
	Scanner s = new Scanner(System.in);
	void shape(){
		System.out.println("\nenter radius of circle: ");

		double radius;

		radius = s.nextDouble();
		double area = (3.14)*radius*radius;

		System.out.println("area of circle = " + area);
	}
}

class prac6{
	public static void main(String[] args) {

		System.out.println("IU2141230208 VEDANT PATEL");
		System.out.println("--------------------------");
		area t = new triangle();
		t.shape();

		area s = new square();
		s.shape();

		area c = new circle();
		c.shape();
	}
}
