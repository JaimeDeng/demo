package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;


public class arrayPractice {
	public static void main(String[] args) {
		
		//陣列練習題 找出小於20的質數放入陣列,由大到小印出
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//找出小於20的質數
		int i = 1; //從1開始
		while (i<=20) { //欲找質數的範圍
			int j;
			for (j = 2 ; j < i ; j++) { //1直接排除,由2開始遞增並給i除,直到j=i(因為必定被整除)
				if (i % j == 0) //若i一被j整除就直接中斷
				break;
		    }
			//如果剛剛j被中斷的話j就不會大於i
			if (j == i) { //如果上面for迴圈沒被中斷,最後執行了j++,所以會是j=i
				list.add(i); //i被全部的j除完了都沒有被整除就把i的數字印出來
			}
			i++; //讓i遞增
		}
		
		//用foreach遍歷
		for(int con : list) {
			System.out.printf("%d " , con);
		}
		//找出小於20的質數
		
		//氣泡排序大到小
		int num1 , num2; //暫存容器
		for (i = list.size() ; i > 1 ; i--) { //執行範圍由陣列最右邊遞減 , 因為每執行一次排列最小數就會在最右邊
			for (int j = 0 ; j < i - 1 ; j++) { //執行次數會比總陣列數少1 , 所以-1
				if (list.get(j) < list.get(j+1)) { //如果這個位置的數小於下一個位置的數就執行對調
					num1 = list.get(j+1);
					num2 = list.get(j);
					list.set(j , num1);
					list.set(j+1 , num2);
				}
			}		
		}
		//氣泡排序大到小
		System.out.println();
		System.out.println("由大到小排列:");
		System.out.println(list);
	}
}


//java.util.Collections 陣列反序工具
//Collections.reverse(list);		//利用java工具對array反序排列
//System.out.println(list);
//
////自製List反序
//int size = list.size();
//int count = 0;
//switch(size%2) {
//	case 0:	//偶數陣列
//		for(int a = 0 ; a < size / 2 ; a++) {	//對調執行次數=size/2
//			num1 = list.get(size/2-count-1);	//除2的位置-1就是前半部開頭
//			num2 = list.get(size/2+count);	//除2的位置就是後半部開頭
//			list.set(size/2+count , num1);
//			list.set(size/2-count-1 , num2);
//			count++;
//		}
//		System.out.println(list);
//		break;
//	default:	//奇數陣列
//		count += 1;
//		for(int b = 0 ; b < size / 2 ; b++) {	//對調執行次數=size/2
//			num1 = list.get(size/2-count);	//除2的位置就是正中間 , 從正中間+1跟-1的位置開始對調
//			num2 = list.get(size/2+count);
//			list.set(size/2+count , num1);
//			list.set(size/2-count , num2);
//			count++;
//		}
//		System.out.println(list);
//		break;
//}	