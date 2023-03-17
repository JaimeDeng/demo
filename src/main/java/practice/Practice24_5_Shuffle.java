package practice;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Practice24_5_Shuffle {
	public static void main(String[] args) {
		
		//ArrayList預設內容 使用Arrays.asList(內容)
		var list = new ArrayList<String>(Arrays.asList("1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K"));
		System.out.println("shuffle前的list: " + list.toString());
		for(int i = 1 ; i <= 10 ; i++) {
			Collections.shuffle(list);
			System.out.println("shuffle第" + i + "次的list: " + list.toString());
		}

		
	}
}