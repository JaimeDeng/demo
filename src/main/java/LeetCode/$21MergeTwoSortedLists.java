package LeetCode;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class $21MergeTwoSortedLists {
	public static void main(String[] args) {
		
		//合併兩組陣列且依序排列
		//Input: list1 = [1,2,4], list2 = [1,3,4]   Output: [1,1,2,3,4,4]
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> listA = new ArrayList();
		ArrayList<Integer> listB = new ArrayList();
		ArrayList<Integer> listResult = new ArrayList();
		
		System.out.println("請輸入第一組數字:");
		char[] inputA = scan.next().toCharArray();		//將輸入轉為字符陣列
		for(int i = 0 ; i < inputA.length ; i++) {
			listA.add( Character.getNumericValue(inputA[i]) );		//將字符數字轉為整數放入list
		}
		Collections.sort(listA);		//排序list
		System.out.println("排序為第一組陣列" + listA);
		
		System.out.println();

		System.out.println("請輸入第二組數字:");
		char[] inputB = scan.next().toCharArray();
		for(int i = 0 ; i < inputB.length ; i++) {
			listB.add( Character.getNumericValue(inputB[i]) );
		}
		Collections.sort(listB);
		System.out.println("排序為第二組陣列" + listB);
		
		System.out.println();
		
		listResult.addAll(listA);		//使用addAll來將listA放入listResult
		listResult.addAll(listB);		//將listB放入
		Collections.sort(listResult);		//排序合併後的list
		System.out.println("合併後為:");
		System.out.println(listResult);
			
	}
}