package homework.InterfaceHomework;

//Human為抽象類別 implements Action的方法
public class Human implements Action{
	
	@Override
	public void run() {
		System.out.println("人類在跑");
	}
	
}
