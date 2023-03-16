package practice;

abstract class MyMathAbstract {
	
	//建構子帶屬性不帶方法
	abstract int add(int n1 , int n2);		//加法
	abstract int mns(int n1 , int n2);	//減法
	abstract int mul(int n1 , int n2);	//乘法
	abstract int div(int n1 , int n2);		//除法
	
	public void output() {
		System.out.println("我的計算器");		//抽象類別內的普通方法
	}

}
