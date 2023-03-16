package SelfPractice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;


public class findSameNum {
	public static void main(String[] args) {
		
		
		//雙迴圈遍歷找重複數字
		ArrayList<Integer> arrayran = new ArrayList<Integer>();
		Random ran = new Random();
		int num;
		
		whil: while(true) {
			arrayran.clear(); //清空陣列
			for( int i = 0 ; i < 4 ; i++ ) {
				num = ran.nextInt(10);
				arrayran.add(num);
			}
			System.out.println(arrayran.toString());
			
			for( int i = 0 ; i < 4 ; i++ ) {
				for( int j = 0 ; j < 4 ; j++ ) {
					System.out.println("i" + i + "j" + j);
					if(arrayran.get(j) == arrayran.get(i) && j != i) { //數字相同且位置不同時
						System.out.println("有重複");
						continue whil; //回去重做while
					}
				}
			}
			break; //雙迴圈全部跑完 = 沒有重複 , 結束while迴圈
		}
	}
}



//失敗
//原因 : 雙迴圈內判斷式不需要下else! 讓迴圈全部執行完都沒有if的條件就是沒有重複了!
//Random ran = new Random();
//int arrayran[] = new int[4];
//
//procedure: while(true) {
//	addArrayRan : for( int i = 0 ; i < 4 ; i++ ) {
//		arrayran[i] = ran.nextInt(10);
//	}
//	System.out.println(Arrays.toString(arrayran));
//	
//	for( int i = 0 ; i < 4 ; i++ ) {
//		for( int j = 0 ; j < 4 ; j++ ) {
//			if(arrayran[j] == arrayran[i] && j != i) {
//				arrayran = null;
//		        continue addArrayRan;
//			}else {
//				System.out.println(Arrays.toString(arrayran));
//				break addArrayRan;
//			}
//		}
//	}
//} 