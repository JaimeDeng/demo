package practice;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Practice24_4_HashMap {
	public static void main(String[] args) {
		
		var scan = new Scanner(System.in);
		var map = new HashMap<String , String>();
		int count = 0;
		boolean bye = false;
		map.put("Taipei", "台北");
		map.put("Tokyo", "東京");
		map.put("Singapore", "新加坡");
		map.put("Chicago", "芝加哥");
		map.put("Beijing", "北京");
		map.put("Osaka", "大阪");
		map.put("Seoul", "首爾");
		map.put("Sydney", "雪梨");
		
		while(bye == false) {
			System.out.println("請輸入英文名稱查詢中文名稱:");
			String input = scan.next();
			String result = map.get(input);
			if(result == null) {
				System.out.println("查無此字");
				System.out.println();
				
				//相似關鍵字搜尋區
				System.out.println("相似結果:");
				for(Entry m : map.entrySet()) {		//Map.Entry遍歷HashMap
					String mapData = m.getKey().toString();		//獲取當前key轉String
					int countEqualsTimes = 0;
					for(int i = 0 ; i < mapData.length() && i < input.length() ; i ++) {	 //i要小於最短的那個字串長度否則報錯
						String mapDataInitial = String.valueOf(mapData.charAt(i));
						String inputInitial = String.valueOf(input.charAt(i));		//比對兩組同位index的字元
						if(mapDataInitial.equalsIgnoreCase(inputInitial)){
							countEqualsTimes++;		//字元相同就+1
						}
					}
					//字元有3個或以上相同 , 且長度誤差 +- 1內 , 就把該key跟value列出
					if(countEqualsTimes >= 2 && input.length() >= input.length()-1
						&& input.length() <= input.length()+1) {
						System.out.printf("%s : %s%n" , m.getKey() , m.getValue());		//相符者輸出
					}else {
						count++;	//都沒有就計次1
					}
				}
				if(count == map.size()) {		//如果跑遍map都沒有就等於無相似結果
					System.out.println("無");
				}
				System.out.println();
				//相似關鍵字搜尋區
				
			}else {
				System.out.println("查詢結果: " + result);
				System.out.println();
			}

			while(true) {
				System.out.println("是否繼續查詢? (Y/N)");
				String check = scan.next();
				if(check.equals("N")) {
					System.out.println("88");
					bye = true;
					break;
				}else if(!check.equals("Y")) {
					System.out.println("母湯亂輸入");
					continue;
				}
				break;
			}
		}
	}
}