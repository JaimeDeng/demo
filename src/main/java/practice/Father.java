package practice;

public class Father {
	
	private String name;
	
	public Father(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void walk() {
		System.out.println(name + " is walking!");
	}

}
