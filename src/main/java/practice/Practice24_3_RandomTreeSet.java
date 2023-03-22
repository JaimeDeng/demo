package practice;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Practice24_3_RandomTreeSet {
	public static void main(String[] args) {
		
		var scan = new Scanner(System.in);
		var set = new TreeSet<Integer>();
		int container;
		
		//set不能存有重複內容 , 若用for跑10次 , 重複的話會不存入
		while(true) {
			container = (int)(Math.random() * 10)+1;
			set.add(container);
			if(set.size() == 8) {
				break;
			}
		}
		System.out.println("set內容為:");
		for(int n : set) {
			System.out.print(n + " " );
		}
		System.out.println();
		System.out.println("最大值: " + set.last());
		System.out.println("最小值: " + set.first());
	
	}
}