package practice;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice20_5 {
	
	//建立一個method , 該method在執行中會遇到拋出exception的狀況
	public static void checkAge(int age) {
		if(age >= 18) {
			System.out.println(age + "歲符合投票年齡");
		}else {
			System.out.println(age + "歲未達到投票年齡");
			throw new StringIndexOutOfBoundsException("不符合投票最低年齡");	//自行throw一個exception
		}
	}
	
	public static void main(String[] args) {
		
		int[] age = {12 , 19 , 67 , 87};
		for (int i = 0 ; i < age.length ; i ++) {
			//利用try catch區塊,使chechAge()拋出exception的時候不會中止程式
			try {
			checkAge(age[i]);
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Error!" + e);
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println("年齡確認結束");
		
	}
}