package course;
import java.util.Random;
import java.util.Scanner;


public class DemoTestApplication_0223_3 {
	public static void main(String[] args) {
		
		//switch練習2
		Scanner hourScan = new Scanner(System.in);
		int hourSalary = 150;
		int workHourWeek;
		System.out.println("請輸入本週總工時:");
		workHourWeek = hourScan.nextInt();
        switch(workHourWeek/10) { //以 workHourWeek 除以10的值為條件
		case 0: //1~9
		case 1: //10~19
		case 2: //20~29
		case 3: //30~39
			hourSalary *= 0.8;	//都小於40 執行程序然後break結束
			System.out.println("您的時薪是:" + hourSalary);
			System.out.println("本週薪水為:" + hourSalary * workHourWeek);
			break;
		case 4: //40~49
		case 5: //50~59
			if(workHourWeek == 40) {   //都大於等於40 , 若是40執行程序然後break結束
				System.out.println("您的時薪是:" + hourSalary);
				System.out.println("本週薪水為:" + hourSalary * workHourWeek);
				break;
			}
			else if(workHourWeek > 40 && workHourWeek <=50) {   //若大於40且小於等於50執行程序然後break結束
				hourSalary *= 1.2;			
				System.out.println("您的時薪是:" + hourSalary);
				System.out.println("本週薪水為:" + hourSalary * workHourWeek);
				break;
			}
		default:   //都非以上的值就當作大於50 , 執行該程序
			hourSalary *= 1.6;			
			System.out.println("您的時薪是:" + hourSalary);
			System.out.println("本週薪水為:" + hourSalary * workHourWeek);
		}
		
	}
}