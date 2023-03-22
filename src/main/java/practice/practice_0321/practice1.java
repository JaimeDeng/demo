package practice.practice_0321;
import java.util.Scanner;
import java.util.TreeSet;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class practice1 {
	public static void main(String[] args) {
		//input 一組數字 , 輸出奇數 , 由大到小排列 , 數字不重複
		var list = new ArrayList<Integer>(Arrays.asList( 11 ,12 , 6 , 8 , 2 , 1 , 5 , 7 , 9));
		var set = new TreeSet<Integer>();
		for(int i = 0 ; i <list.size() ; i ++) {
			switch(list.get(i) % 2) {
				case 0:
					set.add(list.get(i));
					break;
			}
		}
		var reverseList = new ArrayList<Integer>();
		for(int n : set) {
			reverseList.add(n);
		}
		Collections.reverse(reverseList);
		for(int n : set) {
			System.out.print(n + " ");
		}
		System.out.println();
		for(int n : reverseList) {
			System.out.print(n + " ");
		}
	}
}