package practice.practice_0321;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice2 {
	public static void main(String[] args) {
		
		var list = new ArrayList<String>( );
		boolean reverse = false;
		String listStr;
		int starNum = 10;
		
		for(int i = 1 ; i < starNum ; i++) {
			list.add("＊");
		}
		list.add("＊");
		
		for(int i = 0 ; i < list.size()*2-1 ; i++) {	//總數為size x 2 -1(因為反轉後少做一次)
			
			if(!reverse) {		//如果reverse是True就印正三角 , False就印倒三角
				for(String n : list) {
					System.out.print(n);
				}
				System.out.println();
				list.add("＊");		//先印再加 , 不然會一開始就有兩個*
				list.remove(0);		
			} else {							
				list.remove(list.size()-1);		//先減再印 , 不然會多印一次同數量的*
				list.add(0 , " ");
				for(String n : list) {
					System.out.print(n);
				}
				System.out.println();
			}
						
			if(i ==list.size()-1) { 	//list.size()-1代表印完正三角的最後一輪了
				reverse = true;
			}
			
		}		
	}
}