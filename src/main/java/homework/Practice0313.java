package homework;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Practice0313 {
	public static void main(String[] args) {
		
		//ex) 輸入 [1,9] => 19+1 => 輸出[2,0] 
		List <Integer> list =  Arrays.asList(9 , 9 , 9);
		StringBuffer buffer = new StringBuffer();
		for(Integer num : list) {
			buffer.append(num);		//逐個加入buffer
		}
		String inputStr = buffer.toString();		//buffer轉String
		int input = Integer.parseInt(inputStr);		//String轉int
		int output = input + 1;
		String outputStr = String.valueOf(output);		//int轉String
		char[] outputChar = outputStr.toCharArray();		//String轉charArray
		System.out.println(Arrays.toString(outputChar));		//Array轉String輸出
		
	}
}