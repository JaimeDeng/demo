package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class RegEx_Practice2 {
	public static void main(String[] args) {
		
		String TEL = "06-9487987";
		String TEL2 = "0987-94879487";
		String TEL3 = "20-9487987";
		String pattern = "0\\d{1,3}-\\d{7,8}";		//開頭0 , 數字[0-9]1~3次 "-" 數字[0-9]7~8次
		System.out.println("是否為市話號碼:" + TEL.matches(pattern));
		System.out.println("是否為市話號碼:" + TEL2.matches(pattern));
		System.out.println("是否為市話號碼:" + TEL3.matches(pattern));
		
	}
}