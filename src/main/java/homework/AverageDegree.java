package homework;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;


public class AverageDegree {
	public static void main(String[] args) {
		
		double[] weekDegree = { 24 , 23 , 21 , 26 , 30 , 27 , 22 };
		double total = 0;
		for(int i = 0 ; i < weekDegree.length ; i++) {
			total += weekDegree[i]; 
		}
		System.out.printf("本週平均溫度為%5.2f度" , total / weekDegree.length);
		//%5.2f意思 : 5 = 總位數(加上小數點&浮點數) / 2 = 小數點位數
		//若改成 %7.3f 就會顯示 000.000 , 若實際數小於範圍 , 就只會顯示實際數
	}
}