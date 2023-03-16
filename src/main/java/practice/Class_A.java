package practice;

public class Class_A {

	//Aggregation 聚合方式取用其他class的屬性值
	private String address = "A市";
	
	private Class_C objC;		//單純宣告Class_C物件為Class_A的屬性之一 , 但沒有賦值 , 其值為null
	//以此方法的話 , 必須在執行程式建立一個有參照Class_C()的物件 , 並放入Class_A物件的建構子中才會有值
	
	//constructor
	public Class_A() {		//空白建構子會取用包含Class_C , 但此Class_C的objA值為null
	}
	
	public Class_A(Class_C objC) {		//建構子中加入Class_C
		this.objC = objC;	//若class_c有預設值即會自己帶入
	}
	
	//getter
	public String getAddress() {
		return address;
	}
	
	public Class_C getObjC() {
		return objC;
	}

	public void info() {
		System.out.println("address:" + address);		//取用自己的class屬性
		System.out.println("age:" + getObjC().getAge());
		System.out.println("name:" + getObjC().getName());
		System.out.println("score:" + getObjC().getScore());
		//這裡的Class_C物件objC沒有參照實體 , 所以沒有賦值 , 需透過get Class_C的參照才能再get Class_C的屬性值
	}
}