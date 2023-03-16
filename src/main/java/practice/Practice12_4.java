package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Practice12_4 {
	public static void main(String[] args) {
		
		//練習12-4 計算"小龍女"出現次數
		String str = "神鵰俠侶是楊過與小龍女的故事,我喜歡小龍女在古墓的生活片段,小龍女清新脫俗美若天仙";
		int counter = 0;		//出現次數容器
		String target = "小龍女";		//搜尋字串時,需要先建立目標容器,indexOf(不可直接放入"小龍女");
		int index = 0;		//記錄前一個搜索到的索引點
		
		while(true) {
			index = str.indexOf(target , index);		//indexOf(目標容器 , 起始點索引)
			if(index >= 0) {
				counter++;
				index += target.length();		//下次起點從索引點+target長度(例如小龍女佔3個索引)開始繼續尋找
			} else {		//如果找不到會回傳-1 此時小於0則break無限迴圈
				break;
			}
		}
		System.out.println("小龍女出現次數:" + counter);
	}
}