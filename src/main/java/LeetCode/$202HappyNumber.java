package LeetCode;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $202HappyNumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("請輸入一個數字,判斷是否為happyNum");
		String inputFirst = scan.next();
		String input;
		int count = 0;
		int output = 0;
		input = inputFirst;		//輸入的值給input
		while(count < 100) {		//計算超過100次就算不是happyNum
			list.clear();		//清空list
			char[] charArray = input.toCharArray();		//將input轉為字符陣列方便逐個計算
			for(int i = 0 ; i < charArray.length ; i++) {
				int charValue = Character.getNumericValue(charArray[i]);		//將字符轉為整數
				int charValueSquare = (int) Math.pow(charValue , 2);		//將整數平方
				list.add(charValueSquare);		//將平方後的整數逐個丟入list
			}
			output = 0;		//清空上一輪的output
			for(int j = 0 ; j < list.size() ; j++) {
				output += list.get(j);		//將list總和
			}
			input = Integer.toString(output);		//把總和的output轉為String給input , 作為下一輪的input
			if(output == 1) {
				System.out.println("是happyNum");		//有output是1就是happyNum
				break;
			}
			count++;
		}
		if(count == 100) {
		System.out.println("不是happyNum");		//while達100次 判為不是
		}
	}
}
