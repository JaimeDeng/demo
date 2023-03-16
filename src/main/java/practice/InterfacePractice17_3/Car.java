package practice.InterfacePractice17_3;

public class Car implements Vehicle {
	
	private String brand;
	
	//建構子獲取brand值
	Car(String brand){
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		return brand;	//回傳brand給String輸出
	}

	@Override
	public String run() {
		return "安全駕駛中...";
	}

}
