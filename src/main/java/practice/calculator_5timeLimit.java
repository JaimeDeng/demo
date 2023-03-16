package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;


public class calculator_5timeLimit {
	public static void main(String[] args) {
		
		//陣列作業 乘法計算機 限制5次
		Scanner scan = new Scanner(System.in);
		int i = 0; //讓迴圈由陣列0行開始
		int[][] cal; //記錄用陣列
		cal = new int[5][3]; //5行4排陣列 , 記錄5組 A x B ANS
		String container; //輸入用容器
		
		System.out.println("請輸入5組欲相乘數字(1~9):");
		calWhile : while(i < 5) {
			container = scan.nextLine(); //以字串輸入
			char[] input = container.toCharArray(); //字串轉字符陣列,即每個字符分開儲存
			if(input.length < 3) {
				System.out.println("母湯亂輸入");
				continue calWhile;
			}
			//字符轉整數後丟進整數陣列
			cal[i][0] = Integer.parseInt(String.valueOf(input[0]));  //方法1 取其值轉為字串,再轉為整數
			cal[i][1] = Character.getNumericValue(input[2]); //方法2 直接獲取數字字符的數字整數

			
			switch ( input[1] ) { //用字符陣列的第1位來判斷輸入是否正常
			case '*' : cal[i][2] = cal[i][0] * cal[i][1]; //確定是乘號 將結果丟入記錄陣列3排
				break;
			default:
				System.out.println("母湯亂輸入");
				continue calWhile; //輸入有錯誤從頭開始
			}
			System.out.printf("%d x %d = %d%n" , cal[i][0] , cal[i][1] , cal[i][2]);
			i++; // 一組乘法完成,記錄陣列行數+1換記錄下一組
		}
		System.out.println();
		System.out.println("總結");
		// 將記錄的算式全部呈現
		for( int j=0 ; j < cal.length ; j++ ) {
			System.out.printf("%d x %d = %d%n" , cal[j][0] , cal[j][1] , cal[j][2]);
		}
	}
}