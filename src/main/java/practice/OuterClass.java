package practice;

public class OuterClass {
	public class InnerClass{
		//InnerClass內的屬性跟方法都是private , 無法被外部直接取用
		private int ID = 7414;
		
		private void info() {
			System.out.println("ID: " + this.ID);
		}
	}
	
	public void displayInfo() {
		InnerClass inner = new InnerClass();
		inner.info();	//自己的Class內可以取用private屬性.方法
	}
	
	//方法內部Class
	public void college() {
		int student = 400;		//因為student在方法區塊內 , 無法直接被外部取用
		class EE{
			public int getNum() {
				return student;
			}
		}
		EE inner = new EE();
		System.out.println("學生人數" + inner.getNum());
	}

}
