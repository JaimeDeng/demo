package homework.InterfaceHomework;

//一般類別Person 繼承 抽象類別Human
public class Person extends Human{
	
	//將Human implements Action的method run() override
	@Override
	public void run() {
		System.out.println("有人在跑");
	}
	
}
