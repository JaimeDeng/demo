package course;
import java.util.Random;
import java.util.Scanner;


public class DemoTestApplication_0223 {
	public static void main(String[] args) {
		
		//if else練習
		Scanner hourScan = new Scanner(System.in);
		int hourSalary = 150;
		int workHourWeek;
		System.out.println("請輸入本週總工時:");
		workHourWeek = hourScan.nextInt();
		if( workHourWeek < 40 ) {
			hourSalary *= 0.8;			
			System.out.println("您的時薪是:" + hourSalary);
			System.out.println("本週薪水為:" + hourSalary * workHourWeek);
    	}else if ( workHourWeek == 40 ) {
			System.out.println("您的時薪是:" + hourSalary);
			System.out.println("本週薪水為:" + hourSalary * workHourWeek);
		}else if ( workHourWeek > 40 && workHourWeek <= 50) {
			hourSalary *= 1.2;
			System.out.println("您的時薪是:" + hourSalary);
			System.out.println("本週薪水為:" + hourSalary * workHourWeek);
		}else {
			hourSalary *= 1.6;
			System.out.println("您的時薪是:" + hourSalary);
			System.out.println("本週薪水為:" + hourSalary * workHourWeek);
		}
		System.out.println();
		
		//if反向判斷
		int a = 20;
		if(!(a < 15)) {
			System.out.println("讚");
		}

	}
}