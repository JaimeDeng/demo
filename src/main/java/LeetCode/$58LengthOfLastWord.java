package LeetCode;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $58LengthOfLastWord {
	public static void main(String[] args) {
				
		//輸出句子最後一段的字數
		//Input: s = "Hello World"  Output: 5
		
		Scanner scan = new Scanner(System.in);
	    ArrayList<String> list = new ArrayList();
	    String str;
	    str = scan.nextLine();
	    String[] buf = str.split(" ");		//將輸入的字串以空白為區隔丟進陣列
	    for(String con : buf){
	        list.add(con);		//將陣列內的內容逐個丟給list
	    }
	    int last = buf.length-1;		//last為陣列的最後一位
	    String resultStr = list.get(last);		//獲取list的最後一個位置的內容
	    System.out.print(resultStr.length());	//輸出最後一個位String的length
		
	}
}