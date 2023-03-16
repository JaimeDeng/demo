package practice;

public class Class_D {
	
	//Aggregation 聚合方式取用其他class的屬性值
	private String num = "7414";
	
	private Class_C objC = new Class_C();		//帶入Class_C (含空白建構子,賦預設值)
	
	//constructor
	public Class_D() {
	}
	
	//getter
	public String getNum() {
		return num;
	}

	public Class_C getObjC() {
		return objC;
	}
	
	public void info() {
		System.out.println("num:" + num);		//取用自己的class屬性
		System.out.println("age:" + objC.getAge());
		System.out.println("name:" + objC.getName());		//取用Class_C的屬性
		System.out.println("score:" + objC.getScore());
	}
}