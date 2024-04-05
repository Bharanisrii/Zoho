package assignment9;



public abstract class Shape {
	final double pi=3.14;
	double r,a,b,l;
	abstract double calculateArea();
	}
class Circle extends Shape{

	public Circle(int r) {
		this.r=r;
		}

	@Override
	double calculateArea() {
		return pi*r*r;
		
	}
}
class Rectangle extends Shape{
	public Rectangle(int l, int b) {
		
this.l=l;
this.b=b;
	}
	@Override
	double calculateArea() {
		return l*b;
		
	}
}
	

class Square extends Shape{
	public Square(int a) {
		
this.a=a;
	}
	@Override
	double calculateArea() {
		return a*a;
		
	}
}

public class Main{
	public static void main(String[]args) {
		Shape s = new Circle(5);
 	System.out.println("Circle"+s.calculateArea());
		Shape r = new Rectangle(5,2);
		System.out.println("Rectangle"+r.calculateArea());
		Shape t=new Square(6);
		System.out.println("Square"+t.calculateArea());
}
}