package practice;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Comparator;


public class Practice24_6_TreeMap {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		var map = new TreeMap<String , Integer>();
		map.put("牛排" , 200);
		map.put("豬排" , 150);
		map.put("雞腿" , 180);
		map.put("魚排" , 220);
		System.out.println("輸入餐點名稱查詢價格: ");
		String input = scan.next();
		Integer query = map.get(input); //用.get(key)獲取該key的value
		if(map.containsKey(input)) {
			System.out.println();
			System.out.println(query + "元");
		} else if (input.equals("All")){
			System.out.println();
			System.out.println("菜單總覽");
			for(Map.Entry m : map.entrySet()) {
				System.out.println(m.getKey() + " : " + m.getValue());
			} 
		} else {
			System.out.println("無此餐點");
		}	
		
		//使用另一個TreeMap對調Key跟Value實現以Key(價格)來輸出最貴與最便宜
		var sort = new TreeMap<Integer , String>();
		for(Map.Entry m : map.entrySet()) {
			sort.put((int)m.getValue() , (String)m.getKey());
		} 
		System.out.println();
		System.out.println("最便宜餐點: " +sort.firstEntry());
		System.out.println("最貴餐點: " + sort.lastEntry());
	}
}