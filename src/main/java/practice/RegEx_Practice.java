package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class RegEx_Practice {
	public static void main(String[] args) {
		
		//此為使用pattern類別的matches()來比對的方法 , 使用java.util.regex的方法請見 W3School資料夾的RegEx
		String str = "I love java";
		String str2 = "0987-987-487";
		String str3 = "(06)-2087987";
		String str_name = "Johnnason" ;
		String str_name2 = "Johnson" ;
		String str_name3 = "Johnnanason" ;
		
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";	//設置一個pattern的容器 , \\d代表一個數字
		String pattern2 = "\\d{4}-\\d{3}-\\d{3}";	//{}內數字代表連續重複,此行與pattern功能相同
		String pattern3 = "\\d{4}(-\\d{3}){2}";		//後面是2組-\\d{3} , 因此可以用(){2}來表示-\\d3重複2組
		//大括號{}除了可以表示重複次數,也可以表示重複範圍 例如) (son){3,5} 代表son出現3~5次的範圍都是對照pattern
		String pattern_brackets = "\\(\\d{2}\\)-\\d{7}";		//若要檢查括號 , 在括號前都要加上\\
		String pattern_pipe = "\\(\\d{2}\\)-\\d{7}|\\d{4}(-\\d{3}){2}";		//使用|符號(不可留空白)可以同時設定不同pattern
		
		String pattern_name = "John(na)?son";		// ()?內的字串可有可無,但只能出現一次
		String pattern_name2 = "John(na)*son";		// ()*內的字串可有可無,可以出現多次
		String pattern_name3 = "John(na)+son";		// ()*內的字串必須有,且可以出現多次
		
		//使用 字串變數.matches(pattern) 來對照變數值是否有符合pattern
		System.out.println("============");
		System.out.println("str是台灣手機號碼嗎:" + str.matches(pattern));
		System.out.println("str2是台灣手機號碼嗎:" + str2.matches(pattern));
		System.out.println("str3是台灣手機號碼嗎:" + str3.matches(pattern));
		//matches輸出為布林值
		
		//重複簡化
		System.out.println("======簡化======");
		System.out.println("str2是台灣手機號碼嗎:" + str2.matches(pattern2));	//用pattern2對照結果一樣
		System.out.println("str2是台灣手機號碼嗎:" + str2.matches(pattern3));	//用pattern3對照結果一樣
		
		//特殊符號
		System.out.println("======括號======");
		System.out.println("str3是市話嗎:" + str3.matches(pattern_brackets));	//含檢查括號
		
		//pipe
		System.out.println("======pipe======");
		System.out.println("str3是市話嗎:" + str3.matches(pattern_pipe));	//pipe同時檢查市話
		System.out.println("str2是台灣手機號碼嗎:" + str2.matches(pattern_pipe));	//pipe同時檢查手機
		
		//使用( )?	可有可無 最多1個
		System.out.println("======?======");
		System.out.println("str_name有na嗎:" + str_name.matches(pattern_name));		//有na true
		System.out.println("str_name有na嗎:" + str_name2.matches(pattern_name));		//沒有na也true
		System.out.println("str_name有na嗎:" + str_name3.matches(pattern_name));		//na多了一個
		
		//使用( )*	可有可無
		System.out.println("======*======");
		System.out.println("str_name有na嗎:" + str_name.matches(pattern_name2));		//有na true
		System.out.println("str_name有na嗎:" + str_name2.matches(pattern_name2));		//沒有na也true
		System.out.println("str_name有na嗎:" + str_name3.matches(pattern_name2));		//多個na也true
		
		//使用( )+	1~多個true
		System.out.println("======+======");
		System.out.println("str_name有na嗎:" + str_name.matches(pattern_name3));		//有na true
		System.out.println("str_name有na嗎:" + str_name2.matches(pattern_name3));		//沒有na就false
		System.out.println("str_name有na嗎:" + str_name3.matches(pattern_name3));		//多個na也true
		
		//replace
		System.out.println("======replace======");
		System.out.println(str.replaceFirst("[A-Z]" , "You"));		//將第一個符合的()內第一位pattern的子字串用,()第二位字串替換
		System.out.println(str.replaceAll("[a-z]{4}" , "go"));		//只要符合()內pattern就全部替換為()第二位的字串
		
	}
}