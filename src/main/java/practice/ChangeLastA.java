package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ChangeLastA {
	public static void main(String[] args) {
		
		String str = "ABACADEF";
		int index = str.lastIndexOf("A");	//找到最後一個A的index(索引)
		str = str.substring(0 , index) + 'W' + str.substring(index+1);
		//substring(起始點索引 , 結束點索引) ==> *注意 : 輸出為起始點索引到結束點索引-1 的範圍
		System.out.println(str);
		
	}
}