package course;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTestApplication_0301 {
	public static void main(String[] args) {
		
		//計算一週平均溫度
		double[] weekDegree = { 24 , 23 , 21 , 26 , 30 , 27 , 22 };
		double totalDegree = 0;
		for(int i = 0 ; i < weekDegree.length ; i++) {
			totalDegree += weekDegree[i]; 
		}
		System.out.printf("本週平均溫度為%5.2f度%n" , totalDegree / weekDegree.length);
		//%5.2f意思 : 5 = 總位數(加上小數點&浮點數) / 2 = 小數點位數
		//若改成 %7.3f 就會顯示 000.000 , 若實際數小於範圍 , 就只會顯示實際數
		
		System.out.println("===============");
		
	
		//計算平均 最多輸入五個數字
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
		System.out.println("===============");
		
		//改用List來實現計算平均
		System.out.println("List方式:");
		
		List<Integer> listAve = new ArrayList<Integer>();		//List長度自由,給多少值即多少長度
		int total2 = 0;
		System.out.println("輸入數字,輸入0則計算平均值:");
		for(int i = 0 ;  ; i++) {
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