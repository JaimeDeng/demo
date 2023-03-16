package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;


public class calculator_0x0end {
	public static void main(String[] args) {
		
		//陣列作業 乘法計算機 輸入0 * 0結束
		Scanner scan = new Scanner(System.in);
		int[] cal; //記錄用陣列
		cal = new int[4]; //4排陣列 , 記錄 A x B ANS
		String container; //輸入用容器
		
		System.out.println("請輸入欲相乘數字,字符用空白間隔:");
		calWhile : while(true) {
			container = scan.nextLine(); //以字串輸入
			String[] input = container.split(" "); //以split功能來對字串分割並放入陣列,這邊以空白作為分割符
			if(input.length < 3) {
				System.out.println("母湯亂輸入");
				continue calWhile;
			}
			cal[0] = Integer.parseInt(input[0]); //第一個數字轉成int丟進記錄陣列
			cal[2] = Integer.parseInt(input[2]); //第二個數字轉成int丟進記錄陣列
			if(cal[0] == 0 && cal[2] == 0) {
				System.out.println("結束計算機");
				break calWhile;
			}
			switch ( input[1] ) { //用字串陣列的第1位來判斷輸入是否正常
			case "*" : cal[3] = cal[0] * cal[2]; //確定是乘號 將結果丟入記錄陣列3排
				break;
			default:
				System.out.println("母湯亂輸入");
				continue calWhile;
			}
			System.out.printf("%d x %d = %d%n" , cal[0] , cal[2] , cal[3]);
		}
	}
}