package practice;

public class Son extends Father {
	
	public Son(String name) {		//Superclass有建構子時,Subclass也要有
		super(name);
	}

	public void playball() {
		System.out.println(super.getName() + " is playing ball!");
	}

}
