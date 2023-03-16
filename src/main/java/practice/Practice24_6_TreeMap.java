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


public class Practice24_6_TreeMap {
	public static void main(String[] args) {

		var map = new TreeMap<Integer , String>();
		//價格作Key方便取大小
		map.put(100 , "蘋果");
		map.put(30 , "香蕉");
		map.put(50 , "芒果");
		map.put(20 , "西瓜");
		map.put(200 , "酪梨");
		//用.get(key)獲取該key的value
		System.out.println("最便宜的水果:" + map.get(map.firstKey()) + " 單價:" + map.firstKey());
		System.out.println("最貴的水果:" + map.get(map.lastKey()) + " 單價:" + map.lastKey());
		System.out.println();
		System.out.println("遍歷水果表");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getValue() + " : " + m.getKey());
		}
		
	}
}