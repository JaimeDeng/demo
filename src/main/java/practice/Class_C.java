package practice;

public class Class_C {
	
	//Class_C本身即有3個預設值
	private String name = "wow";
	private int age = 30;
	private int score = 87;
	
	//constructor
	public Class_C() {	//空白建構子=使用預設值
	}
	
	public Class_C(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	//getter
	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


}