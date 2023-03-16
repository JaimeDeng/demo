package homework;
import java.util.Scanner;


public class RandomBomb {
	public static void main(String[] args) {
		
		//數字炸彈
		Scanner scan = new Scanner(System.in);
		int input;
		int max = 99 , min = 1; //初始範圍設為1~99
		
		//炸彈數產生區
		int bomb = (int)(Math.random()*99)+1;
		System.out.printf("炸彈是:%d%n" , bomb);
		//炸彈數產生區
		
		//判斷區
		int round = 1;
		while(round  < 6) {
			System.out.printf("請從%d~%d之中猜一個數字(五次機會):%n" , min , max); //告知範圍
			System.out.printf("第%d回合%n" , round);
			input = scan.nextInt();
			//防呆區
			if( input <= min || input >= max ) { //檢查輸入是否超出範圍
				System.out.println("超過範圍了!請重新輸入!");
				continue;
			}
			//防呆區
			
			if( input == bomb ) { //猜中就中斷迴圈
				System.out.println("炸彈爆炸啦!");
				break;
			}else if( input < bomb ) { //小於炸彈數字 , 複寫min繼續迴圈
				System.out.println("沒中");
				min = input;
			}else if( input > bomb ) { //大於炸彈數字 , 複寫max繼續迴圈
				System.out.println("沒中");
				max = input;
			}
			round++;
			//判斷區		
	    }
		if(round == 6) {
		System.out.println("遊戲結束");
		}
	}
}