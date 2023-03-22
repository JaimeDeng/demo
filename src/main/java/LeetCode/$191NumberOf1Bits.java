package LeetCode;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $191NumberOf1Bits {
	public static void main(String[] args) {
		
		//Input: n(輸入時要輸入整數)
		//例 00000000000000000000000000001011 有三個1 Output: 3
		
		//charArray解法
		System.out.println("請輸入整數");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int count = 0;
		//整數轉2進制字串再轉為字符陣列
		char[] charAry = Integer.toBinaryString(input).toCharArray();
		System.out.println(Arrays.toString(charAry));
		for(char n : charAry) {
			if(n == '1') {		//字符陣列有'1'就計次
				count++;
			}
		}
		System.out.println("output: " + count);		//輸出結果
	}
}