package course;

public class Dog {
	String name;		//名字 初始值為null
	String color;		//顏色 初始值為null
	int age;		//年齡 初始值為0
	boolean chip;		//有無晶片 初始值為false
	
//	Integer ageA;		//若用Integer宣告整數 初始值會是null
//Boolean A;		//若用大寫開頭的布林值 初始時會是null
			//只要是大寫的變數型態實際上都是物件 預設值就是null
	
	void sleeping() {		//動作:睡覺
		System.out.println("zzZZ");
	}
	void barking() {		//動作:叫
		System.out.println("Wof ! Wof !");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}