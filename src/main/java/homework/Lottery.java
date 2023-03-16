package homework;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lottery {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] lottery = new int[50];
		
		System.out.println("請輸入大樂透購買組數:");
		int num = scan.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {	//列表順序索引
			System.out.printf("%d : " , i);
			
			for(int n = 1 ; n <= 49 ; n++) {	//建立一個陣列,值為1~49,作為防重複手段
				lottery[n] = n;
			}
			
			int counter = 1;
			while(counter <= 6) {	//產生六個數字
				int lotteryNum = ran.nextInt(49) + 1;		//49為上限 1為下限
				if (lottery[lotteryNum] == 0) {		//如果產生的數字作為防重複陣列索引,值為0,就重做 (原因見else區塊)
					continue;
				} else {
					System.out.printf("%d " , lotteryNum);
					lottery[lotteryNum] = 0;		//將產生的數字相等的防重複陣列索引其值改為0
					counter++;
				}
			}
			while(true) {		//6碼產生完畢後 產生特別號
				int spLotteryNum = ran.nextInt(8) + 1;		//8為上限 1為下限
				if (lottery[spLotteryNum] == 0) {
					continue;
				} else {
					System.out.printf("特別號 : %d" , spLotteryNum);
					lottery[spLotteryNum] = 0;
					break;
				}
			}
			System.out.printf("\n");		//換行
		}
	}
}