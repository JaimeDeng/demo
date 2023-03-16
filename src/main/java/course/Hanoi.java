package course;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Hanoi {
	public static void hanoi(int discNum , char from , char buffer , char to) {
		if(discNum == 1) {		//遞迴中止條件 , 只剩一盤時移動完就結束
			System.out.printf("將碟子%d從%c" , discNum , from);
			System.out.printf("移動到%c%n" , to);
		}else {
			hanoi(discNum-1 , from , to , buffer);		// A移動到B (這邊to值遞給了buffer , buffer值遞給了to)
												//A    ,  C  ,      B
			System.out.printf("將碟子%d從%c" , discNum , from);
			System.out.printf("移動到%c%n" , to);
			hanoi(discNum-1 , buffer , from , to);		//B移動到C (這邊buffer值遞給了from , from值遞給了buffer)
												//B       ,  A       , C	
		}

	}
	public static void main(String[] args) {
		int discNum;
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入圓盤數量:");
		discNum = scan.nextInt();
		hanoi(discNum , 'A' , 'B' , 'C');		//定義from = A , buffer = B , to = C
	}
}