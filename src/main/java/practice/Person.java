package practice;

public class Person {
	
	static String id ;
	String name;
	int age;
	String address;
	

	public Person(String setId , String setName , int age){
		this.name = setName;
		this.id = setId;
		this.age = age;
	}

	public Person(String setId , String setName , int age , String address){
		this.name = setName;
		this.id = setId;
		this.age = age;
		this.address = address;
	}

	public static String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

}
