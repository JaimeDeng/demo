package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Practice12_6 {
	public static void main(String[] args) {
		
		//練習12-6 compareTo . compareToIgnoreCase . equals . equalsIgnoreCase 的輸出差別
		String str1 = "JAVA";
		String str2 = "java";
		
		System.out.println("======compareTo======");
		if(str1.compareTo(str2) == 0) {		//傳回值為-32 ==> 小於0表示字元順序較小,大於則反之
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("======compareToIgnoreCase======");
		if(str1.compareToIgnoreCase(str2) == 0) {		//忽略字元大小寫
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println("======equals======");
		System.out.println(str1.equals(str2));		//對照字符回傳布林值
		
		System.out.println("======equalsIgnoreCase======");
		System.out.println(str1.equalsIgnoreCase(str2));		//無視字元大小對照字符回傳布林值

	}
}