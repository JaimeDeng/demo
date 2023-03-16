package LeetCode;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $9PalindromeNumber {
	public static void main(String[] args) {
		
		//回文判斷
		// example) input(為int) = 12321 / output = true
		
		//StringBuffer reverse法
		Scanner scan = new Scanner(System.in);
        String input =scan.next();
		String reverseString = new StringBuffer(input).reverse().toString();
		//建立StringBuffer帶入input , 然後執行reverse , 再轉為String丟入新容器
		boolean palindrome = false;
		if(input.equals(reverseString)) {
			palindrome = true;		//判斷input與reverse是否相同 , 是就true
		}
		System.out.println("是否為回文 : " + palindrome);
		
		
		//陣列位置對照法
//		Scanner scan = new Scanner(System.in);
//		String input = scan.next();
//		char[] container = input.toCharArray();
//		int count = 0;
//		switch(container.length%2) {
//		case 0:
//			for(int i = 0 ; i < container.length/2 ; i++) {
//				int num = 0;
//				int front = container.length/2-num-1;
//				int rear = container.length/2+num;
//				if(container[front] == container[rear]){
//					count++;
//				}else{
//					System.out.println("不是回文");
//					break;
//				}
//				num++;
//			}
//			if(count == container.length/2) {
//				System.out.println("是回文");
//			}
//			break;
//			
//		case 1:
//			for(int i = 0 ; i < container.length/2 ; i++) {
//				int num = 1;
//				int front = container.length/2-num;
//				int rear = container.length/2+num;
//				if(container[front] == container[rear]){
//					count++;
//				}else {
//					System.out.println("不是回文");
//					break;
//				}
//				num++;
//			}
//			if(count == container.length/2) {
//				System.out.println("是回文");
//			}
//			break;
//		}
	}
}