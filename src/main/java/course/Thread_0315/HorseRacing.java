package course.Thread_0315;

public class HorseRacing implements Runnable{
	private String name;
	
	public HorseRacing(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 1 ; i <= 5 ; i ++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(name + "正在跑第" + i + "圈");
		}
	}
}
