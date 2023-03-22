package LeetCode;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class $1TwoSum {
	public static void main(String[] args) {
		
		var set = new HashSet<Integer>();
		int[] sum = new int[5];
		int container;
		while(true) {
			container = (int)(Math.random() * 10)+1;
			set.add(container);
			if(set.size() == sum.length) {
				break;
			}
		}
		Iterator setIt = set.iterator();
		int x = 0;
		while(setIt.hasNext()) {
			sum[x] = (int) setIt.next();
			x++;
		}
		for(int n : sum) {
			System.out.print(n + " ");
		}
		Scanner scan = new Scanner(System.in);
		int result[] = new int[2]; // 建立一個有兩格的空陣列
        System.out.println("請輸入一個數字:");
        int target = scan.nextInt();
        int twosum;
        int i, j;
        int count = 0;
        // 我們需要 A + B = target數字
        sum_add: for (i = 0; i < sum.length - 1; i++) { // 讓A在sum陣列範圍內累加
            for (j = 1; j < sum.length; j++) { // 讓B在sum陣列範圍內累加
                twosum = sum[i] + sum[j]; // 把累加的A跟B不斷重複相加後丟到twosum裡面
                if (twosum == target && i != j) { // 只要twosum的數字與target相同時
                    result[0] = i; // 把i(第一個陣列位置)丟到result陣列的第0欄
                    result[1] = j; // 把j(第二個陣列位置)丟到result陣列的第1欄
                    System.out.println("result: " + Arrays.toString(result)); // 把int陣列result 轉換成string並輸出
                    break sum_add; // 達成條件中斷所有迴圈
                }
            }
            count ++;
        }
        if(count == sum.length) {
        	System.out.println("沒有搜尋到可相加為target的數字組");
        }
	}
}