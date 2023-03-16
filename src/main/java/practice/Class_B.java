package practice;

public class Class_B {
		
	//Aggregation 聚合方式取用其他class的屬性值
	private String ID = "94877414";
	
	private Class_C objC = new Class_C();		//new新物件 , Class_C的建構子空白但有預設值 , 因此值為預設值
	
	//constructor
//	public Class_B() {
//	}
	
	//getter
	public Class_C getObjC() {		//當呼叫getClass_c的時候回傳objC的Class_C給Class_C
		return objC;
	}

	public String getID() {
		return ID;
	}


	public void info() {
		System.out.println("ID:" + ID);		//取用自己的class屬性
		System.out.println("age:" + objC.getAge());
		System.out.println("name:" + objC.getName());		//objC有參照實體 Class_C() , 所以有賦值 , 可以直接用objC來get參數
		System.out.println("score:" + objC.getScore());
	}
}