package homework;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//計算平均 最多輸入五個數字
public class Average {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] Ave = new int[5];
		int input;
		int total = 0;
		int count = 0;		//執行次數容器
		System.out.println("輸入數字,最多五次,輸入0則提前結束:");
		for(int i = 0 ; i < Ave.length ; i++) {
			input = scan.nextInt();
			if(input == 0) {
				break;
			}
			Ave[i] = input;
			count++;		//跑一次記數一次
		}
		for(int j = 0 ;  j < count ; j++) {		//只執行到運算次數的位置 , 因為如果中斷後面都會是0
			total += Ave[j]; 
		}
		
		System.out.printf("平均為%d" , total / count);		//總數除以次數
		
		System.out.println();
		System.out.println("============");
		System.out.println("List方式:");
		
		List<Integer> listAve = new ArrayList<Integer>();		//List長度自由,給多少值即多少長度
		int total2 = 0;
		System.out.println("輸入數字,最多五次,輸入0則提前結束:");
		for(int i = 0 ; i < Ave.length ; i++) {
			input = scan.nextInt();
			if(input == 0) {
				break;
			}
			listAve.add(input);
		}
		for(int j = 0 ;  j < listAve.size() ; j++) {		//只執行到運算次數的位置 , 因為如果中斷後面都會是0
			total2 += listAve.get(j); 
		}
		
		System.out.printf("平均為%d" , total2 / listAve.size() );		//總數除以次數
	}
}