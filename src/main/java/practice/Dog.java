package practice;

public class Dog extends Animal {
	
	String name = "lol";
	
	public String getName() {
		return name;
	}

	Dog(){
	}
	
	Dog(String name){
		super(name);	//當superclass的屬性是private時無法直接使用this.屬性 , 必須使用super(屬性)來存取
	}
	
		public void barking() {
			System.out.println(super.getName() +" : WOF! WOF!");		
			//當superclass的屬性是private時要用super.getName()來取用
		}
		public void eat() {
			System.out.println(this.getName() + " AMUAMUAMU");
		}
		@Override
		public void sleep() {
			System.out.println(super.getName() + " :zzzZZZ");
		}

}
