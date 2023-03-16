package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Practice12_7 {
	public static void main(String[] args) {
		
		//練習12-7 列出ch1開頭的檔案 & 列出副檔名.c的檔案
		String[] files = {"ch1_1.docx" , "ch1_2.c" , "ch2_1.java" , "ch2_2.pptx" , "ch3_1.c" , "ch3_2.java"};
		String target = "ch1";		//目標ch1
		
		//找ch1開頭的檔案
		System.out.println("ch1開頭檔案:");
		for(int i = 0 ; i < files.length ; i++) {
			if(files[i].indexOf(target) == 0) {	//如果該索引搜尋目標"ch1"位置是於0 (字串最開頭即為ch1) , 就輸出
				System.out.println(files[i]);
			}
		}
		
		System.out.println();
		
		//找.c結尾的檔案
		System.out.println("c語言檔案:");
		for(int i = 0 ; i < files.length ; i++) {
			if(files[i].endsWith(".c")) {	//利用.endsWith()此布林值method來對比該字串的後綴,如果相符則回傳true
				System.out.println(files[i]);		//是true就輸出
			}
		}

	}
}