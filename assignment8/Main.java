package assignment8;

class Animal {
	String eat;
	void eat() {
		System.out.println("Animal is eating");
	}
	

}
class WildAnimal{
	String hunt;
	void hunt() {
	System.out.println("Animal Is Hunting");	
	}
}
public class Main {
	public static void main(String[]args) {
		Animal a = new Animal();
	a.eat();
	WildAnimal w = new WildAnimal();
	w.hunt();
		
	}
}
	
	

