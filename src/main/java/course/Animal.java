package course;

public class Animal {
	
	String name = "Animal";
	
	public String getName() {
		return name;
	}
	public Animal() {
		
	}
	public Animal(String name) {
		this.name = name;
	}
	public void roar() {
		System.out.println("ROAR!");
	}
	public void move() {
		System.out.println("This animal is moving");
	}
	public void animalMove(Animal animal) {
		animal.move();
	}
	public void eat() {
		System.out.println(this.name + " is eating");
	}
	public void sleep() {
		System.out.println(this.name + " is sleeping");
	}
}
