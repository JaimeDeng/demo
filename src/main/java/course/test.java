package course;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class test {
	public static void main(String[] args) {
		
		
		
		//找因數
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("輸入一數字即顯示其因數:");
		int input = scan.nextInt();
		int i = 1;		//從1開始相乘
		int num;
		
		// i * j 遍歷法
		while( i <= input) {
			for(int j = 2 ; j <= input ; j++) {
				num = i * j;
				if(num == input && !list.contains(i)) {		//如果相乘=輸入數且list中沒有相同的數
					list.add(i);
					if(!list.contains(j)) {		//為避免ex. 9=3x3 同時存入兩個3的狀況 , 對j也檢查一次
					list.add(j);	
					}
					System.out.println(i + "x" + j);
				} else if (list.contains(i)) {		//如果接下來的i=list裡面有的數,就結束迴圈
					break;
				}
			}
			i++;
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
		
		
		//找質數 for寫法
//		int i, j;
//		int k = 0;
//		for (i = 10 ; ; i++) { //指定從10以後,不斷遞增找質數
//			for (j = 2; j < i; j++) { //1直接排除,由2開始給i除
//				if (i % j == 0) //若i一被j整除就中斷
//				break;
//		    }
//			//如果剛剛j被中斷的話j就不會大於i
//	    	if (j == i) { //如果上面for迴圈沒被中斷,最後執行了j++,所以會是j=i
//				k++; //每執行到一次這個程序就記錄一次
//				System.out.println(i); //i被全部的j除完了都沒有被整除就把i的數字印出來
//			}
//			if (k >= 20) { //k紀錄大於等於20就中斷整個迴圈
//				break;
//			}
//		}
			
		//列出小於20的質數 習題9 while寫法
//		int j;
//		int k = 0;
//		int i = 1; //從1開始
//		while (i<=20) { //執行到k=20
//			for (j = 2; j < i; j++) { //1直接排除,由2開始遞增並給i除,直到j=i(因為必定被整除)
//				if (i % j == 0) //若i一被j整除就直接中斷
//				break;
//		    }
//			//如果剛剛j被中斷的話j就不會大於i
//			if (j == i) { //如果上面for迴圈沒被中斷,最後執行了j++,所以會是j=i
//				k++; //每執行到一次這個程序就記錄一次
//				System.out.println(i); //i被全部的j除完了都沒有被整除就把i的數字印出來
//			}
//			i++; //讓i遞增
//		}
		
//		//遞減排序 習題7
//		outerloop: for(int x = 1 ; x < 10 ; x++ ) { //排數
//			for(int y = 9 ; y > 0 ; y-- ) { //字數
//				System.out.printf("%d" , y);
//				if( y == x ) { //字數跑到跟排數一樣的時候下一列
//					System.out.println();
//					continue outerloop; //並且離開內迴圈,跑外迴圈
//				}
//			}
//		}