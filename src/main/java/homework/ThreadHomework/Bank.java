package homework.ThreadHomework;
import java.util.Scanner;

public class Bank {
	Scanner scan = new Scanner(System.in);
	int amount;
	int balance = 10000; 
	boolean bye = false;
	
	public synchronized void withdraw(int amount) {		//使用synchronized同步線程防止兩個thread互相干擾
		this.amount = amount;		//將取款金額記錄給外部block使用
		System.out.println("歡迎使用取款功能");
		while(balance < amount) {
			System.out.println("餘額不足,無法取款,等待存款");
			try {
				wait();		//讓該執行緒暫時停止(並將鎖釋出)
				if(bye) {		//如果bye是1(結束手續) , 就直接跳出迴圈
					break;
				}
			}catch(Exception e){
				System.out.println(e);
			}
		}
		if(balance >= amount) {
			balance -= amount;
			System.out.println("取款完成");
			System.out.println("取款後餘額:" + balance);
		}
	}
	public synchronized void deposit(int deposit) {
		System.out.println("歡迎使用存款功能");
		balance += deposit;
		System.out.println("存款完成");
		System.out.println("存款後餘額:" + balance);
		if(balance < amount) {		//如果餘額還是低於取款金額就不喚醒wait線程
			System.out.println("餘額不足取款,是否繼續存款? 是請輸入1 , 否請輸入0");
			int check = scan.nextInt();
			
			if(check == 1) {
				System.out.println("請輸入存款金額");
				deposit(scan.nextInt());		//再次執行存款功能
			}else if(check == 0) {
				bye = true;		//如果選擇0 , 讓bye為1 , notify後跳脫迴圈
				System.out.println("結束手續");
				notify();
			}else {
				System.out.println("輸入錯誤!");
				throw new NumberFormatException("請勿輸入0或1以外的字元");
			}
			
		} else {
			notify();		//喚醒停止的執行緒
		}
	}

}
