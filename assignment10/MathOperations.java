package assignment10;

public class MathOperations {
	
 void calculate(int a,int b) {
	System.out.println("Addition:"+(a+b));

}
 void calculate(int a,float b,double c) {
	System.out.println("Subtraction:"+(a-b-c));

}
  void calculate(double a,int b) {
System.out.println("Multiplication:"+(a*b));

}
  void calculate(float a,int b) {
	  
	System.out.println("Division:"+(a/b));

}public static void main(String[] args) {
	MathOperations m=new MathOperations();
	m.calculate(4,0.5f, 2.5);
	m.calculate(5.5, 5);
	m.calculate(20, 30);
	
}
}
