package course.Thread_Syncronization_0315;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class  SellTicket implements Runnable{
	private String name;
	private int tickets = 100;
	
	public SellTicket() {

	}
	//如果方法設置同步 , 搶到資源的執行緒會一次把for做完才釋出
	public void sell() {
		for(int i = 0 ; i < 100 ; i ++) {
			//因此同步區塊設置在for迴圈內 , 每次開始迴圈都是兩個執行緒搶資源執行
			synchronized (this) {
				if(tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						System.out.println(e);
					}
					System.out.println(Thread.currentThread().getName() + "票剩下" + tickets-- + "張");
				}
			}
		}
		if(tickets == 0) {
			System.out.println("票賣光了");
		}
	}
	@Override
	public void run() {
			sell();
	}
}
