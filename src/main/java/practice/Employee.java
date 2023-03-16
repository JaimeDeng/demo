package practice;

public class Employee {
	
	private int id;
	private int age;
	private char gender;
	private int salary;
	
	Hometown hometown = new Hometown();

	public Employee(int id, int age, char gender, int salary, Hometown hometown) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hometown = hometown;
	}
	
	public void info() {
		System.out.println("id: " + id);
		System.out.println("age: " + age);
		System.out.println("gender: " + gender);
		System.out.println("salary: " + salary);
		System.out.println("Country: " + hometown.getCountry());
		System.out.println("State: " + hometown.getState());
		System.out.println("City: " + hometown.getCity());
		System.out.println("Street: " + hometown.getStreet());
		System.out.println("Num: " + hometown.getNum());
	}
	
	
	

}
