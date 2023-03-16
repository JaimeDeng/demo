package course;
import java.util.Random;
import java.util.Scanner;


public class DemoTestApplication_0223_2 {
	public static void main(String[] args) {
				
		//switch練習1
		Scanner hourScan = new Scanner(System.in);
		int days;
		System.out.println("今天是星期天,請輸入過幾天後顯示是星期幾:");
		days = hourScan.nextInt();
    	switch(days%7) {
		case 1:
			System.out.println("星期一唷");
			break;
		case 2:
         	System.out.println("星期二唷");
			break;
		case 3:
			System.out.println("星期三唷");
			break;
		case 4:
			System.out.println("星期四唷");
			break;
		case 5:
			System.out.println("星期五唷");
			break;
		case 6:
			System.out.println("星期一唷");
			break;
		default:
			System.out.println("母湯亂輸入= =");
		}
		
	}
}