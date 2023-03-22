package course.Collection_0320;
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


public class Display {
	public static void main(String[] args) {
		
		//泛型類別 , 用<>來宣告該Object的Type
		MyData<Integer> dataInt = new MyData();
		dataInt.setObj(87);
		System.out.println(dataInt.getObj());
		
		MyData<String> dataStr = new MyData();
		dataStr.setObj("wow");
		System.out.println(dataStr.getObj());
		
//		MyData<Bank> dataBank = new MyData();
		
		System.out.println();
		
		//泛型方法
		Integer[] intArray = { 1 , 2 , 3 , 4 , 5 };
		String[] strArray = {"a" , "b" , "c" , "d" , "e"};
		
		System.out.println("整數陣列");
		MyData.outputArray(intArray);
		System.out.println("字串陣列");
		MyData.outputArray(strArray);
		System.out.println("輸出字串");
		MyData.outputContent("LOLOLOLOL");
		System.out.println("輸出浮點數");
		MyData.outputContent(123.456f);
	}
}