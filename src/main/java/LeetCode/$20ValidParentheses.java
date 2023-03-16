package LeetCode;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $20ValidParentheses {
	public static void main(String[] args) {
		
		boolean valid = false;
		int round = 0;
		int round2 = 0;
		int counter = 0;
		int target = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一串括號:");
		String input = scan.next();
		
		if(input.indexOf("(") < 0 && input.indexOf("[") < 0 && input.indexOf("{") < 0) {
			System.out.println("沒有括號");
		}
		while(true) {
			if(input.indexOf("(" , round) >= 0) {
				round += input.indexOf("(" , round) + 1;
				target++;
				if(input.indexOf(")" , round) > input.indexOf("(" , round)){
					counter++;
				}
			}else {
				break;
			}
		}
		while(true) {
			if(input.indexOf("[" , round) >= 0) {
				round += input.indexOf("[" , round) + 1;
				target++;
				if(input.indexOf("]" , round) > input.indexOf("[" , round)){
					counter++;
				}
			}else {
				break;
			}
		}
		while(true) {
			if(input.indexOf("{" , round) >= 0) {
				round += input.indexOf("{" , round) + 1;
				target++;
				if(input.indexOf("}" , round) > input.indexOf("{" , round)){
					counter++;
				}
			}else {
				break;
			}
		}
		if(target == counter) {
			valid = true;
			System.out.println(valid);
		}else {
			System.out.println(valid);
		}
//		Pattern pattern1 = Pattern.compile("[\\(\\[\\{]");
//		Pattern pattern2 = Pattern.compile("[\\)\\]\\}]");
//		Matcher matcher1 = pattern1.matcher(input);
//		Matcher matcher2 = pattern2.matcher(input);
		
	}
}