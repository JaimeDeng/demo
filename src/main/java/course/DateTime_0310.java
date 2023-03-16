package course;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DateTime_0310 {
	public static void main(String[] args) {
		
		//LocalDateTime類別建立物件,以now()賦予現在時間的值
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		//用DateTimeFormatter類別建立物件 , 並透過ofPattern()來定義格式
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");		//大寫M是月,小寫是分鐘!
		
		//建立一個字串物件做為格式化後的時間值容器 , 把原本today用format()帶入pattern執行後轉為String
		String date = today.format(formatter);
		System.out.println(date);
	}
}