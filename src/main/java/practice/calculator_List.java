package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;


public class calculator_List {
	public static void main(String[] args) {
		
		//陣列作業 乘法計算機 以List記錄 0*0結束
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0; //讓迴圈由陣列位置0開始記錄
		int count = 0;
		int containerA , containerB; //輸入用容器
		
		System.out.println("請用空白間隔輸入欲相乘數字");
		System.out.println("限制五組,或輸入0x0結束:");
		while(count < 5) {
			containerA = scan.nextInt();
			containerB = scan.nextInt();
			if(containerA == 0 && containerB ==0) {		//輸入兩個0就結束
				break;
			}
			
			list.add(containerA);		//加入輸入的第一個數字
			list.add(containerB);		//加入輸入的第二個數字
			list.add(containerA * containerB);		//加入相乘的數字
			count++;

			System.out.printf("%d x %d = %d%n" , list.get(i) , list.get(i+1) , list.get(i+2));
			i+=3; // 一組乘法完成,佔用了3個位置,因此每次都+3才能夠換記錄下一組
		}
		System.out.println();
		System.out.println("總結");
		// 將記錄的算式全部呈現
		for( int j=0 ; j < list.size() ; j+=3 ) {
			System.out.printf("%d x %d = %d%n" , list.get(j) , list.get(j+1) , list.get(j+2));
		}
	}
}