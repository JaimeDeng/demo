package practice;

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
	public void eat() {
		System.out.println(this.name + " is eating");
	}
	public void sleep() {
		System.out.println(this.name + " is sleeping");
	}
}
