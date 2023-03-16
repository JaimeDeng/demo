package homework.InterfaceHomework;

public  class Dog implements Action{
	
	//將Dog implements Action的run() override
	@Override
	public void run() {
		System.out.println("狗狗在跑");
	}
}
