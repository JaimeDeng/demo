package homework.InterfaceHomework;

public class Car implements Action{
	
	//將Car implements Action的run() override
	@Override
	public void run() {
		System.out.println("轟隆龍隆隆隆隆衝衝衝衝拉風");
	}
}
