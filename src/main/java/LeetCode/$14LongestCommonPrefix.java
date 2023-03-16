package LeetCode;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $14LongestCommonPrefix {
	public static void main(String[] args) {
		
		//輸出相同開頭
		//若String陣列所有項目有相同開頭 , 輸出相同部分字串
		//Input: strs = ["flower","flow","flight"] Output: "fl" , 只要一個不同就輸出"無"
		
		String [] input = {"application","apple","approach"};
		int count = 0;
		ArrayList<Character> list = new ArrayList<Character>();
		StringBuffer container = new StringBuffer();
		outer : for(int i = 0 ; ; i++) {	//從index0開始
			for(int j = 1 ; j < input.length ; j++) {	//從陣列位置1開始對比
				if(input[0].charAt(i) == input[j].charAt(i)) {		//陣列位置0與之後的每個陣列內容比對
					count++;		//相同一次就記一次
					if(count == input.length-1)		//如果每次都相同,次數就會等於陣列length-1,等於全部都有相同的字元
					list.add(input[j].charAt(i));		//把該字元放入list
				}else {
					break outer;		//只要一有不同就中斷對照迴圈
				}
			}
			count = 0;		//全部的相同index對照完畢後count歸0,再給下一個index對照計次
		}
		if(list.size() == 0) {
			System.out.println("無共通開頭");		//list.size為0 , 等於完全沒有共通的開頭字元
		}else {
		for(int i = 0 ; i < list.size() ; i++) {
			container.append(list.get(i));		//把list的內容依次丟給StringBuffer
		}
		String output = container.toString();		//StringBuffer轉為String
		System.out.println(output);
		}
	}
}