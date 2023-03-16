package LeetCode;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $7ReverseInteger {
	public static void main(String[] args) {
		
		//給予一個整數 , 輸出其反向 , 負數保持負數 , 如果給予的數超過32位元 , 輸出0
		//Input: x = 123  Output: 321  /  Input: x = -123  Output: -321  /  Input: x = 120  Output: 21
		try {
			int x = -87;
			if(x < 0) {		//負數判斷
				String inputStrMinus = Integer.toString(x);		//int轉String
				StringBuffer buffer = new StringBuffer(inputStrMinus).reverse().deleteCharAt(inputStrMinus.length()-1);
				//反向去除最末字元(去除負號) , 丟入buffer
				String bufferToStr = buffer.toString();		//buffer轉String
				int output = Integer.valueOf(bufferToStr);		//String轉整數
				System.out.println(0 - output);		//0 - 整數輸出負數
			}else {
				String inputStrMinus = Integer.toString(x);
				StringBuffer buffer = new StringBuffer(inputStrMinus).reverse();
				String bufferToStr = buffer.toString();
				int output = Integer.valueOf(bufferToStr);
				System.out.println(output);
			}
		}catch(NumberFormatException e) {
			System.out.println(0);
		}
	}
}