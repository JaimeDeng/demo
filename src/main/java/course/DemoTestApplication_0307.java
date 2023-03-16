package course;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTestApplication_0307 {
	public static void main(String[] args) {
		
		//字元的empty辨別
		String str = "wow";
		System.out.println(StringUtils.hasLength(str));
		System.out.println(StringUtils.hasText(str));
		
		String str2 = " ";
		System.out.println(StringUtils.hasLength(str2));		//有長度
		System.out.println(StringUtils.hasText(str2));		//沒文字
		
		String str3 = "";
		System.out.println(StringUtils.hasLength(str3));		//沒長度
		System.out.println(StringUtils.hasText(str3));		//沒文字
		
		//hasText 類似於 isEmpty
		//hasLength 類似於 isBlank
		
		//搜尋字串index
		String strindex = "ABCADEA";
		//									0123456
		System.out.println(strindex.indexOf("A"));
		System.out.println(strindex.indexOf("A" , 2));		//從index2開始找
		System.out.println(strindex.lastIndexOf("A"));
		System.out.println(strindex.lastIndexOf("A" , 5));		//從index5反向找
		
	}
}