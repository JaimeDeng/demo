package practice;

public class Daughter extends Father {
	
	public Daughter(String name) {		//Superclass有建構子時,Subclass也要有
		super(name);
	}

	public void shopping() {		
		System.out.println(super.getName() + " is shopping!");
	}
	
}
