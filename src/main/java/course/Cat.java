package course;

public class Cat extends Animal {
	
	Cat(String name){
		super(name);	//當superclass的屬性是private時無法直接使用this.屬性 , 必須使用super(屬性)來存取
		//此處等於導向super的name建構子 , 因此Superclass必須有一個name的建構子
	}
	
		public void jump() {
			System.out.println(super.getName() +" is jumping");		
			//當superclass的屬性是private時要用super.getName()來取用
		}
		@Override
		public void move() {
			System.out.println("cat " + super.getName() + " is moving");
		}
		@Override
		public void eat() {
			System.out.println(super.getName() + " is eating fish");
			super.eat();		//若要做Superclass的method就用super
		}

		
}
