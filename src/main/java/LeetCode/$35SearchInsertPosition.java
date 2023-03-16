package LeetCode;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $35SearchInsertPosition {
	public static void main(String[] args) {
		
		//輸出相同數字的index , 若沒有則找出依序插入後應該是的index
		//Input: nums = [1,3,5,6], target = 2  Output: 1
		
		int[] input = { 3 , 4 , 6 , 8 , 9 };		//題目規定陣列要排序小到大
		int result = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入數字:");
		int target = scan.nextInt();
		
		if(target < input[0]) {
			result = 0;
		}
		if(target > input[input.length-1]) {
			result = input.length;
		}
		
		for (int i =0 ; i < input.length ; i++) {
			if(target <= input[i]) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
		
	}
}