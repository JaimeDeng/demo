package practice.InterfacePractice17_3;

public interface Vehicle {
	
	String getBrand();
	String run();
	
	//static method
	static int rpmUp(int rpm) {
		return rpm+50;
	}
	
	//default method
	default String alarmOn() {
		return "開啟警示燈";
	}
	
	default String alarmOff() {
		return "關閉警示燈";
	}
	
	default String starting() {
		return "車輛啟動系統檢查中...";
	}
	
	default String ending() {
		return "車輛停駐完成,車輛保全啟動中...";
	}

}
