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


public class TreeMapSortByValue {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		var map = new TreeMap<String , Integer>();
		//價格作Key方便取大小
		map.put("牛排" , 250);
		map.put("豬排" , 150);
		map.put("雞腿" , 130);
		map.put("魚排" , 220);

		System.out.println("------------原序------------");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		} 
		
		
		//按照Value小到大排序輸出 *僅有輸出時排序 , map內實際上沒有變動
		var valueComp = new Comparator<Map.Entry<String , Integer>>(){
		 @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			 		return o1.getValue()-o2.getValue();
            }
        };
        // map轉換成list進行排序
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        // 排序
        Collections.sort(list,valueComp);
        // 默認情況下，TreeMap對key進行升序排序
        System.out.println("-----map按照value升序排序-----");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        
        System.out.println("-----利用計次來輸出最小最大-----");
        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {
			if(count == 0)		//第一次即為最小值
				System.out.println("最便宜的是: " + entry.getKey());
			if(count == map.size()-1)	//最後一次即為最大值
				System.out.println("最貴的是: " + entry.getKey());
			count ++;		//記錄遍歷次數
        }
        
        //但實際上map內沒有變
        System.out.println("-----map內實際排序依舊是原本的-----");
    	for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		} 
	}
}